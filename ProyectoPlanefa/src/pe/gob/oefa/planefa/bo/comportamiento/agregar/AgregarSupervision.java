
package pe.gob.oefa.planefa.bo.comportamiento.agregar;

import java.util.logging.Level;
import java.util.logging.Logger;
import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadSupervision;
import pe.gob.oefa.planefa.resources.PlanefaUtils;

public class AgregarSupervision implements ComportamientoAgregar{

    @Override
    public Actividad agregar(Actividad actividad){        
        try {
            ActividadSupervision actividadSupervision = (ActividadSupervision) actividad;
            actividadSupervision = (ActividadSupervision)actividadSupervision.clone();
            actividadSupervision.setCodigo(PlanefaUtils.getCodigoUnico());
            System.out.println("AgregarSupervision..." + actividadSupervision.toString());
            return actividadSupervision;
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(AgregarSupervision.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
}
