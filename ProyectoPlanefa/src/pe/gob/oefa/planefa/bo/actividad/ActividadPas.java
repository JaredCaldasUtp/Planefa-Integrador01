package pe.gob.oefa.planefa.bo.actividad;

import pe.gob.oefa.planefa.bo.catalogo.UnidadMedida;
import pe.gob.oefa.planefa.bo.catalogo.Sector;

public class ActividadPas extends Actividad{
    private Integer anio;
    private Sector sector;    
    private UnidadMedida unidadMedida;

    public ActividadPas(){}

    public ActividadPas(Integer anio, Sector sector, UnidadMedida unidadMedida) {
        this.anio = anio;
        this.sector = sector;
        this.unidadMedida = unidadMedida;
    }

    public ActividadPas(Integer anio, Sector sector, UnidadMedida unidadMedida, Integer programacionEnero, Integer programacionFebrero, Integer programacionMarzo, Integer programacionAbril, Integer programacionMayo, Integer programacionJunio, Integer programacionJulio, Integer programacionAgosto, Integer programacionSeptiembre, Integer programacionOctubre, Integer programacionNoviembre, Integer programacionDiciembre, Double presupuestoAnual) {
        super(programacionEnero, programacionFebrero, programacionMarzo, programacionAbril, programacionMayo, programacionJunio, programacionJulio, programacionAgosto, programacionSeptiembre, programacionOctubre, programacionNoviembre, programacionDiciembre, presupuestoAnual);
        this.anio = anio;
        this.sector = sector;
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return super.toString() + " ActividadPas{" + "anio=" + anio + ", sector=" + sector + ", unidadMedida=" + unidadMedida + '}';
    }
    
    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
   
    
    
}
