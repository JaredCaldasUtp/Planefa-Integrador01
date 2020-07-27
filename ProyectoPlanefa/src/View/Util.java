/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JTextField;

/**
 *
 * @author CLIENTE
 */
public class Util {
    public static Integer convertirAEntero(JTextField textField ){
        return Integer.parseInt(textField.getText());
    }
    
    public static Double convertirADouble(JTextField textField ){
        return Double.parseDouble(textField.getText());
    }
}
