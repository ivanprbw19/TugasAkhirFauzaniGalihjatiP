package tugasakhir;

import javax.swing.JOptionPane;

/**
 *
 * @author M S I
 */
public class ojaaaaaaaaaan extends javax.swing.JFrame {

    static String salam(){
    return " Selamat datang Mahasiswa Fakultas Hukum, Universitas Indonesia." + "\n Silahkan input : ";
    }

    public ojaaaaaaaaaan() {
        initComponents();
        
        kelasta objek = new kelasta();
        objek.setTes("      > Nama");
        objek.setTess("      > Nomor Ujian");
        objek.setTesss("      > Shift");
        objek.setTessss(" Pada Kolom yang tersedia" + "\n Selamat Mengerjakan Ujian Akhir Semester!");
        kolomHasil.setText(salam() + "\n" + objek.getTes() + "\n" + objek.getTess() + "\n" + objek.getTesss() + "\n" + objek.getTessss());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kolomShift = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        kolomHasil = new javax.swing.JTextArea();
        btnGo = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        kolomNama = new javax.swing.JTextField();
        kolomNoUjian = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kolomShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\tMasukkan Shift Ujian Anda", "\tShift 1", "\tShift 2", "\tShift 3", "\tShift 4", "\tShift 5", "\tShift 6" }));
        kolomShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomShiftActionPerformed(evt);
            }
        });
        getContentPane().add(kolomShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 310, 50));

        kolomHasil.setEditable(false);
        kolomHasil.setColumns(20);
        kolomHasil.setRows(5);
        jScrollPane1.setViewportView(kolomHasil);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 416, 540, 130));

        btnGo.setText("GO");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 140, 50));

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 120, 50));

        kolomNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomNamaActionPerformed(evt);
            }
        });
        kolomNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kolomNamaKeyTyped(evt);
            }
        });
        getContentPane().add(kolomNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 310, 50));
        getContentPane().add(kolomNoUjian, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 310, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasakhir/ojan (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
            try {
            String nama = kolomNama.getText();
            String noUjian = kolomNoUjian.getText();
            String action = null;
            String Waktu = null;
            String Ruang = null;
            int shift = kolomShift.getSelectedIndex();
            switch (shift) {
                case 1:
                    action = "Silahkan Masuk Ujian pada : ";
                    Waktu = "Waktu : Senin, Pukul 07.00 - 08.30";
                    Ruang = "Ruang : H207 ";
                    break;
                case 2:
                    action = "Silahkan Masuk Ujian pada : ";
                    Waktu = "Waktu : Senin, Pukul 08.45 - 10.15";
                    Ruang = "Ruang : H209 ";
                    break;
                case 3:
                    action = "Silahkan Masuk Ujian pada : ";
                    Waktu = "Waktu : Senin, Pukul 10.30 - 12.00";
                    Ruang = "Ruang : H211 ";
                    break;
                case 4:
                    action = "Silahkan Masuk Ujian pada : ";
                    Waktu = "Waktu : Selasa, Pukul 07.00 - 08.30";
                    Ruang = "Ruang : H207 ";
                    break;
                case 5:
                    action = "Silahkan Masuk Ujian pada : ";
                    Waktu = "Waktu : Selasa, Pukul 08.45 - 10.15";
                    Ruang = "Ruang : H209 ";
                    break;
                case 6:
                    action = "Silahkan Masuk Ujian pada : ";
                    Waktu = "Waktu : Selasa, Pukul 10.30 - 12.00";
                    Ruang = "Ruang : H211 ";
                    break;
            }
            kolomHasil.setText("Saudara/i " + nama + " dengan Nomor Ujian " + noUjian + "." + "\n" + action + "\n" + Waktu + "\n" + Ruang + "\nSelamat Mengerjakan Ujian Akhir Semester!");
        }
              catch (Exception e){
                  kolomHasil.setText ("Masukkan Input dengan Benar!");
            
        }
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int Exit = JOptionPane.showConfirmDialog(this,
                "Do you want to exit?",
                "Warning!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (JOptionPane.YES_OPTION == Exit) {
            System.exit(0);
       }
    }//GEN-LAST:event_btnExitActionPerformed

    private void kolomNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomNamaActionPerformed

    private void kolomNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kolomNamaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomNamaKeyTyped

    private void kolomShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomShiftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomShiftActionPerformed

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
            java.util.logging.Logger.getLogger(ojaaaaaaaaaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ojaaaaaaaaaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ojaaaaaaaaaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ojaaaaaaaaaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ojaaaaaaaaaan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea kolomHasil;
    private javax.swing.JTextField kolomNama;
    private javax.swing.JTextField kolomNoUjian;
    private javax.swing.JComboBox<String> kolomShift;
    // End of variables declaration//GEN-END:variables
}
