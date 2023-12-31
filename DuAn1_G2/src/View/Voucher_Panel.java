/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.khuyenMai;
import Service.KhuyenMai_serVice;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Voucher_Panel extends javax.swing.JPanel {

    private KhuyenMai_serVice service = new KhuyenMai_serVice();
    DefaultTableModel mol = new DefaultTableModel();
    private int index = -1;

    /**
     * Creates new form Voucher_Panel
     */
    public Voucher_Panel() {
        initComponents();

        fillTable();

        if (tbl_bang.getRowCount() > 0) {
            tbl_bang.setRowSelectionInterval(0, 0);
            showdata();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_Ma = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_tiengiam = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rdo_Khadung = new javax.swing.JRadioButton();
        rdo_Khongkhadung = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_NBD = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNKT = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bang = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Thống Tin Khuyến Mãi"));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Mã Khuyến Mãi");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel14.setText("Tiền Giảm");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel15.setText("Trạng Thái");

        rdo_Khadung.setText("Khả Dụng");

        rdo_Khongkhadung.setText("Không Khả Dụng");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel16.setText("ID :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel17.setText("Ngày Kết Thúc");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel18.setText("Ngày Bắt Đầu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdo_Khadung)
                        .addGap(18, 18, 18)
                        .addComponent(rdo_Khongkhadung))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel16))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_tiengiam)
                                .addComponent(txt_NBD)
                                .addComponent(txt_ID)
                                .addComponent(txtNKT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_tiengiam, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NBD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNKT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(rdo_Khadung)
                    .addComponent(rdo_Khongkhadung))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        btn_add.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/preview_8.png"))); // NOI18N
        btn_add.setText("Thêm ");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_sua.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/preview_9.png"))); // NOI18N
        btn_sua.setText("Sửa ");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/preview_10.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/preview_11.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_sua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_xoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add)
                            .addComponent(btn_clear))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        tbl_bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Mã Khuyến Mãi", "Tiền Giảm", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Trạng Thái"
            }
        ));
        tbl_bang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bang);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Quản Lý Khuyến Mãi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:

        try {
            khuyenMai kk = readForm();
            int a = service.addKM(kk);
            if (a == 1) {
                JOptionPane.showMessageDialog(this, "them thanh cong");
                fillTable();
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "them that bai");
            return;
        }

    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        //        index = tbl_bang.getSelectedRow();
        //        if (index < 0) {
        //            JOptionPane.showMessageDialog(this, service.updateKM(this.readForm()));
        //            this.fillTable(service.getAll());
        //
        //        } else
        //            //JOptionPane.showMessageDialog(this, service.updateNhanVien(index, this.readForm()));
        //            this.fillTable(service.getAll());
        try {
            khuyenMai kk = readForm();
            int a = service.updateKM(kk);
            if (a == 1) {
                JOptionPane.showMessageDialog(this, "sua thanh cong");
                fillTable();
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "sua that bai");
            return;
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        try {
            khuyenMai kk = readForm();
            if (service.deleteKM(txt_Ma.getText()) != null) {
                JOptionPane.showMessageDialog(this, "xoa thanh cong");
                fillTable();
            } else {
                JOptionPane.showMessageDialog(this, "xoa that bai");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "xoa loi");
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_ID.setText("");
        txt_Ma.setText("");
        txt_NBD.setText("");
        txtNKT.setText("");
        txt_tiengiam.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void tbl_bangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bangMouseClicked
        // TODO add your handling code here:
        int index = tbl_bang.getSelectedRow();
        showdata();
    }//GEN-LAST:event_tbl_bangMouseClicked

    private void fillTable() {

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        mol = (DefaultTableModel) tbl_bang.getModel();
        List<khuyenMai> list = service.getAll();
        mol.setRowCount(0);
        for (khuyenMai km : list) {
            mol.addRow(new Object[]{
                km.getId_khuyenMaiSanPham(),
                km.getMaKM(),
                km.getTiemGiam(),
                km.getNgayBatDau(),
                km.getNgayKetThuc(),
                km.isTrangThai() ? "Khả Dụng" : "Không Khả Dụng"
            });

        }

    }

    private void showdata() {

// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int index = tbl_bang.getSelectedRow();
        txt_ID.setText(tbl_bang.getValueAt(index, 0).toString());
        txt_Ma.setText(tbl_bang.getValueAt(index, 1).toString());
        txt_tiengiam.setText(tbl_bang.getValueAt(index, 2).toString());
        txt_NBD.setText(tbl_bang.getValueAt(index, 3).toString());
        txtNKT.setText(tbl_bang.getValueAt(index, 4).toString());
        rdo_Khadung.setSelected(tbl_bang.getValueAt(index, 5).toString().equalsIgnoreCase("Khả Dụng") ? true : false);
        rdo_Khongkhadung.setSelected(!tbl_bang.getValueAt(index, 5).toString().equalsIgnoreCase("Khả Dụng") ? true : false);

    }

    khuyenMai readForm() {
        khuyenMai km = new khuyenMai();
        try {
            Date getngayBatDau = Date.valueOf(txt_NBD.getText());
            Date getngayKetThuc = Date.valueOf(txtNKT.getText());
            km.setMaKM(txt_Ma.getText());
            km.setTiemGiam(Integer.parseInt(txt_tiengiam.getText()));
            km.setNgayBatDau(getngayBatDau);
            km.setNgayKetThuc(getngayKetThuc);
            if (rdo_Khadung.isSelected()) {
                km.setTrangThai(true);

            } else {
                km.setTrangThai(false);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return km;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdo_Khadung;
    private javax.swing.JRadioButton rdo_Khongkhadung;
    private javax.swing.JTable tbl_bang;
    private javax.swing.JTextField txtNKT;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Ma;
    private javax.swing.JTextField txt_NBD;
    private javax.swing.JTextField txt_tiengiam;
    // End of variables declaration//GEN-END:variables
}
