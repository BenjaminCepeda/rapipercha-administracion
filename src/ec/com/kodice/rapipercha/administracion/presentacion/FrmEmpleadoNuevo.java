/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.kodice.rapipercha.administracion.presentacion;

import ec.com.kodice.rapipercha.administracion.negocio.PerfilBO;
import ec.com.kodice.rapipercha.administracion.negocio.UsuarioBO;//preguntar si va EmpleadoBO
import ec.com.kodice.rapipercha.administracion.persistencia.PerfilVO;
import ec.com.kodice.rapipercha.administracion.persistencia.UsuarioVO;
import ec.com.kodice.rapipercha.util.UtilPresentacion;
import javax.swing.JOptionPane;


/**
 *
 * @author Edi
 */
public class FrmEmpleadoNuevo extends javax.swing.JFrame {

    private int codigoActual = 0;

    public void setCodigoActual(int codigoActual) {
        this.codigoActual = codigoActual;
    }

    /** Creates new form FrmPerfilAdministracion */
    public FrmEmpleadoNuevo(int codigoActual, boolean soloLectura) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.codigoActual = codigoActual;
        if (soloLectura)
            seteaControles(soloLectura);
        cargarDatos();
    }
    
    public FrmEmpleadoNuevo() {
          initComponents();
        this.setLocationRelativeTo(null);
        this.codigoActual = 0;
        cargarDatos();
    }
    private void seteaControles(boolean soloLectura){
        btnGrabar.setEnabled(!soloLectura);
    }
    
    private void cargarDatos(){
        UsuarioVO usuarioVO = null;
        UsuarioBO usuarioBO = new UsuarioBO();
        PerfilBO perfilBO = new PerfilBO();
        String nombrePerfil;
    //    cmbEstado.setModel(usuarioBO.generaModeloDatosEstados());
        try {
     //       cmbPerfil.setModel(perfilBO.generaModeloDatosCombo());
            if (codigoActual!=0){
                usuarioVO=usuarioBO.buscar(codigoActual);
            }
        }
        catch ( Exception e) {
            UtilPresentacion.mostrarMensajeError(this, e.getMessage());
        }
        finally{
            if (usuarioVO != null){
             //           cmbPerfil.getModel().setSelectedItem(usuarioVO.getPerfil());
                        txtCodigo.setText(String.valueOf(usuarioVO.getCodigo()));
                        txtNombre.setText(usuarioVO.getNombre());
                        txtCedula.setText(usuarioVO.getClave());
                        txtApelido.setText(usuarioVO.getClave());
               //         cmbEstado.setSelectedItem(usuarioVO.getEstado());
            }
            usuarioVO = null;
            usuarioBO = null;
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

        jPanel1 = new javax.swing.JPanel();
        pnlCabecera = new javax.swing.JPanel();
        lblLogoRapipercha = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        pnlDetalle = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblPerfil = new javax.swing.JLabel();
        txtCedula = new javax.swing.JPasswordField();
        txtApelido = new javax.swing.JPasswordField();
        txtCodigoProveedor = new javax.swing.JTextField();
        lblPerfil1 = new javax.swing.JLabel();
        txtCodigoUsuario = new javax.swing.JTextField();
        lblPerfil2 = new javax.swing.JLabel();
        lblPerfil3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JPasswordField();
        lblPerfil4 = new javax.swing.JLabel();
        lblPerfil5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JPasswordField();
        lblPerfil6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JPasswordField();
        pnlPie = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblLogoKodice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        pnlCabecera.setBackground(new java.awt.Color(64, 124, 202));
        pnlCabecera.setAlignmentX(0.0F);
        pnlCabecera.setAlignmentY(0.0F);
        pnlCabecera.setMaximumSize(new java.awt.Dimension(32767, 90));
        pnlCabecera.setMinimumSize(new java.awt.Dimension(0, 90));
        pnlCabecera.setPreferredSize(new java.awt.Dimension(518, 90));

        lblLogoRapipercha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/kodice/rapipercha/imagenes/logo-rapipercha.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("EMPLEADO");

        javax.swing.GroupLayout pnlCabeceraLayout = new javax.swing.GroupLayout(pnlCabecera);
        pnlCabecera.setLayout(pnlCabeceraLayout);
        pnlCabeceraLayout.setHorizontalGroup(
            pnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabeceraLayout.createSequentialGroup()
                .addComponent(lblLogoRapipercha)
                .addGap(202, 202, 202)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCabeceraLayout.setVerticalGroup(
            pnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogoRapipercha)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCabeceraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(30, 30, 30))
        );

        pnlDetalle.setAlignmentX(0.0F);
        pnlDetalle.setAlignmentY(0.0F);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo.setText("Código:");

        txtCodigo.setEnabled(false);
        txtCodigo.setMinimumSize(new java.awt.Dimension(7, 22));
        txtCodigo.setPreferredSize(new java.awt.Dimension(7, 22));

        lblPerfil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPerfil.setText("Codigo Proveedor:");

        txtCedula.setMinimumSize(new java.awt.Dimension(7, 22));
        txtCedula.setPreferredSize(new java.awt.Dimension(7, 22));

        txtApelido.setMinimumSize(new java.awt.Dimension(7, 22));
        txtApelido.setPreferredSize(new java.awt.Dimension(7, 22));

        txtCodigoProveedor.setEnabled(false);
        txtCodigoProveedor.setMinimumSize(new java.awt.Dimension(7, 22));
        txtCodigoProveedor.setPreferredSize(new java.awt.Dimension(7, 22));

        lblPerfil1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPerfil1.setText("Codigo Usuario:");

        txtCodigoUsuario.setEnabled(false);
        txtCodigoUsuario.setMinimumSize(new java.awt.Dimension(7, 22));
        txtCodigoUsuario.setPreferredSize(new java.awt.Dimension(7, 22));

        lblPerfil2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPerfil2.setText("Cedula:");

        lblPerfil3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPerfil3.setText("Nombre:");

        txtNombre.setMinimumSize(new java.awt.Dimension(7, 22));
        txtNombre.setPreferredSize(new java.awt.Dimension(7, 22));

        lblPerfil4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPerfil4.setText("Apellido:");

        lblPerfil5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPerfil5.setText("Telefono:");

        txtTelefono.setMinimumSize(new java.awt.Dimension(7, 22));
        txtTelefono.setPreferredSize(new java.awt.Dimension(7, 22));

        lblPerfil6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPerfil6.setText("Correo:");

        txtCorreo.setMinimumSize(new java.awt.Dimension(7, 22));
        txtCorreo.setPreferredSize(new java.awt.Dimension(7, 22));

        javax.swing.GroupLayout pnlDetalleLayout = new javax.swing.GroupLayout(pnlDetalle);
        pnlDetalle.setLayout(pnlDetalleLayout);
        pnlDetalleLayout.setHorizontalGroup(
            pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetalleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDetalleLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDetalleLayout.createSequentialGroup()
                        .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPerfil1)
                            .addComponent(lblPerfil2)
                            .addComponent(lblPerfil)
                            .addComponent(lblPerfil3)
                            .addComponent(lblPerfil4)
                            .addComponent(lblPerfil5)
                            .addComponent(lblPerfil6))
                        .addGap(10, 10, 10)
                        .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApelido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(52, 52, 52))
        );
        pnlDetalleLayout.setVerticalGroup(
            pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerfil)
                    .addComponent(txtCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerfil1))
                .addGap(8, 8, 8)
                .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerfil2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerfil3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerfil4)
                    .addComponent(txtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPerfil5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerfil6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
            .addComponent(pnlDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPie.setMaximumSize(new java.awt.Dimension(32767, 90));
        pnlPie.setMinimumSize(new java.awt.Dimension(0, 90));
        pnlPie.setPreferredSize(new java.awt.Dimension(780, 90));

        btnGrabar.setBackground(new java.awt.Color(64, 124, 202));
        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGrabar.setForeground(new java.awt.Color(255, 255, 255));
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/kodice/rapipercha/imagenes/Disquette.png"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.setToolTipText("");
        btnGrabar.setAlignmentY(0.0F);
        btnGrabar.setBorderPainted(false);
        btnGrabar.setPreferredSize(new java.awt.Dimension(125, 57));
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(64, 124, 202));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/kodice/rapipercha/imagenes/Badge-cancel.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setAlignmentY(0.0F);
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblLogoKodice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/kodice/rapipercha/imagenes/logo-kodice.png"))); // NOI18N

        javax.swing.GroupLayout pnlPieLayout = new javax.swing.GroupLayout(pnlPie);
        pnlPie.setLayout(pnlPieLayout);
        pnlPieLayout.setHorizontalGroup(
            pnlPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogoKodice)
                .addGap(48, 48, 48))
        );
        pnlPieLayout.setVerticalGroup(
            pnlPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogoKodice, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalir)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPie, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(pnlPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpleadoNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblLogoKodice;
    private javax.swing.JLabel lblLogoRapipercha;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblPerfil1;
    private javax.swing.JLabel lblPerfil2;
    private javax.swing.JLabel lblPerfil3;
    private javax.swing.JLabel lblPerfil4;
    private javax.swing.JLabel lblPerfil5;
    private javax.swing.JLabel lblPerfil6;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCabecera;
    private javax.swing.JPanel pnlDetalle;
    private javax.swing.JPanel pnlPie;
    private javax.swing.JPasswordField txtApelido;
    private javax.swing.JPasswordField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoProveedor;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JPasswordField txtCorreo;
    private javax.swing.JPasswordField txtNombre;
    private javax.swing.JPasswordField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
