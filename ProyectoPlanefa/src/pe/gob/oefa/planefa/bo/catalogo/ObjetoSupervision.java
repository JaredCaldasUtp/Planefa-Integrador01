package pe.gob.oefa.planefa.bo.catalogo;

public class ObjetoSupervision extends Catalogo{
    
    public ObjetoSupervision(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String toString() {
        return "ObjetoSupervision{" + super.toString() + '}';
    }    
}
