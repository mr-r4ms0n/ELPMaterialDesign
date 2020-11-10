/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import configuracion.Alertas;
import java.awt.Color;
import java.awt.Shape;
import java.awt.Window;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.MetodosBD;
import pDataBasePrisasdb.ManipulaDBAdmins;

/**
 *
 * @author Kevin Benitez
 */
public class LoginAdmin extends javax.swing.JFrame
{

    public static Window vtn;
    
   // ManipulaDBAdmins mani = new ManipulaDBAdmins();

    /**
     * Creates new form LoginAdmin
     */
    public LoginAdmin()
    {
        vtn = this;
        initComponents();
        setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
        vtn.setShape(forma);
        lblError();
    }

    public void lblError()
    {
        JLErrorUsr.setText(null);
        JLErrorCtr.setText(null);
        JFUsuario.setText(null);
        JFContraseña.setText(null);
        JLErrorInicio.setText(null);
    }

    public void iniciosys()
    {
        new LoginAdmin().setVisible(true);
    }

    public boolean checkInicio(String usr, String ctr)
    {
        try
        {
            ResultSet rs = MetodosBD.getUsuario(usr, ctr);
            if (rs.next())
            {
                if (rs.getString(2).equals(ctr))
                {
                    return true;
                }
            }
        } catch (SQLException ex)
        {
            System.out.println("Error al obtener la informacion");
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        PanelMaterialImage = new RSMaterialComponent.RSPanelMaterialImage();
        PanelComponentes = new RSMaterialComponent.RSPanelMaterial();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLErrorCtr = new javax.swing.JLabel();
        JLErrorUsr = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JLErrorInicio = new javax.swing.JLabel();
        JFUsuario = new RSMaterialComponent.RSTextFieldMaterialIcon();
        JFContraseña = new RSMaterialComponent.RSPasswordMaterialIcon();
        btnIngresar = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnSalir = new RSMaterialComponent.RSButtonMaterialIconOne();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelMaterialImage.setImagen(new javax.swing.ImageIcon(getClass().getResource("/recursos/prisas_login.jpg"))); // NOI18N
        PanelMaterialImage.setShadowBottom(false);
        PanelMaterialImage.setShadowLeft(false);
        PanelMaterialImage.setShadowRight(false);
        PanelMaterialImage.setShadowTop(false);

        PanelComponentes.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("El Prisas Logistic");

        jLabel2.setBackground(new java.awt.Color(240, 240, 240));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inicio de sesion");

        jLabel3.setBackground(new java.awt.Color(240, 240, 240));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_login.png"))); // NOI18N

        JLErrorCtr.setBackground(new java.awt.Color(240, 240, 240));
        JLErrorCtr.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        JLErrorCtr.setForeground(new java.awt.Color(204, 0, 51));
        JLErrorCtr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLErrorCtr.setText("Campo requerido");

        JLErrorUsr.setBackground(new java.awt.Color(240, 240, 240));
        JLErrorUsr.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        JLErrorUsr.setForeground(new java.awt.Color(204, 0, 51));
        JLErrorUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLErrorUsr.setText("Campo requerido");

        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        JLErrorInicio.setBackground(new java.awt.Color(240, 240, 240));
        JLErrorInicio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        JLErrorInicio.setForeground(new java.awt.Color(204, 0, 51));
        JLErrorInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JFUsuario.setForeground(new java.awt.Color(0, 0, 0));
        JFUsuario.setColorIcon(new java.awt.Color(0, 0, 0));
        JFUsuario.setColorMaterial(new java.awt.Color(0, 153, 204));
        JFUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        JFUsuario.setPhColor(new java.awt.Color(0, 0, 0));
        JFUsuario.setPlaceholder("Ingrese Usuario");
        JFUsuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JFUsuarioActionPerformed(evt);
            }
        });

        JFContraseña.setForeground(new java.awt.Color(0, 0, 0));
        JFContraseña.setColorIcon(new java.awt.Color(0, 0, 0));
        JFContraseña.setColorMaterial(new java.awt.Color(0, 153, 204));
        JFContraseña.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        JFContraseña.setPhColor(new java.awt.Color(0, 0, 0));
        JFContraseña.setPlaceholder("Ingrese Contraseña");

        btnIngresar.setText("Ingresar");
        btnIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIngresar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ARROW_FORWARD);
        btnIngresar.setRound(20);
        btnIngresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 0, 51));
        btnSalir.setText("Salir");
        btnSalir.setBackgroundHover(new java.awt.Color(204, 0, 51));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);
        btnSalir.setRound(20);
        btnSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelComponentesLayout = new javax.swing.GroupLayout(PanelComponentes);
        PanelComponentes.setLayout(PanelComponentesLayout);
        PanelComponentesLayout.setHorizontalGroup(
            PanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelComponentesLayout.createSequentialGroup()
                .addGroup(PanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelComponentesLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelComponentesLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(PanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JFUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JFContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelComponentesLayout.createSequentialGroup()
                                .addGroup(PanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLErrorInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelComponentesLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))
                            .addComponent(JLErrorCtr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLErrorUsr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelComponentesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PanelComponentesLayout.setVerticalGroup(
            PanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelComponentesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLErrorUsr)
                .addGap(37, 37, 37)
                .addComponent(JFContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLErrorCtr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(PanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLErrorInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout PanelMaterialImageLayout = new javax.swing.GroupLayout(PanelMaterialImage);
        PanelMaterialImage.setLayout(PanelMaterialImageLayout);
        PanelMaterialImageLayout.setHorizontalGroup(
            PanelMaterialImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMaterialImageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMaterialImageLayout.setVerticalGroup(
            PanelMaterialImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMaterialImageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelMaterialImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelMaterialImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JFUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JFUsuarioActionPerformed
    {//GEN-HEADEREND:event_JFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIngresarActionPerformed
    {//GEN-HEADEREND:event_btnIngresarActionPerformed
        if (JFUsuario.getText().isEmpty())
        {
            JLErrorUsr.setText("Este Campo es Requerido");
        }

        if (JFContraseña.getText().isEmpty())
        {
            JLErrorCtr.setText("Este Campo es Requerido");
        }

        if (!(JFUsuario.getText().isEmpty() && JFContraseña.getText().isEmpty()))
        {
            Alertas al = new Alertas();
            if (checkInicio(JFUsuario.getText(), JFContraseña.getText()))
            {

                al.incorrect(2);
                JLErrorInicio.setForeground(Color.green);
                JLErrorInicio.setText("Autentificacion correcta");
                Menu vtn = new Menu(JFUsuario.getText());
                vtn.setVisible(true);
                dispose();
            } else
            {

                al.incorrect(1);
                JLErrorInicio.setForeground(Color.red);
                JLErrorInicio.setText("Las credenciales no son validas");
            }
        } else
        {

        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalirActionPerformed
    {//GEN-HEADEREND:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSPasswordMaterialIcon JFContraseña;
    private RSMaterialComponent.RSTextFieldMaterialIcon JFUsuario;
    private javax.swing.JLabel JLErrorCtr;
    private javax.swing.JLabel JLErrorInicio;
    private javax.swing.JLabel JLErrorUsr;
    private RSMaterialComponent.RSPanelMaterial PanelComponentes;
    private RSMaterialComponent.RSPanelMaterialImage PanelMaterialImage;
    private RSMaterialComponent.RSButtonMaterialIconOne btnIngresar;
    private RSMaterialComponent.RSButtonMaterialIconOne btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}