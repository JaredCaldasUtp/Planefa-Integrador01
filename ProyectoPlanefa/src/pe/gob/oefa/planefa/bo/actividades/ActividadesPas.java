package pe.gob.oefa.planefa.bo.actividades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import pe.gob.oefa.planefa.bo.comportamiento.actualizar.ActualizarPas;
import pe.gob.oefa.planefa.bo.comportamiento.anular.AnularPas;
import pe.gob.oefa.planefa.bo.comportamiento.agregar.AgregarPas;
import pe.gob.oefa.planefa.bo.comportamiento.listaractividadesoperativas.ListarActividadesOperativasPas;
import pe.gob.oefa.planefa.bo.comportamiento.listarsectores.ListarSectoresPas;
import pe.gob.oefa.planefa.bo.comportamiento.listarunidadesdemedida.ListarUnidadesMedidaPas;
import pe.gob.oefa.planefa.resources.Constantes;

public class ActividadesPas extends Actividades {

    public ActividadesPas() {
        this.comportamientoAgregar = new AgregarPas();
        this.comportamientoActualizar = new ActualizarPas();
        this.comportamientoAnular = new AnularPas();
        this.comportamientoListarActividadesOperativas = new ListarActividadesOperativasPas();
        this.comportamientoListarSectores = new ListarSectoresPas();
        this.comportamientoListarUnidadesMedida = new ListarUnidadesMedidaPas();
        this.programacion = new ArrayList<>();                
    }     
    
    public List<String> listarAnios() {
        List<String> lista= new ArrayList<>();
        Calendar calendar = new GregorianCalendar();
        int anioActual = calendar.get(Calendar.YEAR);
        int anioDesde = anioActual - Constantes.ANIOS_ANTERIORES;

        for (int i = anioDesde; i <= anioActual; i++) {
            lista.add(i+"");
        }
        
        return lista;
    }
}
