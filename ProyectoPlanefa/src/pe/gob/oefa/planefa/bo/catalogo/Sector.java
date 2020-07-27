package pe.gob.oefa.planefa.bo.catalogo;

public class Sector extends Catalogo{
   
    public Sector(String codigo, String nombre) {
        super(codigo, nombre);
    }   

    @Override
    public String toString() {
        return "Sector{" + super.toString()+ '}';
    }
    
}
