/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.paquetes;

import configuracion.Paqs;
import vista.confirmaciones.ConfirmaAcc;

/**
 *
 * @author Kevin Benitez
 */
public class Recibidos extends javax.swing.JPanel
{

    public static int confirmacion = -1;

    /**
     * Creates new form Principal
     */
    public Recibidos()
    {
        initComponents();

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

        jPanel1 = new javax.swing.JPanel();
        rSButtonIcon_new1 = new newscomponents.RSButtonIcon_new();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();
        btnEliminarPq = new newscomponents.RSButtonIcon_new();
        btnModificarPq = new newscomponents.RSButtonIcon_new();
        btnEnviarPq = new newscomponents.RSButtonIcon_new();
        pnlSlider = new newscomponents.RSPanelEffect();
        tabContenidoRec1 = new vista.paquetes.tabContenidoRec();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(51, 51, 51)));

        rSButtonIcon_new1.setBackground(new java.awt.Color(103, 177, 202));
        rSButtonIcon_new1.setText("Nuevo paquete");
        rSButtonIcon_new1.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonIcon_new1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD_CIRCLE);
        rSButtonIcon_new1.setRound(10);
        rSButtonIcon_new1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButtonIcon_new1ActionPerformed(evt);
            }
        });

        rSLabelTextIcon1.setForeground(new java.awt.Color(0, 153, 204));
        rSLabelTextIcon1.setText("Paquetes recibidos");
        rSLabelTextIcon1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        rSLabelTextIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCAL_POST_OFFICE);

        btnEliminarPq.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarPq.setText("Eliminar paquete");
        btnEliminarPq.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnEliminarPq.setForegroundIcon(new java.awt.Color(255, 0, 0));
        btnEliminarPq.setForegroundText(new java.awt.Color(0, 0, 0));
        btnEliminarPq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminarPq.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.REMOVE_CIRCLE);
        btnEliminarPq.setRound(10);
        btnEliminarPq.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarPqActionPerformed(evt);
            }
        });

        btnModificarPq.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarPq.setText("Modificar paquete");
        btnModificarPq.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnModificarPq.setForegroundIcon(new java.awt.Color(0, 153, 204));
        btnModificarPq.setForegroundText(new java.awt.Color(0, 0, 0));
        btnModificarPq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModificarPq.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnModificarPq.setRound(10);
        btnModificarPq.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModificarPqActionPerformed(evt);
            }
        });

        btnEnviarPq.setBackground(new java.awt.Color(255, 255, 255));
        btnEnviarPq.setText("Enviar paquete");
        btnEnviarPq.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnEnviarPq.setForegroundIcon(new java.awt.Color(0, 102, 102));
        btnEnviarPq.setForegroundText(new java.awt.Color(0, 0, 0));
        btnEnviarPq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEnviarPq.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEND);
        btnEnviarPq.setRound(10);
        btnEnviarPq.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEnviarPqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonIcon_new1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(btnEliminarPq, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnModificarPq, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnEnviarPq, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 479, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonIcon_new1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarPq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarPq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarPq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlSlider.setBackground(new java.awt.Color(255, 255, 255));
        pnlSlider.add(tabContenidoRec1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 1523, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 480, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarPqActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarPqActionPerformed
    {//GEN-HEADEREND:event_btnEliminarPqActionPerformed
        System.out.println("Seleccionaste la fila == " + tabContenidoRec.tblPaquetesRec.getSelectedRow());
        int row = tabContenidoRec.tblPaquetesRec.getSelectedRow();
        String num_guia = (String) (tabContenidoRec.tblPaquetesRec.getValueAt(row, 0));
        System.out.println("Dato seleccionado == " + num_guia);
        ConfirmaAcc sure = new ConfirmaAcc("eliminar");
        sure.setModal(true);
        sure.setVisible(true);
        if (confirmacion == 1)
        {
            //int dato = (int) tabContenidoRec.tblPaquetesRec.getValueAt(tabContenidoRec.tblPaquetesRec.getSelectedRow(), 0);
            modelo.MetodosBD.eliminaBD(Integer.parseInt(num_guia));
            tabContenidoRec.listarPaquetes(tabContenidoRec.tblPaquetesRec);
            confirmacion = -1;
        }

    }//GEN-LAST:event_btnEliminarPqActionPerformed

    private void btnModificarPqActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarPqActionPerformed
    {//GEN-HEADEREND:event_btnModificarPqActionPerformed
        int row = tabContenidoRec.tblPaquetesRec.getSelectedRow();
        String num_guia = (String) (tabContenidoRec.tblPaquetesRec.getValueAt(row, 0));
        String peso = String.valueOf(tabContenidoRec.tblPaquetesRec.getValueAt(row, 6));
        String altura = String.valueOf((tabContenidoRec.tblPaquetesRec.getValueAt(row, 7)));
        String ancho = String.valueOf(tabContenidoRec.tblPaquetesRec.getValueAt(row, 8));
        String profundidad = String.valueOf(tabContenidoRec.tblPaquetesRec.getValueAt(row, 9));
        String precio = String.valueOf(tabContenidoRec.tblPaquetesRec.getValueAt(row, 10));

        Modificaciones mod = new Modificaciones(num_guia, peso, altura, ancho, profundidad, precio);
        mod.setModal(true);
        mod.setVisible(true);

    }//GEN-LAST:event_btnModificarPqActionPerformed

    private void rSButtonIcon_new1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButtonIcon_new1ActionPerformed
    {//GEN-HEADEREND:event_rSButtonIcon_new1ActionPerformed
        Altas vtn = new Altas();
        vtn.setModal(true);
        vtn.setVisible(true);
    }//GEN-LAST:event_rSButtonIcon_new1ActionPerformed

    private void btnEnviarPqActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEnviarPqActionPerformed
    {//GEN-HEADEREND:event_btnEnviarPqActionPerformed
        int row = tabContenidoRec.tblPaquetesRec.getSelectedRow();
        String num_guia = (String) (tabContenidoRec.tblPaquetesRec.getValueAt(row, 0));
        EnviarP send = new EnviarP(num_guia);
        send.setModal(true);
        send.setVisible(true);
    }//GEN-LAST:event_btnEnviarPqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonIcon_new btnEliminarPq;
    private newscomponents.RSButtonIcon_new btnEnviarPq;
    private newscomponents.RSButtonIcon_new btnModificarPq;
    private javax.swing.JPanel jPanel1;
    private newscomponents.RSPanelEffect pnlSlider;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new1;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    private vista.paquetes.tabContenidoRec tabContenidoRec1;
    // End of variables declaration//GEN-END:variables
}