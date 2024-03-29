/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javax.swing.SwingUtilities;
import reloj.Reloj;


/**
 *
 * @author Kevin Benitez
 */
public class VistaReloj extends javax.swing.JPanel
{

    public static int confirmacion = -1;
    public static boolean busqueda_f = false;
    /**
     * Creates new form Principal
     */
    public VistaReloj()
    {
        mRelojCorrer();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vLabelNumPaqRecibidos = new javax.swing.JLabel();
        vLabelNumPaqEnviados = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(51, 51, 51)));

        rSLabelTextIcon1.setForeground(new java.awt.Color(0, 153, 204));
        rSLabelTextIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_login.png"))); // NOI18N
        rSLabelTextIcon1.setText("Bienvenido al sistema de \"El Prisas Logistics S.A. DE C.V.\"");
        rSLabelTextIcon1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        rSLabelTextIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INFO);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(982, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 80));

        pnlSlider.setBackground(new java.awt.Color(255, 255, 255));
        pnlSlider.setLayout(new java.awt.FlowLayout());
        add(pnlSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 530, 580));

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 38)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Paquetes recibidos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 260, 460, 60));

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 38)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Paquetes enviados");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 450, 60));

        vLabelNumPaqRecibidos.setFont(new java.awt.Font("OCR A Extended", 1, 38)); // NOI18N
        vLabelNumPaqRecibidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vLabelNumPaqRecibidos.setText("123456789");
        add(vLabelNumPaqRecibidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 350, 450, 40));

        vLabelNumPaqEnviados.setFont(new java.awt.Font("OCR A Extended", 1, 38)); // NOI18N
        vLabelNumPaqEnviados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vLabelNumPaqEnviados.setText("123456789");
        add(vLabelNumPaqEnviados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 450, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOpaque(true);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, 450, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOpaque(true);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 450, 10));
    }// </editor-fold>//GEN-END:initComponents


    private static void initAndShowGUI()
    {
        
        // This method is invoked on Swing thread
        final JFXPanel fxPanel = new JFXPanel();
        fxPanel.setBackground(java.awt.Color.red);
        pnlSlider.add(fxPanel);
        Platform.runLater(new Runnable()
        {
            @Override
            public void run()
            {
                initFX(fxPanel);
            }
        });
    }
    
    private static void initFX(JFXPanel fxPanel)
    {
        // This method is invoked on JavaFX thread
        Scene scene = createScene();
        fxPanel.setScene(scene);
    }
    
    public void mRelojCorrer()
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                initAndShowGUI();
            }
        });
    }
    
    private static Scene createScene()
    {
        Reloj reloj = new Reloj();
        Scene scene = new Scene(reloj);
        scene.setFill(Color.TRANSPARENT);
        return scene;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static newscomponents.RSPanelEffect pnlSlider;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    public static javax.swing.JLabel vLabelNumPaqEnviados;
    public static javax.swing.JLabel vLabelNumPaqRecibidos;
    // End of variables declaration//GEN-END:variables
}
