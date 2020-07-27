
package pe.gob.oefa.planefa.bo.catalogo;

public class OficinaDesconcentrada extends Catalogo{
        
    public OficinaDesconcentrada(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String toString() {
        return "OficinaDesconcentrada{" + super.toString()+ '}';
    }
        
}
