
package pe.gob.oefa.planefa.programacionsupervision.model;

public enum SeccionPlanefa {
    DATOS_GENERALES("Datos generales"),
    SUPERVISIONES("Programación de supervisiones"),
    PAS("Programación PAS"),
    EVALUACIONES("Programación de evaluaciones"),
    INSTRUMENTOS_NORMATIVOS("Programación de instrumentos normativos"),
    RESUMEN("Resumen");
    
    private String description = null;

    private SeccionPlanefa(String desc){
        this.description = desc;
    }

    public String getDescription() {
        return this.description;
    }
}
