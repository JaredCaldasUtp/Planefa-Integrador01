
package pe.gob.oefa.planefa.bo.catalogo;

public class Ambito extends Catalogo{
        
    public Ambito(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String toString() {
        return "Ambito{" + super.toString()+ '}';
    }
        
}
