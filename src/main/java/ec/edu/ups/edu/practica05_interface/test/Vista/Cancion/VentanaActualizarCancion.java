/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Vista.Cancion;
import ec.edu.ups.edu.practica05_interface.test.controlador.CompositorControlador;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cancion;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jf001
 */
public class VentanaActualizarCancion extends javax.swing.JInternalFrame {
private CompositorControlador controladorCompositor;
 private ResourceBundle mensajes;
    /**
     * Creates new form VentanaActualizarCancion
     */
    public VentanaActualizarCancion(CompositorControlador controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
    }
        public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jLabel1CC.setText(mensajes.getString("txtCodigo"));
        jLabel2NC.setText(mensajes.getString("txtNombre"));
        jLabel3APEC.setText(mensajes.getString("txtApellido"));  
        jLabel4NC.setText(mensajes.getString("txtComposiciones"));  
        jLabel5CCA.setText(mensajes.getString("txtCodigo"));
        jLabel6TI.setText(mensajes.getString("txtTitulo"));
        jLabel7LE.setText(mensajes.getString("txtLetra"));  
        jLabel8DU.setText(mensajes.getString("txtDuracion"));        
        BtnAceptar.setText(mensajes.getString("BtnAceptar"));
        BtnCancelar.setText(mensajes.getString("BtnCancelar"));
        BtnBuscar.setText(mensajes.getString("BtnBuscar"));
        BtnActualizar.setText(mensajes.getString("actualizar"));
        BtnSalir.setText(mensajes.getString("salir"));
        jLabelTITULOCOMPO.setText(mensajes.getString("menu.compositor"));
        jLabelTITULOCAN.setText(mensajes.getString("jcancion"));
       jPanel1.setBorder(BorderFactory.createTitledBorder(mensajes.getString("PanelACancion")));
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
        jLabel1CC = new javax.swing.JLabel();
        jLabel2NC = new javax.swing.JLabel();
        jLabel3APEC = new javax.swing.JLabel();
        jLabel4NC = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNumComposiciones = new javax.swing.JTextField();
        BtnSalir = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        jLabelTITULOCAN = new javax.swing.JLabel();
        jLabel5CCA = new javax.swing.JLabel();
        jLabel6TI = new javax.swing.JLabel();
        jLabel7LE = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtLetra = new javax.swing.JTextField();
        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        cbxCancion = new javax.swing.JComboBox<>();
        BtnActualizar = new javax.swing.JButton();
        txtDuracion = new javax.swing.JTextField();
        jLabel8DU = new javax.swing.JLabel();
        jLabelTITULOCOMPO = new javax.swing.JLabel();

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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar Cancion")));

        jLabel1CC.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel1CC.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1CC.setText("Codigo");

        jLabel2NC.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2NC.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel2NC.setText("Nombre");

        jLabel3APEC.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3APEC.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel3APEC.setText("Apellido");

        jLabel4NC.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4NC.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel4NC.setText("Numero de composiciones");

        txtCodigo.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombre.setEnabled(false);

        txtApellido.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtApellido.setEnabled(false);

        txtNumComposiciones.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNumComposiciones.setEnabled(false);

        BtnSalir.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnBuscar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        jLabelTITULOCAN.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTITULOCAN.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelTITULOCAN.setText(" Cancion");

        jLabel5CCA.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5CCA.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel5CCA.setText("Codigo");

        jLabel6TI.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6TI.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel6TI.setText("Titulo");

        jLabel7LE.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7LE.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel7LE.setText("Letra");

        txtTitulo.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtTitulo.setEnabled(false);

        txtLetra.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtLetra.setEnabled(false);

        BtnAceptar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnAceptar.setText("Aceptar");
        BtnAceptar.setEnabled(false);
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnCancelar.setText("Cancelar ");
        BtnCancelar.setEnabled(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        cbxCancion.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        cbxCancion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canciones" }));
        cbxCancion.setEnabled(false);
        cbxCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxCancionMouseClicked(evt);
            }
        });
        cbxCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCancionActionPerformed(evt);
            }
        });

        BtnActualizar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnActualizar.setText("Actualizar ");
        BtnActualizar.setEnabled(false);
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        txtDuracion.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtDuracion.setEnabled(false);

        jLabel8DU.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8DU.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel8DU.setText("Duracion");

        jLabelTITULOCOMPO.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTITULOCOMPO.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelTITULOCOMPO.setText("Compositor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTITULOCAN)
                    .addComponent(jLabel3APEC)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1CC)
                            .addComponent(jLabel2NC)
                            .addComponent(jLabel4NC))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(BtnBuscar))
                                    .addComponent(BtnAceptar)
                                    .addComponent(BtnCancelar)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5CCA)
                            .addComponent(jLabel6TI)
                            .addComponent(jLabel7LE)
                            .addComponent(jLabel8DU))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnSalir)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLetra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                .addComponent(BtnActualizar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxCancion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDuracion))))
                    .addComponent(jLabelTITULOCOMPO))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelTITULOCOMPO)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1CC)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAceptar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2NC)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3APEC)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4NC)
                            .addComponent(txtNumComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BtnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jLabelTITULOCAN)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5CCA)
                    .addComponent(cbxCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6TI)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7LE)
                    .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8DU)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(BtnActualizar)
                .addGap(29, 29, 29)
                .addComponent(BtnSalir)
                .addGap(108, 108, 108))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        LimpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
 if (!txtCodigo.getText().isEmpty()) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            Compositor compositor= controladorCompositor.buscar(codigo);
            if (compositor != null) {
                txtApellido.setText(compositor.getApellido());
                txtNombre.setText(compositor.getNombre());
                txtNumComposiciones.setText(String.valueOf(compositor.getCancionesCompositor()));
                BtnAceptar.setEnabled(true);

            } else {
                 JOptionPane.showMessageDialog(this, mensajes.getString("mensajeBuscar"));
                LimpiarCampos();
            }
        } else {
           LimpiarCampos();
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigoIngresado = Integer.parseInt(txtCodigo.getText());
            Compositor compositor = controladorCompositor.buscar(codigoIngresado);

            if (compositor != null) {
                if (compositor.getNombre().equals(txtNombre.getText()) && compositor.getApellido().equals(txtApellido.getText())) {
                    txtCodigo.setEnabled(false);
                    BtnCancelar.setEnabled(true);
                    BtnAceptar.setEnabled(false);
                    BtnBuscar.setEnabled(false);
                    cbxCancion.setEnabled(true);
                    enableCancion(true);
                    cargarDatosCombo();
                }
            }else {
            
                }
        }
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        txtCodigo.setEnabled(true);
        BtnAceptar.setEnabled(true);
        BtnCancelar.setEnabled(false);
        BtnBuscar.setEnabled(true);
        enableCancion(false);
        LimpiarCampos();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void cbxCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCancionMouseClicked

        cargarDatosCombo();
    }//GEN-LAST:event_cbxCancionMouseClicked

    private void cbxCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCancionActionPerformed
        if (cbxCancion.getSelectedItem() != null) {
            Cancion cancion = (Cancion) cbxCancion.getSelectedItem();
            txtLetra.setText(cancion.getLetra());
            txtTitulo.setText(cancion.getTitulo());
            txtDuracion.setText(String.valueOf(cancion.getTiempoEnMinutos()));
        }
    }//GEN-LAST:event_cbxCancionActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        if (validarCamposCancion()) {
            Compositor compositor = controladorCompositor.buscar(Integer.parseInt(txtCodigo.getText()));
            DefaultComboBoxModel<Cancion> modelo = (DefaultComboBoxModel) cbxCancion.getModel();
            Cancion cancion = (Cancion) modelo.getSelectedItem();
            int codigo = cancion.getCodigo();
            String titulo = txtTitulo.getText();
            String  letra = txtLetra.getText();
            double duracion = cancion.getTiempoEnMinutos();
            controladorCompositor.actualizarCancion(compositor, codigo, titulo, letra,duracion);
            JOptionPane.showMessageDialog(this, mensajes.getString("mensajeActualizar"));
            enableCancion(false);
            txtCodigo.setEnabled(true);
            BtnBuscar.setEnabled(true);
            BtnCancelar.setEnabled(false);
            LimpiarCampos();
        } else {
           JOptionPane.showMessageDialog(this, mensajes.getString("mensajeNOActualizar"));
           LimpiarCampos();
        }
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
 repaint();
    }//GEN-LAST:event_formInternalFrameActivated
public void LimpiarCampos(){
  txtTitulo.setText("");
  txtLetra.setText("");
  txtCodigo.setText("");
  txtDuracion.setText("");
  txtApellido.setText("");
  txtNombre.setText("");
  txtNumComposiciones.setText("");

}

 private void cargarDatosCombo() {
        DefaultComboBoxModel<Cancion> modelo = (DefaultComboBoxModel) cbxCancion.getModel();
        Compositor compositor = this.controladorCompositor.buscar(Integer.parseInt(txtCodigo.getText()));
        modelo.removeAllElements();
        List<Cancion> listaCanciones = compositor.listarCanciones();

        for (Cancion cancion : listaCanciones) {
            modelo.addElement(cancion);
        }
        Cancion cancion = (Cancion) modelo.getSelectedItem();
        txtTitulo.setText(cancion.getTitulo());
        txtLetra.setText(cancion.getLetra());
        txtDuracion.setText(String.valueOf(cancion.getTiempoEnMinutos()));
    }

    private void enableCancion(boolean val) {
        cbxCancion.setEnabled(val);
        txtTitulo.setEnabled(val);
        txtLetra.setEnabled(val);
        txtDuracion.setEnabled(val);
        BtnActualizar.setEnabled(val);
    }
    
    private boolean validarCamposCancion() {
        if (txtTitulo.getText().isEmpty() || txtLetra.getText().isEmpty() || txtDuracion.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> cbxCancion;
    private javax.swing.JLabel jLabel1CC;
    private javax.swing.JLabel jLabel2NC;
    private javax.swing.JLabel jLabel3APEC;
    private javax.swing.JLabel jLabel4NC;
    private javax.swing.JLabel jLabel5CCA;
    private javax.swing.JLabel jLabel6TI;
    private javax.swing.JLabel jLabel7LE;
    private javax.swing.JLabel jLabel8DU;
    private javax.swing.JLabel jLabelTITULOCAN;
    private javax.swing.JLabel jLabelTITULOCOMPO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtLetra;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumComposiciones;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
