
package pe.gob.oefa.planefa.bo.planefa;

import pe.gob.oefa.planefa.bo.catalogo.Catalogo;

public class EstadoPlanefa extends Catalogo{
        
    public EstadoPlanefa(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String toString() {
        return "EstadoPlanefa{" + super.toString()+ '}';
    }
        
}
