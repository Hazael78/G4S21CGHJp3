/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21cghjp3;

import Operaciones.Avanzado;
import Operaciones.Basicas;

/**
 *
 * @author hazae
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        lblresultado = new javax.swing.JLabel();
        btnResta = new javax.swing.JButton();
        btnDivi = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnRaizcua = new javax.swing.JButton();
        btnRaizcub = new javax.swing.JButton();
        btnFac = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Operaciones Basicas");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Primer numero");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Segundo numero");

        btnSuma.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(0, 153, 0));
        btnSuma.setText("Sumar");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        lblresultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblresultado.setForeground(new java.awt.Color(204, 0, 204));
        lblresultado.setText("Resultado");

        btnResta.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        btnResta.setForeground(new java.awt.Color(0, 153, 0));
        btnResta.setText("Resta");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnDivi.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        btnDivi.setForeground(new java.awt.Color(0, 153, 0));
        btnDivi.setText("Diviscion");
        btnDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiviActionPerformed(evt);
            }
        });

        btnMulti.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        btnMulti.setForeground(new java.awt.Color(0, 153, 0));
        btnMulti.setText("Multiplicacion");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnPotencia.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        btnPotencia.setForeground(new java.awt.Color(0, 153, 0));
        btnPotencia.setText("Potencia");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnRaizcua.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnRaizcua.setForeground(new java.awt.Color(255, 102, 51));
        btnRaizcua.setText("Raiz Cuadrada");
        btnRaizcua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizcuaActionPerformed(evt);
            }
        });

        btnRaizcub.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnRaizcub.setForeground(new java.awt.Color(255, 102, 51));
        btnRaizcub.setText("Raiz Cubica");
        btnRaizcub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizcubActionPerformed(evt);
            }
        });

        btnFac.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnFac.setForeground(new java.awt.Color(255, 102, 51));
        btnFac.setText("Factorial");
        btnFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacActionPerformed(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnLog.setForeground(new java.awt.Color(255, 102, 51));
        btnLog.setText("Logaritmo");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnum2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(txtnum1))
                            .addComponent(lblresultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPotencia)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSuma)
                                .addGap(18, 18, 18)
                                .addComponent(btnResta)
                                .addGap(18, 18, 18)
                                .addComponent(btnDivi)
                                .addGap(18, 18, 18)
                                .addComponent(btnMulti))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFac)
                                .addGap(18, 18, 18)
                                .addComponent(btnLog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRaizcua)
                                .addGap(18, 18, 18)
                                .addComponent(btnRaizcub)))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuma)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnResta)
                        .addComponent(btnDivi)
                        .addComponent(btnMulti)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPotencia)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFac)
                    .addComponent(btnLog)
                    .addComponent(btnRaizcua)
                    .addComponent(btnRaizcub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Basicas objbasicas = new Basicas();
        lblresultado.setText("El resultado de la suma es " + String.valueOf(objbasicas.Sumar(num1, Integer.valueOf(txtnum2.getText())))); 
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Basicas objbasicas = new Basicas();
        lblresultado.setText("El resultado de la resta es " + String.valueOf(objbasicas.Resta(num1, Integer.valueOf(txtnum2.getText())))); 
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiviActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Basicas objbasicas = new Basicas();
        lblresultado.setText("El resultado de la division es " + String.valueOf(objbasicas.Divi(num1, Integer.valueOf(txtnum2.getText()))));
    }//GEN-LAST:event_btnDiviActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Basicas objbasicas = new Basicas();
        lblresultado.setText("El resultado de la multiplicacion es " + String.valueOf(objbasicas.Multi(num1, Integer.valueOf(txtnum2.getText()))));
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblresultado.setText("El resultado de la potencia es " + String.valueOf(objavanzado.potencia(Integer.valueOf(txtnum1.getText()), Integer.valueOf(txtnum2.getText()))));
        
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnRaizcuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizcuaActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblresultado.setText("El resultado de la raiz cuadrada es " + String.valueOf(objavanzado.rcuadrada(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnRaizcuaActionPerformed

    private void btnRaizcubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizcubActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblresultado.setText("El resultado de la raiz cubica es " + String.valueOf(objavanzado.rcubica(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnRaizcubActionPerformed

    private void btnFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblresultado.setText("El resultado del factorial es " + String.valueOf(objavanzado.factorial(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnFacActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblresultado.setText("El resultado del logaritmo de es " + String.valueOf(objavanzado.logaritmo(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnLogActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivi;
    private javax.swing.JButton btnFac;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnRaizcua;
    private javax.swing.JButton btnRaizcub;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    // End of variables declaration//GEN-END:variables
}
