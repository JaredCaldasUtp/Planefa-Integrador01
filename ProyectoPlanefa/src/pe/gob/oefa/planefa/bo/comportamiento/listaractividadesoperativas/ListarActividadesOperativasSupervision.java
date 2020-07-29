
package pe.gob.oefa.planefa.bo.comportamiento.listaractividadesoperativas;

import java.util.ArrayList;
import java.util.List;
import pe.gob.oefa.planefa.bo.catalogo.ActividadOperativa;
import pe.gob.oefa.planefa.bo.catalogo.Catalogo;

public class ListarActividadesOperativasSupervision implements ComportamientoListarActividadesOperativas{

   @Override
    public List<Catalogo> listar() {
        List<Catalogo> lista = new ArrayList();   
        lista.add(new ActividadOperativa("01", "Supervisión"));
        System.out.println("ListarActividadesOperativasSupervision...");
        
        return lista;
    }  
}
