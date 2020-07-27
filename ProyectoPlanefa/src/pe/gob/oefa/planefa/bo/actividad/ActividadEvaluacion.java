package pe.gob.oefa.planefa.bo.actividad;

import pe.gob.oefa.planefa.bo.catalogo.ActividadOperativa;
import pe.gob.oefa.planefa.bo.catalogo.UnidadMedida;
import pe.gob.oefa.planefa.bo.catalogo.TipoEvaluacion;

public class ActividadEvaluacion extends Actividad{
    private ActividadOperativa actividadOperativa;
    private TipoEvaluacion tipoEvaluacion;    
    private UnidadMedida unidadMedida;

    public ActividadEvaluacion(){}

    public ActividadEvaluacion(ActividadOperativa actividadOperativa, TipoEvaluacion tipoEvaluacion, UnidadMedida unidadMedida) {
        this.actividadOperativa = actividadOperativa;
        this.tipoEvaluacion = tipoEvaluacion;
        this.unidadMedida = unidadMedida;
    }

    public ActividadEvaluacion(ActividadOperativa actividadOperativa, TipoEvaluacion tipoEvaluacion, UnidadMedida unidadMedida, Integer programacionEnero, Integer programacionFebrero, Integer programacionMarzo, Integer programacionAbril, Integer programacionMayo, Integer programacionJunio, Integer programacionJulio, Integer programacionAgosto, Integer programacionSeptiembre, Integer programacionOctubre, Integer programacionNoviembre, Integer programacionDiciembre, Double presupuestoAnual) {
        super(programacionEnero, programacionFebrero, programacionMarzo, programacionAbril, programacionMayo, programacionJunio, programacionJulio, programacionAgosto, programacionSeptiembre, programacionOctubre, programacionNoviembre, programacionDiciembre, presupuestoAnual);
        this.actividadOperativa = actividadOperativa;
        this.tipoEvaluacion = tipoEvaluacion;
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return super.toString() + " ActividadEvaluacion{" + "actividadOperativa=" + actividadOperativa + ", tipoEvaluacion=" + tipoEvaluacion + ", unidadMedida=" + unidadMedida + '}';
    }
    
    public ActividadOperativa getActividadOperativa() {
        return actividadOperativa;
    }

    public void setActividadOperativa(ActividadOperativa actividadOperativa) {
        this.actividadOperativa = actividadOperativa;
    }

    public TipoEvaluacion getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    public void setTipoEvaluacion(TipoEvaluacion tipoEvaluacion) {
        this.tipoEvaluacion = tipoEvaluacion;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    
}
