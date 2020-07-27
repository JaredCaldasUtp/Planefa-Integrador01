
package pe.gob.oefa.planefa.bo.planefa;

import java.util.Date;
import pe.gob.oefa.planefa.bo.catalogo.Catalogo;

public class Periodo{
    
    private Integer anio;
    private Date plazoRemisionInicial;
    private Date plazoRemisionFinal;

    public Periodo(Integer anio, Date plazoRemisionInicial, Date plazoRemisionFinal) {        
        this.anio = anio;
        this.plazoRemisionInicial = plazoRemisionInicial;
        this.plazoRemisionFinal = plazoRemisionFinal;
    }

    @Override
    public String toString() {
        return "Periodo{" + "anio=" + anio + ", plazoRemisionInicial=" + plazoRemisionInicial + ", plazoRemisionFinal=" + plazoRemisionFinal + '}';
    }
    
    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Date getPlazoRemisionInicial() {
        return plazoRemisionInicial;
    }

    public void setPlazoRemisionInicial(Date plazoRemisionInicial) {
        this.plazoRemisionInicial = plazoRemisionInicial;
    }

    public Date getPlazoRemisionFinal() {
        return plazoRemisionFinal;
    }

    public void setPlazoRemisionFinal(Date plazoRemisionFinal) {
        this.plazoRemisionFinal = plazoRemisionFinal;
    }
 
}