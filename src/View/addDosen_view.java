/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author user
 */
public class addDosen_view extends javax.swing.JFrame {

    /**
     * Creates new form Dosen_view
     */
    public addDosen_view() {
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

        JenisKelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNamaDataDosen = new javax.swing.JTextField();
        tfNidnDataDosen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbLakiDataDosen = new javax.swing.JRadioButton();
        rbPerempuanDataDosen = new javax.swing.JRadioButton();
        btnAddDataDosen = new javax.swing.JButton();
        btnEditDataDosen = new javax.swing.JButton();
        btnRemoveDataDosen = new javax.swing.JButton();
        btnResetDataDosen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDataDosen = new javax.swing.JTable();
        tfSearchDataDosen = new javax.swing.JTextField();
        btnSearchDataDosen = new javax.swing.JButton();
        cbKkDataDosen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Data Dosen");

        jLabel2.setText("Nama");

        jLabel3.setText("NIDN/NIP");

        jLabel4.setText("KK");

        jLabel5.setText("Jenis kelamin");

        JenisKelamin.add(rbLakiDataDosen);
        rbLakiDataDosen.setText("Laki-laki");

        JenisKelamin.add(rbPerempuanDataDosen);
        rbPerempuanDataDosen.setText("Perempuan");

        btnAddDataDosen.setText("Add");
        btnAddDataDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataDosenActionPerformed(evt);
            }
        });

        btnEditDataDosen.setText("Edit");
        btnEditDataDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDataDosenActionPerformed(evt);
            }
        });

        btnRemoveDataDosen.setText("Remove");

        btnResetDataDosen.setText("Reset");
        btnResetDataDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDataDosenActionPerformed(evt);
            }
        });

        tbDataDosen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama", "NIDN/NIP", "KK"
            }
        ));
        jScrollPane1.setViewportView(tbDataDosen);

        tfSearchDataDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchDataDosenActionPerformed(evt);
            }
        });

        btnSearchDataDosen.setText("Search");

        cbKkDataDosen.setEditable(true);
        cbKkDataDosen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIDE", "ICM", "TELE", "MCE" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNamaDataDosen)
                                    .addComponent(tfNidnDataDosen)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbLakiDataDosen)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbPerempuanDataDosen)
                                        .addGap(0, 120, Short.MAX_VALUE))
                                    .addComponent(cbKkDataDosen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddDataDosen)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditDataDosen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemoveDataDosen)
                                .addGap(18, 18, 18)
                                .addComponent(btnResetDataDosen)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(43, 43, 43)
                        .addComponent(tfSearchDataDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchDataDosen)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(317, 317, 317))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNamaDataDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNidnDataDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbKkDataDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbLakiDataDosen)
                    .addComponent(rbPerempuanDataDosen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDataDosen)
                    .addComponent(btnEditDataDosen)
                    .addComponent(btnRemoveDataDosen)
                    .addComponent(btnResetDataDosen)
                    .addComponent(tfSearchDataDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchDataDosen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDataDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddDataDosenActionPerformed

    private void btnEditDataDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDataDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditDataDosenActionPerformed

    private void btnResetDataDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDataDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetDataDosenActionPerformed

    private void tfSearchDataDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchDataDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchDataDosenActionPerformed

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
            java.util.logging.Logger.getLogger(addDosen_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDosen_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDosen_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDosen_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDosen_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup JenisKelamin;
    private javax.swing.JButton btnAddDataDosen;
    private javax.swing.JButton btnEditDataDosen;
    private javax.swing.JButton btnRemoveDataDosen;
    private javax.swing.JButton btnResetDataDosen;
    private javax.swing.JButton btnSearchDataDosen;
    private javax.swing.JComboBox<String> cbKkDataDosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbLakiDataDosen;
    private javax.swing.JRadioButton rbPerempuanDataDosen;
    private javax.swing.JTable tbDataDosen;
    private javax.swing.JTextField tfNamaDataDosen;
    private javax.swing.JTextField tfNidnDataDosen;
    private javax.swing.JTextField tfSearchDataDosen;
    // End of variables declaration//GEN-END:variables
}
