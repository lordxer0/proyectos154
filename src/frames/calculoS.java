/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author sena
 */
public class calculoS extends javax.swing.JFrame {

    /**
     * Creates new form calculoS
     */
    public calculoS() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        horasExtraDiurnas = new javax.swing.JTextField();
        horasExtraNocturnas = new javax.swing.JTextField();
        totalExtras = new javax.swing.JTextField();
        seguridadSocial = new javax.swing.JTextField();
        valorHoraExtraDiur = new javax.swing.JTextField();
        valorHoraExtraNoc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        salarioTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        trabajadorNumero = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoPagos = new javax.swing.JTextArea();
        ingresarSalario = new javax.swing.JButton();
        totalPagado = new javax.swing.JTextField();
        SALIR = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PAZ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jLabel1.setText("CALCULADORA SALARIO");

        jLabel2.setText("llene los siguientes cuadros con los datos requeridos :");

        jLabel3.setText("horas extra diurnas:");

        jLabel4.setText("horas extra nocturnas:");

        jLabel5.setText("total horas extra:");

        jLabel6.setText("seguridad social:");

        horasExtraDiurnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasExtraDiurnasActionPerformed(evt);
            }
        });

        horasExtraNocturnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasExtraNocturnasActionPerformed(evt);
            }
        });

        totalExtras.setEditable(false);
        totalExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalExtrasActionPerformed(evt);
            }
        });

        seguridadSocial.setEditable(false);
        seguridadSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguridadSocialActionPerformed(evt);
            }
        });

        valorHoraExtraDiur.setEditable(false);
        valorHoraExtraDiur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorHoraExtraDiurActionPerformed(evt);
            }
        });

        valorHoraExtraNoc.setEditable(false);
        valorHoraExtraNoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorHoraExtraNocActionPerformed(evt);
            }
        });

        jLabel7.setText("total salario:");

        jLabel8.setText("trabajador # :");

        listadoPagos.setColumns(20);
        listadoPagos.setRows(5);
        jScrollPane1.setViewportView(listadoPagos);

        ingresarSalario.setText("AGREGAR A LA LISTA");
        ingresarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarSalarioActionPerformed(evt);
            }
        });

        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        jLabel9.setText(">;V v:<");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SALIR)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salarioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seguridadSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(horasExtraDiurnas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(valorHoraExtraDiur, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(horasExtraNocturnas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(valorHoraExtraNoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(trabajadorNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ingresarSalario)
                            .addComponent(jScrollPane1)
                            .addComponent(totalPagado))))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PAZ)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PAZ)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(trabajadorNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(horasExtraDiurnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorHoraExtraDiur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(horasExtraNocturnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorHoraExtraNoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(totalExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seguridadSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(salarioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(SALIR)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ingresarSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void horasExtraDiurnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasExtraDiurnasActionPerformed
        // TODO add your handling code here:
        double horasExtraDiurnas = Integer.parseInt(this.horasExtraDiurnas.getText());

        String valorED = Double.toString(horasExtraDiurnas * (7500 * 1.35));
        this.valorHoraExtraDiur.setText(valorED);
        if (this.horasExtraNocturnas.getText().equals("")) {
            this.horasExtraNocturnas.requestFocus();
        } else {
            calcularSalario();
            agregarALista();
        }
    }//GEN-LAST:event_horasExtraDiurnasActionPerformed

    private void horasExtraNocturnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasExtraNocturnasActionPerformed
        // TODO add your handling code here:

        double horasExtraNocturnas = Integer.parseInt(this.horasExtraNocturnas.getText());

        String valorED = Double.toString(horasExtraNocturnas * (7500 * 1.50));
        this.valorHoraExtraNoc.setText(valorED);
        if (this.horasExtraDiurnas.getText().equals("")) {
            this.horasExtraDiurnas.requestFocus();
        } else {
            calcularSalario();
            agregarALista();
        }
    }//GEN-LAST:event_horasExtraNocturnasActionPerformed

    private void totalExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalExtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalExtrasActionPerformed

    private void seguridadSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguridadSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seguridadSocialActionPerformed

    private void valorHoraExtraDiurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorHoraExtraDiurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorHoraExtraDiurActionPerformed

    private void valorHoraExtraNocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorHoraExtraNocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorHoraExtraNocActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void ingresarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarSalarioActionPerformed
        // TODO add your handling code here:
        agregarALista();

    }//GEN-LAST:event_ingresarSalarioActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

    /**
     * @param args the command line arguments
     */
    private final double seguridaSocial = 1500000 * .08;
    private int trabajadorN = 0;
    private double totalPagos = 0;

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
            java.util.logging.Logger.getLogger(calculoS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculoS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculoS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculoS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculoS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PAZ;
    private javax.swing.JButton SALIR;
    private javax.swing.JTextField horasExtraDiurnas;
    private javax.swing.JTextField horasExtraNocturnas;
    private javax.swing.JButton ingresarSalario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listadoPagos;
    private javax.swing.JTextField salarioTotal;
    private javax.swing.JTextField seguridadSocial;
    private javax.swing.JTextField totalExtras;
    private javax.swing.JTextField totalPagado;
    private javax.swing.JLabel trabajadorNumero;
    private javax.swing.JTextField valorHoraExtraDiur;
    private javax.swing.JTextField valorHoraExtraNoc;
    // End of variables declaration//GEN-END:variables

    private void agregarALista() {
        this.trabajadorN = trabajadorN + 1;
        this.listadoPagos.append("\n el trabajador " + trabajadorN
                + "\n gano " + this.salarioTotal.getText());

        totalPagos = totalPagos + (Double.parseDouble(this.salarioTotal.getText()));
        this.totalPagado.setText(Double.toString(totalPagos));

        this.trabajadorNumero.setText(Integer.toString(trabajadorN));
        this.horasExtraDiurnas.setText("");
        this.horasExtraNocturnas.setText("");
    }

    private void calcularSalario() {
        String segu = Double.toString(seguridaSocial);
            this.seguridadSocial.setText(segu);
            double valorT = Double.parseDouble(this.valorHoraExtraDiur.getText())
                    + Double.parseDouble(this.valorHoraExtraNoc.getText());
            this.totalExtras.setText(Double.toString(valorT));
            double totalSalario = (1500000 + valorT) - seguridaSocial;
            this.salarioTotal.setText(Double.toString(totalSalario));
    }
}
