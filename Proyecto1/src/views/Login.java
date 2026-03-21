package views;

import views.DashboardAdmin.dashboard;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import models.Usuario;
import utils.Sistema;

public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());
    int xMouse, yMouse;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgImagen = new javax.swing.JPanel();
        LogoUsac = new javax.swing.JLabel();
        NombreProyecto = new javax.swing.JLabel();
        NombreFacultad = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        tituloContraseña = new javax.swing.JLabel();
        tituloUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JPanel();
        tituloIngresar = new javax.swing.JLabel();
        BarraNavegacion = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        crearCuenta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgImagen.setBackground(new java.awt.Color(204, 204, 204));

        LogoUsac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoUsac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoUSAC.png"))); // NOI18N
        LogoUsac.setToolTipText("");

        NombreProyecto.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        NombreProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreProyecto.setText("BibliSystem");

        NombreFacultad.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        NombreFacultad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NombreFacultad.setText("FIUSAC  ");

        javax.swing.GroupLayout bgImagenLayout = new javax.swing.GroupLayout(bgImagen);
        bgImagen.setLayout(bgImagenLayout);
        bgImagenLayout.setHorizontalGroup(
            bgImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoUsac, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
            .addComponent(NombreProyecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NombreFacultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgImagenLayout.setVerticalGroup(
            bgImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgImagenLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(LogoUsac)
                .addGap(18, 18, 18)
                .addComponent(NombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(NombreFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(bgImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 370, 600));

        Titulo.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        Titulo.setText("Iniciar Sesión");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 300, 90));

        tituloContraseña.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        tituloContraseña.setText("COntraseña");
        bg.add(tituloContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 200, 40));

        tituloUsuario.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        tituloUsuario.setText("Usuario");
        bg.add(tituloUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 200, 40));

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 400, 40));

        txtContra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtContra.setForeground(new java.awt.Color(204, 204, 204));
        txtContra.setText("**********");
        txtContra.setBorder(null);
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        bg.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 400, 40));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 400, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 400, -1));

        btnIngresar.setBackground(new java.awt.Color(204, 204, 204));
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });

        tituloIngresar.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        tituloIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloIngresar.setText("Ingresar");
        tituloIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tituloIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloIngresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnIngresarLayout = new javax.swing.GroupLayout(btnIngresar);
        btnIngresar.setLayout(btnIngresarLayout);
        btnIngresarLayout.setHorizontalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIngresarLayout.createSequentialGroup()
                .addComponent(tituloIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnIngresarLayout.setVerticalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnIngresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 150, 50));

        BarraNavegacion.setBackground(new java.awt.Color(255, 255, 255));
        BarraNavegacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraNavegacionMouseDragged(evt);
            }
        });
        BarraNavegacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraNavegacionMousePressed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("x");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BarraNavegacionLayout = new javax.swing.GroupLayout(BarraNavegacion);
        BarraNavegacion.setLayout(BarraNavegacionLayout);
        BarraNavegacionLayout.setHorizontalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraNavegacionLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 865, Short.MAX_VALUE))
        );
        BarraNavegacionLayout.setVerticalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(BarraNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        crearCuenta.setBackground(new java.awt.Color(255, 255, 255));
        crearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCuentaMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Aún no tienes cuenta? Crea una cuenta aquí");

        javax.swing.GroupLayout crearCuentaLayout = new javax.swing.GroupLayout(crearCuenta);
        crearCuenta.setLayout(crearCuentaLayout);
        crearCuentaLayout.setHorizontalGroup(
            crearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        crearCuentaLayout.setVerticalGroup(
            crearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(crearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BarraNavegacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraNavegacionMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraNavegacionMousePressed

    private void BarraNavegacionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraNavegacionMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_BarraNavegacionMouseDragged

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setForeground(Color.red);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setForeground(Color.black);
    }//GEN-LAST:event_btnExitMouseExited

    private void tituloIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloIngresarMouseEntered
        btnIngresar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_tituloIngresarMouseEntered

    private void tituloIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloIngresarMouseExited
        btnIngresar.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_tituloIngresarMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if(txtUsuario.getText().equals("Ingrese su nombre de usuario")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if(String.valueOf(txtContra.getPassword()).isEmpty()){
            txtContra.setText("**********");
            txtContra.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        if(String.valueOf(txtContra.getPassword()).equals("**********")){
            txtContra.setText("");
            txtContra.setForeground(Color.black);
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtContraMousePressed

    private void crearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaMouseClicked
        Registro mostrar = new Registro();
        mostrar.show();
        dispose();
    }//GEN-LAST:event_crearCuentaMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void tituloIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloIngresarMouseClicked
        try {
            String usuario = txtUsuario.getText();
            String password = String.valueOf(txtContra.getPassword());

            for (int i = 0; i < Sistema.contadorUsuarios; i++) {
                Usuario u = Sistema.usuarios[i];

                if (u.nombreCompleto.equals(usuario) && u.password.equals(password)) {

                    Sistema.usuarioActual = u;
                    JOptionPane.showMessageDialog(null, "Bienvenido " + u.nombreCompleto);
                    dashboard inicio = new dashboard();
                    inicio.show();
                    dispose();
                    return;
                }
            }

            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Ingrese datos válidos");
        }
    }//GEN-LAST:event_tituloIngresarMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraNavegacion;
    private javax.swing.JLabel LogoUsac;
    private javax.swing.JLabel NombreFacultad;
    private javax.swing.JLabel NombreProyecto;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgImagen;
    private javax.swing.JLabel btnExit;
    private javax.swing.JPanel btnIngresar;
    private javax.swing.JPanel crearCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel tituloContraseña;
    private javax.swing.JLabel tituloIngresar;
    private javax.swing.JLabel tituloUsuario;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
