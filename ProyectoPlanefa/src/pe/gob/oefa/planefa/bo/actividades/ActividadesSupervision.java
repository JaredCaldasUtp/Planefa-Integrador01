package pe.gob.oefa.planefa.bo.actividades;

import java.util.ArrayList;
import pe.gob.oefa.planefa.bo.comportamiento.actualizar.ActualizarSupervision;
import pe.gob.oefa.planefa.bo.comportamiento.anular.AnularSupervision;
import pe.gob.oefa.planefa.bo.comportamiento.agregar.AgregarSupervision;
import pe.gob.oefa.planefa.bo.comportamiento.listaractividadesoperativas.ListarActividadesOperativasSupervision;
import pe.gob.oefa.planefa.bo.comportamiento.listarsectores.ListarSectoresSupervision;
import pe.gob.oefa.planefa.bo.comportamiento.listarunidadesdemedida.ListarUnidadesMedidaSupervision;

public class ActividadesSupervision extends Actividades {

    public ActividadesSupervision() {
        this.comportamientoAgregar = new AgregarSupervision();
        this.comportamientoActualizar = new ActualizarSupervision();
        this.comportamientoAnular = new AnularSupervision();
        this.comportamientoListarActividadesOperativas = new ListarActividadesOperativasSupervision();
        this.comportamientoListarSectores = new ListarSectoresSupervision();
        this.comportamientoListarUnidadesMedida = new ListarUnidadesMedidaSupervision();
        this.programacion = new ArrayList<>();                
    }     
}
