
package pe.gob.oefa.planefa.bo.comportamiento.anular;

import pe.gob.oefa.planefa.bo.actividad.Actividad;

public class AnularEvaluacion implements ComportamientoAnular{

    @Override
    public void anular(Actividad actividad) {
        System.out.println("AnularEvaluacion...");
        
    }    
}
