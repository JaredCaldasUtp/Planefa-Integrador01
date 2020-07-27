
package pe.gob.oefa.planefa.bo.actividades;

import pe.gob.oefa.planefa.bo.actividad.Actividad;
import java.util.List;
import pe.gob.oefa.planefa.bo.comportamiento.actualizar.ComportamientoActualizar;
import pe.gob.oefa.planefa.bo.comportamiento.anular.ComportamientoAnular;
import pe.gob.oefa.planefa.bo.comportamiento.agregar.ComportamientoAgregar;
import pe.gob.oefa.planefa.bo.comportamiento.listaractividadesoperativas.ComportamientoListarActividadesOperativas;
import pe.gob.oefa.planefa.bo.comportamiento.listarsectores.ComportamientoListarSectores;
import pe.gob.oefa.planefa.bo.comportamiento.listarunidadesdemedida.ComportamientoListarUnidadesMedida;

public abstract class Actividades {
    ComportamientoAgregar comportamientoAgregar;
    ComportamientoActualizar comportamientoActualizar;
    ComportamientoAnular comportamientoAnular;
    ComportamientoListarActividadesOperativas comportamientoListarActividadesOperativas;
    ComportamientoListarSectores comportamientoListarSectores;
    ComportamientoListarUnidadesMedida comportamientoListarUnidadesMedida;
    
    List<Actividad> programacion;
        
    public Actividad agregar(Actividad actividad){
        Actividad actividadRegistrada = comportamientoAgregar.agregar(actividad);
        this.programacion.add(actividadRegistrada);
        return actividadRegistrada;
    }
    
    public Actividad actualizar(Actividad actividad){
        return comportamientoActualizar.actualizar(actividad);
    }
    
    public void anular(Actividad actividad){
        comportamientoAnular.anular(actividad);
    }    
    
    public List listarActividadesOperativas(){
        return comportamientoListarActividadesOperativas.listar();
    }
    
    public List listarSectores(){
        return comportamientoListarSectores.listar();
    }
    
    public List listarUnidadesMedida(){
        return comportamientoListarUnidadesMedida.listar();
    }
    
    public List<Actividad> getProgramacion(){
        return this.programacion;
    }    
}
