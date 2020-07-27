
package pe.gob.oefa.planefa.bo.catalogo;

public class TipoGobierno extends Catalogo{
        
    public TipoGobierno(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String toString() {
        return "TipoGobierno{" + super.toString()+ '}';
    }
        
}
