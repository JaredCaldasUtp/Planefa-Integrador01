package pe.gob.oefa.planefa.bo.comportamiento.agregar;

import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadPas;
import pe.gob.oefa.planefa.resources.PlanefaUtils;

public class AgregarPas implements ComportamientoAgregar {

    @Override
    public Actividad agregar(Actividad actividad) {
        ActividadPas actividadPas = (ActividadPas) actividad;
        actividadPas.setCodigo(PlanefaUtils.getCodigoUnico());
        System.out.println("AgregarPas..." + actividadPas.toString());
        return actividadPas;
    }
}
