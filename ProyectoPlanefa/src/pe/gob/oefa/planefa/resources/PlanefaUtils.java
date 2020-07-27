package pe.gob.oefa.planefa.resources;

import java.util.UUID;

public class PlanefaUtils {
    
    public static String getCodigoUnico() {       
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
