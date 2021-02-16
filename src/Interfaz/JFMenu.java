package Interfaz;

import SQL.ConexionSQL;
import javax.swing.JOptionPane;

/**
 * @author Valery
 */
public class JFMenu extends javax.swing.JFrame {

    ConexionSQL conexionSQL;
    JFReserva jfreserva;
    
    public JFMenu() {
        initComponents();
        this.setLocationRelativeTo(jMenuBar);
        conexionSQL = new ConexionSQL();
        jfreserva = new JFReserva();
        this.setExtendedState(MAXIMIZED_BOTH);    //Maximizar el formulario
        this.jMnuInicio.setVisible(false);
        this.jMnuFile.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPFContraseña = new javax.swing.JPasswordField();
        jTFUsuario = new javax.swing.JTextField();
        jLUsuario = new javax.swing.JLabel();
        jLContraseña = new javax.swing.JLabel();
        jBAceptar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMnuFile = new javax.swing.JMenu();
        jMnuSalir = new javax.swing.JMenuItem();
        jMnuInicio = new javax.swing.JMenu();
        jMnuConexion = new javax.swing.JMenuItem();
        jMnuBasesDatos = new javax.swing.JMenu();
        jMnuReserva = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Vector");

        jTFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsuarioActionPerformed(evt);
            }
        });

        jLUsuario.setText("Usuario:");

        jLContraseña.setText("Contraseña:");

        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jMnuFile.setText("File");

        jMnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMnuSalir.setText("Salir");
        jMnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSalirActionPerformed(evt);
            }
        });
        jMnuFile.add(jMnuSalir);

        jMenuBar.add(jMnuFile);

        jMnuInicio.setText("Inicio");

        jMnuConexion.setText("Conexión");
        jMnuConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConexionActionPerformed(evt);
            }
        });
        jMnuInicio.add(jMnuConexion);

        jMenuBar.add(jMnuInicio);

        jMnuBasesDatos.setText("Base de Datos");

        jMnuReserva.setText("Reserva de Vuelos");
        jMnuReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuReservaActionPerformed(evt);
            }
        });
        jMnuBasesDatos.add(jMnuReserva);

        jMenuBar.add(jMnuBasesDatos);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLContraseña)
                            .addComponent(jLUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPFContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jBAceptar)
                        .addGap(23, 23, 23)
                        .addComponent(jBCancelar)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLContraseña)
                    .addComponent(jPFContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAceptar)
                    .addComponent(jBCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMnuSalirActionPerformed

    private void jMnuConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConexionActionPerformed
        if(conexionSQL.verificarConexion() == true){
            this.jMnuBasesDatos.setVisible(true);
        }
    }//GEN-LAST:event_jMnuConexionActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
       String usuario="KevinSQL"; 
       String clave="KevinSQL";
       
       String contraseña = new String(jPFContraseña.getPassword());
               
       if (usuario.compareTo(jTFUsuario.getText())==0){
           if(clave.compareTo(contraseña)==0){
               JOptionPane.showMessageDialog(null, "¡Bienvenido " + jTFUsuario.getText() + "! Ahora puedes acceder al menu de operaciones.");
               jMnuInicio.setVisible(true);
               jMnuFile.setVisible(true);
               jMnuBasesDatos.setVisible(false);
               jLContraseña.setVisible(false);
               jLUsuario.setVisible(false);
               jPFContraseña.setVisible(false);
               jTFUsuario.setVisible(false);
               jBAceptar.setVisible(false);
               jBCancelar.setVisible(false);
               
           }else{
               JOptionPane.showMessageDialog(null, usuario + " . La contraseña ingresada es incorrecta. Inténtelo nuevamente");
               jPFContraseña.setText("");
               jPFContraseña.requestFocus();
           }
       }else{
           JOptionPane.showMessageDialog(null, "El usuario no fue encontrado.");
           jTFUsuario.setText("");
           jPFContraseña.setText("");
           jTFUsuario.requestFocus();
       }
       
        
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jTFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsuarioActionPerformed

    }//GEN-LAST:event_jTFUsuarioActionPerformed

    private void jMnuReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuReservaActionPerformed
        this.jfreserva.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMnuReservaActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JLabel jLContraseña;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMnuBasesDatos;
    private javax.swing.JMenuItem jMnuConexion;
    private javax.swing.JMenu jMnuFile;
    private javax.swing.JMenu jMnuInicio;
    private javax.swing.JMenuItem jMnuReserva;
    private javax.swing.JMenuItem jMnuSalir;
    private javax.swing.JPasswordField jPFContraseña;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
