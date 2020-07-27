
package pe.gob.oefa.planefa.bo.comportamiento.actualizar;

import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadInstrumentoNormativo;

public class ActualizarInstrumentoNormativo implements ComportamientoActualizar{

    @Override
    public Actividad actualizar(Actividad actividad) {
        ActividadInstrumentoNormativo actividadInstrumentoNormativo = (ActividadInstrumentoNormativo) actividad;        
        System.out.println("ActualizarInstrumentoNormativo..." + actividadInstrumentoNormativo.toString());
        return actividadInstrumentoNormativo;
    }    
}
