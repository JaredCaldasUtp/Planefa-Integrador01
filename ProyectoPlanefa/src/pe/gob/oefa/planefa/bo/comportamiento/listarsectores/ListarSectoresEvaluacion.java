
package pe.gob.oefa.planefa.bo.comportamiento.listarsectores;

import java.util.ArrayList;
import java.util.List;
import pe.gob.oefa.planefa.bo.catalogo.Catalogo;

public class ListarSectoresEvaluacion implements ComportamientoListarSectores{

    @Override
    public List<Catalogo> listar() {
        List<Catalogo> lista = new ArrayList();
        System.out.println("ListarSectoresEvaluacion...");
        
        return lista;
    }    
}
