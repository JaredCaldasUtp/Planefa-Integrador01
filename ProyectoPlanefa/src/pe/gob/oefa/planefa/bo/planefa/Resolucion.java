
package pe.gob.oefa.planefa.bo.planefa;

import java.util.Date;

public class Resolucion {
    private String codigo;
    private TipoResolucion tipoResolucion;
    private String numero;
    private Date fechaAprobacion;

    public Resolucion(String codigo, TipoResolucion tipoResolucion, String numero, Date fechaAprobacion) {
        this.codigo = codigo;
        this.tipoResolucion = tipoResolucion;
        this.numero = numero;
        this.fechaAprobacion = fechaAprobacion;
    }

    @Override
    public String toString() {
        return "Resolucion{" + "codigo=" + codigo + ", tipoResolucion=" + tipoResolucion + ", numero=" + numero + ", fechaAprobacion=" + fechaAprobacion + '}';
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoResolucion getTipoResolucion() {
        return tipoResolucion;
    }

    public void setTipoResolucion(TipoResolucion tipoResolucion) {
        this.tipoResolucion = tipoResolucion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }
    
}
