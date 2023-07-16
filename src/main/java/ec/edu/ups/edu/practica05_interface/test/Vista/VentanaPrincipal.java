/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Vista;

import ec.edu.ups.edu.practica05_interface.test.Dao.CantanteDAO;
import ec.edu.ups.edu.practica05_interface.test.Dao.CompositorDAO;
import ec.edu.ups.edu.practica05_interface.test.IDao.ICantanteDao;
import ec.edu.ups.edu.practica05_interface.test.IDao.ICompositorDao;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cancion.VentanaActualizarCancion;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cancion.VentanaBuscarCancion;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cancion.VentanaCrearCancion;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cancion.VentanaEliminarCancion;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cancion.VentanaListarCancion;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cantante.VentanaActualizarCantante;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cantante.VentanaBuscarCantante;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cantante.VentanaCrearCantante;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cantante.VentanaEliminarCantante;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cantante.VentanaListarCantante;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cliente.VentanaActualizarCliente;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cliente.VentanaBuscarCliente;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cliente.VentanaCrearCliente;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cliente.VentanaEliminarCliente;
import ec.edu.ups.edu.practica05_interface.test.Vista.Cliente.VentanaListarCliente;
import ec.edu.ups.edu.practica05_interface.test.Vista.Compositor.VentanaActualizarCompositor;
import ec.edu.ups.edu.practica05_interface.test.Vista.Compositor.VentanaBuscarCompositor;
import ec.edu.ups.edu.practica05_interface.test.Vista.Compositor.VentanaCrearCompositor;
import ec.edu.ups.edu.practica05_interface.test.Vista.Compositor.VentanaEliminarCompositor;
import ec.edu.ups.edu.practica05_interface.test.Vista.Compositor.VentanaListarCompositor;
import ec.edu.ups.edu.practica05_interface.test.Vista.Disco.VentanaActualizarDisco;
import ec.edu.ups.edu.practica05_interface.test.Vista.Disco.VentanaBuscarDisco;
import ec.edu.ups.edu.practica05_interface.test.Vista.Disco.VentanaCrearDisco;
import ec.edu.ups.edu.practica05_interface.test.Vista.Disco.VentanaEliminarDisco;
import ec.edu.ups.edu.practica05_interface.test.Vista.Disco.VentanaListarDisco;
import ec.edu.ups.edu.practica05_interface.test.controlador.CantanteControlador;
import ec.edu.ups.edu.practica05_interface.test.controlador.CompositorControlador;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author jf001
 */
public class VentanaPrincipal extends javax.swing.JFrame {
//Ventanas de Cliente
     private VentanaEliminarCliente ventanaEliminarCliente;   
     private VentanaListarCliente ventanaListarCliente; 
     private VentanaCrearCliente ventanaCrearCliente; 
     private VentanaBuscarCliente ventanaBuscarCliente; 
     private VentanaActualizarCliente ventanaActualizarCliente; 
//Ventanas de cantante   
     private VentanaCrearCantante ventanaCrearCantante;
     private VentanaListarCantante ventanaListarCantante;
     private VentanaBuscarCantante ventanaBuscarCantante;
     private VentanaActualizarCantante ventanaActualizarCantante;
     private VentanaEliminarCantante ventanaEliminarCantante;
//Ventanas de compositor
    private VentanaCrearCompositor ventanaCrearCompositor;
    private VentanaBuscarCompositor ventanaBuscarCompositor;
    private VentanaEliminarCompositor ventanaEliminarCompositor;
    private VentanaActualizarCompositor ventanaActualizarCompositor;
    private VentanaListarCompositor ventanaListarCompositor;
//Ventana de Disco
    private VentanaCrearDisco ventanaCrearDisco;
    private VentanaBuscarDisco ventanaBuscarDisco;
    private VentanaEliminarDisco ventanaEliminarDisco;
    private VentanaActualizarDisco ventanaActualizarDisco;
    private VentanaListarDisco ventanaListarDisco;   
//Ventana de Cancion 
    private VentanaCrearCancion ventanaCrearCancion;
    private VentanaBuscarCancion ventanaBuscarCancion;
    private VentanaEliminarCancion ventanaEliminarCancion;
    private VentanaActualizarCancion ventanaActualizarCancion;
    private VentanaListarCancion ventanaListarCancion;  
//controladores
     private CantanteControlador cantanteControlador;
     private CompositorControlador compositorControlador;

//Dao´s
     private ICantanteDao cantanteDao;
    private ICompositorDao compositorDao;

//internacionalizacion
    private Locale localizacion;
    private ResourceBundle mensajes;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        cantanteDao = new CantanteDAO();
        cantanteControlador = new CantanteControlador(cantanteDao);
        compositorDao = new CompositorDAO();
        compositorControlador = new CompositorControlador(compositorDao);
        localizacion = Locale.getDefault();
        cambiarIdioma();
        
    }
    
     public void cambiarIdioma(){
      mensajes=ResourceBundle.getBundle("mensajes.mensaje", localizacion);   
      menuCantante.setText(mensajes.getString("menu.cantante"));
      menuCompositor.setText(mensajes.getString("menu.compositor")); 
      menuDisco.setText(mensajes.getString("menu.disco")); 
      menuCancion.setText(mensajes.getString("menu.cancion"));
      menuCliente.setText(mensajes.getString("menu.cliente"));
      menuIdiomas.setText(mensajes.getString("menu.idioma"));
      jMenuItemCrear.setText(mensajes.getString("crear"));
      jMenuItemActualizar.setText(mensajes.getString("actualizar"));
      jMenuItemEliminar.setText(mensajes.getString("eliminar"));
      jMenuItemBuscar.setText(mensajes.getString("buscar"));
      jMenuItemListar.setText(mensajes.getString("listar"));
      jMenuItem1CD.setText(mensajes.getString("crear"));
      jMenuItem2CD.setText(mensajes.getString("actualizar"));
      jMenuItem3CD.setText(mensajes.getString("buscar"));
      jMenuItem4CD.setText(mensajes.getString("eliminar"));
      jMenuItem5CD.setText(mensajes.getString("listar"));
      jMenuItem1CC.setText(mensajes.getString("crear"));
      jMenuItem2CC.setText(mensajes.getString("actualizar"));
      jMenuItem3CC.setText(mensajes.getString("buscar"));
      jMenuItem4CC.setText(mensajes.getString("eliminar"));
      jMenuItem5CC.setText(mensajes.getString("listar"));
      jMenuItem1CA.setText(mensajes.getString("crear"));
      jMenuItem2CA.setText(mensajes.getString("actualizar"));
      jMenuItem3CA.setText(mensajes.getString("buscar"));
      jMenuItem4CA.setText(mensajes.getString("eliminar"));
      jMenuItem5CA.setText(mensajes.getString("listar"));
      jMenuItemSalir.setText(mensajes.getString("salir"));
      menuItemI1Cli.setText(mensajes.getString("crear"));
      menuItemI2Cli.setText(mensajes.getString("buscar"));        
      menuItemI3Cli.setText(mensajes.getString("actualizar"));
      menuItemI4Cli.setText(mensajes.getString("eliminar"));
      menuItemI5Cli.setText(mensajes.getString("listar"));        
      //cambio de idioma de ventanas de cantante
           if(ventanaCrearCantante != null){
            ventanaCrearCantante.cambiarIdioma(localizacion);
           }
             if(ventanaActualizarCantante != null){
            ventanaActualizarCantante .cambiarIdioma(localizacion);
           }
             if(ventanaEliminarCantante != null){
            ventanaEliminarCantante.cambiarIdioma(localizacion);
           }
             if(ventanaBuscarCantante != null){
            ventanaBuscarCantante.cambiarIdioma(localizacion);
           }
           if(ventanaListarCantante != null){
            ventanaListarCantante.cambiarIdioma(localizacion);
           }
      //cambio de idomas de ventanas de Compositor       
            if(ventanaCrearCompositor != null){
            ventanaCrearCompositor.cambiarIdioma(localizacion);
           }
             if(ventanaActualizarCompositor != null){
            ventanaActualizarCompositor .cambiarIdioma(localizacion);
           }
             if(ventanaEliminarCompositor != null){
            ventanaEliminarCompositor.cambiarIdioma(localizacion);
           }
             if(ventanaBuscarCompositor != null){
            ventanaBuscarCompositor.cambiarIdioma(localizacion);
           }
             if(ventanaListarCompositor != null){
            ventanaListarCompositor.cambiarIdioma(localizacion);
             }
        //cambio de idiomas de ventana Cancion     
           if(ventanaCrearCancion != null){
            ventanaCrearCancion.cambiarIdioma(localizacion);
           }
             if(ventanaActualizarCancion != null){
            ventanaActualizarCancion .cambiarIdioma(localizacion);
           }
             if(ventanaEliminarCancion != null){
            ventanaEliminarCancion.cambiarIdioma(localizacion);
           }
             if(ventanaBuscarCancion != null){
            ventanaBuscarCancion.cambiarIdioma(localizacion);
           }
             if(ventanaListarCancion != null){
            ventanaListarCancion.cambiarIdioma(localizacion);
           } 
         //CAMBIO DE IDIOMA DE VENTANA DISCO    
           if(ventanaCrearDisco != null){
            ventanaCrearDisco.cambiarIdioma(localizacion);
           }
             if(ventanaActualizarDisco != null){
            ventanaActualizarDisco .cambiarIdioma(localizacion);
           }
             if(ventanaEliminarDisco != null){
            ventanaEliminarDisco.cambiarIdioma(localizacion);
           }
             if(ventanaBuscarDisco != null){
            ventanaBuscarDisco.cambiarIdioma(localizacion);
           } 
              if(ventanaListarDisco != null){
            ventanaListarDisco.cambiarIdioma(localizacion);
           }
           //CAMBIO DE IDIOMAS DE VENTANAS CLIENTE
           if(ventanaCrearCliente != null){
            ventanaCrearCliente.cambiarIdioma(localizacion);
           }
             if(ventanaActualizarCliente != null){
            ventanaActualizarCliente .cambiarIdioma(localizacion);
           }
             if(ventanaEliminarCliente != null){
            ventanaEliminarCliente.cambiarIdioma(localizacion);
           }
             if(ventanaBuscarCliente != null){
            ventanaBuscarCliente.cambiarIdioma(localizacion);
           }
             if(ventanaListarCliente != null){
            ventanaListarCliente.cambiarIdioma(localizacion);
           }
           
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCantante = new javax.swing.JMenu();
        jMenuItemCrear = new javax.swing.JMenuItem();
        jMenuItemActualizar = new javax.swing.JMenuItem();
        jMenuItemBuscar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jMenuItemListar = new javax.swing.JMenuItem();
        menuDisco = new javax.swing.JMenu();
        jMenuItem1CD = new javax.swing.JMenuItem();
        jMenuItem2CD = new javax.swing.JMenuItem();
        jMenuItem3CD = new javax.swing.JMenuItem();
        jMenuItem4CD = new javax.swing.JMenuItem();
        jMenuItem5CD = new javax.swing.JMenuItem();
        menuCompositor = new javax.swing.JMenu();
        jMenuItem1CC = new javax.swing.JMenuItem();
        jMenuItem2CC = new javax.swing.JMenuItem();
        jMenuItem3CC = new javax.swing.JMenuItem();
        jMenuItem4CC = new javax.swing.JMenuItem();
        jMenuItem5CC = new javax.swing.JMenuItem();
        menuCancion = new javax.swing.JMenu();
        jMenuItem1CA = new javax.swing.JMenuItem();
        jMenuItem2CA = new javax.swing.JMenuItem();
        jMenuItem3CA = new javax.swing.JMenuItem();
        jMenuItem4CA = new javax.swing.JMenuItem();
        jMenuItem5CA = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        menuItemI1Cli = new javax.swing.JMenuItem();
        menuItemI2Cli = new javax.swing.JMenuItem();
        menuItemI3Cli = new javax.swing.JMenuItem();
        menuItemI4Cli = new javax.swing.JMenuItem();
        menuItemI5Cli = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        menuIdiomas = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(51, 51, 51));
        desktopPane.setOpaque(false);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1321, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );

        menuCantante.setText("Cantante");

        jMenuItemCrear.setText("Crear");
        jMenuItemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearActionPerformed(evt);
            }
        });
        menuCantante.add(jMenuItemCrear);

        jMenuItemActualizar.setText("Actualizar");
        jMenuItemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActualizarActionPerformed(evt);
            }
        });
        menuCantante.add(jMenuItemActualizar);

        jMenuItemBuscar.setText("Buscar");
        jMenuItemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarActionPerformed(evt);
            }
        });
        menuCantante.add(jMenuItemBuscar);

        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        menuCantante.add(jMenuItemEliminar);

        jMenuItemListar.setText("Listar");
        jMenuItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarActionPerformed(evt);
            }
        });
        menuCantante.add(jMenuItemListar);

        menuDisco.setText("Disco");

        jMenuItem1CD.setText("Crear");
        jMenuItem1CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1CDActionPerformed(evt);
            }
        });
        menuDisco.add(jMenuItem1CD);

        jMenuItem2CD.setText("Actualizar");
        jMenuItem2CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2CDActionPerformed(evt);
            }
        });
        menuDisco.add(jMenuItem2CD);

        jMenuItem3CD.setText("Buscar");
        jMenuItem3CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3CDActionPerformed(evt);
            }
        });
        menuDisco.add(jMenuItem3CD);

        jMenuItem4CD.setText("Eliminar");
        jMenuItem4CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4CDActionPerformed(evt);
            }
        });
        menuDisco.add(jMenuItem4CD);

        jMenuItem5CD.setText("Listar");
        jMenuItem5CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5CDActionPerformed(evt);
            }
        });
        menuDisco.add(jMenuItem5CD);

        menuCantante.add(menuDisco);

        jMenuBar1.add(menuCantante);

        menuCompositor.setText("Compositor");

        jMenuItem1CC.setText("Crear");
        jMenuItem1CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1CCActionPerformed(evt);
            }
        });
        menuCompositor.add(jMenuItem1CC);

        jMenuItem2CC.setText("Actualizar");
        jMenuItem2CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2CCActionPerformed(evt);
            }
        });
        menuCompositor.add(jMenuItem2CC);

        jMenuItem3CC.setText("Buscar");
        jMenuItem3CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3CCActionPerformed(evt);
            }
        });
        menuCompositor.add(jMenuItem3CC);

        jMenuItem4CC.setText("Eliminar");
        jMenuItem4CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4CCActionPerformed(evt);
            }
        });
        menuCompositor.add(jMenuItem4CC);

        jMenuItem5CC.setText("Listar");
        jMenuItem5CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5CCActionPerformed(evt);
            }
        });
        menuCompositor.add(jMenuItem5CC);

        menuCancion.setText("Agregar Cancion");

        jMenuItem1CA.setText("Crear");
        jMenuItem1CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1CAActionPerformed(evt);
            }
        });
        menuCancion.add(jMenuItem1CA);

        jMenuItem2CA.setText("Actualizar");
        jMenuItem2CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2CAActionPerformed(evt);
            }
        });
        menuCancion.add(jMenuItem2CA);

        jMenuItem3CA.setText("Buscar");
        jMenuItem3CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3CAActionPerformed(evt);
            }
        });
        menuCancion.add(jMenuItem3CA);

        jMenuItem4CA.setText("Eliminar");
        jMenuItem4CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4CAActionPerformed(evt);
            }
        });
        menuCancion.add(jMenuItem4CA);

        jMenuItem5CA.setText("Listar");
        jMenuItem5CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5CAActionPerformed(evt);
            }
        });
        menuCancion.add(jMenuItem5CA);

        menuCompositor.add(menuCancion);

        menuCliente.setText("Agregar Cliente");

        menuItemI1Cli.setText("Crear");
        menuItemI1Cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemI1CliActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemI1Cli);

        menuItemI2Cli.setText("Buscar ");
        menuItemI2Cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemI2CliActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemI2Cli);

        menuItemI3Cli.setText("Actualizar ");
        menuItemI3Cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemI3CliActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemI3Cli);

        menuItemI4Cli.setText("Eliminar ");
        menuItemI4Cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemI4CliActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemI4Cli);

        menuItemI5Cli.setText("Listar ");
        menuItemI5Cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemI5CliActionPerformed(evt);
            }
        });
        menuCliente.add(menuItemI5Cli);

        menuCompositor.add(menuCliente);

        jMenuBar1.add(menuCompositor);

        jMenu5.setText("......");

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemSalir);

        jMenuBar1.add(jMenu5);

        menuIdiomas.setText("Idiomas");

        jMenuItem3.setText("Español");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuIdiomas.add(jMenuItem3);

        jMenuItem24.setText("English");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        menuIdiomas.add(jMenuItem24);

        jMenuItem25.setText("Français");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        menuIdiomas.add(jMenuItem25);

        jMenuBar1.add(menuIdiomas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearActionPerformed
        if (ventanaCrearCantante == null) {
            ventanaCrearCantante = new VentanaCrearCantante(cantanteControlador);
            desktopPane.add(ventanaCrearCantante);
        }
        
        ventanaCrearCantante.setVisible(true);
        ventanaCrearCantante.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItemCrearActionPerformed

    private void jMenuItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarActionPerformed
             if (ventanaListarCantante == null) {
            ventanaListarCantante = new VentanaListarCantante(cantanteControlador);
            desktopPane.add(ventanaListarCantante);
        }
        
        ventanaListarCantante.setVisible(true);
         ventanaListarCantante.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItemListarActionPerformed

    private void jMenuItemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarActionPerformed
                 if (ventanaBuscarCantante == null) {
            ventanaBuscarCantante = new VentanaBuscarCantante(cantanteControlador);
            desktopPane.add(ventanaBuscarCantante);
        }
        
        ventanaBuscarCantante.setVisible(true);
        ventanaBuscarCantante.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItemBuscarActionPerformed

    private void jMenuItemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActualizarActionPerformed
                 if (ventanaActualizarCantante == null) {
            ventanaActualizarCantante = new VentanaActualizarCantante(cantanteControlador);
            desktopPane.add(ventanaActualizarCantante);
        }
        
        ventanaActualizarCantante.setVisible(true);
        ventanaActualizarCantante.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItemActualizarActionPerformed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
                  if (ventanaEliminarCantante == null) {
            ventanaEliminarCantante = new VentanaEliminarCantante(cantanteControlador);
            desktopPane.add(ventanaEliminarCantante);
        }
        
        ventanaEliminarCantante.setVisible(true);
        ventanaEliminarCantante.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void jMenuItem1CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1CCActionPerformed
             if (ventanaCrearCompositor == null) {
            ventanaCrearCompositor = new VentanaCrearCompositor(compositorControlador);
            desktopPane.add(ventanaCrearCompositor);
        }
        
        ventanaCrearCompositor.setVisible(true);
        ventanaCrearCompositor.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem1CCActionPerformed

    private void jMenuItem3CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3CCActionPerformed
            if (ventanaBuscarCompositor == null) {
            ventanaBuscarCompositor = new VentanaBuscarCompositor(compositorControlador);
            desktopPane.add(ventanaBuscarCompositor);
        }
        
        ventanaBuscarCompositor.setVisible(true);
        ventanaBuscarCompositor.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem3CCActionPerformed

    private void jMenuItem2CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2CCActionPerformed
             if (ventanaActualizarCompositor == null) {
            ventanaActualizarCompositor = new VentanaActualizarCompositor(compositorControlador);
            desktopPane.add(ventanaActualizarCompositor);
        }
        
        ventanaActualizarCompositor.setVisible(true);
         ventanaActualizarCompositor.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem2CCActionPerformed

    private void jMenuItem4CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4CCActionPerformed
        if (ventanaEliminarCompositor == null) {
        ventanaEliminarCompositor = new VentanaEliminarCompositor(compositorControlador);
        desktopPane.add(ventanaEliminarCompositor);
        }
        
        ventanaEliminarCompositor.setVisible(true);
         ventanaEliminarCompositor.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem4CCActionPerformed

    private void jMenuItem5CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5CCActionPerformed
              if (ventanaListarCompositor == null) {
        ventanaListarCompositor = new VentanaListarCompositor(compositorControlador);
        desktopPane.add(ventanaListarCompositor);
        }
        
        ventanaListarCompositor.setVisible(true);
         ventanaListarCompositor.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem5CCActionPerformed

    private void jMenuItem1CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1CDActionPerformed
       if (ventanaCrearDisco == null) {
        ventanaCrearDisco = new VentanaCrearDisco(cantanteControlador);
        desktopPane.add(ventanaCrearDisco);
        }
        
        ventanaCrearDisco.setVisible(true);
        ventanaCrearDisco.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem1CDActionPerformed

    private void jMenuItem2CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2CDActionPerformed
         if (ventanaActualizarDisco == null) {
        ventanaActualizarDisco = new VentanaActualizarDisco(cantanteControlador);
        desktopPane.add(ventanaActualizarDisco);
        }
        
        ventanaActualizarDisco.setVisible(true);
        ventanaActualizarDisco.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem2CDActionPerformed

    private void jMenuItem3CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3CDActionPerformed
         if (ventanaBuscarDisco == null) {
        ventanaBuscarDisco = new VentanaBuscarDisco(cantanteControlador);
        desktopPane.add(ventanaBuscarDisco);
        }
        
        ventanaBuscarDisco.setVisible(true);
        ventanaBuscarDisco.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem3CDActionPerformed

    private void jMenuItem4CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4CDActionPerformed
       if (ventanaEliminarDisco == null) {
        ventanaEliminarDisco = new VentanaEliminarDisco(cantanteControlador);
        desktopPane.add(ventanaEliminarDisco);
        }
        
        ventanaEliminarDisco.setVisible(true);
        ventanaEliminarDisco.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem4CDActionPerformed

    private void jMenuItem5CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5CDActionPerformed
            if (ventanaListarDisco == null) {
        ventanaListarDisco = new VentanaListarDisco(cantanteControlador);
        desktopPane.add(ventanaListarDisco);
        }
        
        ventanaListarDisco.setVisible(true);
         ventanaListarDisco.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem5CDActionPerformed

    private void jMenuItem1CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1CAActionPerformed
       if (ventanaCrearCancion == null) {
        ventanaCrearCancion = new VentanaCrearCancion(compositorControlador);
        desktopPane.add(ventanaCrearCancion);
        }
        
        ventanaCrearCancion.setVisible(true);
        ventanaCrearCancion.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem1CAActionPerformed

    private void jMenuItem2CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2CAActionPerformed
         if (ventanaActualizarCancion == null) {
        ventanaActualizarCancion = new VentanaActualizarCancion(compositorControlador);
        desktopPane.add(ventanaActualizarCancion);
        }
        
        ventanaActualizarCancion.setVisible(true);
        ventanaActualizarCancion.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem2CAActionPerformed

    private void jMenuItem3CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3CAActionPerformed
            if (ventanaBuscarCancion == null) {
        ventanaBuscarCancion = new VentanaBuscarCancion(compositorControlador);
        desktopPane.add(ventanaBuscarCancion);
        }
        
        ventanaBuscarCancion.setVisible(true);
        ventanaBuscarCancion.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem3CAActionPerformed

    private void jMenuItem4CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4CAActionPerformed
        if (ventanaEliminarCancion == null) {
        ventanaEliminarCancion = new VentanaEliminarCancion(compositorControlador);
        desktopPane.add(ventanaEliminarCancion);
        }
        
        ventanaEliminarCancion.setVisible(true);
        ventanaEliminarCancion.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem4CAActionPerformed

    private void jMenuItem5CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5CAActionPerformed
               if (ventanaListarCancion == null) {
        ventanaListarCancion = new VentanaListarCancion(compositorControlador);
        desktopPane.add(ventanaListarCancion);
        }
        
        ventanaListarCancion.setVisible(true);
         ventanaListarCancion.cambiarIdioma(localizacion);
    }//GEN-LAST:event_jMenuItem5CAActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     localizacion = new Locale("es","EC");
     cambiarIdioma();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
     localizacion = new Locale("en","US");
     cambiarIdioma();
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
       localizacion = new Locale("fr","FR");
     cambiarIdioma();
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void menuItemI1CliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemI1CliActionPerformed
        if (ventanaCrearCliente == null) {
            ventanaCrearCliente = new VentanaCrearCliente(cantanteControlador,compositorControlador);
            desktopPane.add(ventanaCrearCliente);
        }
        ventanaCrearCliente.setVisible(true);
         ventanaCrearCliente.cambiarIdioma(localizacion);
    }//GEN-LAST:event_menuItemI1CliActionPerformed

    private void menuItemI2CliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemI2CliActionPerformed
        if (ventanaBuscarCliente == null) {
            ventanaBuscarCliente = new VentanaBuscarCliente(compositorControlador, cantanteControlador);
            desktopPane.add(ventanaBuscarCliente);
        }
        ventanaBuscarCliente.setVisible(true);
         ventanaBuscarCliente.cambiarIdioma(localizacion);
    }//GEN-LAST:event_menuItemI2CliActionPerformed

    private void menuItemI3CliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemI3CliActionPerformed
        if (ventanaActualizarCliente == null) {
            ventanaActualizarCliente = new VentanaActualizarCliente(compositorControlador, cantanteControlador);
            desktopPane.add(ventanaActualizarCliente);
        }
        ventanaActualizarCliente.setVisible(true);
         ventanaActualizarCliente.cambiarIdioma(localizacion);
    }//GEN-LAST:event_menuItemI3CliActionPerformed

    private void menuItemI4CliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemI4CliActionPerformed
        if (ventanaEliminarCliente == null) {
            ventanaEliminarCliente = new VentanaEliminarCliente(compositorControlador, cantanteControlador);
            desktopPane.add(ventanaEliminarCliente);
        }
        ventanaEliminarCliente.setVisible(true);
         ventanaEliminarCliente.cambiarIdioma(localizacion);
    }//GEN-LAST:event_menuItemI4CliActionPerformed

    private void menuItemI5CliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemI5CliActionPerformed
        if (ventanaListarCliente == null) {
            ventanaListarCliente = new VentanaListarCliente(cantanteControlador,compositorControlador);
            desktopPane.add(ventanaListarCliente);
        }
        ventanaListarCliente.setVisible(true);
         ventanaListarCliente.cambiarIdioma(localizacion);
    }//GEN-LAST:event_menuItemI5CliActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1CA;
    private javax.swing.JMenuItem jMenuItem1CC;
    private javax.swing.JMenuItem jMenuItem1CD;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem2CA;
    private javax.swing.JMenuItem jMenuItem2CC;
    private javax.swing.JMenuItem jMenuItem2CD;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem3CA;
    private javax.swing.JMenuItem jMenuItem3CC;
    private javax.swing.JMenuItem jMenuItem3CD;
    private javax.swing.JMenuItem jMenuItem4CA;
    private javax.swing.JMenuItem jMenuItem4CC;
    private javax.swing.JMenuItem jMenuItem4CD;
    private javax.swing.JMenuItem jMenuItem5CA;
    private javax.swing.JMenuItem jMenuItem5CC;
    private javax.swing.JMenuItem jMenuItem5CD;
    private javax.swing.JMenuItem jMenuItemActualizar;
    private javax.swing.JMenuItem jMenuItemBuscar;
    private javax.swing.JMenuItem jMenuItemCrear;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemListar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu menuCancion;
    private javax.swing.JMenu menuCantante;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuCompositor;
    private javax.swing.JMenu menuDisco;
    private javax.swing.JMenu menuIdiomas;
    private javax.swing.JMenuItem menuItemI1Cli;
    private javax.swing.JMenuItem menuItemI2Cli;
    private javax.swing.JMenuItem menuItemI3Cli;
    private javax.swing.JMenuItem menuItemI4Cli;
    private javax.swing.JMenuItem menuItemI5Cli;
    // End of variables declaration//GEN-END:variables

        
}
