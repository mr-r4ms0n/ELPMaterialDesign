/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import configuracion.Alertas;
import java.awt.Shape;
import java.awt.Window;
import java.awt.geom.RoundRectangle2D;
import vista.enviados.tabContenidoEnv;
import static configuracion.Alertas.vPanelPrincipal;


/**
 *
 * @author Kevin Benitez
 */
public class Menu extends javax.swing.JFrame
{

    /**
     * Creates new form Menu
     */
    public static Window vtn;

    public Menu(String user)
    {
        initComponents();
        setLocationRelativeTo(null);
        vtn = this;
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
        vtn.setShape(forma);
        LblBienvenida1.setText("Bienvenido (" + user + ")");
        panelRecibidos.setVisible(false);
        panelEnviados.setVisible(false);
        panelinfo.setVisible(false);
        panelreloj.setVisible(true);
    }

    public Menu()
    {

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

        rSPanelMaterialImage1 = new RSMaterialComponent.RSPanelMaterialImage();
        rSPanelMaterial2 = new RSMaterialComponent.RSPanelMaterial();
        jLabel1 = new javax.swing.JLabel();
        rSLabelIcon1 = new RSMaterialComponent.RSLabelIcon();
        BtnCerrar = new RSMaterialComponent.RSButtonIconOne();
        rSPanelMaterial1 = new RSMaterialComponent.RSPanelMaterial();
        rSPanelBorderImage1 = new RSMaterialComponent.RSPanelBorderImage();
        LblBienvenida = new javax.swing.JLabel();
        JBInicio = new RSMaterialComponent.RSButtonMaterialIconShadow();
        JBPaquetes = new RSMaterialComponent.RSButtonMaterialIconShadow();
        JBAbout = new RSMaterialComponent.RSButtonMaterialIconShadow();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JBPaquetesEnv = new RSMaterialComponent.RSButtonMaterialIconShadow();
        LblBienvenida1 = new javax.swing.JLabel();
        panelRecibidos = new newscomponents.RSPanelEffect();
        recibidos1 = new vista.paquetes.Recibidos();
        panelEnviados = new newscomponents.RSPanelEffect();
        enviados1 = new vista.enviados.Enviados();
        panelinfo = new newscomponents.RSPanelEffect();
        informacion1 = new vista.confirmaciones.Informacion();
        panelreloj = new newscomponents.RSPanelEffect();
        reloj1 = new vista.VistaReloj();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rSPanelMaterialImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/recursos/prisas_login.jpg"))); // NOI18N
        rSPanelMaterialImage1.setShadowBottom(false);
        rSPanelMaterialImage1.setShadowLeft(false);
        rSPanelMaterialImage1.setShadowRight(false);
        rSPanelMaterialImage1.setShadowTop(false);

        rSPanelMaterial2.setBackground(new java.awt.Color(0, 153, 204));
        rSPanelMaterial2.setRound(10);
        rSPanelMaterial2.setShadowLeft(false);
        rSPanelMaterial2.setShadowRight(false);
        rSPanelMaterial2.setShadowTop(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("El Prisas Logistic");

        rSLabelIcon1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCAL_POST_OFFICE);
        rSLabelIcon1.setSizeIcon(50.0F);

        BtnCerrar.setBackground(new java.awt.Color(0, 153, 204));
        BtnCerrar.setToolTipText("Cerrar");
        BtnCerrar.setBackgroundHover(new java.awt.Color(103, 177, 202));
        BtnCerrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_RIGHT);
        BtnCerrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BtnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelMaterial2Layout = new javax.swing.GroupLayout(rSPanelMaterial2);
        rSPanelMaterial2.setLayout(rSPanelMaterial2Layout);
        rSPanelMaterial2Layout.setHorizontalGroup(
            rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1321, Short.MAX_VALUE)
                .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        rSPanelMaterial2Layout.setVerticalGroup(
            rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        rSPanelMaterial1.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelMaterial1.setIntensity(5);
        rSPanelMaterial1.setRound(30);
        rSPanelMaterial1.setShadowBottom(false);
        rSPanelMaterial1.setShadowLeft(false);
        rSPanelMaterial1.setShadowTop(false);

        rSPanelBorderImage1.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelBorderImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_man_with_a_security_shield_100px.png"))); // NOI18N
        rSPanelBorderImage1.setShapePanel(rojeru_san.efectos.ValoresEnum.PANEL_FORMA.CIRCLE);

        javax.swing.GroupLayout rSPanelBorderImage1Layout = new javax.swing.GroupLayout(rSPanelBorderImage1);
        rSPanelBorderImage1.setLayout(rSPanelBorderImage1Layout);
        rSPanelBorderImage1Layout.setHorizontalGroup(
            rSPanelBorderImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rSPanelBorderImage1Layout.setVerticalGroup(
            rSPanelBorderImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        LblBienvenida.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        LblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblBienvenida.setText("Usuario");

        JBInicio.setBackground(new java.awt.Color(255, 255, 255));
        JBInicio.setForeground(new java.awt.Color(51, 51, 51));
        JBInicio.setText("Inicio");
        JBInicio.setBackgroundHover(new java.awt.Color(103, 177, 202));
        JBInicio.setForegroundText(new java.awt.Color(51, 51, 51));
        JBInicio.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        JBInicio.setSelected(true);
        JBInicio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JBInicioActionPerformed(evt);
            }
        });

        JBPaquetes.setBackground(new java.awt.Color(255, 255, 255));
        JBPaquetes.setForeground(new java.awt.Color(51, 51, 51));
        JBPaquetes.setText("Paquetes Recibidos");
        JBPaquetes.setBackgroundHover(new java.awt.Color(103, 177, 202));
        JBPaquetes.setForegroundText(new java.awt.Color(51, 51, 51));
        JBPaquetes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCAL_POST_OFFICE);
        JBPaquetes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JBPaquetesActionPerformed(evt);
            }
        });

        JBAbout.setBackground(new java.awt.Color(255, 255, 255));
        JBAbout.setForeground(new java.awt.Color(51, 51, 51));
        JBAbout.setText("Acerca De");
        JBAbout.setBackgroundHover(new java.awt.Color(103, 177, 202));
        JBAbout.setForegroundText(new java.awt.Color(51, 51, 51));
        JBAbout.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.NEW_RELEASES);
        JBAbout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JBAboutActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel4.setText("Navegación");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel5.setText("Extras");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JBPaquetesEnv.setBackground(new java.awt.Color(255, 255, 255));
        JBPaquetesEnv.setForeground(new java.awt.Color(51, 51, 51));
        JBPaquetesEnv.setText("Paquetes Enviados");
        JBPaquetesEnv.setBackgroundHover(new java.awt.Color(103, 177, 202));
        JBPaquetesEnv.setForegroundText(new java.awt.Color(51, 51, 51));
        JBPaquetesEnv.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MOTORCYCLE);
        JBPaquetesEnv.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JBPaquetesEnvActionPerformed(evt);
            }
        });

        LblBienvenida1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        LblBienvenida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblBienvenida1.setText("Usuario");

        javax.swing.GroupLayout rSPanelMaterial1Layout = new javax.swing.GroupLayout(rSPanelMaterial1);
        rSPanelMaterial1.setLayout(rSPanelMaterial1Layout);
        rSPanelMaterial1Layout.setHorizontalGroup(
            rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(rSPanelBorderImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(JBPaquetes, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel5))))
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBPaquetesEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblBienvenida1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        rSPanelMaterial1Layout.setVerticalGroup(
            rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelBorderImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblBienvenida1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBPaquetesEnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        panelRecibidos.setBackground(new java.awt.Color(255, 255, 255));
        panelRecibidos.add(recibidos1, "card2");

        panelEnviados.setBackground(new java.awt.Color(255, 255, 255));
        panelEnviados.add(enviados1, "card2");

        panelinfo.setBackground(new java.awt.Color(255, 255, 255));
        panelinfo.add(informacion1, "card2");

        panelreloj.setBackground(new java.awt.Color(255, 255, 255));
        panelreloj.add(reloj1, "card2");

        javax.swing.GroupLayout rSPanelMaterialImage1Layout = new javax.swing.GroupLayout(rSPanelMaterialImage1);
        rSPanelMaterialImage1.setLayout(rSPanelMaterialImage1Layout);
        rSPanelMaterialImage1Layout.setHorizontalGroup(
            rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterialImage1Layout.createSequentialGroup()
                .addGroup(rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelMaterialImage1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rSPanelMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRecibidos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(rSPanelMaterial2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelMaterialImage1Layout.createSequentialGroup()
                    .addContainerGap(277, Short.MAX_VALUE)
                    .addComponent(panelEnviados, javax.swing.GroupLayout.PREFERRED_SIZE, 1449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)))
            .addGroup(rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelMaterialImage1Layout.createSequentialGroup()
                    .addGap(295, 295, 295)
                    .addComponent(panelinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 1433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
            .addGroup(rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelMaterialImage1Layout.createSequentialGroup()
                    .addContainerGap(278, Short.MAX_VALUE)
                    .addComponent(panelreloj, javax.swing.GroupLayout.PREFERRED_SIZE, 1460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        rSPanelMaterialImage1Layout.setVerticalGroup(
            rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterialImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelMaterial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSPanelMaterial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRecibidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelMaterialImage1Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(panelEnviados, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelMaterialImage1Layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addComponent(panelinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelMaterialImage1Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(panelreloj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelMaterialImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelMaterialImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAboutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JBAboutActionPerformed
    {//GEN-HEADEREND:event_JBAboutActionPerformed
        vPanelPrincipal=false;
        if (!JBAbout.isSelected())
        {
            JBAbout.setSelected(true);
            JBInicio.setSelected(false);

            JBPaquetes.setSelected(false);
            JBPaquetesEnv.setSelected(false);
        }
        panelRecibidos.setVisible(false);
        panelEnviados.setVisible(false);
        panelinfo.setVisible(true);
        panelreloj.setVisible(false);
    }//GEN-LAST:event_JBAboutActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BtnCerrarActionPerformed
    {//GEN-HEADEREND:event_BtnCerrarActionPerformed
        dispose();
        LoginAdmin vtn = new LoginAdmin();
        vtn.setVisible(true);
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void JBPaquetesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JBPaquetesActionPerformed
    {//GEN-HEADEREND:event_JBPaquetesActionPerformed
        vPanelPrincipal=false;
        if (!JBPaquetes.isSelected())
        {

            JBPaquetes.setSelected(true);
            JBInicio.setSelected(false);

            JBAbout.setSelected(false);
            JBPaquetesEnv.setSelected(false);
        }

        panelRecibidos.setVisible(true);
        panelEnviados.setVisible(false);
        panelinfo.setVisible(false);
        panelreloj.setVisible(false);
    }//GEN-LAST:event_JBPaquetesActionPerformed

    private void JBInicioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JBInicioActionPerformed
    {//GEN-HEADEREND:event_JBInicioActionPerformed
        vPanelPrincipal = true;
        if (!JBInicio.isSelected())
        {
            JBInicio.setSelected(true);
            JBPaquetes.setSelected(false);

            JBAbout.setSelected(false);
            JBPaquetesEnv.setSelected(false);

        }
        panelRecibidos.setVisible(false);
        panelEnviados.setVisible(false);
        panelinfo.setVisible(false);
        panelreloj.setVisible(true);
    }//GEN-LAST:event_JBInicioActionPerformed

    private void JBPaquetesEnvActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JBPaquetesEnvActionPerformed
    {//GEN-HEADEREND:event_JBPaquetesEnvActionPerformed
        vPanelPrincipal = false;
        if (!JBPaquetesEnv.isSelected())
        {
            JBPaquetesEnv.setSelected(true);
            JBPaquetes.setSelected(false);

            JBInicio.setSelected(false);
            JBAbout.setSelected(false);

        }
        panelRecibidos.setVisible(false);
        panelEnviados.setVisible(true);
        panelinfo.setVisible(false);
        panelreloj.setVisible(false);
        tabContenidoEnv.listarPaquetes(tabContenidoEnv.tblPaquetesEnv);
    }//GEN-LAST:event_JBPaquetesEnvActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconOne BtnCerrar;
    private RSMaterialComponent.RSButtonMaterialIconShadow JBAbout;
    private RSMaterialComponent.RSButtonMaterialIconShadow JBInicio;
    private RSMaterialComponent.RSButtonMaterialIconShadow JBPaquetes;
    private RSMaterialComponent.RSButtonMaterialIconShadow JBPaquetesEnv;
    private javax.swing.JLabel LblBienvenida;
    private javax.swing.JLabel LblBienvenida1;
    private vista.enviados.Enviados enviados1;
    private vista.confirmaciones.Informacion informacion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private newscomponents.RSPanelEffect panelEnviados;
    private newscomponents.RSPanelEffect panelRecibidos;
    private newscomponents.RSPanelEffect panelinfo;
    private newscomponents.RSPanelEffect panelreloj;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon1;
    private RSMaterialComponent.RSPanelBorderImage rSPanelBorderImage1;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial1;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial2;
    private RSMaterialComponent.RSPanelMaterialImage rSPanelMaterialImage1;
    private vista.paquetes.Recibidos recibidos1;
    private vista.VistaReloj reloj1;
    // End of variables declaration//GEN-END:variables
}
