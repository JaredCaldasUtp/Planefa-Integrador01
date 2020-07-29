package pe.gob.oefa.planefa.bo.actividades;

import java.util.ArrayList;
import java.util.List;
import pe.gob.oefa.planefa.bo.catalogo.Catalogo;
import pe.gob.oefa.planefa.bo.catalogo.FuncionNormada;
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
    
    public List<Catalogo> listarFunciones(){
        List<Catalogo> lista = new ArrayList();        
        int i = 1;
        lista.add(new FuncionNormada("0"+(i++), "Evaluadora"));
        lista.add(new FuncionNormada("0"+(i++), "Fiscalizadora - Sancionadora"));
        lista.add(new FuncionNormada("0"+(i++), "Supervisora"));
        
        return lista;
    }
}
