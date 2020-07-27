
package pe.gob.oefa.planefa.bo.catalogo;

public class ActividadOperativa extends Catalogo{
        
    public ActividadOperativa(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String toString() {
        return "ActividadOperativa{" + super.toString()+ '}';
    }
        
}
