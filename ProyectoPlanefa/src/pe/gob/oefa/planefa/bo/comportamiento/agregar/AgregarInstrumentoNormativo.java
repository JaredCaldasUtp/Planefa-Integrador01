package pe.gob.oefa.planefa.bo.comportamiento.agregar;

import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadInstrumentoNormativo;
import pe.gob.oefa.planefa.resources.PlanefaUtils;

public class AgregarInstrumentoNormativo implements ComportamientoAgregar {

    @Override
    public Actividad agregar(Actividad actividad) {
        ActividadInstrumentoNormativo actividadInstrumentoNormativo = (ActividadInstrumentoNormativo) actividad;
        actividadInstrumentoNormativo.setCodigo(PlanefaUtils.getCodigoUnico());
        System.out.println("AgregarInstrumentoNormativo..." + actividadInstrumentoNormativo.toString());
        return actividadInstrumentoNormativo;
    }
}
