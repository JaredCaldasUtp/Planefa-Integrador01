package pe.gob.oefa.planefa.bo.actividad;

import pe.gob.oefa.planefa.bo.catalogo.ActividadOperativa;
import pe.gob.oefa.planefa.bo.catalogo.UnidadMedida;
import pe.gob.oefa.planefa.bo.catalogo.ObjetoSupervision;
import pe.gob.oefa.planefa.bo.catalogo.Sector;

public class ActividadSupervision extends Actividad{
    private ActividadOperativa actividadOperativa;
    private Sector sector;
    private ObjetoSupervision objetoSupervision;
    private UnidadMedida unidadMedida;

    public ActividadSupervision(){}

    public ActividadSupervision(ActividadOperativa actividadOperativa, Sector sector, ObjetoSupervision objetoSupervision, UnidadMedida unidadMedida) {
        this.actividadOperativa = actividadOperativa;
        this.sector = sector;
        this.objetoSupervision = objetoSupervision;
        this.unidadMedida = unidadMedida;
    }

    public ActividadSupervision(ActividadOperativa actividadOperativa, Sector sector, ObjetoSupervision objetoSupervision, UnidadMedida unidadMedida, Integer programacionEnero, Integer programacionFebrero, Integer programacionMarzo, Integer programacionAbril, Integer programacionMayo, Integer programacionJunio, Integer programacionJulio, Integer programacionAgosto, Integer programacionSeptiembre, Integer programacionOctubre, Integer programacionNoviembre, Integer programacionDiciembre, Double presupuestoAnual) {
        super(programacionEnero, programacionFebrero, programacionMarzo, programacionAbril, programacionMayo, programacionJunio, programacionJulio, programacionAgosto, programacionSeptiembre, programacionOctubre, programacionNoviembre, programacionDiciembre, presupuestoAnual);
        this.actividadOperativa = actividadOperativa;
        this.sector = sector;
        this.objetoSupervision = objetoSupervision;
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return super.toString() + " ActividadSupervision{" + "actividadOperativa=" + actividadOperativa + ", sector=" + sector + ", objetoSupervision=" + objetoSupervision + ", unidadMedida=" + unidadMedida + '}';
    }
    
    public ActividadOperativa getActividadOperativa() {
        return actividadOperativa;
    }

    public void setActividadOperativa(ActividadOperativa actividadOperativa) {
        this.actividadOperativa = actividadOperativa;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public ObjetoSupervision getObjetoSupervision() {
        return objetoSupervision;
    }

    public void setObjetoSupervision(ObjetoSupervision objetoSupervision) {
        this.objetoSupervision = objetoSupervision;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    
}
