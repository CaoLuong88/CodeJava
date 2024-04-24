/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package KiemTra;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FPT
 */
public class Cau25 extends javax.swing.JFrame {

    public Cau25() {

        initComponents();
        KhoiTaoDuLieu();
    }
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    private void KhoiTaoDuLieu() {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("Tiếng anh");
        defaultTableModel.addColumn("Tiếng trung");

        Object[] row1 = {"Nguyễn hoàng", "Tiếng anh", ""};
        defaultTableModel.addRow(row1);
        Object[] row2 = {"Nguyễn An", "", "Tiếng trung"};
        defaultTableModel.addRow(row2);
        Object[] row3 = {" An", "Tiếng anh", "Tiếng trung"};
        defaultTableModel.addRow(row3);
        tbDanhSachHocVien.setModel(defaultTableModel);
    }

    private void resetControll() {

        txtHoTenThem.setText("");
        cbThemTiengAnh.setSelected(false);
        cbThemTiengTrung.setSelected(false);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diaglogThemThongTin = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHoTenThem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btDongYThem = new javax.swing.JButton();
        btHuyBoThem = new javax.swing.JButton();
        cbThemTiengAnh = new javax.swing.JCheckBox();
        cbThemTiengTrung = new javax.swing.JCheckBox();
        diaglogSuaThongTin = new javax.swing.JDialog();
        txtSuaHoTen = new javax.swing.JTextField();
        btSuaDongY = new javax.swing.JButton();
        btSuaHuyBo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbSuaTiengAnh = new javax.swing.JCheckBox();
        cbSuaTiengTrung = new javax.swing.JCheckBox();
        dialogXoaThongTin = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbXoaTiengAnh = new javax.swing.JCheckBox();
        cbXoaTiengTrung = new javax.swing.JCheckBox();
        txtXoaHoTen = new javax.swing.JTextField();
        btXoaDongY = new javax.swing.JButton();
        btXoaHuyBo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDanhSachHocVien = new javax.swing.JTable();

        diaglogThemThongTin.setSize(new java.awt.Dimension(350, 250));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÊM HỌC VIÊN");

        jLabel3.setText("Họ và tên:");

        jLabel4.setText("Môn học");

        btDongYThem.setText("Đồng ý");
        btDongYThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDongYThemActionPerformed(evt);
            }
        });

        btHuyBoThem.setText("Hủy bỏ");
        btHuyBoThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyBoThemActionPerformed(evt);
            }
        });

        cbThemTiengAnh.setText("Tiếng anh");

        cbThemTiengTrung.setText("Tiếng trung");

        javax.swing.GroupLayout diaglogThemThongTinLayout = new javax.swing.GroupLayout(diaglogThemThongTin.getContentPane());
        diaglogThemThongTin.getContentPane().setLayout(diaglogThemThongTinLayout);
        diaglogThemThongTinLayout.setHorizontalGroup(
            diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaglogThemThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(diaglogThemThongTinLayout.createSequentialGroup()
                        .addGroup(diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diaglogThemThongTinLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diaglogThemThongTinLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtHoTenThem, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(diaglogThemThongTinLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbThemTiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbThemTiengTrung, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(diaglogThemThongTinLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btDongYThem)
                .addGap(18, 18, 18)
                .addComponent(btHuyBoThem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        diaglogThemThongTinLayout.setVerticalGroup(
            diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaglogThemThongTinLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTenThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbThemTiengAnh)
                    .addComponent(cbThemTiengTrung)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDongYThem)
                    .addComponent(btHuyBoThem))
                .addGap(0, 102, Short.MAX_VALUE))
        );

        diaglogSuaThongTin.setSize(new java.awt.Dimension(350, 250));

        btSuaDongY.setText("Đồng ý");
        btSuaDongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaDongYActionPerformed(evt);
            }
        });

        btSuaHuyBo.setText("Hủy bỏ");
        btSuaHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaHuyBoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SỬA THÔNG TIN CÁ NHÂN");

        jLabel6.setText("Họ và tên:");

        jLabel8.setText("Môn học");

        cbSuaTiengAnh.setText("Tiếng anh");

        cbSuaTiengTrung.setText("Tiếng trung");

        javax.swing.GroupLayout diaglogSuaThongTinLayout = new javax.swing.GroupLayout(diaglogSuaThongTin.getContentPane());
        diaglogSuaThongTin.getContentPane().setLayout(diaglogSuaThongTinLayout);
        diaglogSuaThongTinLayout.setHorizontalGroup(
            diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaglogSuaThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(diaglogSuaThongTinLayout.createSequentialGroup()
                        .addGroup(diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diaglogSuaThongTinLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtSuaHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(diaglogSuaThongTinLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(btSuaDongY)
                                .addGap(18, 18, 18)
                                .addComponent(btSuaHuyBo)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(diaglogSuaThongTinLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSuaTiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbSuaTiengTrung, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        diaglogSuaThongTinLayout.setVerticalGroup(
            diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaglogSuaThongTinLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSuaHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSuaTiengAnh)
                    .addComponent(cbSuaTiengTrung)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSuaDongY)
                    .addComponent(btSuaHuyBo))
                .addGap(0, 75, Short.MAX_VALUE))
        );

        dialogXoaThongTin.setSize(new java.awt.Dimension(350, 250));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("XÓA THÔNG TIN CÁ NHÂN");

        jLabel9.setText("Họ và tên:");

        jLabel10.setText("Môn học");

        cbXoaTiengAnh.setText("Tiếng anh");

        cbXoaTiengTrung.setText("Tiếng trung");

        btXoaDongY.setText("Đồng ý");
        btXoaDongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaDongYActionPerformed(evt);
            }
        });

        btXoaHuyBo.setText("Hủy bỏ");
        btXoaHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaHuyBoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogXoaThongTinLayout = new javax.swing.GroupLayout(dialogXoaThongTin.getContentPane());
        dialogXoaThongTin.getContentPane().setLayout(dialogXoaThongTinLayout);
        dialogXoaThongTinLayout.setHorizontalGroup(
            dialogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogXoaThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dialogXoaThongTinLayout.createSequentialGroup()
                        .addGroup(dialogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogXoaThongTinLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtXoaHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogXoaThongTinLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(btXoaDongY)
                                .addGap(18, 18, 18)
                                .addComponent(btXoaHuyBo)))
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(dialogXoaThongTinLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbXoaTiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbXoaTiengTrung, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogXoaThongTinLayout.setVerticalGroup(
            dialogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogXoaThongTinLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtXoaHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dialogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbXoaTiengAnh)
                    .addComponent(cbXoaTiengTrung)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(dialogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXoaDongY)
                    .addComponent(btXoaHuyBo))
                .addGap(0, 109, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DANH SÁCH HỌC VIÊN");

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

        tbDanhSachHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbDanhSachHocVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDanhSachHocVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDanhSachHocVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSua)
                        .addGap(18, 18, 18)
                        .addComponent(btXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btThoat))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btThoat)
                    .addComponent(btThem))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:

        diaglogThemThongTin.setTitle("Thêm thông tin");
        diaglogThemThongTin.setLocationRelativeTo(null);
        diaglogThemThongTin.setVisible(true);
    }//GEN-LAST:event_btThemActionPerformed
    int chisodong = -1;
    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        if (chisodong >= 0) {
            txtSuaHoTen.setText(tbDanhSachHocVien.getModel().getValueAt(chisodong, 0).toString());
            
            String tienganh = tbDanhSachHocVien.getModel().getValueAt(chisodong, 1).toString();
            if (tienganh.equals("Tiếng anh")) {
                cbSuaTiengAnh.setSelected(true);
            }
            String tiengtrung = tbDanhSachHocVien.getModel().getValueAt(chisodong, 2).toString();
            if (tiengtrung.equals("Tiếng trung")) {
                cbSuaTiengTrung.setSelected(true);
            }
        }
        diaglogSuaThongTin.setTitle("Sửa thông tin");
        diaglogSuaThongTin.setLocationRelativeTo(null);
        diaglogSuaThongTin.setVisible(true);
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        if (chisodong >= 0) {

            txtXoaHoTen.setText(tbDanhSachHocVien.getModel().
                getValueAt(chisodong, 0).toString());
            
            String tienganh = tbDanhSachHocVien.getModel().getValueAt(chisodong, 1).toString();
            if (tienganh.equals("Tiếng anh")) {
                cbSuaTiengAnh.setSelected(true);
            }
            String tiengtrung = tbDanhSachHocVien.getModel().getValueAt(chisodong, 2).toString();
            if (tiengtrung.equals("Tiếng trung")) {
                cbSuaTiengTrung.setSelected(true);
            }
        }
        dialogXoaThongTin.setTitle("Xoa thông tin");
        dialogXoaThongTin.setLocationRelativeTo(null);
        dialogXoaThongTin.setVisible(true);
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btThoatActionPerformed

    private void tbDanhSachHocVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDanhSachHocVienMouseClicked
        // TODO add your handling code here
        chisodong = tbDanhSachHocVien.getSelectedRow();
    }//GEN-LAST:event_tbDanhSachHocVienMouseClicked

    private void btDongYThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDongYThemActionPerformed

        String tienganh = "";
        String tiengtrung = "";
        if (cbThemTiengAnh.isSelected()) {
            tienganh = "Tiếng anh";
        }
        if (cbThemTiengTrung.isSelected()) {
            tiengtrung = "Tiếng trung";
        }
        Object[] rowi = {txtHoTenThem.getText(), tienganh, tiengtrung};
        defaultTableModel.addRow(rowi);
        tbDanhSachHocVien.clearSelection();
        resetControll();
        diaglogThemThongTin.setVisible(false);
    }//GEN-LAST:event_btDongYThemActionPerformed

    private void btHuyBoThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyBoThemActionPerformed
        // TODO add your handling code here:
        tbDanhSachHocVien.clearSelection();
        resetControll();
        diaglogThemThongTin.setVisible(false);
    }//GEN-LAST:event_btHuyBoThemActionPerformed

    private void btSuaDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaDongYActionPerformed
//        // TODO add your handling code here:
        if (chisodong >= 0) {
            defaultTableModel.setValueAt(txtSuaHoTen.getText(), chisodong, 0);
           String tienganh="";
        String tiengtrung="";
            if (cbThemTiengAnh.isSelected()) {
                tienganh = "Tiếng anh";            
            }  
            if (cbThemTiengTrung.isSelected()) {
                tiengtrung = "Tiếng trung";
            }
            
            defaultTableModel.setValueAt(tienganh, chisodong, 1);
            defaultTableModel.setValueAt(tiengtrung, chisodong, 2);
            tbDanhSachHocVien.setModel(defaultTableModel);
            tbDanhSachHocVien.clearSelection();
            resetControll();
            chisodong = -1;
            diaglogSuaThongTin.setVisible(false);
        }
    }//GEN-LAST:event_btSuaDongYActionPerformed

    private void btSuaHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaHuyBoActionPerformed
        // TODO add your handling code here:
        tbDanhSachHocVien.clearSelection();
        resetControll();
        chisodong = -1;
        diaglogSuaThongTin.setVisible(false);
    }//GEN-LAST:event_btSuaHuyBoActionPerformed

    private void btXoaDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaDongYActionPerformed
        // TODO add your handling code here:
        String str = tbDanhSachHocVien.getModel().getValueAt(chisodong, 0).toString();
        int confirm = JOptionPane.showConfirmDialog(this,
                "Bạn chắc chắn muốn xóa bản ghi: \n" + str, "Confirm", JOptionPane.YES_NO_OPTION );
        if (confirm == JOptionPane.YES_OPTION) {
            defaultTableModel.removeRow(chisodong);
            tbDanhSachHocVien.setModel(defaultTableModel);
            chisodong = -1;
            tbDanhSachHocVien.clearSelection();
            resetControll();
            chisodong = -1;
            dialogXoaThongTin.setVisible(false);
        }
    }//GEN-LAST:event_btXoaDongYActionPerformed

    private void btXoaHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaHuyBoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btXoaHuyBoActionPerformed

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
            java.util.logging.Logger.getLogger(Cau25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cau25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cau25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cau25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cau25().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDongYThem;
    private javax.swing.JButton btHuyBoThem;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btSuaDongY;
    private javax.swing.JButton btSuaHuyBo;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btXoaDongY;
    private javax.swing.JButton btXoaHuyBo;
    private javax.swing.JCheckBox cbSuaTiengAnh;
    private javax.swing.JCheckBox cbSuaTiengTrung;
    private javax.swing.JCheckBox cbThemTiengAnh;
    private javax.swing.JCheckBox cbThemTiengTrung;
    private javax.swing.JCheckBox cbXoaTiengAnh;
    private javax.swing.JCheckBox cbXoaTiengTrung;
    private javax.swing.JDialog diaglogSuaThongTin;
    private javax.swing.JDialog diaglogThemThongTin;
    private javax.swing.JDialog dialogXoaThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbDanhSachHocVien;
    private javax.swing.JTextField txtHoTenThem;
    private javax.swing.JTextField txtSuaHoTen;
    private javax.swing.JTextField txtXoaHoTen;
    // End of variables declaration//GEN-END:variables
}
