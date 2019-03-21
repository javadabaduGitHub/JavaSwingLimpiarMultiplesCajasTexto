package view;

import util.SwingUtil;

public class TerceroView extends javax.swing.JDialog {

    public TerceroView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTercero = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTFApellido1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTFApellido2 = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jTFRazonSocial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFNombreComercial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRBRegimenComun = new javax.swing.JRadioButton();
        jRBCategoriaTI = new javax.swing.JRadioButton();
        jRBRegimenSimplificado = new javax.swing.JRadioButton();
        jRBCategoriaCE = new javax.swing.JRadioButton();
        jRBRegimenEspecial = new javax.swing.JRadioButton();
        jRBCategoriaTE = new javax.swing.JRadioButton();
        jRBCategoriaRC = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRBCategoriaPA = new javax.swing.JRadioButton();
        jTFPaisCodigo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTFMunicipioCodigo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFNombre1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRBCategoriaNIT = new javax.swing.JRadioButton();
        jRBCategoriaCC = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jTFNombre2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTercero.setBorder(javax.swing.BorderFactory.createTitledBorder("Tercero"));

        jLabel6.setText("Apeliido 2");

        jTFTelefono.setText("3137114545");

        jLabel7.setText("Apellido 1");

        jLabel17.setText("Teléfono");

        jTFApellido1.setText("DE LA CRUZ");

        jLabel18.setText("Dirección");

        jTFApellido2.setText("CRUZ");

        jTFDireccion.setText("LAURELES DEL BALCÓN");

        jTFRazonSocial.setText("EMPRESA PRIVADA");

        jLabel8.setText("Razón social");

        jTFNombreComercial.setText("LFDEL");

        jLabel9.setText("Nombre comercial");

        jLabel10.setText("Régimen");

        jRBRegimenComun.setText("Común");

        jRBCategoriaTI.setText("TI");

        jRBRegimenSimplificado.setText("Simplificado");

        jRBCategoriaCE.setText("CE");

        jRBRegimenEspecial.setText("Especial");

        jRBCategoriaTE.setText("TE");

        jRBCategoriaRC.setText("RC");

        jLabel11.setText("País");

        jRBCategoriaPA.setText("PA");

        jTFPaisCodigo.setText("COLOMBIA");

        jLabel12.setText("Buscar");

        jTFMunicipioCodigo.setText("ARMENIA");

        jLabel13.setText("Buscar");

        jLabel3.setText("Nombre 1");

        jTFNombre1.setText("LEOANRDO");

        jLabel2.setText("Documento");

        jTFDocumento.setText("7537141");

        jLabel4.setText("Categoría");

        jRBCategoriaNIT.setText("NIT");

        jRBCategoriaCC.setText("CC");

        jLabel14.setText("Municipio");

        jLabel15.setText("Email");

        jLabel5.setText("Nombre 2");

        jTFEmail.setText("LFDEL@GMAIL.COM");

        jTFNombre2.setText("FABIO");

        javax.swing.GroupLayout jPanelTerceroLayout = new javax.swing.GroupLayout(jPanelTercero);
        jPanelTercero.setLayout(jPanelTerceroLayout);
        jPanelTerceroLayout.setHorizontalGroup(
            jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTerceroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTerceroLayout.createSequentialGroup()
                        .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFDocumento)
                            .addGroup(jPanelTerceroLayout.createSequentialGroup()
                                .addComponent(jRBCategoriaNIT)
                                .addGap(18, 18, 18)
                                .addComponent(jRBCategoriaCC)
                                .addGap(18, 18, 18)
                                .addComponent(jRBCategoriaTI)
                                .addGap(18, 18, 18)
                                .addComponent(jRBCategoriaCE)
                                .addGap(18, 18, 18)
                                .addComponent(jRBCategoriaTE)
                                .addGap(18, 18, 18)
                                .addComponent(jRBCategoriaRC)
                                .addGap(18, 18, 18)
                                .addComponent(jRBCategoriaPA))))
                    .addGroup(jPanelTerceroLayout.createSequentialGroup()
                        .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNombre1)
                            .addComponent(jTFNombre2)
                            .addComponent(jTFApellido1)
                            .addComponent(jTFApellido2)
                            .addComponent(jTFRazonSocial)
                            .addComponent(jTFNombreComercial)
                            .addGroup(jPanelTerceroLayout.createSequentialGroup()
                                .addComponent(jRBRegimenComun)
                                .addGap(18, 18, 18)
                                .addComponent(jRBRegimenSimplificado)
                                .addGap(18, 18, 18)
                                .addComponent(jRBRegimenEspecial))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTerceroLayout.createSequentialGroup()
                        .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTerceroLayout.createSequentialGroup()
                                .addComponent(jTFPaisCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12))
                            .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelTerceroLayout.createSequentialGroup()
                                .addComponent(jTFMunicipioCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelTerceroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel14, jLabel15, jLabel17, jLabel18, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanelTerceroLayout.setVerticalGroup(
            jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTerceroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRBCategoriaNIT)
                    .addComponent(jRBCategoriaCC)
                    .addComponent(jRBCategoriaTI)
                    .addComponent(jRBCategoriaCE)
                    .addComponent(jRBCategoriaTE)
                    .addComponent(jRBCategoriaRC)
                    .addComponent(jRBCategoriaPA))
                .addGap(18, 18, 18)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFNombreComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jRBRegimenComun)
                    .addComponent(jRBRegimenSimplificado)
                    .addComponent(jRBRegimenEspecial))
                .addGap(18, 18, 18)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTFPaisCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTFMunicipioCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Enviar");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTercero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButton1)
                .addGap(3, 3, 3)
                .addComponent(jBLimpiar)
                .addGap(3, 3, 3)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelTercero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jBLimpiar)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jBLimpiarActionPerformed();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TerceroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TerceroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TerceroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TerceroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TerceroView dialog = new TerceroView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelTercero;
    private javax.swing.JRadioButton jRBCategoriaCC;
    private javax.swing.JRadioButton jRBCategoriaCE;
    private javax.swing.JRadioButton jRBCategoriaNIT;
    private javax.swing.JRadioButton jRBCategoriaPA;
    private javax.swing.JRadioButton jRBCategoriaRC;
    private javax.swing.JRadioButton jRBCategoriaTE;
    private javax.swing.JRadioButton jRBCategoriaTI;
    private javax.swing.JRadioButton jRBRegimenComun;
    private javax.swing.JRadioButton jRBRegimenEspecial;
    private javax.swing.JRadioButton jRBRegimenSimplificado;
    private javax.swing.JTextField jTFApellido1;
    private javax.swing.JTextField jTFApellido2;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFDocumento;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFMunicipioCodigo;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFNombre2;
    private javax.swing.JTextField jTFNombreComercial;
    private javax.swing.JTextField jTFPaisCodigo;
    private javax.swing.JTextField jTFRazonSocial;
    private javax.swing.JTextField jTFTelefono;
    // End of variables declaration//GEN-END:variables

    void init() {
        setLocationRelativeTo(null);
        setTitle("");
    }

    void jBLimpiarActionPerformed() {
        limpiar();
    }

    void limpiar() {
        // solución # 1
        SwingUtil.limpiar("", // texto por defecto 
                jTFDocumento, // caja de texto 1
                jTFNombre1, // caja de texto 2
                jTFNombre2,
                jTFApellido1,
                jTFApellido2,
                jTFRazonSocial,
                jTFNombreComercial,
                jTFPaisCodigo,
                jTFMunicipioCodigo,
                jTFEmail,
                jTFTelefono,
                jTFDireccion // caja de texto n
        );
        // solución # 2
        SwingUtil.limpiar("", jPanelTercero);
    }

}
