/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package KiemTra;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FPT
 */

public class Cau13 extends javax.swing.JFrame {

    /**
     * Creates new f
     */
    public Cau13() {
        initComponents();
        KhoiTaoDuLieu();
    }

    @SuppressWarnings("unchecked")
     DefaultTableModel defaultTableModel = new DefaultTableModel();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        diaglogThemThongTin = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHoTenThem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btDongYThem = new javax.swing.JButton();
        btHuyBoThem = new javax.swing.JButton();
        rdThemNam = new javax.swing.JRadioButton();
        rdThemNu = new javax.swing.JRadioButton();
        gbThemGT = new javax.swing.ButtonGroup();
        diaglogSuaThongTin = new javax.swing.JDialog();
        txtSuaHoTen = new javax.swing.JTextField();
        btSuaDongY = new javax.swing.JButton();
        btSuaHuyBo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdSuaNam = new javax.swing.JRadioButton();
        rdSuaNu = new javax.swing.JRadioButton();
        gbSuaGT = new javax.swing.ButtonGroup();
        diaglogXoaThongTin = new javax.swing.JDialog();
        rdXoaNu = new javax.swing.JRadioButton();
        txtXoaHoTen = new javax.swing.JTextField();
        btXoaDongY = new javax.swing.JButton();
        btXoaHuyBo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rdXoaNam = new javax.swing.JRadioButton();
        gbXoaGT = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbThongTinCaNhan = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        diaglogThemThongTin.setSize(new java.awt.Dimension(350, 250));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÊM THÔNG TIN CÁ NHÂN");

        jLabel3.setText("Họ và tên:");

        jLabel4.setText("Giới tính");

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

        gbThemGT.add(rdThemNam);
        rdThemNam.setText("Nam");

        gbThemGT.add(rdThemNu);
        rdThemNu.setText("Nữ");

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
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diaglogThemThongTinLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtHoTenThem, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(diaglogThemThongTinLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdThemNam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdThemNu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 33, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdThemNam)
                        .addComponent(rdThemNu)))
                .addGap(28, 28, 28)
                .addGroup(diaglogThemThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDongYThem)
                    .addComponent(btHuyBoThem))
                .addGap(0, 131, Short.MAX_VALUE))
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

        jLabel7.setText("Giới tính");

        gbSuaGT.add(rdSuaNam);
        rdSuaNam.setText("Nam");

        gbSuaGT.add(rdSuaNu);
        rdSuaNu.setText("Nữ");

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
                            .addGroup(diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(diaglogSuaThongTinLayout.createSequentialGroup()
                                    .addComponent(btSuaDongY)
                                    .addGap(18, 18, 18)
                                    .addComponent(btSuaHuyBo))
                                .addGroup(diaglogSuaThongTinLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rdSuaNam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdSuaNu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        diaglogSuaThongTinLayout.setVerticalGroup(
            diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaglogSuaThongTinLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSuaHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSuaNam)
                        .addComponent(rdSuaNu)))
                .addGap(25, 25, 25)
                .addGroup(diaglogSuaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSuaDongY)
                    .addComponent(btSuaHuyBo))
                .addGap(0, 169, Short.MAX_VALUE))
        );

        diaglogXoaThongTin.setSize(new java.awt.Dimension(350, 250));

        gbXoaGT.add(rdXoaNu);
        rdXoaNu.setText("Nữ");

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("XÓA THÔNG TIN CÁ NHÂN");

        jLabel9.setText("Họ và tên:");

        jLabel10.setText("Giới tính");

        gbXoaGT.add(rdXoaNam);
        rdXoaNam.setText("Nam");

        javax.swing.GroupLayout diaglogXoaThongTinLayout = new javax.swing.GroupLayout(diaglogXoaThongTin.getContentPane());
        diaglogXoaThongTin.getContentPane().setLayout(diaglogXoaThongTinLayout);
        diaglogXoaThongTinLayout.setHorizontalGroup(
            diaglogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaglogXoaThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diaglogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(diaglogXoaThongTinLayout.createSequentialGroup()
                        .addGroup(diaglogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diaglogXoaThongTinLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtXoaHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(diaglogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(diaglogXoaThongTinLayout.createSequentialGroup()
                                    .addComponent(btXoaDongY)
                                    .addGap(18, 18, 18)
                                    .addComponent(btXoaHuyBo))
                                .addGroup(diaglogXoaThongTinLayout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rdXoaNam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdXoaNu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        diaglogXoaThongTinLayout.setVerticalGroup(
            diaglogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaglogXoaThongTinLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diaglogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtXoaHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diaglogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(diaglogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdXoaNam)
                        .addComponent(rdXoaNu)))
                .addGap(25, 25, 25)
                .addGroup(diaglogXoaThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXoaDongY)
                    .addComponent(btXoaHuyBo))
                .addGap(0, 169, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Danh sách thông tin");
        setResizable(false);

        jLabel1.setText("DANH SÁCH THÔNG TIN CÁ NHÂN");

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

        tbThongTinCaNhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbThongTinCaNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThongTinCaNhanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbThongTinCaNhan);

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
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
  private void KhoiTaoDuLieu() {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("Giới tính");
        
         Object[] row1 = { "Nguyễn hoàng", "Nam"};
        defaultTableModel.addRow(row1);
        Object[] row2 = { "Nguyễn An", "Nam"};
        defaultTableModel.addRow(row2);
       Object[] row3 = { " An", "Nữ"};
        defaultTableModel.addRow(row3);
       
        tbThongTinCaNhan.setModel(defaultTableModel);
    }
     private void resetControll() {
       
        txtHoTenThem.setText("");
//       gbThemGT.equals(false);
        rdThemNam.setSelected(false);
        rdThemNu.setSelected(false);
        txtSuaHoTen.setText("");
        rdSuaNam.setSelected(true);
    }
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
        txtSuaHoTen.setText(tbThongTinCaNhan.getModel().getValueAt(chisodong, 0).toString());
        
        String gioiTinh = tbThongTinCaNhan.getModel().getValueAt(chisodong, 1).toString();
        if (gioiTinh.equals("Nam")) {
            rdSuaNam.setSelected(true); // Chọn radio "Nam"
        } else {
            rdSuaNu.setSelected(true); // Chọn radio "Nữ"
        }
//        if (gbSuaGT.getSelection() != null) {
//            if(gioiTinh == "Nữ"){
//                rdSuaNu.setSelected(true);
//            }else{
//                rdSuaNam.setSelected(true);
//            }
//        }
        
        }
        diaglogSuaThongTin.setTitle("Sửa thông tin");
        diaglogSuaThongTin.setLocationRelativeTo(null);
        diaglogSuaThongTin.setVisible(true);
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        if (chisodong >= 0) {

            txtXoaHoTen.setText(tbThongTinCaNhan.getModel().
                getValueAt(chisodong, 0).toString());
            
            String gioiTinh = tbThongTinCaNhan.getModel().getValueAt(chisodong, 1).toString();
        if (gioiTinh.equals("Nam")) {
            rdSuaNam.setSelected(true); // Chọn radio "Nam"
        } else {
            rdSuaNu.setSelected(true); // Chọn radio "Nữ"
        }

        }
        diaglogXoaThongTin.setTitle("Xoa thông tin");
        diaglogXoaThongTin.setLocationRelativeTo(null);
        diaglogXoaThongTin.setVisible(true);
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btThoatActionPerformed

    private void btDongYThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDongYThemActionPerformed
        // TODO add your handling code here
        String gioiTinh = "";
        
      
        if (gbThemGT.getSelection() != null) {
            if (rdThemNam.isSelected()) {
                gioiTinh = "Nam";
            } else if (rdThemNu.isSelected()) {
                gioiTinh = "Nữ";
            }
        }
        Object[] rowi = {txtHoTenThem.getText(), gioiTinh };
    defaultTableModel.addRow (rowi);
    tbThongTinCaNhan.clearSelection ();
       resetControll();
    diaglogThemThongTin.setVisible (false);

    }//GEN-LAST:event_btDongYThemActionPerformed

    private void btHuyBoThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyBoThemActionPerformed
        // TODO add your handling code here:
        tbThongTinCaNhan.clearSelection();
        resetControll();
        diaglogThemThongTin.setVisible(false);
    }//GEN-LAST:event_btHuyBoThemActionPerformed

    private void btSuaDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaDongYActionPerformed
        // TODO add your handling code here:
        if (chisodong >= 0) {
            defaultTableModel.setValueAt(txtSuaHoTen.getText(), chisodong, 0);
            
            String gioiTinh = "";       
        if (gbSuaGT.getSelection() != null) {
            if (rdSuaNam.isSelected()) {
                gioiTinh = "Nam";
            } else if (rdSuaNu.isSelected()) {
                gioiTinh = "Nữ";
            }
        }
            defaultTableModel.setValueAt(gioiTinh, chisodong, 1);

            tbThongTinCaNhan.setModel(defaultTableModel);
            tbThongTinCaNhan.clearSelection();
            resetControll();
            chisodong = -1;
            diaglogSuaThongTin.setVisible(false);
        }
    }//GEN-LAST:event_btSuaDongYActionPerformed

    private void btSuaHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaHuyBoActionPerformed
        // TODO add your handling code here:
        tbThongTinCaNhan.clearSelection();
        resetControll();
        chisodong = -1;
        diaglogSuaThongTin.setVisible(false);
    }//GEN-LAST:event_btSuaHuyBoActionPerformed

    private void tbThongTinCaNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThongTinCaNhanMouseClicked
        // TODO add your handling code here
         chisodong = tbThongTinCaNhan.getSelectedRow();
    }//GEN-LAST:event_tbThongTinCaNhanMouseClicked

    private void btXoaDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaDongYActionPerformed
        // TODO add your handling code here:
        String str = tbThongTinCaNhan.getModel().getValueAt(chisodong, 0).toString();
        int confirm = JOptionPane.showConfirmDialog(this,
                "Bạn chắc chắn muốn xóa bản ghi: \n" + str, "Confirm", JOptionPane.YES_NO_OPTION );
        if (confirm == JOptionPane.YES_OPTION) {
            defaultTableModel.removeRow(chisodong);
            tbThongTinCaNhan.setModel(defaultTableModel);
            chisodong = -1;
            tbThongTinCaNhan.clearSelection();
            resetControll();
            chisodong = -1;
            diaglogXoaThongTin.setVisible(false);
        }
    }//GEN-LAST:event_btXoaDongYActionPerformed

    private void btXoaHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaHuyBoActionPerformed
        // TODO add your handling code here:
         tbThongTinCaNhan.clearSelection();
        resetControll();
        chisodong = -1;
        diaglogXoaThongTin.setVisible(false);
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
        java.util.logging.Logger.getLogger(Cau13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Cau13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Cau13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Cau13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Cau13().setVisible(true);
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
    private javax.swing.JDialog diaglogSuaThongTin;
    private javax.swing.JDialog diaglogThemThongTin;
    private javax.swing.JDialog diaglogXoaThongTin;
    private javax.swing.ButtonGroup gbSuaGT;
    private javax.swing.ButtonGroup gbThemGT;
    private javax.swing.ButtonGroup gbXoaGT;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdSuaNam;
    private javax.swing.JRadioButton rdSuaNu;
    private javax.swing.JRadioButton rdThemNam;
    private javax.swing.JRadioButton rdThemNu;
    private javax.swing.JRadioButton rdXoaNam;
    private javax.swing.JRadioButton rdXoaNu;
    private javax.swing.JTable tbThongTinCaNhan;
    private javax.swing.JTextField txtHoTenThem;
    private javax.swing.JTextField txtSuaHoTen;
    private javax.swing.JTextField txtXoaHoTen;
    // End of variables declaration//GEN-END:variables
}
