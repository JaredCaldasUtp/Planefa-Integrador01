
package pe.gob.oefa.planefa.programacionsupervision.model;

public enum Meses {
    Enero("Enero"),
    Febrero("Febrero"),
    Marzo("Marzo"),
    Abril("Abril"),
    Mayo("Mayo"),
    Junio("Junio"),
    Julio("Julio"),
    Agosto("Agosto"),
    Septiembre("Septiembre"),
    Octubre("Octubre"),
    Noviembre("Noviembre"),    
    Diciembre("Diciembre");
    
    private String description = null;

    private Meses(String desc){
        this.description = desc;
    }

    public String getDescription() {
        return this.description;
    }
}
