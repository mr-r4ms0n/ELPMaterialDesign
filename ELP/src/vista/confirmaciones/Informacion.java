/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.confirmaciones;

import vista.paquetes.*;
import configuracion.Paqs;
import vista.confirmaciones.ConfirmaAcc;

/**
 *
 * @author Kevin Benitez
 */
public class Informacion extends javax.swing.JPanel
{

    public static int confirmacion = -1;
    public static boolean busqueda_f = false;
    /**
     * Creates new form Principal
     */
    public Informacion()
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
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();
        pnlSlider = new newscomponents.RSPanelEffect();
        jPanel2 = new javax.swing.JPanel();
        rSLabelTextIcon4 = new RSMaterialComponent.RSLabelTextIcon();
        rSTextFieldIconTwo1 = new RSMaterialComponent.RSTextFieldIconTwo();
        rSTextFieldIconTwo2 = new RSMaterialComponent.RSTextFieldIconTwo();
        rSTextFieldIconTwo3 = new RSMaterialComponent.RSTextFieldIconTwo();
        jLabel7 = new javax.swing.JLabel();
        rSLabelTextIcon2 = new RSMaterialComponent.RSLabelTextIcon();
        rSTextFieldIconTwo6 = new RSMaterialComponent.RSTextFieldIconTwo();
        rSTextFieldIconTwo4 = new RSMaterialComponent.RSTextFieldIconTwo();
        rSTextFieldIconTwo5 = new RSMaterialComponent.RSTextFieldIconTwo();
        rSLabelTextIcon3 = new RSMaterialComponent.RSLabelTextIcon();
        rSTextFieldIconTwo7 = new RSMaterialComponent.RSTextFieldIconTwo();
        rSTextFieldIconTwo8 = new RSMaterialComponent.RSTextFieldIconTwo();
        rSTextFieldIconTwo9 = new RSMaterialComponent.RSTextFieldIconTwo();
        rSTextFieldIconTwo10 = new RSMaterialComponent.RSTextFieldIconTwo();
        rSTextFieldIconTwo11 = new RSMaterialComponent.RSTextFieldIconTwo();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(51, 51, 51)));

        rSLabelTextIcon1.setForeground(new java.awt.Color(0, 153, 204));
        rSLabelTextIcon1.setText("Acerca de ");
        rSLabelTextIcon1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        rSLabelTextIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INFO);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1392, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pnlSlider.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        rSLabelTextIcon4.setForeground(new java.awt.Color(0, 153, 204));
        rSLabelTextIcon4.setText("Información de la empresa");
        rSLabelTextIcon4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INFO);

        rSTextFieldIconTwo1.setEditable(false);
        rSTextFieldIconTwo1.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo1.setText("El Prisas Logistic, S.A. de C.V.");
        rSTextFieldIconTwo1.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo1.setColorIcon(new java.awt.Color(0, 153, 204));
        rSTextFieldIconTwo1.setFocusable(false);
        rSTextFieldIconTwo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSTextFieldIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCATION_CITY);

        rSTextFieldIconTwo2.setEditable(false);
        rSTextFieldIconTwo2.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo2.setText("Constitiyentes No. 14 Esq. Oriente, Estado de México, CP 52775.");
        rSTextFieldIconTwo2.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo2.setColorIcon(new java.awt.Color(0, 153, 204));
        rSTextFieldIconTwo2.setFocusable(false);
        rSTextFieldIconTwo2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSTextFieldIconTwo2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCATION_ON);
        rSTextFieldIconTwo2.setPlaceholder("");

        rSTextFieldIconTwo3.setEditable(false);
        rSTextFieldIconTwo3.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo3.setText("Tel: 55-741-98-56");
        rSTextFieldIconTwo3.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo3.setColorIcon(new java.awt.Color(0, 153, 204));
        rSTextFieldIconTwo3.setFocusable(false);
        rSTextFieldIconTwo3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSTextFieldIconTwo3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PHONE);
        rSTextFieldIconTwo3.setPlaceholder("");

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 204, 255)));

        rSLabelTextIcon2.setForeground(new java.awt.Color(0, 153, 204));
        rSLabelTextIcon2.setText("Información de los desarrolladores");
        rSLabelTextIcon2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INFO);

        rSTextFieldIconTwo6.setEditable(false);
        rSTextFieldIconTwo6.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo6.setText("BugHunters, S.A. de C.V.");
        rSTextFieldIconTwo6.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo6.setColorIcon(new java.awt.Color(0, 153, 204));
        rSTextFieldIconTwo6.setFocusable(false);
        rSTextFieldIconTwo6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSTextFieldIconTwo6.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCATION_CITY);
        rSTextFieldIconTwo6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSTextFieldIconTwo6ActionPerformed(evt);
            }
        });

        rSTextFieldIconTwo4.setEditable(false);
        rSTextFieldIconTwo4.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo4.setText("Paraje el Tejocote, Tlaltizapán, CP 52640, Tianguistenco,  Edo de México");
        rSTextFieldIconTwo4.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo4.setColorIcon(new java.awt.Color(0, 153, 204));
        rSTextFieldIconTwo4.setFocusable(false);
        rSTextFieldIconTwo4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSTextFieldIconTwo4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCATION_ON);
        rSTextFieldIconTwo4.setPlaceholder("");

        rSTextFieldIconTwo5.setEditable(false);
        rSTextFieldIconTwo5.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo5.setText("Tel: 722-481-08-00");
        rSTextFieldIconTwo5.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo5.setColorIcon(new java.awt.Color(0, 153, 204));
        rSTextFieldIconTwo5.setFocusable(false);
        rSTextFieldIconTwo5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSTextFieldIconTwo5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PHONE);
        rSTextFieldIconTwo5.setPlaceholder("");

        rSLabelTextIcon3.setForeground(new java.awt.Color(0, 153, 204));
        rSLabelTextIcon3.setText("Usuarios del equipo");
        rSLabelTextIcon3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);

        rSTextFieldIconTwo7.setEditable(false);
        rSTextFieldIconTwo7.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo7.setText("SaiproG");
        rSTextFieldIconTwo7.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo7.setColorIcon(new java.awt.Color(0, 153, 204));
        rSTextFieldIconTwo7.setFocusable(false);
        rSTextFieldIconTwo7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSTextFieldIconTwo7.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        rSTextFieldIconTwo7.setPlaceholder("");

        rSTextFieldIconTwo8.setEditable(false);
        rSTextFieldIconTwo8.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo8.setText("Mr. r4ms0n");
        rSTextFieldIconTwo8.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo8.setColorIcon(new java.awt.Color(0, 153, 204));
        rSTextFieldIconTwo8.setFocusable(false);
        rSTextFieldIconTwo8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSTextFieldIconTwo8.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        rSTextFieldIconTwo8.setPlaceholder("");

        rSTextFieldIconTwo9.setEditable(false);
        rSTextFieldIconTwo9.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo9.setText("Leandroidex");
        rSTextFieldIconTwo9.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo9.setColorIcon(new java.awt.Color(0, 153, 204));
        rSTextFieldIconTwo9.setFocusable(false);
        rSTextFieldIconTwo9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSTextFieldIconTwo9.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        rSTextFieldIconTwo9.setPlaceholder("");

        rSTextFieldIconTwo10.setEditable(false);
        rSTextFieldIconTwo10.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo10.setText("Deks");
        rSTextFieldIconTwo10.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo10.setColorIcon(new java.awt.Color(0, 153, 204));
        rSTextFieldIconTwo10.setFocusable(false);
        rSTextFieldIconTwo10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSTextFieldIconTwo10.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        rSTextFieldIconTwo10.setPlaceholder("");
        rSTextFieldIconTwo10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSTextFieldIconTwo10ActionPerformed(evt);
            }
        });

        rSTextFieldIconTwo11.setEditable(false);
        rSTextFieldIconTwo11.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo11.setText("Zamarad");
        rSTextFieldIconTwo11.setBorderColor(new java.awt.Color(0, 0, 0));
        rSTextFieldIconTwo11.setColorIcon(new java.awt.Color(0, 153, 204));
        rSTextFieldIconTwo11.setFocusable(false);
        rSTextFieldIconTwo11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSTextFieldIconTwo11.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        rSTextFieldIconTwo11.setPlaceholder("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/hacker_80px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSTextFieldIconTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSTextFieldIconTwo3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSTextFieldIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(rSLabelTextIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rSTextFieldIconTwo5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rSTextFieldIconTwo6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rSTextFieldIconTwo4, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addComponent(rSLabelTextIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(rSTextFieldIconTwo9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(rSTextFieldIconTwo7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rSTextFieldIconTwo10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(rSTextFieldIconTwo11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(rSTextFieldIconTwo8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(rSLabelTextIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(rSLabelTextIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSTextFieldIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSTextFieldIconTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSTextFieldIconTwo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rSLabelTextIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rSTextFieldIconTwo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(rSTextFieldIconTwo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rSTextFieldIconTwo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSLabelTextIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSTextFieldIconTwo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSTextFieldIconTwo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSTextFieldIconTwo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSTextFieldIconTwo11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSTextFieldIconTwo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSlider.add(jPanel2, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 482, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSTextFieldIconTwo6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSTextFieldIconTwo6ActionPerformed
    {//GEN-HEADEREND:event_rSTextFieldIconTwo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSTextFieldIconTwo6ActionPerformed

    private void rSTextFieldIconTwo10ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSTextFieldIconTwo10ActionPerformed
    {//GEN-HEADEREND:event_rSTextFieldIconTwo10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSTextFieldIconTwo10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private newscomponents.RSPanelEffect pnlSlider;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon2;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon3;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon4;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo1;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo10;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo11;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo2;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo3;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo4;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo5;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo6;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo7;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo8;
    private RSMaterialComponent.RSTextFieldIconTwo rSTextFieldIconTwo9;
    // End of variables declaration//GEN-END:variables
}
