/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.paquetes;

import RSMaterialComponent.RSTableMetroCustom;
import configuracion.Funciones_aux;
import java.awt.Color;
import java.sql.ResultSet;
import modelo.MetodosBD;

/**
 *
 * @author Kevin Benitez
 */
public class tabContenidoRec extends javax.swing.JPanel
{

    /**
     * Creates new form tabContenido
     */
    public tabContenidoRec()
    {
        initComponents();
        jScrollPane1.getViewport().setBackground(Color.white);
        listarPaquetes(tblPaquetesRec);
    }
    
    public void listarPaquetes(RSTableMetroCustom tabla)
    {
        String arr[] = {"num_guia","fecha_recp","Fecha_ent","peso","altura", "ancho","profundidad","precio"};
        ResultSet rs = MetodosBD.getPaquetesRec();
        Funciones_aux.getTable(rs, tabla, arr);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaquetesRec = new RSMaterialComponent.RSTableMetroCustom();
        tfbusqueda = new RSMaterialComponent.RSTextFieldMaterialIcon();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblPaquetesRec.setForeground(new java.awt.Color(255, 255, 255));
        tblPaquetesRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "Numero de guia", "Fecha de recepcion", "Fecha de envio", "Peso", "Altura", "Ancho", "Profundiidad", "Precio"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblPaquetesRec.setBackgoundHead(new java.awt.Color(0, 153, 204));
        tblPaquetesRec.setBackgoundHover(new java.awt.Color(0, 153, 204));
        tblPaquetesRec.setColorBorderHead(new java.awt.Color(255, 255, 255));
        tblPaquetesRec.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tblPaquetesRec.setColorPrimaryText(new java.awt.Color(0, 153, 204));
        tblPaquetesRec.setColorSecundaryText(new java.awt.Color(0, 153, 204));
        tblPaquetesRec.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        tblPaquetesRec.setFontHead(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        tblPaquetesRec.setFontRowHover(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        tblPaquetesRec.setFontRowSelect(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        tblPaquetesRec.setGridColor(new java.awt.Color(255, 255, 255));
        tblPaquetesRec.setSelectionBackground(new java.awt.Color(0, 153, 204));
        jScrollPane1.setViewportView(tblPaquetesRec);

        tfbusqueda.setForeground(new java.awt.Color(103, 177, 202));
        tfbusqueda.setColorIcon(new java.awt.Color(103, 177, 202));
        tfbusqueda.setColorMaterial(new java.awt.Color(103, 177, 202));
        tfbusqueda.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        tfbusqueda.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        tfbusqueda.setPhColor(new java.awt.Color(103, 177, 202));
        tfbusqueda.setPlaceholder("Buscar");
        tfbusqueda.setSelectionColor(new java.awt.Color(103, 177, 202));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(tfbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(481, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tfbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSTableMetroCustom tblPaquetesRec;
    private RSMaterialComponent.RSTextFieldMaterialIcon tfbusqueda;
    // End of variables declaration//GEN-END:variables
}