package pe.gob.oefa.planefa.bo.actividades;

import java.util.ArrayList;
import java.util.List;
import pe.gob.oefa.planefa.bo.catalogo.Catalogo;
import pe.gob.oefa.planefa.bo.catalogo.FuncionNormada;
import pe.gob.oefa.planefa.bo.catalogo.TipoEvaluacion;
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
    
    public List<Catalogo> listarTiposEvaluacion(){
        List<Catalogo> lista = new ArrayList();        
        int i = 1;
        lista.add(new TipoEvaluacion("0"+(i++), "Monitoreo"));        
        lista.add(new TipoEvaluacion("0"+(i++), "Vigilancia"));        
        return lista;
    }
}
