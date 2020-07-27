
package pe.gob.oefa.planefa.bo.planefa;

import java.util.Date;
import pe.gob.oefa.planefa.bo.actividades.ActividadesEvaluacion;
import pe.gob.oefa.planefa.bo.actividades.ActividadesInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.actividades.ActividadesPas;
import pe.gob.oefa.planefa.bo.actividades.ActividadesSupervision;
import pe.gob.oefa.planefa.bo.catalogo.Efa;

public class Planefa implements Cloneable{
    
    private String codigo;
    private Periodo periodo;
    private Efa efa;
    private Date fechaEnvio;
    private Resolucion resolucionAprobacionPlanefa;
    private Resolucion resolucionAprbacionPoi;
    
    private ActividadesSupervision actividadesSupervision;
    private ActividadesPas actividadesPas;
    private ActividadesEvaluacion actividadesEvaluacion;
    private ActividadesInstrumentoNormativo actividadesInstrumentoNormativo;
    
    public Planefa(){
        actividadesSupervision = new ActividadesSupervision();
        actividadesPas = new ActividadesPas();
        actividadesEvaluacion = new ActividadesEvaluacion();
        actividadesInstrumentoNormativo = new ActividadesInstrumentoNormativo();
    }
    
    public Planefa(Periodo periodo, Efa efa) {
        this();
        this.periodo = periodo;
        this.efa = efa;
    }
    
     
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Efa getEfa() {
        return efa;
    }

    public void setEfa(Efa efa) {
        this.efa = efa;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Resolucion getResolucionAprobacionPlanefa() {
        return resolucionAprobacionPlanefa;
    }

    public void setResolucionAprobacionPlanefa(Resolucion resolucionAprobacionPlanefa) {
        this.resolucionAprobacionPlanefa = resolucionAprobacionPlanefa;
    }

    public Resolucion getResolucionAprbacionPoi() {
        return resolucionAprbacionPoi;
    }

    public void setResolucionAprbacionPoi(Resolucion resolucionAprbacionPoi) {
        this.resolucionAprbacionPoi = resolucionAprbacionPoi;
    }

    public ActividadesSupervision getActividadesSupervision() {
        return actividadesSupervision;
    }

    public ActividadesPas getActividadesPas() {
        return actividadesPas;
    }

    public ActividadesEvaluacion getActividadesEvaluacion() {
        return actividadesEvaluacion;
    }

    public ActividadesInstrumentoNormativo getActividadesInstrumentoNormativo() {
        return actividadesInstrumentoNormativo;
    }
}
