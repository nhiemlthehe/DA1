/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

/**
 *
 * @author Ly Tinh Nhiem
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        menuPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        clbTrangChu = new controller.CustomLabel();
        clbGiaoDich = new controller.CustomLabel();
        clbHoaDon = new controller.CustomLabel();
        clbDoiHang = new controller.CustomLabel();
        clbNhanVien = new controller.CustomLabel();
        clbKhachHang = new controller.CustomLabel();
        clbNhaCungCap = new controller.CustomLabel();
        clbSanPham = new controller.CustomLabel();
        clbChiTietSanPham = new controller.CustomLabel();
        clbNhapHang = new controller.CustomLabel();
        clbKhuyenMai = new controller.CustomLabel();
        clbThongKe = new controller.CustomLabel();
        clbThoat = new controller.CustomLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAnhDaiDien = new controller.WhiteLabel();
        myButton1 = new controller.BlackButton();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1550, 870));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel1.setBackground(new java.awt.Color(0, 0, 0));
        menuPanel1.setPreferredSize(new java.awt.Dimension(80, 850));
        menuPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logox75.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        menuPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 50, 50));
        menuPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, -1));
        menuPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 80, -1));
        menuPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 80, -1));
        menuPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 465, 80, -1));
        menuPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 80, -1));
        menuPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 80, -1));

        clbTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/TrangChu_24x.jpg"))); // NOI18N
        menuPanel1.add(clbTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, 55));

        clbGiaoDich.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbGiaoDich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/GiaoDich_24x.jpg"))); // NOI18N
        menuPanel1.add(clbGiaoDich, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 80, 55));

        clbHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HoaDon_24x.jpg"))); // NOI18N
        menuPanel1.add(clbHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 80, 55));

        clbDoiHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbDoiHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/DoiHang_24x.jpg"))); // NOI18N
        clbDoiHang.setAutoscrolls(true);
        menuPanel1.add(clbDoiHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, 80, 55));

        clbNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/NhanVien_24x.jpg"))); // NOI18N
        menuPanel1.add(clbNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 80, 55));

        clbKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/KhachHang_24x.png"))); // NOI18N
        menuPanel1.add(clbKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 355, 80, 55));

        clbNhaCungCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbNhaCungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/NhaCungCap_24x.jpg"))); // NOI18N
        menuPanel1.add(clbNhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 80, 55));

        clbSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SanPham_24x.jpg"))); // NOI18N
        menuPanel1.add(clbSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 465, 80, 55));

        clbChiTietSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbChiTietSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ChiTietSanPham_24x.jpg"))); // NOI18N
        menuPanel1.add(clbChiTietSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 80, 55));

        clbNhapHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/NhapHang_24x.jpg"))); // NOI18N
        menuPanel1.add(clbNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 575, 80, 55));

        clbKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/KhuyenMai_24x.jpg"))); // NOI18N
        menuPanel1.add(clbKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 80, 55));

        clbThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ThongKe_24x.jpg"))); // NOI18N
        clbThongKe.setToolTipText("");
        menuPanel1.add(clbThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 685, 80, 55));

        clbThoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Thoat_24x.jpg"))); // NOI18N
        menuPanel1.add(clbThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 80, 55));

        getContentPane().add(menuPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(1800, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Role : ");
        jLabel3.setToolTipText("");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 40, -1, -1));

        lblAnhDaiDien.setText(" ");
        lblAnhDaiDien.setRadius(40);
        jPanel3.add(lblAnhDaiDien, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, 40, 40));

        myButton1.setBackground(new java.awt.Color(23, 23, 23));
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText(" ");
        myButton1.setPreferredSize(new java.awt.Dimension(100, 60));
        myButton1.setRadius(60);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(myButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, 220, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 80));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setForeground(new java.awt.Color(240, 62, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 1460, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controller.CustomLabel clbChiTietSanPham;
    private controller.CustomLabel clbDoiHang;
    private controller.CustomLabel clbGiaoDich;
    private controller.CustomLabel clbHoaDon;
    private controller.CustomLabel clbKhachHang;
    private controller.CustomLabel clbKhuyenMai;
    private controller.CustomLabel clbNhaCungCap;
    private controller.CustomLabel clbNhanVien;
    private controller.CustomLabel clbNhapHang;
    private controller.CustomLabel clbSanPham;
    private controller.CustomLabel clbThoat;
    private controller.CustomLabel clbThongKe;
    private controller.CustomLabel clbTrangChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private controller.WhiteLabel lblAnhDaiDien;
    private javax.swing.JPanel menuPanel1;
    private controller.BlackButton myButton1;
    // End of variables declaration//GEN-END:variables
}
