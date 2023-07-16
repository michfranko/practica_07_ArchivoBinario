/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Vista.Cliente;

import ec.edu.ups.edu.practica05_interface.test.controlador.CantanteControlador;
import ec.edu.ups.edu.practica05_interface.test.controlador.CompositorControlador;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaCrearCliente extends javax.swing.JInternalFrame {
    private ResourceBundle mensajes;
    private CompositorControlador controladorCompositor;
    private CantanteControlador controladorCantante;

    /**
     * Creates new form VentanaCrearClientec
     */
    public VentanaCrearCliente(CantanteControlador controladorCantante, CompositorControlador controladorCompositor) {
        initComponents();
        this.controladorCantante = controladorCantante;
        this.controladorCompositor = controladorCompositor;
    }
     public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jLabel1.setText(mensajes.getString("menu.cantante"));
        jLabel3.setText(mensajes.getString("jcliente")); 
        jLabel2.setText(mensajes.getString("jmensaje"));
        jLabel4.setText(mensajes.getString("menu.compositor")); 
        btnSalir.setText(mensajes.getString("salir"));
        btnAceptar.setText(mensajes.getString("BtnAceptar"));
        String Codigo = mensajes.getString("txtCodigo");
        String nombre = mensajes.getString("txtNombre");
        String apellido = mensajes.getString("txtApellido");  
        String edad = mensajes.getString("txtEdad"); 
        String nacionalidad = mensajes.getString("txtNacionalidad");  
        String salarioF = mensajes.getString("txtSalarioF");
        String artist = mensajes.getString("txtArtistico");  
        String genero = mensajes.getString("txtGeneroMusical");
        String numComposiciones = mensajes.getString("txtComposiciones");
        String disco = mensajes.getString("txtDiscos");  
        String numSencillos = mensajes.getString("txtSencillos");
        String numGiras = mensajes.getString("txtGiras");
        
        //table de compositor
        DefaultTableModel modelo = (DefaultTableModel) tblCompositor.getModel();
        modelo.setColumnIdentifiers(new Object[]{Codigo, nombre, apellido, edad, nacionalidad, salarioF, numComposiciones});
        //table de cantante  
        DefaultTableModel modeloCantante = (DefaultTableModel) tblCantante.getModel();
        modeloCantante.setColumnIdentifiers(new Object[]{Codigo, nombre, apellido, edad, nacionalidad, salarioF,artist, genero, numSencillos, disco, numGiras});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCompositor = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCantante = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        tblCompositor.setBackground(new java.awt.Color(102, 102, 102));
        tblCompositor.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        tblCompositor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Numero de composiciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCompositor);

        tblCantante.setBackground(new java.awt.Color(102, 102, 102));
        tblCantante.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        tblCantante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Nombre artistico", "Genero Musical", "N de sencillos", "Discografia", "N de giras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCantante);

        btnSalir.setBackground(new java.awt.Color(102, 102, 102));
        btnSalir.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(102, 102, 102));
        btnAceptar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel1.setText("Cantante");

        jLabel2.setText("(Seleccione el compositor y el cliente que se le quiera asignar)");

        jLabel3.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel3.setText("Crear Cliente");

        jLabel4.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel4.setText("Compositor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(btnAceptar)
                        .addGap(70, 70, 70)
                        .addComponent(btnSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel4)
                    .addContainerGap(881, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jLabel4)
                    .addContainerGap(463, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
if (comprobarSeleccion()) {
            Compositor compositor = cargarCompositorSeleccionado();
            Cantante cantante = cargarCantanteSeleccionado();

            int fila = tblCantante.getSelectedRow();
            int codigo = Integer.parseInt(tblCantante.getValueAt(fila, 0).toString());
            Cantante cantanteValidacion = controladorCompositor.buscarCantante(compositor, codigo);
            if (cantanteValidacion == null) {
                controladorCompositor.agregarCliente(compositor, cantante);
                guardarCliente(compositor, cantante); // Guardar en el archivo "clientes.dat"
                JOptionPane.showMessageDialog(this, mensajes.getString("mensajeCreado"));
                tblCantante.clearSelection();
                tblCompositor.clearSelection();
            } else {
                JOptionPane.showMessageDialog(this, "No :(");
                tblCantante.clearSelection();
            }
        } else {
            if (tblCompositor.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, ":().");
            } else if (tblCantante.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, ":().");
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un compositor y un cantante.");
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarCantante();
        cargarCompositor();
        repaint();
    }//GEN-LAST:event_formInternalFrameActivated

    private void cargarCompositor() {
        DefaultTableModel modelo = (DefaultTableModel) tblCompositor.getModel();
        modelo.setNumRows(0);
        List<Compositor> listaCompositors = controladorCompositor.Listar();
        for (Compositor compositor : listaCompositors) {
            String codigo = String.valueOf(compositor.getCodigo());
            String nombre = compositor.getNombre();
            String edad = String.valueOf(compositor.getEdad());
            String nacionalidad = compositor.getNacionalidad();
            String apellido = compositor.getApellido();
            String salario = String.valueOf(compositor.getSalarioFinal());
            String numComposiciones = String.valueOf(compositor.getNumeroDeComposiciones());
            Object[] rowData = {codigo, nombre, apellido, edad, nacionalidad, salario, numComposiciones};
            modelo.addRow(rowData);

        }
        tblCompositor.setModel(modelo);
    }

    private void cargarCantante() {
        DefaultTableModel modelo = (DefaultTableModel) tblCantante.getModel();
        modelo.setNumRows(0);
        List<Cantante> listaCantante = controladorCantante.Listar();
        for (Cantante cantante : listaCantante) {
            String codigo = String.valueOf(cantante.getCodigo());
            String nombre = cantante.getNombre();
            String apellido = cantante.getApellido();
            String edad = String.valueOf(cantante.getEdad());
            String nacionalidad = cantante.getNacionalidad();
            String salario = String.valueOf(cantante.getSalarioFinal());
            String nombreArtistico = cantante.getNombreArtistico();
            String generoMusical = cantante.getGeneroMusical();
            String numSencillos = String.valueOf(cantante.getNumeroDeSencillos());
            String numConciertos = String.valueOf(cantante.getNumeroDeConciertos());
            String numGiras = String.valueOf(cantante.getNumeroDeGiras());
            Object[] rowData = {codigo, nombre, apellido, edad, nacionalidad, salario, nombreArtistico, generoMusical, numSencillos, numConciertos, numGiras};
            modelo.addRow(rowData);
        }
        tblCantante.setModel(modelo);
    }

    private Cantante cargarCantanteSeleccionado() {
        int fila = tblCantante.getSelectedRow();
        int codigo = Integer.parseInt(tblCantante.getValueAt(fila, 0).toString());
        Cantante cantante = controladorCantante.buscar(codigo);
        return cantante;

    }

    private Compositor cargarCompositorSeleccionado() {
        int fila = tblCompositor.getSelectedRow();
        int codigo = Integer.parseInt(tblCompositor.getValueAt(fila, 0).toString());
        Compositor compositor = controladorCompositor.buscar(codigo);
        return compositor;

    }

    private boolean comprobarSeleccion() {
        if (tblCompositor.getSelectedRow() == -1 || tblCantante.getSelectedRow() == -1) {
            return false;
        } else {
            return true;
        }
    }
    
    private void guardarCliente(Compositor compositor, Cantante cantante) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("clientes.dat", true))) {
            writer.write("Compositor: " + compositor.getNombre() + " " + compositor.getApellido());
            writer.newLine();
            writer.write("Cantante: " + cantante.getNombre() + " " + cantante.getApellido());
            writer.newLine();
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblCantante;
    private javax.swing.JTable tblCompositor;
    // End of variables declaration//GEN-END:variables
}
