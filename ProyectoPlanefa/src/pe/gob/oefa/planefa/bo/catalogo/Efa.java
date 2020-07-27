
package pe.gob.oefa.planefa.bo.catalogo;

public class Efa {
    
    private String codigo;
    private String ruc;
    private String nombre;
    private Ubigeo ubigeo;    
    private Ambito ambito;
    private TipoGobierno tipoGobierno;    
    private ClasificacionMef clasificacionMef;
    private OficinaDesconcentrada oficinaDesconcentrada;

    public Efa(String codigo, String ruc, String nombre, Ubigeo ubigeo, Ambito ambito, TipoGobierno tipoGobierno, ClasificacionMef clasificacionMef, OficinaDesconcentrada oficinaDesconcentrada) {
        this.codigo = codigo;
        this.ruc = ruc;
        this.nombre = nombre;
        this.ubigeo = ubigeo;
        this.ambito = ambito;
        this.tipoGobierno = tipoGobierno;
        this.clasificacionMef = clasificacionMef;
        this.oficinaDesconcentrada = oficinaDesconcentrada;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ubigeo getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }

    public Ambito getAmbito() {
        return ambito;
    }

    public void setAmbito(Ambito ambito) {
        this.ambito = ambito;
    }

    public TipoGobierno getTipoGobierno() {
        return tipoGobierno;
    }

    public void setTipoGobierno(TipoGobierno tipoGobierno) {
        this.tipoGobierno = tipoGobierno;
    }

    public ClasificacionMef getClasificacionMef() {
        return clasificacionMef;
    }

    public void setClasificacionMef(ClasificacionMef clasificacionMef) {
        this.clasificacionMef = clasificacionMef;
    }

    public OficinaDesconcentrada getOficinaDesconcentrada() {
        return oficinaDesconcentrada;
    }

    public void setOficinaDesconcentrada(OficinaDesconcentrada oficinaDesconcentrada) {
        this.oficinaDesconcentrada = oficinaDesconcentrada;
    }
    
}
