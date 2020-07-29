package pe.gob.oefa.planefa.bo.comportamiento.actualizar;

import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadSupervision;

public class ActualizarSupervision implements ComportamientoActualizar {

    @Override
    public Actividad actualizar(Actividad actividad) {
        ActividadSupervision actividadSupervision = (ActividadSupervision) actividad;
        //actividadSupervision.setCodigo(PlanefaUtils.getCodigoUnico());
        System.out.println("ActualizarSupervision..." + actividadSupervision.toString());
        System.out.println("ActualizarSupervision..." + actividadSupervision.getCorrelativo());
        return actividadSupervision;
    }
}
