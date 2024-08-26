/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author buimi
 */
public class QuanLyCD extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyCD
     */
    List<CD> list = new ArrayList<CD>();

    public QuanLyCD() {
        initComponents();
        setLocationRelativeTo(null);
        initData();
        fillToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTieuDe = new javax.swing.JTextField();
        txtLoai = new javax.swing.JTextField();
        txtNamXB = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("02-BuiMinhQuang");

        jLabel1.setText("Mã");

        jLabel2.setText("Tiêu đề");

        jLabel3.setText("Loại");

        jLabel4.setText("Năm xuất bản");

        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        tblCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã", "Tiêu đề", "Loại", "Năm xuất bản"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblCDMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblCD);
        if (tblCD.getColumnModel().getColumnCount() > 0) {
            tblCD.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNamXB, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(txtLoai)
                    .addComponent(txtTieuDe)
                    .addComponent(txtMa))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnLuu)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(txtTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnLuu)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String ma = txtMa.getText();
        String tieuDe = txtTieuDe.getText();
        String loai = txtLoai.getText();
        int namXB;
        try {
            namXB = Integer.parseInt(txtNamXB.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Năm xuất bản phải là số nguyên.");
            return;
        }
        CD cd = new CD(ma, tieuDe, loai, namXB);
        list.add(cd);
        fillToTable();
        JOptionPane.showMessageDialog(this, "Thêm CD thành công");
        clear();
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void tblCDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCDMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCDMouseEntered

    private void tblCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCDMouseClicked
        // TODO add your handling code here:
        showDetail();
    }//GEN-LAST:event_tblCDMouseClicked

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCD.getSelectedRow();
        if (selectedRow < 0 || selectedRow >= list.size()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một CD để cập nhật.");
            return;
        }
        CD cd = list.get(selectedRow);
        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn cập nhật CD này?", "Xác nhận cập nhật", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            cd.setMaSp(txtMa.getText());
            cd.setTieuDe(txtTieuDe.getText());
            cd.setLoai(txtLoai.getText());
            cd.setNamXB(Integer.parseInt(txtNamXB.getText()));
            fillToTable();
            JOptionPane.showMessageDialog(this, "Cập nhật CD thành công");
            clear();
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCD.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một CD để xóa.");
            return;
        }

        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa CD này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            list.remove(selectedRow);
            fillToTable();
            JOptionPane.showMessageDialog(this, "Xóa CD thành công");
            clear();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String maCD = txtMa.getText();
        for (CD cd : list) {
            if (maCD.equalsIgnoreCase(cd.getMaSp())) {
                txtTieuDe.setText(cd.getTieuDe());
                txtLoai.setText(cd.getLoai());
                txtNamXB.setText(String.valueOf(cd.getNamXB()));
                JOptionPane.showMessageDialog(this, "Đã tìm thấy CD có mã: " + maCD);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Không tìm thấy CD có mã: " + maCD);
    }//GEN-LAST:event_btnTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyCD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyCD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyCD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyCD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyCD().setVisible(true);
            }
        });
    }

    public void clear() {
        // Clear text fields
        txtMa.setText("");
        txtTieuDe.setText("");
        txtLoai.setText("");
        txtNamXB.setText("");
        tblCD.clearSelection();
    }

    public void initData() {
        DefaultTableModel model = (DefaultTableModel) tblCD.getModel();
        list.add(new CD("sp1", "CD hoạt hình", "CD", 2010));
        list.add(new CD("sp2", "DVD siêu nhân", "DVD", 2015));
        list.add(new CD("sp3", "Phim hài", "DVD", 2019));
        list.add(new CD("sp4", "Phim hành động", "DVD", 2021));
        list.add(new CD("sp5", "Phim kiếm hiệp", "CD", 2022));
        list.add(new CD("sp6", "Phim cổ trang", "CD", 2023));
    }

    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblCD.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);

        model.addColumn("Mã sp");
        model.addColumn("Tiêu đề");
        model.addColumn("Loại");
        model.addColumn("Năm xuất bản");
        model.setRowCount(0);
        for (CD cd : list) {
            Object[] row = {cd.getMaSp(), cd.getTieuDe(), cd.getLoai(), cd.getNamXB()};
            model.addRow(row);
        }
    }

    public void showDetail() {
        int index = tblCD.getSelectedRow();
        CD cd = list.get(index);
        txtMa.setText(cd.getMaSp());
        txtTieuDe.setText(cd.getTieuDe());
        txtLoai.setText(cd.getLoai() + "");
        txtNamXB.setText(Integer.toString(cd.getNamXB()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCD;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNamXB;
    private javax.swing.JTextField txtTieuDe;
    // End of variables declaration//GEN-END:variables
}
