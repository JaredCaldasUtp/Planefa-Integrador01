package pe.gob.oefa.planefa.resources;

import java.util.UUID;
import javax.swing.JTextField;

public class PlanefaUtils {
    
    public static String getCodigoUnico() {       
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    
     public static Integer convertirAEntero(JTextField textField ){
        return Integer.parseInt(textField.getText());
    }
    
    public static Double convertirADouble(JTextField textField ){
        return Double.parseDouble(textField.getText());
    }
}
