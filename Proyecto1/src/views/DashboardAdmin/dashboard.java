package views.DashboardAdmin;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import utils.Sistema;
import models.Usuario;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JOptionPane;
import models.Libro;

public class dashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(dashboard.class.getName());
    int xMouse, yMouse;
    LocalDate hoy = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Usuario u = Sistema.usuarioActual;
    
    
    public dashboard() {
        initComponents();
        panelUsuario.setVisible(false);
        panelPrestamos.setVisible(false);
        panelLibros.setVisible(false);
        panelReportes.setVisible(false);
        panelUsuarioN.setVisible(false);
        panelPrestamosN.setVisible(false);
        panelLibrosN.setVisible(false);
        panelReportesN.setVisible(false);
        Filtros.setVisible(false);
        fecha.setText(hoy.format(formato) + "  ");
        txtHistorialporUsuario.setVisible(false);
        separadorHistorial.setVisible(false);
        btnBuscarHistorialPorUsuario.setVisible(false);
        cargarTablaUsuarios();
        cargarTablaLibros();
        
        
        // ADMIN
        if (u.rol.equals("admin")) {
            btnLibros.setVisible(true);
            btnUsuarios.setVisible(true);
            btnPrestamos.setVisible(true);
            btnReportes.setVisible(true);
        }

        // ESTUDIANTE
        else if (u.rol.equals("estudiante")) {
            btnLibros.setVisible(false);
            btnUsuarios.setVisible(false);
            btnReportes.setVisible(false);
            btnPrestamos.setVisible(true);
        }

        // OPERADOR
        else if (u.rol.equals("operador")) {
            btnUsuarios.setVisible(false);
            btnLibros.setVisible(true);
            btnPrestamos.setVisible(true);
            btnReportes.setVisible(true);
        }
    }
    
    public void cargarTablaUsuarios() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Carnet");
        modelo.addColumn("Nombre");
        modelo.addColumn("Carrera");
        modelo.addColumn("Rol");

        for (int i = 0; i < Sistema.contadorUsuarios; i++) {
            Usuario u = Sistema.usuarios[i];

            modelo.addRow(new Object[]{
                u.carnet,
                u.nombreCompleto,
                u.carrera,
                u.rol
            });
        }

        tablaUsuarios.setModel(modelo);
    }
    
    public void buscarUsuarios() {
        String texto = txtBuscarUsuario.getText().toLowerCase();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Carnet");
        modelo.addColumn("Nombre");
        modelo.addColumn("Carrera");
        modelo.addColumn("Rol");

        for (int i = 0; i < Sistema.contadorUsuarios; i++) {
            Usuario u = Sistema.usuarios[i];

            String carnetStr = String.valueOf(u.carnet);
            String nombre = u.nombreCompleto.toLowerCase();

            if (carnetStr.contains(texto) || nombre.contains(texto)) {
                modelo.addRow(new Object[]{
                    u.carnet,
                    u.nombreCompleto,
                    u.carrera,
                    u.rol
                });
            }
        }

        tablaUsuarios.setModel(modelo);
    }
    
    //USE LO MISMO QUE EN USUARIO SOLO ANDO COPIANDO Y PEGANDO Y CAMBIANDO VALORES
    public void cargarTablaLibros() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Código");
        modelo.addColumn("ISBN");
        modelo.addColumn("Título");
        modelo.addColumn("Autor");
        modelo.addColumn("Total");
        modelo.addColumn("Disponibles");

        for (int i = 0; i < Sistema.contadorLibros; i++) {
            Libro l = Sistema.libros[i];

            modelo.addRow(new Object[]{
                l.codigo,
                l.isbn,
                l.titulo,
                l.autor,
                l.cantidadTotal,
                l.cantidadDisponible
            });
        }

        tablaLibros.setModel(modelo);
    }
    
    public void buscarLibros() {
        String texto = txtBuscarLibros.getText().toLowerCase();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Código");
        modelo.addColumn("ISBN");
        modelo.addColumn("Título");
        modelo.addColumn("Autor");
        modelo.addColumn("Total");
        modelo.addColumn("Disponibles");

        for (int i = 0; i < Sistema.contadorLibros; i++) {
            Libro l = Sistema.libros[i];

            if (l.codigo.toLowerCase().contains(texto) ||
                l.isbn.toLowerCase().contains(texto) ||
                l.titulo.toLowerCase().contains(texto) ||
                l.autor.toLowerCase().contains(texto)) {

                modelo.addRow(new Object[]{
                    l.codigo,
                    l.isbn,
                    l.titulo,
                    l.autor,
                    l.cantidadTotal,
                    l.cantidadDisponible
                });
            }
        }

        tablaLibros.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Navegacion = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        NombreProyecto = new javax.swing.JLabel();
        logoUsac = new javax.swing.JLabel();
        btnInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPrestamos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLibros = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnReportes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelNavegacionModulo = new javax.swing.JPanel();
        panelUsuarioN = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        txtBuscarUsuario = new javax.swing.JTextField();
        btnBuscarUsuario = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnEliminarUsuario = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnModificarUsuario = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnNuevoUsuario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelPrestamosN = new javax.swing.JPanel();
        btnDevolucionPrestamo = new javax.swing.JPanel();
        devoluciontxt = new javax.swing.JLabel();
        btnNuevoPrestamo = new javax.swing.JPanel();
        nuevoprestamotxt = new javax.swing.JLabel();
        Filtros = new javax.swing.JPanel();
        prestamosactivos = new javax.swing.JLabel();
        prestamosvencidos = new javax.swing.JLabel();
        todos = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelLibrosN = new javax.swing.JPanel();
        btnBuscarLibro = new javax.swing.JPanel();
        txtBuscarLibro = new javax.swing.JLabel();
        txtBuscarLibros = new javax.swing.JTextField();
        btnModificarLibro = new javax.swing.JPanel();
        txtModificarLibro = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnEliminarLibro = new javax.swing.JPanel();
        txtEliminarLibro = new javax.swing.JLabel();
        btnNuevoLibro = new javax.swing.JPanel();
        txtNuevoLibro = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panelReportesN = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        PanelReportesListado = new javax.swing.JPanel();
        librosdisponiblestxt = new javax.swing.JLabel();
        prestamosactivostxxt = new javax.swing.JLabel();
        prestamosvencidostxt = new javax.swing.JLabel();
        top5librostxt = new javax.swing.JLabel();
        historialporusuariotxt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        txtHistorialporUsuario = new javax.swing.JTextField();
        btnBuscarHistorialPorUsuario = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        separadorHistorial = new javax.swing.JSeparator();
        panelInicioN = new javax.swing.JPanel();
        BarraNavegacion = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        panelContenedor = new javax.swing.JPanel();
        panelUsuario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        panelInicio = new javax.swing.JPanel();
        panelPrestamos = new javax.swing.JPanel();
        panelLibros = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        panelReportes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Navegacion.setBackground(new java.awt.Color(204, 204, 204));
        Navegacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NavegacionMouseExited(evt);
            }
        });
        Navegacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Navegacion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 220, 10));

        NombreProyecto.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        NombreProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreProyecto.setText("BibliSystem");
        Navegacion.add(NombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 44));

        logoUsac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoUsac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoUSAC (1).png"))); // NOI18N
        Navegacion.add(logoUsac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        btnInicio.setBackground(new java.awt.Color(153, 153, 153));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("inicio");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Navegacion.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 60));

        btnPrestamos.setBackground(new java.awt.Color(204, 204, 204));
        btnPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Prestamos");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPrestamosLayout = new javax.swing.GroupLayout(btnPrestamos);
        btnPrestamos.setLayout(btnPrestamosLayout);
        btnPrestamosLayout.setHorizontalGroup(
            btnPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btnPrestamosLayout.setVerticalGroup(
            btnPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPrestamosLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Navegacion.add(btnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        btnLibros.setBackground(new java.awt.Color(204, 204, 204));
        btnLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Libros");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLibrosLayout = new javax.swing.GroupLayout(btnLibros);
        btnLibros.setLayout(btnLibrosLayout);
        btnLibrosLayout.setHorizontalGroup(
            btnLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btnLibrosLayout.setVerticalGroup(
            btnLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLibrosLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Navegacion.add(btnLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        btnUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("usuarios");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnUsuariosLayout = new javax.swing.GroupLayout(btnUsuarios);
        btnUsuarios.setLayout(btnUsuariosLayout);
        btnUsuariosLayout.setHorizontalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btnUsuariosLayout.setVerticalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsuariosLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Navegacion.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        btnReportes.setBackground(new java.awt.Color(204, 204, 204));
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("reportes");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnReportesLayout = new javax.swing.GroupLayout(btnReportes);
        btnReportes.setLayout(btnReportesLayout);
        btnReportesLayout.setHorizontalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btnReportesLayout.setVerticalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportesLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Navegacion.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        btnCerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("cerrar sesion");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Navegacion.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 240, 60));

        bg.add(Navegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 700));

        panelUsuarioN.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        txtBuscarUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtBuscarUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarUsuario.setText("Carnet o Nombre");
        txtBuscarUsuario.setBorder(null);
        txtBuscarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarUsuarioMousePressed(evt);
            }
        });

        btnBuscarUsuario.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Buscar");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarUsuarioLayout = new javax.swing.GroupLayout(btnBuscarUsuario);
        btnBuscarUsuario.setLayout(btnBuscarUsuarioLayout);
        btnBuscarUsuarioLayout.setHorizontalGroup(
            btnBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        btnBuscarUsuarioLayout.setVerticalGroup(
            btnBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnEliminarUsuario.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Eliminar");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarUsuarioLayout = new javax.swing.GroupLayout(btnEliminarUsuario);
        btnEliminarUsuario.setLayout(btnEliminarUsuarioLayout);
        btnEliminarUsuarioLayout.setHorizontalGroup(
            btnEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        btnEliminarUsuarioLayout.setVerticalGroup(
            btnEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnModificarUsuario.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modificar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnModificarUsuarioLayout = new javax.swing.GroupLayout(btnModificarUsuario);
        btnModificarUsuario.setLayout(btnModificarUsuarioLayout);
        btnModificarUsuarioLayout.setHorizontalGroup(
            btnModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        btnModificarUsuarioLayout.setVerticalGroup(
            btnModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModificarUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnNuevoUsuario.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoUsuarioMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nuevo");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnNuevoUsuarioLayout = new javax.swing.GroupLayout(btnNuevoUsuario);
        btnNuevoUsuario.setLayout(btnNuevoUsuarioLayout);
        btnNuevoUsuarioLayout.setHorizontalGroup(
            btnNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        btnNuevoUsuarioLayout.setVerticalGroup(
            btnNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButton1.setText("Recargar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout panelUsuarioNLayout = new javax.swing.GroupLayout(panelUsuarioN);
        panelUsuarioN.setLayout(panelUsuarioNLayout);
        panelUsuarioNLayout.setHorizontalGroup(
            panelUsuarioNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioNLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelUsuarioNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelUsuarioNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelUsuarioNLayout.createSequentialGroup()
                            .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelUsuarioNLayout.createSequentialGroup()
                            .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelUsuarioNLayout.setVerticalGroup(
            panelUsuarioNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioNLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelUsuarioNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(panelUsuarioNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelUsuarioNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );

        panelPrestamosN.setBackground(new java.awt.Color(255, 255, 255));

        btnDevolucionPrestamo.setBackground(new java.awt.Color(204, 204, 204));

        devoluciontxt.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        devoluciontxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devoluciontxt.setText("Devolucion");
        devoluciontxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devoluciontxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                devoluciontxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                devoluciontxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDevolucionPrestamoLayout = new javax.swing.GroupLayout(btnDevolucionPrestamo);
        btnDevolucionPrestamo.setLayout(btnDevolucionPrestamoLayout);
        btnDevolucionPrestamoLayout.setHorizontalGroup(
            btnDevolucionPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(devoluciontxt, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        btnDevolucionPrestamoLayout.setVerticalGroup(
            btnDevolucionPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDevolucionPrestamoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(devoluciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnNuevoPrestamo.setBackground(new java.awt.Color(204, 204, 204));

        nuevoprestamotxt.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        nuevoprestamotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoprestamotxt.setText("Nuevo Prestamo");
        nuevoprestamotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoprestamotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoprestamotxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoprestamotxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnNuevoPrestamoLayout = new javax.swing.GroupLayout(btnNuevoPrestamo);
        btnNuevoPrestamo.setLayout(btnNuevoPrestamoLayout);
        btnNuevoPrestamoLayout.setHorizontalGroup(
            btnNuevoPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoprestamotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        btnNuevoPrestamoLayout.setVerticalGroup(
            btnNuevoPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNuevoPrestamoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevoprestamotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Filtros.setBackground(new java.awt.Color(255, 255, 255));
        Filtros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FiltrosMouseExited(evt);
            }
        });

        prestamosactivos.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        prestamosactivos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prestamosactivos.setText("Todos");
        prestamosactivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamosactivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prestamosactivosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prestamosactivosMouseExited(evt);
            }
        });

        prestamosvencidos.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        prestamosvencidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prestamosvencidos.setText("Prestamos Activos");
        prestamosvencidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamosvencidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prestamosvencidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prestamosvencidosMouseExited(evt);
            }
        });

        todos.setBackground(new java.awt.Color(0, 0, 0));
        todos.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        todos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        todos.setText("Prestamos Vencidos");
        todos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        todos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                todosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                todosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FiltrosLayout = new javax.swing.GroupLayout(Filtros);
        Filtros.setLayout(FiltrosLayout);
        FiltrosLayout.setHorizontalGroup(
            FiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prestamosvencidos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(todos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(prestamosactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        FiltrosLayout.setVerticalGroup(
            FiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiltrosLayout.createSequentialGroup()
                .addComponent(prestamosvencidos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(todos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(prestamosactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel14.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Filtros:         >");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelPrestamosNLayout = new javax.swing.GroupLayout(panelPrestamosN);
        panelPrestamosN.setLayout(panelPrestamosNLayout);
        panelPrestamosNLayout.setHorizontalGroup(
            panelPrestamosNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrestamosNLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDevolucionPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelPrestamosNLayout.setVerticalGroup(
            panelPrestamosNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrestamosNLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelPrestamosNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrestamosNLayout.createSequentialGroup()
                        .addGroup(panelPrestamosNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrestamosNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDevolucionPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Filtros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelLibrosN.setBackground(new java.awt.Color(255, 255, 255));
        panelLibrosN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarLibro.setBackground(new java.awt.Color(204, 204, 204));

        txtBuscarLibro.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        txtBuscarLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBuscarLibro.setText("Buscar");
        txtBuscarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBuscarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBuscarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBuscarLibroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarLibroLayout = new javax.swing.GroupLayout(btnBuscarLibro);
        btnBuscarLibro.setLayout(btnBuscarLibroLayout);
        btnBuscarLibroLayout.setHorizontalGroup(
            btnBuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBuscarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        btnBuscarLibroLayout.setVerticalGroup(
            btnBuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLibroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLibrosN.add(btnBuscarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 70, -1, -1));

        txtBuscarLibros.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtBuscarLibros.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarLibros.setText("ISBN, Titulo, Auto o Codigo");
        txtBuscarLibros.setBorder(null);
        txtBuscarLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarLibrosMousePressed(evt);
            }
        });
        panelLibrosN.add(txtBuscarLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 600, 40));

        btnModificarLibro.setBackground(new java.awt.Color(204, 204, 204));

        txtModificarLibro.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        txtModificarLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtModificarLibro.setText("Modificar");
        txtModificarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtModificarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModificarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtModificarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtModificarLibroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnModificarLibroLayout = new javax.swing.GroupLayout(btnModificarLibro);
        btnModificarLibro.setLayout(btnModificarLibroLayout);
        btnModificarLibroLayout.setHorizontalGroup(
            btnModificarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModificarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        btnModificarLibroLayout.setVerticalGroup(
            btnModificarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModificarLibroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtModificarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLibrosN.add(btnModificarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 71, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        panelLibrosN.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 52, 600, -1));

        btnEliminarLibro.setBackground(new java.awt.Color(204, 204, 204));

        txtEliminarLibro.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        txtEliminarLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminarLibro.setText("Eliminar");
        txtEliminarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEliminarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEliminarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEliminarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEliminarLibroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarLibroLayout = new javax.swing.GroupLayout(btnEliminarLibro);
        btnEliminarLibro.setLayout(btnEliminarLibroLayout);
        btnEliminarLibroLayout.setHorizontalGroup(
            btnEliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEliminarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        btnEliminarLibroLayout.setVerticalGroup(
            btnEliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLibroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLibrosN.add(btnEliminarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 70, -1, -1));

        btnNuevoLibro.setBackground(new java.awt.Color(204, 204, 204));

        txtNuevoLibro.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        txtNuevoLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNuevoLibro.setText("Nuevo");
        txtNuevoLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNuevoLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNuevoLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNuevoLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNuevoLibroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnNuevoLibroLayout = new javax.swing.GroupLayout(btnNuevoLibro);
        btnNuevoLibro.setLayout(btnNuevoLibroLayout);
        btnNuevoLibroLayout.setHorizontalGroup(
            btnNuevoLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNuevoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        btnNuevoLibroLayout.setVerticalGroup(
            btnNuevoLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNuevoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelLibrosN.add(btnNuevoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 71, -1, 46));

        jButton2.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButton2.setText("Recargar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(this::jButton2ActionPerformed);
        panelLibrosN.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 15, 98, 40));

        panelReportesN.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelReportesListado.setBackground(new java.awt.Color(255, 255, 255));
        PanelReportesListado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        librosdisponiblestxt.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        librosdisponiblestxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        librosdisponiblestxt.setText("Historial por Usuario");
        librosdisponiblestxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        librosdisponiblestxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                librosdisponiblestxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                librosdisponiblestxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                librosdisponiblestxtMouseExited(evt);
            }
        });
        PanelReportesListado.add(librosdisponiblestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 150, 50));

        prestamosactivostxxt.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        prestamosactivostxxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prestamosactivostxxt.setText("Libros Disponibles");
        prestamosactivostxxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamosactivostxxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prestamosactivostxxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prestamosactivostxxtMouseExited(evt);
            }
        });
        PanelReportesListado.add(prestamosactivostxxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        prestamosvencidostxt.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        prestamosvencidostxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prestamosvencidostxt.setText("Prestamos Activos");
        prestamosvencidostxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamosvencidostxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prestamosvencidostxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prestamosvencidostxtMouseExited(evt);
            }
        });
        PanelReportesListado.add(prestamosvencidostxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 150, 50));

        top5librostxt.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        top5librostxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top5librostxt.setText("Prestamos Vencidos");
        top5librostxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        top5librostxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                top5librostxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                top5librostxtMouseExited(evt);
            }
        });
        PanelReportesListado.add(top5librostxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 140, 50));

        historialporusuariotxt.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        historialporusuariotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historialporusuariotxt.setText("Top 5 Libros");
        historialporusuariotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialporusuariotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                historialporusuariotxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                historialporusuariotxtMouseExited(evt);
            }
        });
        PanelReportesListado.add(historialporusuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 130, 50));
        PanelReportesListado.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, -1));
        PanelReportesListado.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 120, -1));
        PanelReportesListado.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 130, -1));
        PanelReportesListado.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 80, -1));
        PanelReportesListado.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 37, 140, -1));

        jPanel1.add(PanelReportesListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 6, -1, -1));

        txtHistorialporUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtHistorialporUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtHistorialporUsuario.setText("Carnet o Nombre");
        txtHistorialporUsuario.setToolTipText("");
        txtHistorialporUsuario.setBorder(null);
        txtHistorialporUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHistorialporUsuarioMousePressed(evt);
            }
        });
        jPanel1.add(txtHistorialporUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 62, 565, 50));

        btnBuscarHistorialPorUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarHistorialPorUsuarioMouseEntered(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Buscar");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarHistorialPorUsuarioLayout = new javax.swing.GroupLayout(btnBuscarHistorialPorUsuario);
        btnBuscarHistorialPorUsuario.setLayout(btnBuscarHistorialPorUsuarioLayout);
        btnBuscarHistorialPorUsuarioLayout.setHorizontalGroup(
            btnBuscarHistorialPorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnBuscarHistorialPorUsuarioLayout.setVerticalGroup(
            btnBuscarHistorialPorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnBuscarHistorialPorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 62, 123, -1));

        separadorHistorial.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(separadorHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 118, 565, 10));

        javax.swing.GroupLayout panelReportesNLayout = new javax.swing.GroupLayout(panelReportesN);
        panelReportesN.setLayout(panelReportesNLayout);
        panelReportesNLayout.setHorizontalGroup(
            panelReportesNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesNLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelReportesNLayout.setVerticalGroup(
            panelReportesNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesNLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelInicioN.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelInicioNLayout = new javax.swing.GroupLayout(panelInicioN);
        panelInicioN.setLayout(panelInicioNLayout);
        panelInicioNLayout.setHorizontalGroup(
            panelInicioNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panelInicioNLayout.setVerticalGroup(
            panelInicioNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelNavegacionModuloLayout = new javax.swing.GroupLayout(panelNavegacionModulo);
        panelNavegacionModulo.setLayout(panelNavegacionModuloLayout);
        panelNavegacionModuloLayout.setHorizontalGroup(
            panelNavegacionModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicioN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelNavegacionModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelUsuarioN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelNavegacionModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrestamosN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelNavegacionModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelLibrosN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelNavegacionModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelReportesN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNavegacionModuloLayout.setVerticalGroup(
            panelNavegacionModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicioN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelNavegacionModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelUsuarioN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelNavegacionModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrestamosN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelNavegacionModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelLibrosN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelNavegacionModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelReportesN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(panelNavegacionModulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 760, 140));

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

        fecha.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fecha.setText("asdf");

        javax.swing.GroupLayout BarraNavegacionLayout = new javax.swing.GroupLayout(BarraNavegacion);
        BarraNavegacion.setLayout(BarraNavegacionLayout);
        BarraNavegacionLayout.setHorizontalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraNavegacionLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 822, Short.MAX_VALUE)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BarraNavegacionLayout.setVerticalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(BarraNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        panelContenedor.setBackground(new java.awt.Color(255, 255, 255));

        panelUsuario.setBackground(new java.awt.Color(255, 255, 255));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        panelInicio.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        panelPrestamos.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout panelPrestamosLayout = new javax.swing.GroupLayout(panelPrestamos);
        panelPrestamos.setLayout(panelPrestamosLayout);
        panelPrestamosLayout.setHorizontalGroup(
            panelPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panelPrestamosLayout.setVerticalGroup(
            panelPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        panelLibros.setBackground(new java.awt.Color(255, 255, 255));

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaLibros);

        javax.swing.GroupLayout panelLibrosLayout = new javax.swing.GroupLayout(panelLibros);
        panelLibros.setLayout(panelLibrosLayout);
        panelLibrosLayout.setHorizontalGroup(
            panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibrosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelLibrosLayout.setVerticalGroup(
            panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibrosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        panelReportes.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelLibros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelLibros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(panelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 760, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        btnInicio.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        btnInicio.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        btnPrestamos.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        btnPrestamos.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        btnLibros.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        btnLibros.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        btnUsuarios.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        btnUsuarios.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        btnReportes.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        btnReportes.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        btnCerrarSesion.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        btnCerrarSesion.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel7MouseExited

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setForeground(Color.red);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setForeground(Color.black);
    }//GEN-LAST:event_btnExitMouseExited

    private void BarraNavegacionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraNavegacionMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_BarraNavegacionMouseDragged

    private void BarraNavegacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraNavegacionMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraNavegacionMousePressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        panelUsuario.setVisible(true);
        panelInicio.setVisible(false);
        panelPrestamos.setVisible(false);
        panelLibros.setVisible(false);
        panelReportes.setVisible(false);
        panelUsuarioN.setVisible(true);
        panelInicioN.setVisible(false);
        panelPrestamosN.setVisible(false);
        panelLibrosN.setVisible(false);
        panelReportesN.setVisible(false);
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        panelUsuario.setVisible(false);
        panelInicio.setVisible(false);
        panelPrestamos.setVisible(true);
        panelLibros.setVisible(false);
        panelReportes.setVisible(false);
        panelUsuarioN.setVisible(false);
        panelInicioN.setVisible(false);
        panelPrestamosN.setVisible(true);
        panelLibrosN.setVisible(false);
        panelReportesN.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        panelUsuario.setVisible(false);
        panelInicio.setVisible(true);
        panelPrestamos.setVisible(false);
        panelLibros.setVisible(false);
        panelReportes.setVisible(false);
        panelUsuarioN.setVisible(false);
        panelInicioN.setVisible(true);
        panelPrestamosN.setVisible(false);
        panelLibrosN.setVisible(false);
        panelReportesN.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        panelUsuario.setVisible(false);
        panelInicio.setVisible(false);
        panelPrestamos.setVisible(false);
        panelLibros.setVisible(true);
        panelReportes.setVisible(false);
        panelUsuarioN.setVisible(false);
        panelInicioN.setVisible(false);
        panelPrestamosN.setVisible(false);
        panelLibrosN.setVisible(true);
        panelReportesN.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        panelUsuario.setVisible(false);
        panelInicio.setVisible(false);
        panelPrestamos.setVisible(false);
        panelLibros.setVisible(false);
        panelReportes.setVisible(true);
        panelUsuarioN.setVisible(false);
        panelInicioN.setVisible(false);
        panelPrestamosN.setVisible(false);
        panelLibrosN.setVisible(false);
        panelReportesN.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void NavegacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavegacionMouseExited
        
    }//GEN-LAST:event_NavegacionMouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        btnBuscarUsuario.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        btnBuscarUsuario.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        btnNuevoUsuario.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        btnNuevoUsuario.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        btnModificarUsuario.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        btnModificarUsuario.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        btnEliminarUsuario.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        btnEliminarUsuario.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel10MouseExited

    private void txtBuscarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarLibroMouseEntered
        btnBuscarLibro.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_txtBuscarLibroMouseEntered

    private void txtBuscarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarLibroMouseExited
        btnBuscarLibro.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_txtBuscarLibroMouseExited

    private void txtModificarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarLibroMouseEntered
        btnModificarLibro.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_txtModificarLibroMouseEntered

    private void txtModificarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarLibroMouseExited
        btnModificarLibro.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_txtModificarLibroMouseExited

    private void txtEliminarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarLibroMouseEntered
        btnEliminarLibro.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_txtEliminarLibroMouseEntered

    private void txtEliminarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarLibroMouseExited
        btnEliminarLibro.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_txtEliminarLibroMouseExited

    private void txtNuevoLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoLibroMouseEntered
        btnNuevoLibro.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_txtNuevoLibroMouseEntered

    private void txtNuevoLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoLibroMouseExited
        btnNuevoLibro.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_txtNuevoLibroMouseExited

    private void txtBuscarUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioMousePressed
        txtBuscarUsuario.setText("");
        txtBuscarUsuario.setForeground(Color.black);
    }//GEN-LAST:event_txtBuscarUsuarioMousePressed

    private void txtBuscarLibrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarLibrosMousePressed
        txtBuscarLibros.setText("");
        txtBuscarLibros.setForeground(Color.black);
    }//GEN-LAST:event_txtBuscarLibrosMousePressed

    private void devoluciontxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devoluciontxtMouseEntered
        btnDevolucionPrestamo.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_devoluciontxtMouseEntered

    private void devoluciontxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devoluciontxtMouseExited
        btnDevolucionPrestamo.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_devoluciontxtMouseExited

    private void nuevoprestamotxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoprestamotxtMouseEntered
        btnNuevoPrestamo.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_nuevoprestamotxtMouseEntered

    private void nuevoprestamotxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoprestamotxtMouseExited
        btnNuevoPrestamo.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_nuevoprestamotxtMouseExited

    private void prestamosactivosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosactivosMouseEntered
        prestamosactivos.setForeground(Color.blue);
    }//GEN-LAST:event_prestamosactivosMouseEntered

    private void prestamosactivosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosactivosMouseExited
        prestamosactivos.setForeground(Color.black);
    }//GEN-LAST:event_prestamosactivosMouseExited

    private void prestamosvencidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosvencidosMouseEntered
        prestamosvencidos.setForeground(Color.blue);
    }//GEN-LAST:event_prestamosvencidosMouseEntered

    private void prestamosvencidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosvencidosMouseExited
        prestamosvencidos.setForeground(Color.black);
    }//GEN-LAST:event_prestamosvencidosMouseExited

    private void todosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todosMouseEntered
        todos.setForeground(Color.blue);
    }//GEN-LAST:event_todosMouseEntered

    private void todosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todosMouseExited
        todos.setForeground(Color.black);
    }//GEN-LAST:event_todosMouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        Filtros.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void FiltrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltrosMouseExited
        Filtros.setVisible(false);
    }//GEN-LAST:event_FiltrosMouseExited

    private void btnBuscarHistorialPorUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarHistorialPorUsuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarHistorialPorUsuarioMouseEntered

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        btnBuscarHistorialPorUsuario.setBackground(new Color(154,154,154));
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        btnBuscarHistorialPorUsuario.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel18MouseExited

    private void txtHistorialporUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHistorialporUsuarioMousePressed
        txtHistorialporUsuario.setText("");
        txtHistorialporUsuario.setForeground(Color.black);
    }//GEN-LAST:event_txtHistorialporUsuarioMousePressed

    private void librosdisponiblestxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librosdisponiblestxtMouseEntered
        librosdisponiblestxt.setForeground(Color.blue);
    }//GEN-LAST:event_librosdisponiblestxtMouseEntered

    private void librosdisponiblestxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librosdisponiblestxtMouseExited
        librosdisponiblestxt.setForeground(Color.black);
    }//GEN-LAST:event_librosdisponiblestxtMouseExited

    private void prestamosactivostxxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosactivostxxtMouseEntered
        prestamosactivostxxt.setForeground(Color.blue);
    }//GEN-LAST:event_prestamosactivostxxtMouseEntered

    private void prestamosactivostxxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosactivostxxtMouseExited
        prestamosactivostxxt.setForeground(Color.black);
    }//GEN-LAST:event_prestamosactivostxxtMouseExited

    private void prestamosvencidostxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosvencidostxtMouseEntered
        prestamosvencidostxt.setForeground(Color.blue);
    }//GEN-LAST:event_prestamosvencidostxtMouseEntered

    private void prestamosvencidostxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosvencidostxtMouseExited
        prestamosvencidostxt.setForeground(Color.black);
    }//GEN-LAST:event_prestamosvencidostxtMouseExited

    private void top5librostxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top5librostxtMouseEntered
        top5librostxt.setForeground(Color.blue);
    }//GEN-LAST:event_top5librostxtMouseEntered

    private void top5librostxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top5librostxtMouseExited
        top5librostxt.setForeground(Color.black);
    }//GEN-LAST:event_top5librostxtMouseExited

    private void historialporusuariotxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialporusuariotxtMouseEntered
        historialporusuariotxt.setForeground(Color.blue);
    }//GEN-LAST:event_historialporusuariotxtMouseEntered

    private void historialporusuariotxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialporusuariotxtMouseExited
        historialporusuariotxt.setForeground(Color.black);
    }//GEN-LAST:event_historialporusuariotxtMouseExited

    private void librosdisponiblestxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librosdisponiblestxtMouseClicked
        txtHistorialporUsuario.setVisible(true);
        separadorHistorial.setVisible(true);
        btnBuscarHistorialPorUsuario.setVisible(true);
    }//GEN-LAST:event_librosdisponiblestxtMouseClicked

    private void btnNuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioMouseClicked
        
    }//GEN-LAST:event_btnNuevoUsuarioMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            int carnet = Integer.parseInt(JOptionPane.showInputDialog("Carnet:"));
            String nombre = JOptionPane.showInputDialog("Nombre completo:");
            String password = JOptionPane.showInputDialog("Contraseña:");
            String carrera = JOptionPane.showInputDialog("Carrera:");
            String rol = JOptionPane.showInputDialog("Rol (admin/operador/estudiante):");

            // validar duplicado
            for (int i = 0; i < Sistema.contadorUsuarios; i++) {
                if (Sistema.usuarios[i].carnet == carnet) {
                    JOptionPane.showMessageDialog(null, "Carnet ya existe");
                    return;
                }
            }

            Usuario nuevo = new Usuario(carnet, nombre, password, carrera, rol);

            Sistema.usuarios[Sistema.contadorUsuarios++] = nuevo;

            Sistema.guardarUsuarioArchivo(nuevo);

            JOptionPane.showMessageDialog(null, "Usuario agregado");

            cargarTablaUsuarios();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en datos");
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // usamos esto para seleccionar una fila de la columna y poder eliminar
        int fila = tablaUsuarios.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario");
            return;
        }

        // evitar eliminar admin
        if (Sistema.usuarios[fila].rol.equals("admin")) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar admin");
            return;
        }

        // confirmar
        int opcion = JOptionPane.showConfirmDialog(null, "¿Eliminar usuario?");

        if (opcion == JOptionPane.YES_OPTION) {

            // correr elementos
            for (int i = fila; i < Sistema.contadorUsuarios - 1; i++) {
                Sistema.usuarios[i] = Sistema.usuarios[i + 1];
            }

            Sistema.contadorUsuarios--;

            Sistema.reescribirArchivoUsuarios();

            cargarTablaUsuarios();

            JOptionPane.showMessageDialog(null, "Usuario eliminado");
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // usamos esto para seleccionar una fila de la columna y poder modificar
        int fila = tablaUsuarios.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario");
            return;
        }

        Usuario u = Sistema.usuarios[fila];

        // pedir nuevos datos
        try {
            String nombre = JOptionPane.showInputDialog("Nombre:", u.nombreCompleto);
            String password = JOptionPane.showInputDialog("Contraseña:", u.password);
            String carrera = JOptionPane.showInputDialog("Carrera:", u.carrera);
            String rol = JOptionPane.showInputDialog("Rol:", u.rol);

            // actualizar
            u.nombreCompleto = nombre;
            u.password = password;
            u.carrera = carrera;
            u.rol = rol;

            Sistema.reescribirArchivoUsuarios();

            cargarTablaUsuarios();

            JOptionPane.showMessageDialog(null, "Usuario actualizado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar");
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        buscarUsuarios();
        txtBuscarUsuario.setText("");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarTablaUsuarios();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cargarTablaLibros();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNuevoLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoLibroMouseClicked
        try {
            String codigo = JOptionPane.showInputDialog("Código:");
            String isbn = JOptionPane.showInputDialog("ISBN:");
            String titulo = JOptionPane.showInputDialog("Título:");
            String autor = JOptionPane.showInputDialog("Autor:");
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));

            // validar duplicado
            for (int i = 0; i < Sistema.contadorLibros; i++) {
                if (Sistema.libros[i].codigo.equals(codigo)) {
                    JOptionPane.showMessageDialog(null, "Código ya existe");
                    return;
                }
            }

            Libro nuevo = new Libro(codigo, isbn, titulo, autor, cantidad);

            Sistema.libros[Sistema.contadorLibros++] = nuevo;

            Sistema.guardarLibroArchivo(nuevo);

            JOptionPane.showMessageDialog(null, "Libro agregado");

            cargarTablaLibros();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en datos");
        }
    }//GEN-LAST:event_txtNuevoLibroMouseClicked

    private void txtEliminarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarLibroMouseClicked
        int fila = tablaLibros.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un libro");
            return;
        }

        //TODO: VALIDAR PRESTAMOS

        for (int i = fila; i < Sistema.contadorLibros - 1; i++) {
            Sistema.libros[i] = Sistema.libros[i + 1];
        }

        Sistema.contadorLibros--;

        Sistema.reescribirArchivoLibros();

        cargarTablaLibros();

        JOptionPane.showMessageDialog(null, "Libro eliminado");
    }//GEN-LAST:event_txtEliminarLibroMouseClicked

    private void txtModificarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarLibroMouseClicked
        int fila = tablaLibros.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un libro");
            return;
        }

        Libro l = Sistema.libros[fila];

        try {
            String titulo = JOptionPane.showInputDialog("Título:", l.titulo);
            String autor = JOptionPane.showInputDialog("Autor:", l.autor);
            int total = Integer.parseInt(JOptionPane.showInputDialog("Cantidad total:", l.cantidadTotal));

            l.titulo = titulo;
            l.autor = autor;
            l.cantidadTotal = total;

            Sistema.reescribirArchivoLibros();

            cargarTablaLibros();

            JOptionPane.showMessageDialog(null, "Libro actualizado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_txtModificarLibroMouseClicked

    private void txtBuscarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarLibroMouseClicked
        buscarLibros();
    }//GEN-LAST:event_txtBuscarLibroMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new dashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraNavegacion;
    private javax.swing.JPanel Filtros;
    private javax.swing.JPanel Navegacion;
    private javax.swing.JLabel NombreProyecto;
    private javax.swing.JPanel PanelReportesListado;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnBuscarHistorialPorUsuario;
    private javax.swing.JPanel btnBuscarLibro;
    private javax.swing.JPanel btnBuscarUsuario;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnDevolucionPrestamo;
    private javax.swing.JPanel btnEliminarLibro;
    private javax.swing.JPanel btnEliminarUsuario;
    private javax.swing.JLabel btnExit;
    private javax.swing.JPanel btnIncioUsuario2;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnLibros;
    private javax.swing.JPanel btnModificarLibro;
    private javax.swing.JPanel btnModificarUsuario;
    private javax.swing.JPanel btnNuevoLibro;
    private javax.swing.JPanel btnNuevoPrestamo;
    private javax.swing.JPanel btnNuevoUsuario;
    private javax.swing.JPanel btnPrestamos;
    private javax.swing.JPanel btnReportes;
    private javax.swing.JPanel btnUsuarios;
    private javax.swing.JLabel devoluciontxt;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel historialporusuariotxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel librosdisponiblestxt;
    private javax.swing.JLabel logoUsac;
    private javax.swing.JLabel nuevoprestamotxt;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelInicioN;
    private javax.swing.JPanel panelLibros;
    private javax.swing.JPanel panelLibrosN;
    private javax.swing.JPanel panelNavegacionModulo;
    private javax.swing.JPanel panelPrestamos;
    private javax.swing.JPanel panelPrestamosN;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JPanel panelReportesN;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JPanel panelUsuarioN;
    private javax.swing.JLabel prestamosactivos;
    private javax.swing.JLabel prestamosactivostxxt;
    private javax.swing.JLabel prestamosvencidos;
    private javax.swing.JLabel prestamosvencidostxt;
    private javax.swing.JSeparator separadorHistorial;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JLabel todos;
    private javax.swing.JLabel top5librostxt;
    private javax.swing.JLabel txtBuscarLibro;
    private javax.swing.JTextField txtBuscarLibros;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JLabel txtEliminarLibro;
    private javax.swing.JTextField txtHistorialporUsuario;
    private javax.swing.JLabel txtModificarLibro;
    private javax.swing.JLabel txtNuevoLibro;
    // End of variables declaration//GEN-END:variables
}
