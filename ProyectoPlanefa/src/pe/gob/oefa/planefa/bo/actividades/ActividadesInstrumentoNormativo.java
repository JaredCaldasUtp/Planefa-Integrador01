package pe.gob.oefa.planefa.bo.actividades;

import java.util.ArrayList;
import pe.gob.oefa.planefa.bo.comportamiento.actualizar.ActualizarInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.comportamiento.anular.AnularInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.comportamiento.agregar.AgregarInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.comportamiento.listaractividadesoperativas.ListarActividadesOperativasInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.comportamiento.listarsectores.ListarSectoresInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.comportamiento.listarunidadesdemedida.ListarUnidadesMedidaInstrumentoNormativo;

public class ActividadesInstrumentoNormativo extends Actividades {

    public ActividadesInstrumentoNormativo() {
       this.comportamientoAgregar = new AgregarInstrumentoNormativo();
        this.comportamientoActualizar = new ActualizarInstrumentoNormativo();
        this.comportamientoAnular = new AnularInstrumentoNormativo();
        this.comportamientoListarActividadesOperativas = new ListarActividadesOperativasInstrumentoNormativo();
        this.comportamientoListarSectores = new ListarSectoresInstrumentoNormativo();
        this.comportamientoListarUnidadesMedida = new ListarUnidadesMedidaInstrumentoNormativo();
        this.programacion = new ArrayList<>();                   
    }     
}
