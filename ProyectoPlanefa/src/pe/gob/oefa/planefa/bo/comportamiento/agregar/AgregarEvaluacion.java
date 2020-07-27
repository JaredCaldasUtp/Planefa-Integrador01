
package pe.gob.oefa.planefa.bo.comportamiento.agregar;

import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadEvaluacion;
import pe.gob.oefa.planefa.resources.PlanefaUtils;

public class AgregarEvaluacion implements ComportamientoAgregar{

    @Override
    public Actividad agregar(Actividad actividad) {
        ActividadEvaluacion actividadEvaluacion = (ActividadEvaluacion) actividad;                
        actividadEvaluacion.setCodigo(PlanefaUtils.getCodigoUnico());                
        System.out.println("AgregarEvaluacion..." + actividadEvaluacion.toString());
        return actividadEvaluacion;
    }  
}
