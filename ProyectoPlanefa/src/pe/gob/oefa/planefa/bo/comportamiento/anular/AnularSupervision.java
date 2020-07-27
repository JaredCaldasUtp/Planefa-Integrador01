
package pe.gob.oefa.planefa.bo.comportamiento.anular;

import pe.gob.oefa.planefa.bo.actividad.Actividad;

public class AnularSupervision implements ComportamientoAnular{

    @Override
    public void anular(Actividad actividad) {
        System.out.println("AnularSupervision...");
        
    }    
}
