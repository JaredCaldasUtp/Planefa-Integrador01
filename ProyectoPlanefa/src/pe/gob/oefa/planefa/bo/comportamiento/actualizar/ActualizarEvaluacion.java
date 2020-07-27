package pe.gob.oefa.planefa.bo.comportamiento.actualizar;

import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadEvaluacion;

public class ActualizarEvaluacion implements ComportamientoActualizar {

    @Override
    public Actividad actualizar(Actividad actividad) {
        ActividadEvaluacion actividadEvaluacion = (ActividadEvaluacion) actividad;        
        System.out.println("ActualizarEvaluacion..." + actividadEvaluacion.toString());
        return actividadEvaluacion;
    }
}
