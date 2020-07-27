
package pe.gob.oefa.planefa.bo.planefa;

import pe.gob.oefa.planefa.bo.catalogo.Catalogo;

public class TipoResolucion extends Catalogo{
        
    public TipoResolucion(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String toString() {
        return "TipoResolucion{" + super.toString()+ '}';
    }
        
}
