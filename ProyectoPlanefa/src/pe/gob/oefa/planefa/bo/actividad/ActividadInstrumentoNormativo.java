package pe.gob.oefa.planefa.bo.actividad;

import pe.gob.oefa.planefa.bo.catalogo.FuncionNormada;

public class ActividadInstrumentoNormativo extends Actividad{
    private FuncionNormada funcionNormada;
    private String instrumentoNormativo;    
    private Integer mes;
    
    public ActividadInstrumentoNormativo(){}

    public ActividadInstrumentoNormativo(FuncionNormada funcionNormada, String instrumentoNormativo, Integer mes) {
        this.funcionNormada = funcionNormada;
        this.instrumentoNormativo = instrumentoNormativo;
        this.mes = mes;
    }

    public ActividadInstrumentoNormativo(FuncionNormada funcionNormada, String instrumentoNormativo, Integer mes, Integer programacionEnero, Integer programacionFebrero, Integer programacionMarzo, Integer programacionAbril, Integer programacionMayo, Integer programacionJunio, Integer programacionJulio, Integer programacionAgosto, Integer programacionSeptiembre, Integer programacionOctubre, Integer programacionNoviembre, Integer programacionDiciembre, Double presupuestoAnual) {
        super(programacionEnero, programacionFebrero, programacionMarzo, programacionAbril, programacionMayo, programacionJunio, programacionJulio, programacionAgosto, programacionSeptiembre, programacionOctubre, programacionNoviembre, programacionDiciembre, presupuestoAnual);
        this.funcionNormada = funcionNormada;
        this.instrumentoNormativo = instrumentoNormativo;
        this.mes = mes;
    }

    @Override
    public String toString() {
        return super.toString() + " ActividadInstrumentoNormativo{" + "funcionNormada=" + funcionNormada + ", instrumentoNormativo=" + instrumentoNormativo + ", mes=" + mes + '}';
    }
    
    public FuncionNormada getFuncionNormada() {
        return funcionNormada;
    }

    public void setFuncionNormada(FuncionNormada funcionNormada) {
        this.funcionNormada = funcionNormada;
    }

    public String getInstrumentoNormativo() {
        return instrumentoNormativo;
    }

    public void setInstrumentoNormativo(String instrumentoNormativo) {
        this.instrumentoNormativo = instrumentoNormativo;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

   

      
}
