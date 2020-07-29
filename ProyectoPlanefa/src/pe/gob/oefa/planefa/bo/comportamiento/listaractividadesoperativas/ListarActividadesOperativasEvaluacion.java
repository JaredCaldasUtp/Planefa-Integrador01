
package pe.gob.oefa.planefa.bo.comportamiento.listaractividadesoperativas;

import java.util.ArrayList;
import java.util.List;
import pe.gob.oefa.planefa.bo.catalogo.ActividadOperativa;
import pe.gob.oefa.planefa.bo.catalogo.Catalogo;

public class ListarActividadesOperativasEvaluacion implements ComportamientoListarActividadesOperativas{

    @Override
    public List<Catalogo> listar() {
        List<Catalogo> lista = new ArrayList();
        lista.add(new ActividadOperativa("02", "Evaluación de la calidad ambiental"));
        System.out.println("ListarActividadesOperativasEvaluacion...");
        
        return lista;
    }    
}
