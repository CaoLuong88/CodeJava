package model;

import java.math.BigInteger;
import java.util.Random;

public class RSAModel {

	private BigInteger p, q;
	private BigInteger n;
	private BigInteger phiN;
	private BigInteger e;
	private BigInteger d;
	
	public RSAModel() {
		new RSAModel(10);
	}

	public RSAModel(int digits) {
		this.p = generatePrimeNumber(digits);
		this.q = generatePrimeNumber(digits);
		this.n = p.multiply(q);
		this.phiN = findLCM(p.subtract(BigInteger.ONE), q.subtract(BigInteger.ONE));
		this.e = findPublicExponent(phiN);
		this.d = findModInverse(e, phiN);
	}

	public BigInteger getP() {
		return p;
	}

	public void setP(BigInteger p) {
		this.p = p;
	}

	public BigInteger getQ() {
		return q;
	}

	public void setQ(BigInteger q) {
		this.q = q;
	}

	public BigInteger getN() {
		return n;
	}

	public void setN(BigInteger n) {
		this.n = n;
	}

	public BigInteger getPhiN() {
		return phiN;
	}

	public void setPhiN(BigInteger phiN) {
		this.phiN = phiN;
	}

	public BigInteger getE() {
		return e;
	}

	public void setE(BigInteger e) {
		this.e = e;
	}

	public BigInteger getD() {
		return d;
	}

	public void setD(BigInteger d) {
		this.d = d;
	}
	// STEP 1: Chọn hai số nguyên tố p và q phân biệt.
	public boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	// Tạo số nguyên tố
	public BigInteger generatePrimeNumber() {
		return generatePrimeNumber(25);
	}
	// Tạo một số nguyên tố khác
	public static BigInteger generatePrimeNumber(int numDigits) {
        BigInteger prime;
        Random random = new Random();
                do {
            StringBuilder sb = new StringBuilder(numDigits);
            // Tạo chữ số ngẫu nhiên
            for (int i = 0; i < numDigits; i++) {
                int digit = random.nextInt(10); // Generate a random digit from 0 to 9
                sb.append(digit);
            }
            // Chuyển đổi các chữ số được tạo thành Số nguyên lớn
            BigInteger candidate = new BigInteger(sb.toString());
            // Kiểm tra xem ứng viên có phải là số nguyên tố hay không bằng phương thức isProbablePrime()
            boolean isPrime = candidate.isProbablePrime(100); // Điều chỉnh mức độ chắc chắn khi cần thiết
            if (isPrime) {
                prime = candidate;
                break;
            }
        } while (true);
        return prime;
    }
	//BƯỚC 2: Tính tích của chúng, n = p * q.
// Đây là mô-đun cho cả khóa chung và khóa riêng. KHÔNG CẦN VIẾT
// CHỨC NĂNG
	// BƯỚC 3: Tính hàm tổng Euler, φ(n) = lcm((p - 1),(q - 1)),
// biểu thị số số nguyên dương nhỏ hơn n là nguyên tố cùng nhau
// tới n.
	public static BigInteger findLCM(BigInteger a, BigInteger b) {
		// Tính giá trị tuyệt đối của a*b
		BigInteger absProduct = a.multiply(b).abs();
		// Calculate the GCD using the gcd() method
		BigInteger gcd = a.gcd(b);
		// Tính LCM bằng công thức LCM(a, b) = |(a * b)| / GCD(a,b)
		BigInteger lcm = absProduct.divide(gcd);
		return lcm;
	}
	// BƯỚC 4: Chọn số nguyên e sao cho 1 < e < φ(n) và e nguyên tố cùng nhau
// φ(n).
// Đây là số mũ công khai, tạo thành khóa chung.
	public static BigInteger findPublicExponent(BigInteger phiN) {
		BigInteger publicExponent;
		do {
			// Tạo số mũ công khai ngẫu nhiên
			publicExponent = new BigInteger(phiN.bitLength(), new Random());
		} while (publicExponent.compareTo(BigInteger.ONE) <= 0 || publicExponent.compareTo(phiN) >= 0
				|| !publicExponent.gcd(phiN).equals(BigInteger.ONE));
		return publicExponent;
	}
	// BƯỚC 5: Tính nghịch đảo nhân mô đun của e * modulo φ(n).
// Đây là số nguyên d, sao cho (d * e) % φ(n) = 1.
// d là số mũ riêng, tạo thành khóa riêng.
	public static BigInteger findModInverse(BigInteger number, BigInteger modulus) {
		// Tính toán nghịch đảo mô-đun bằng phương thức modInverse()
		BigInteger modInverse = number.modInverse(modulus);
		return modInverse;
	}
	// Chức năng yêu cầu thực hiện nhiệm vụ
	public int mod(int a, int n) {
		return (a % n + n) % n;
	}
	public String textToNum(String plainText) {
		String numbers = "";
		char[] plainChar = plainText.toCharArray();
		for (char ch : plainChar) {
			int text = ch;

			numbers += (text < 100) ? "0" + text : text;
		}
		return numbers;
	}
	public String convertToAscii(String input) {
        StringBuilder result = new StringBuilder();
        // Xử lý hai ký tự đầu tiên (nếu có)
        if (input.length() % 3 != 0 && input.length() >= 2) {
            String firstTwoDigits = input.substring(0, 2);
            int asciiValue = Integer.parseInt(firstTwoDigits);
            char character = (char) asciiValue;
            result.append(character);
            input = input.substring(2);
        }
        // Chuyển đổi các ký tự còn lại thành nhóm ba
        for (int i = 0; i < input.length(); i += 3) {
            String digitGroup = input.substring(i, i + 3);
            int asciiValue = Integer.parseInt(digitGroup);
            char character = (char) asciiValue;
            result.append(character);
        }
        return result.toString();
    }
	// mã hóa
	public String encrypt(String plainText) {
		plainText = textToNum(plainText);
		BigInteger cipherNum = new BigInteger(plainText);
		cipherNum = cipherNum.modPow(this.e, this.n);
		return cipherNum.toString();
	}
	// Giải mã
	public String decrypt(String cipherText) {
		BigInteger message = new BigInteger(cipherText);
		message = message.modPow(this.d, this.n);
		return convertToAscii(message.toString());
	}
}
