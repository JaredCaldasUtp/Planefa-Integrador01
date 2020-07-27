package pe.gob.oefa.planefa.bo.actividades;

import java.util.ArrayList;
import pe.gob.oefa.planefa.bo.comportamiento.actualizar.ActualizarEvaluacion;
import pe.gob.oefa.planefa.bo.comportamiento.anular.AnularEvaluacion;
import pe.gob.oefa.planefa.bo.comportamiento.agregar.AgregarEvaluacion;
import pe.gob.oefa.planefa.bo.comportamiento.listaractividadesoperativas.ListarActividadesOperativasEvaluacion;
import pe.gob.oefa.planefa.bo.comportamiento.listarsectores.ListarSectoresEvaluacion;
import pe.gob.oefa.planefa.bo.comportamiento.listarunidadesdemedida.ListarUnidadesMedidaEvaluacion;

public class ActividadesEvaluacion extends Actividades {

    public ActividadesEvaluacion() {
        this.comportamientoAgregar = new AgregarEvaluacion();
        this.comportamientoActualizar = new ActualizarEvaluacion();
        this.comportamientoAnular = new AnularEvaluacion();
        this.comportamientoListarActividadesOperativas = new ListarActividadesOperativasEvaluacion();
        this.comportamientoListarSectores = new ListarSectoresEvaluacion();
        this.comportamientoListarUnidadesMedida = new ListarUnidadesMedidaEvaluacion();
        this.programacion = new ArrayList<>();                
    }     
}
