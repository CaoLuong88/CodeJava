/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.KhoaController;
import EF.Khoa;
import Dao.KhoaDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLDMKhoa extends javax.swing.JFrame {

    KhoaController khoaController;
    Khoa khoa;
    KhoaDao khoadao;

    /**
     * Creates new form QLDMKhoa
     */
    public QLDMKhoa() {
        initComponents();
        LoadData();
    }

// Hàm hiển thị dữ liệu
    private void LoadData() {
        khoaController = new KhoaController();
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        tableListKhoa.setModel(defaultTableModel);
        defaultTableModel.addColumn("TT");
        defaultTableModel.addColumn("Tên khoa");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("Mã khoa");
        int soTT = 1;
        List<Khoa> Khoas = khoaController.getAllKhoa();
        if (Khoas != null) {
            for (Khoa khoa : Khoas) {
                defaultTableModel.addRow(new Object[]{soTT, khoa.getTenKhoa(), khoa.getDiaChi(), khoa.getiDKhoa()});
                soTT++;
            }
        } else {
        }
    }

    private void resetControll() {
        txtThemTenKhoa.setText("");
        txtThemDiaChi.setText("");
        txtThemMaKhoa.setText("");

    }

    // Hàm hiển thị dữ liệu cho việc tìm kiếm
    private void LoadDataBySearch() {
        khoaController = new KhoaController();
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        tableListKhoa.setModel(defaultTableModel);
        defaultTableModel.addColumn("TT");
        defaultTableModel.addColumn("Tên khoa");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("Mã khoa");
        int soTT = 1;
        String keySearch = txtTimKiem.getText();
        List<Khoa> Khoas = khoaController.getKhoaBySearch(keySearch);
        if (Khoas != null) {
            for (Khoa khoa : Khoas) {
                defaultTableModel.addRow(new Object[]{soTT, khoa.getTenKhoa(), khoa.getDiaChi(), khoa.getiDKhoa()});
                soTT++;
            }
        } else {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogThemKhoa = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtThemMaKhoa = new javax.swing.JTextField();
        txtThemTenKhoa = new javax.swing.JTextField();
        txtThemDiaChi = new javax.swing.JTextField();
        btDongYThemKhoa = new javax.swing.JButton();
        btThoatThemKhoa = new javax.swing.JButton();
        btDongYSua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btTiemKiem = new javax.swing.JButton();
        btReload = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListKhoa = new javax.swing.JTable();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();

        dialogThemKhoa.setTitle("Thêm khoa");
        dialogThemKhoa.setSize(new java.awt.Dimension(350, 250));

        jLabel3.setText("THEM KHOA");

        jLabel4.setText("Ma khoa");

        jLabel5.setText("Ten khoa");

        jLabel6.setText("Dia chi");

        btDongYThemKhoa.setText("Dong y them");
        btDongYThemKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDongYThemKhoaActionPerformed(evt);
            }
        });

        btThoatThemKhoa.setText("Thoat");
        btThoatThemKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatThemKhoaActionPerformed(evt);
            }
        });

        btDongYSua.setText("Dong y Sua");
        btDongYSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDongYSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogThemKhoaLayout = new javax.swing.GroupLayout(dialogThemKhoa.getContentPane());
        dialogThemKhoa.getContentPane().setLayout(dialogThemKhoaLayout);
        dialogThemKhoaLayout.setHorizontalGroup(
            dialogThemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogThemKhoaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(dialogThemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btDongYThemKhoa)
                    .addGroup(dialogThemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(dialogThemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(dialogThemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogThemKhoaLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(dialogThemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThemMaKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(txtThemTenKhoa)
                            .addComponent(txtThemDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogThemKhoaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDongYSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btThoatThemKhoa)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        dialogThemKhoaLayout.setVerticalGroup(
            dialogThemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogThemKhoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogThemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtThemMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogThemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtThemTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogThemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtThemDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(dialogThemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDongYThemKhoa)
                    .addComponent(btThoatThemKhoa)
                    .addComponent(btDongYSua))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("QUẢN LÝ DANH MỤC KHOA");

        jLabel2.setText("Nhập từ khóa");

        btTiemKiem.setText("Tìm");
        btTiemKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTiemKiemActionPerformed(evt);
            }
        });

        btReload.setText("ReLoad");
        btReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReloadActionPerformed(evt);
            }
        });

        tableListKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableListKhoa);

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btTiemKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btReload))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btThem)
                                .addGap(18, 18, 18)
                                .addComponent(btSua)
                                .addGap(18, 18, 18)
                                .addComponent(btXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btThoat)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btTiemKiem)
                    .addComponent(btReload))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btThoat))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btTiemKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTiemKiemActionPerformed
        // TODO add your handling code here:
        String keyword = txtTimKiem.getText();
        if (keyword.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "ban chua nhap tu khoa", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
        } else if (keyword.trim().length() != 0) {
            LoadDataBySearch();
        }
    }//GEN-LAST:event_btTiemKiemActionPerformed

    private void btReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReloadActionPerformed
        // TODO add your handling code here:
        LoadData();
    }//GEN-LAST:event_btReloadActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        dialogThemKhoa.setTitle("Thêm thông tin khoa");
        dialogThemKhoa.setLocationRelativeTo(null);
        dialogThemKhoa.setVisible(true);

    }//GEN-LAST:event_btThemActionPerformed
    private int iDKhoaSua = -2;
    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        int row = tableListKhoa.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(QLDMKhoa.this,
                    "Bạn chưa chọn dữ liệu cần sửa!", "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            int iDKhoa = Integer.valueOf(String.valueOf(tableListKhoa.getValueAt(row, 3)));
            Khoa khoa = new Khoa();
            iDKhoaSua = iDKhoa;
            khoa = khoaController.getKhoaByiDKhoa(iDKhoa);
            txtThemTenKhoa.setText(khoa.getTenKhoa());
            txtThemDiaChi.setText(khoa.getDiaChi());
            dialogThemKhoa.setTitle("Sửa thông tin khoa");
            dialogThemKhoa.setLocationRelativeTo(null);
            dialogThemKhoa.setVisible(true);
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        int row = tableListKhoa.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(QLDMKhoa.this,
                    "Bạn chưa chọn dữ liệu cần xóa !", "Thông báo", JOptionPane.OK_OPTION);
        } else {
            int iDKhoa = Integer.valueOf(
                    String.valueOf(tableListKhoa.getValueAt(row, 3)));
            int confirm = JOptionPane.showConfirmDialog(this,
                    "Bạn có chắc chắn muốn xóa không ?", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                khoaController.deleteKhoa(iDKhoa);
                LoadData();
            }
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btThoatActionPerformed

    private void btDongYThemKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDongYThemKhoaActionPerformed
        // TODO add your handling code here:
        khoadao = new KhoaDao();
        khoaController = new KhoaController();
        khoa = new Khoa();
        khoa.setTenKhoa(txtThemTenKhoa.getText());
        khoa.setDiaChi(txtThemDiaChi.getText());
        // Lấy nội dung văn bản từ JTextField
        String iDKhoaStr = txtThemMaKhoa.getText();
        // Chuyển đổi nội dung văn bản sang kiểu int
        int iDKhoa = Integer.parseInt(iDKhoaStr);
        // Thiết lập giá trị cho iDKhoa
        khoa.setiDKhoa(iDKhoa);
        
        khoaController.addKhoa(khoa);
        LoadData();
        tableListKhoa.clearSelection();
        resetControll();
        dialogThemKhoa.setVisible(false);
    }//GEN-LAST:event_btDongYThemKhoaActionPerformed

    private void btThoatThemKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatThemKhoaActionPerformed
        // TODO add your handling code here:
        dialogThemKhoa.setVisible(false);
    }//GEN-LAST:event_btThoatThemKhoaActionPerformed

    private void btDongYSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDongYSuaActionPerformed
        // TODO add your handling code here:
        if (iDKhoaSua == -2) {
            khoa = new Khoa();
            khoa.setTenKhoa(txtThemTenKhoa.getText());
            khoa.setDiaChi(txtThemDiaChi.getText());
            // Lấy nội dung văn bản từ JTextField
        String iDKhoaStr = txtThemMaKhoa.getText();
        // Chuyển đổi nội dung văn bản sang kiểu int
        int iDKhoa = Integer.parseInt(iDKhoaStr);
        // Thiết lập giá trị cho iDKhoa
        khoa.setiDKhoa(iDKhoa);
            khoaController.addKhoa(khoa);
            txtThemTenKhoa.setText("");
            txtThemDiaChi.setText("");
            dialogThemKhoa.setVisible(false);
            LoadData();
            iDKhoaSua = -2;
        } else if (iDKhoaSua > 0) {
            // thuc hien sua
            khoa = new Khoa();
            khoa.setTenKhoa(txtThemTenKhoa.getText());
            khoa.setDiaChi(txtThemDiaChi.getText());
            khoa.setiDKhoa(iDKhoaSua);
            khoaController.upDateKhoa(khoa);
            txtThemTenKhoa.setText("");
            txtThemDiaChi.setText("");
            dialogThemKhoa.setVisible(false);
            LoadData();
            iDKhoaSua = -2;
        }
    }//GEN-LAST:event_btDongYSuaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLDMKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDMKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDMKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDMKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDMKhoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDongYSua;
    private javax.swing.JButton btDongYThemKhoa;
    private javax.swing.JButton btReload;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btThoatThemKhoa;
    private javax.swing.JButton btTiemKiem;
    private javax.swing.JButton btXoa;
    private javax.swing.JDialog dialogThemKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableListKhoa;
    private javax.swing.JTextField txtThemDiaChi;
    private javax.swing.JTextField txtThemMaKhoa;
    private javax.swing.JTextField txtThemTenKhoa;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
