package main;

import java.awt.EventQueue;
import java.math.BigInteger;
import model.RSAModel;
import view.RSAView;
public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RSAView frame = new RSAView();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
