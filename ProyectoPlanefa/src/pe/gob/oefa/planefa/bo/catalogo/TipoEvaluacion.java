package pe.gob.oefa.planefa.bo.catalogo;

public class TipoEvaluacion extends Catalogo{
   
    public TipoEvaluacion(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String toString() {
        return "TipoEvaluacion{" + super.toString() + '}';
    }
    
}
