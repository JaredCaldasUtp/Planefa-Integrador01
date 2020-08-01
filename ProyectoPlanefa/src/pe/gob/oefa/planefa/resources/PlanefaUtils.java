package pe.gob.oefa.planefa.resources;

import java.text.SimpleDateFormat;
import java.util.UUID;
import javax.swing.JTextField;

public class PlanefaUtils {

    private static final String DEFAULT_DATE_PATTERN = "dd/MM/yyyy HH:mm";

    public static String getCodigoUnico() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static Integer convertirAEntero(JTextField textField) {
        return Integer.parseInt(textField.getText());
    }

    public static Double convertirADouble(JTextField textField) {
        return Double.parseDouble(textField.getText());
    }

    public static String dateToString(java.util.Date date) {
        return dateToString(date, DEFAULT_DATE_PATTERN);
    }

    public static String dateToString(java.util.Date date, String pattern) {
        String result;
        if (date == null) {

        }
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        result = formatter.format(date);
        return result;
    }
}
