package views;

import java.awt.Color;
import javax.swing.JOptionPane;
import models.Usuario;
import utils.Sistema;

public class Registro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Registro.class.getName());
    int xMouse, yMouse;
    
    public Registro() {
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
        tituloCarnet = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtCarnet = new javax.swing.JTextField();
        tituloCarrera = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtCarrera = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
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
            .addComponent(LogoUsac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Titulo.setText("Crear Cuenta");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 300, 90));

        tituloContraseña.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        tituloContraseña.setText("COntraseña");
        bg.add(tituloContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 200, 40));

        tituloUsuario.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        tituloUsuario.setText("Usuario");
        bg.add(tituloUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 200, 40));

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 400, 40));

        txtContra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtContra.setForeground(new java.awt.Color(204, 204, 204));
        txtContra.setText("**********");
        txtContra.setBorder(null);
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        bg.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 400, 40));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 400, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 400, -1));

        btnIngresar.setBackground(new java.awt.Color(204, 204, 204));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });

        tituloIngresar.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        tituloIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloIngresar.setText("Crear cuenta");
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
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnIngresarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tituloIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnIngresarLayout.setVerticalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnIngresarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tituloIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 150, 50));

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
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BarraNavegacionLayout.setVerticalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(BarraNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        tituloCarnet.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        tituloCarnet.setText("Carnet");
        bg.add(tituloCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, 40));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 400, -1));

        txtCarnet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCarnet.setForeground(new java.awt.Color(204, 204, 204));
        txtCarnet.setText("Ingrese su numero de carnet");
        txtCarnet.setBorder(null);
        txtCarnet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCarnetMousePressed(evt);
            }
        });
        bg.add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 400, 40));

        tituloCarrera.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        tituloCarrera.setText("Carrera");
        bg.add(tituloCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 200, 40));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 400, -1));

        txtCarrera.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCarrera.setForeground(new java.awt.Color(204, 204, 204));
        txtCarrera.setText("Ingrese su carrera");
        txtCarrera.setBorder(null);
        txtCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCarreraMousePressed(evt);
            }
        });
        txtCarrera.addActionListener(this::txtCarreraActionPerformed);
        bg.add(txtCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 400, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Ya tienes cuenta? Inicia Sesión Aquí");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 190, 10));

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
        if(txtCarrera.getText().isEmpty()){
            txtCarrera.setText("Ingrese su carrera");
            txtCarrera.setForeground(new Color(204, 204, 204));
        }
        if(txtCarnet.getText().isEmpty()){
            txtCarnet.setText("Ingrese su numero de carnet");
            txtCarnet.setForeground(new Color(204, 204, 204));
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
        if(txtCarrera.getText().isEmpty()){
            txtCarrera.setText("Ingrese su carrera");
            txtCarrera.setForeground(new Color(204, 204, 204));
        }
        if(txtCarnet.getText().isEmpty()){
            txtCarnet.setText("Ingrese su numero de carnet");
            txtCarnet.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtContraMousePressed

    private void txtCarnetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCarnetMousePressed
        if(txtCarnet.getText().equals("Ingrese su numero de carnet")){
            txtCarnet.setText("");
            txtCarnet.setForeground(Color.black);
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(new Color(204, 204, 204));
        }
        if(txtCarrera.getText().isEmpty()){
            txtCarrera.setText("Ingrese su carrera");
            txtCarrera.setForeground(new Color(204, 204, 204));
        }
        if(String.valueOf(txtContra.getPassword()).isEmpty()){
            txtContra.setText("**********");
            txtContra.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtCarnetMousePressed

    private void txtCarreraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCarreraMousePressed
        if(txtCarrera.getText().equals("Ingrese su carrera")){
            txtCarrera.setText("");
            txtCarrera.setForeground(Color.black);
        }
        if(String.valueOf(txtContra.getPassword()).isEmpty()){
            txtContra.setText("**********");
            txtContra.setForeground(new Color(204, 204, 204));
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(new Color(204, 204, 204));
        }
        if(txtCarnet.getText().isEmpty()){
            txtCarnet.setText("Ingrese su numero de carnet");
            txtCarnet.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtCarreraMousePressed

    private void txtCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarreraActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Login mostrar = new Login();
        mostrar.show();
        dispose();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void tituloIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloIngresarMouseClicked
        try {
            String nombreCompleto = txtUsuario.getText();
            String password = String.valueOf(txtContra.getPassword());
            int carnet = Integer.parseInt(txtCarnet.getText());
            String carrera = txtCarrera.getText();

            for (int i = 0; i < Sistema.contadorUsuarios; i++) {
                if (Sistema.usuarios[i].carnet == carnet) {
                    JOptionPane.showMessageDialog(null, "Carnet ya existe");
                    return;
                }
            }

            Usuario nuevo = new Usuario(carnet, nombreCompleto, password, carrera, "estudiante");

            Sistema.usuarios[Sistema.contadorUsuarios++] = nuevo;
            
            // Guardar usuario en el archivo cuentas.txt
            Sistema.guardarUsuarioArchivo(nuevo);
            JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
            Sistema.escribirBitacora("CREACION USUARIO", String.valueOf(carnet), "USUARIOS");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en datos");
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
        java.awt.EventQueue.invokeLater(() -> new Registro().setVisible(true));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel tituloCarnet;
    private javax.swing.JLabel tituloCarrera;
    private javax.swing.JLabel tituloContraseña;
    private javax.swing.JLabel tituloIngresar;
    private javax.swing.JLabel tituloUsuario;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
