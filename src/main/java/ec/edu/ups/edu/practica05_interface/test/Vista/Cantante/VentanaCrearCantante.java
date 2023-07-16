/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Vista.Cantante;

import ec.edu.ups.edu.practica05_interface.test.controlador.CantanteControlador;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Disco;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author jf001
 */
public class VentanaCrearCantante extends javax.swing.JInternalFrame {
      private CantanteControlador cantanteControlador;
       private ResourceBundle mensajes;

    /**
     * Creates new form VentanaCrearCantante
     */
    public VentanaCrearCantante(CantanteControlador cantanteControlador) {
        initComponents();
        this.cantanteControlador = cantanteControlador;
    }
    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        label1.setText(mensajes.getString("txtCodigo"));
        label2.setText(mensajes.getString("txtNombre"));
        label3.setText(mensajes.getString("txtApellido"));  
        label4.setText(mensajes.getString("txtEdad")); 
        label5.setText(mensajes.getString("txtArtistico")); 
        label6.setText(mensajes.getString("txtNacionalidad")); 
        label7.setText(mensajes.getString("txtGeneroMusical")); 
        label8.setText(mensajes.getString("txtSalario")); 
        jLabelS.setText(mensajes.getString("txtSencillos"));
        jLabelD.setText(mensajes.getString("txtDiscos"));
        jLabelG.setText(mensajes.getString("txtGiras"));
        jLabelf.setText(mensajes.getString("txtSalarioF"));        
        BtnAceptar.setText(mensajes.getString("BtnAceptar"));
        BtnCancelar.setText(mensajes.getString("BtnCancelar"));
        BtnCalcular.setText(mensajes.getString("BtnCalcular"));
       jPanel1.setBorder(BorderFactory.createTitledBorder(mensajes.getString("PanelCCantante")));
       jPanel2.setBorder(BorderFactory.createTitledBorder(mensajes.getString("PanelSueldo")));
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
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNombreArtist = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtGeneroMusical = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BtnCalcular = new javax.swing.JButton();
        jLabelS = new javax.swing.JLabel();
        jLabelD = new javax.swing.JLabel();
        jLabelG = new javax.swing.JLabel();
        txtSencillos = new javax.swing.JTextField();
        txtDiscos = new javax.swing.JTextField();
        txtGiras = new javax.swing.JTextField();
        jLabelf = new javax.swing.JLabel();
        txtSueldoFinal = new javax.swing.JTextField();

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
                formInternalFrameClosing(evt);
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Cantante"));

        label1.setText("Codigo");

        label2.setText("Nombre");

        label3.setText("Apellido");

        label4.setText("Edad");

        label5.setText("Nombre Artistico");

        label6.setText("Nacionalidad");

        label7.setText("Genero Musical");

        label8.setText("Salario");

        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Calcular Sueldo"));

        BtnCalcular.setText("Calcular");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        jLabelS.setText("Numero de sencillos");

        jLabelD.setText("Numero de discos");

        jLabelG.setText("Numero de Giras");

        txtSencillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSencillosActionPerformed(evt);
            }
        });

        jLabelf.setText("Salario final:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelG)
                    .addComponent(jLabelD)
                    .addComponent(jLabelS)
                    .addComponent(txtSencillos)
                    .addComponent(txtDiscos)
                    .addComponent(txtGiras, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSueldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelf)
                    .addComponent(BtnCalcular))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSueldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelD))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(BtnCalcular))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDiscos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabelf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7)
                            .addComponent(label6)
                            .addComponent(label4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label1)
                                .addComponent(label2)))))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5)
                            .addComponent(txtNombreArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label8)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(BtnAceptar)
                        .addGap(143, 143, 143)
                        .addComponent(BtnCancelar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(label1)
                .addGap(12, 12, 12)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(label2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(label5))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreArtist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6)
                    .addComponent(label8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label7)
                .addGap(6, 6, 6)
                .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAceptar)
                    .addComponent(BtnCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
    int codigo = Integer.parseInt(txtCodigo.getText());
    String nombre = txtNombre.getText();
    String apellido = txtApellido.getText();
    int edad = Integer.parseInt(txtEdad.getText());
    String nombreArtistico = txtNombreArtist.getText();
    String nacionalidad = txtNacionalidad.getText();
    String generoMusical = txtGeneroMusical.getText();
    double salario = Double.parseDouble(txtSalario.getText());
    int cantidadSencillos = Integer.parseInt(txtSencillos.getText());
    int cantidadGiras = Integer.parseInt(txtGiras.getText());
    

    Cantante singer = new Cantante();
     List<Disco> discografia = singer.getDiscografia();
     int cantidadDiscos = (discografia != null) ? discografia.size() : 0;
     txtDiscos.setText(String.valueOf(cantidadDiscos));
     
     
    singer.setNombre(nombre);
    singer.setCodigo(codigo);
    singer.setApellido(apellido);
    singer.setEdad(edad);
    singer.setNacionalidad(nacionalidad);
    singer.setNombreArtistico(nombreArtistico);
    singer.setSalario(salario);
    singer.setGeneroMusical(generoMusical);
    singer.setNumeroDeSencillos(cantidadSencillos);
    singer.setNumeroDeGiras(cantidadGiras);
    singer.setDiscografia(discografia);

    calcularSalarioFinal(singer); 

    cantanteControlador.crear(singer);
    JOptionPane.showMessageDialog(this, mensajes.getString("mensajeCreado"));
    this.LimpiarCampos();
    cantanteControlador.buscar(codigo);
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
  this.LimpiarCampos();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
this.LimpiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
txtDiscos.setEnabled(false);
  repaint();
    }//GEN-LAST:event_formInternalFrameActivated

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
    Cantante singer = new Cantante();
    int cantidadSencillos = Integer.parseInt(txtSencillos.getText());
    int cantidadGiras = Integer.parseInt(txtGiras.getText());
    List<Disco> discografia = singer.getDiscografia();
    double salario = Double.parseDouble(txtSalario.getText());

    double salarioFinal = salario;
    int cantidadDiscos = (discografia != null) ? discografia.size() : 0;

    txtDiscos.setText(String.valueOf(cantidadDiscos));

    if (cantidadSencillos > 10 && cantidadGiras > 3) {
        salarioFinal += 1000;
    }

    if (cantidadSencillos >= 1 && cantidadSencillos <= 10) {
        salarioFinal *= 1.05;
    }

    if (cantidadGiras >= 1 && cantidadGiras <= 3) {
        salarioFinal *= 1.03;
    }

    if (cantidadDiscos >= 5) {
        salarioFinal += 2000;
    }

    singer.setSalarioFinal(salarioFinal);  

    txtSueldoFinal.setText(String.valueOf(salarioFinal));
    txtSueldoFinal.setEnabled(false);
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void txtSencillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSencillosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSencillosActionPerformed
private void LimpiarCampos(){
txtNombre.setText("");
txtApellido.setText("");
txtEdad.setText("");
txtNombreArtist.setText("");
txtNacionalidad.setText("");
txtGeneroMusical.setText("");
txtSalario.setText("");
txtCodigo.setText("");
txtDiscos.setText("");
txtGiras.setText("");
txtSencillos.setText("");
txtSueldoFinal.setText("");
}
private void calcularSalarioFinal(Cantante singer) {
    int cantidadSencillos = Integer.parseInt(txtSencillos.getText());
    int cantidadGiras = Integer.parseInt(txtGiras.getText());
    List<Disco> discografia = singer.getDiscografia();
    double salario = singer.getSalario();

    double salarioFinal = salario;
    int cantidadDiscos = (discografia != null) ? discografia.size() : 0;

    txtDiscos.setText(String.valueOf(cantidadDiscos));

    if (cantidadSencillos > 10 && cantidadGiras > 3) {
        salarioFinal += 1000;
    }

    if (cantidadSencillos >= 1 && cantidadSencillos <= 10) {
        salarioFinal *= 1.05;
    }

    if (cantidadGiras >= 1 && cantidadGiras <= 3) {
        salarioFinal *= 1.03;
    }

    if (cantidadDiscos >= 5) {
        salarioFinal += 2000;
    }

    singer.setSalarioFinal(salarioFinal);  // Guardar el salario final en el objeto singer

    txtSueldoFinal.setText(String.valueOf(salarioFinal));
    txtSueldoFinal.setEnabled(false);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelG;
    private javax.swing.JLabel jLabelS;
    private javax.swing.JLabel jLabelf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDiscos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtGiras;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtist;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSencillos;
    private javax.swing.JTextField txtSueldoFinal;
    // End of variables declaration//GEN-END:variables
}
