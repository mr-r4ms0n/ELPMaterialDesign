/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import RSMaterialComponent.RSTableMetroCustom;
import RSMaterialComponent.RSTextFieldOne;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin Benitez
 */
public class Funciones_aux
{

    /*
    Variables help referentes al color de las advertencias
     */
    public static Color primary = new Color(1, 56, 228);
    public static Color sucess = new Color(40, 167, 69);
    public static Color danger = new Color(220, 53, 69);
    public static Color warning = new Color(255, 136, 0);
    public static Color info = new Color(51, 181, 229);

    /*
    ///////////////////////////
     */
    public void limpiarFormulario(Component[] componentes)
    {
        for (Component componente : componentes)
        {
            if (componente instanceof JPanel)
            {
                limpiarFormulario(((JPanel) componente).getComponents());
            } else if (componente instanceof JViewport)
            {
                limpiarFormulario(((JViewport) componente).getComponents());
            } else if (componente instanceof JScrollPane)
            {
                limpiarFormulario(((JScrollPane) componente).getComponents());
            } else if (componente instanceof JTextField)
            {
                ((JTextField) componente).setText("");
            } else if (componente instanceof JTextArea)
            {
                ((JTextArea) componente).setText("");
            } else if (componente instanceof JPasswordField)
            {
                ((JPasswordField) componente).setText("");
            } else if (componente instanceof JCheckBox)
            {
                ((JCheckBox) componente).setSelected(false);
            } else if (componente instanceof JRadioButton)
            {
                ((JRadioButton) componente).setSelected(false);
            } else if (componente instanceof JToggleButton)
            {
                ((JToggleButton) componente).setSelected(false);
            } else if (componente instanceof JComboBox)
            {
                ((JComboBox) componente).setSelectedIndex(0);
            } else if (componente instanceof JSlider)
            {
                ((JSlider) componente).setValue(((JSlider) componente).getMinimum());
            } else if (componente instanceof JSpinner)
            {
                ((JSpinner) componente).setValue(0);
            } else if (componente instanceof JFormattedTextField)
            {
                ((JFormattedTextField) componente).setText("");
            } else if (componente instanceof JTable)
            {
                ((DefaultTableModel) (((JTable) componente).getModel())).setRowCount(0);
            }
        }
    }

    /**
     * Funcion general para poder listar cualquier tabla
     *
     * @param rs
     * @param tabla
     * @param columnas
     */
    public static void getTable(ResultSet rs, RSTableMetroCustom tabla, String columnas[])
    {
        DefaultTableModel tablamdl = (DefaultTableModel) tabla.getModel();
        //Vaciamos la tabla primero
        while (tablamdl.getRowCount() > 0)
        {
            tablamdl.removeRow(0);
        }
        try
        {
            //Creamos arreglo de objetos
            Object arr[] = new Object[columnas.length];
            //Mientras se encuentren resultados llenamos el arreglo de objetos con un for y agregamos ese objeto (fila) a la tabla
            while (rs.next())
            {
                for (int i = 0; i < columnas.length; i++)
                {
                    arr[i] = rs.getObject(columnas[i]);
                }
                tablamdl.addRow(arr);
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(Funciones_aux.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo para validar componentes
     *
     * @param tf
     * @param err
     * @param type
     */
    public static void validaTF(RSTextFieldOne tf, JLabel err, String type)
    {
        switch (type)
        {
            case "vacio":
                if (tf.getText().isEmpty())
                {
                    err.setText("Campo requerido");
                    err.setForeground(Color.red);
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}
