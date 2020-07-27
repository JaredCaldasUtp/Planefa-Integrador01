
package pe.gob.oefa.planefa.bo.actividad;

public abstract class Actividad implements Cloneable{
    private String codigo;    
    private Integer programacionEnero;
    private Integer programacionFebrero;
    private Integer programacionMarzo;
    private Integer programacionAbril;
    private Integer programacionMayo;
    private Integer programacionJunio;
    private Integer programacionJulio;
    private Integer programacionAgosto;
    private Integer programacionSeptiembre;
    private Integer programacionOctubre;
    private Integer programacionNoviembre;
    private Integer programacionDiciembre;
    private Double presupuestoAnual;

    public Actividad (){}
    
    public Actividad(Integer programacionEnero, Integer programacionFebrero, Integer programacionMarzo, Integer programacionAbril, Integer programacionMayo, Integer programacionJunio, Integer programacionJulio, Integer programacionAgosto, Integer programacionSeptiembre, Integer programacionOctubre, Integer programacionNoviembre, Integer programacionDiciembre, Double presupuestoAnual) {
        this.programacionEnero = programacionEnero;
        this.programacionFebrero = programacionFebrero;
        this.programacionMarzo = programacionMarzo;
        this.programacionAbril = programacionAbril;
        this.programacionMayo = programacionMayo;
        this.programacionJunio = programacionJunio;
        this.programacionJulio = programacionJulio;
        this.programacionAgosto = programacionAgosto;
        this.programacionSeptiembre = programacionSeptiembre;
        this.programacionOctubre = programacionOctubre;
        this.programacionNoviembre = programacionNoviembre;
        this.programacionDiciembre = programacionDiciembre;
        this.presupuestoAnual = presupuestoAnual;
    }

    @Override
    public String toString() {
        return "Actividad{" + "codigo=" + codigo + ", programacionEnero=" + programacionEnero + ", programacionFebrero=" + programacionFebrero + ", programacionMarzo=" + programacionMarzo + ", programacionAbril=" + programacionAbril + ", programacionMayo=" + programacionMayo + ", programacionJunio=" + programacionJunio + ", programacionJulio=" + programacionJulio + ", programacionAgosto=" + programacionAgosto + ", programacionSeptiembre=" + programacionSeptiembre + ", programacionOctubre=" + programacionOctubre + ", programacionNoviembre=" + programacionNoviembre + ", programacionDiciembre=" + programacionDiciembre + ", presupuestoAnual=" + presupuestoAnual + '}';
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public Integer getMetaFisicaAnual(){
        //La meta física anual es la suma de la progrmación de todos los meses del año
        
        return 0;
    }
    
    public Integer getProgramacionEnero() {
        return programacionEnero;
    }

    public void setProgramacionEnero(Integer programacionEnero) {
        this.programacionEnero = programacionEnero;
    }

    public Integer getProgramacionFebrero() {
        return programacionFebrero;
    }

    public void setProgramacionFebrero(Integer programacionFebrero) {
        this.programacionFebrero = programacionFebrero;
    }

    public Integer getProgramacionMarzo() {
        return programacionMarzo;
    }

    public void setProgramacionMarzo(Integer programacionMarzo) {
        this.programacionMarzo = programacionMarzo;
    }

    public Integer getProgramacionAbril() {
        return programacionAbril;
    }

    public void setProgramacionAbril(Integer programacionAbril) {
        this.programacionAbril = programacionAbril;
    }

    public Integer getProgramacionMayo() {
        return programacionMayo;
    }

    public void setProgramacionMayo(Integer programacionMayo) {
        this.programacionMayo = programacionMayo;
    }

    public Integer getProgramacionJunio() {
        return programacionJunio;
    }

    public void setProgramacionJunio(Integer programacionJunio) {
        this.programacionJunio = programacionJunio;
    }

    public Integer getProgramacionJulio() {
        return programacionJulio;
    }

    public void setProgramacionJulio(Integer programacionJulio) {
        this.programacionJulio = programacionJulio;
    }

    public Integer getProgramacionAgosto() {
        return programacionAgosto;
    }

    public void setProgramacionAgosto(Integer programacionAgosto) {
        this.programacionAgosto = programacionAgosto;
    }

    public Integer getProgramacionSeptiembre() {
        return programacionSeptiembre;
    }

    public void setProgramacionSeptiembre(Integer programacionSeptiembre) {
        this.programacionSeptiembre = programacionSeptiembre;
    }

    public Integer getProgramacionOctubre() {
        return programacionOctubre;
    }

    public void setProgramacionOctubre(Integer programacionOctubre) {
        this.programacionOctubre = programacionOctubre;
    }

    public Integer getProgramacionNoviembre() {
        return programacionNoviembre;
    }

    public void setProgramacionNoviembre(Integer programacionNoviembre) {
        this.programacionNoviembre = programacionNoviembre;
    }

    public Integer getProgramacionDiciembre() {
        return programacionDiciembre;
    }

    public void setProgramacionDiciembre(Integer programacionDiciembre) {
        this.programacionDiciembre = programacionDiciembre;
    }

    public Double getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(Double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
