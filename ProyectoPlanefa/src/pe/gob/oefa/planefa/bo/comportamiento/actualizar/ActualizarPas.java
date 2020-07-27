package pe.gob.oefa.planefa.bo.comportamiento.actualizar;

import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadPas;

public class ActualizarPas implements ComportamientoActualizar {

    @Override
    public Actividad actualizar(Actividad actividad) {
        ActividadPas actividadPas = (ActividadPas) actividad;        
        System.out.println("ActualizarPas..." + actividadPas.toString());
        return actividadPas;
    }
}
