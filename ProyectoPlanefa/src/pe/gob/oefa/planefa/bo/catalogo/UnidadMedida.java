package pe.gob.oefa.planefa.bo.catalogo;

public class UnidadMedida extends Catalogo{
   
    public UnidadMedida(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String toString() {
        return "UnidadMedida{" + super.toString() + '}';
    }
   
}
