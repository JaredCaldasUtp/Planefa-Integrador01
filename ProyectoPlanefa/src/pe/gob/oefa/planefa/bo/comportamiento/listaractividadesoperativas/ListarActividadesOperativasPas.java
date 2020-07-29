
package pe.gob.oefa.planefa.bo.comportamiento.listaractividadesoperativas;

import java.util.ArrayList;
import java.util.List;
import pe.gob.oefa.planefa.bo.catalogo.Catalogo;

public class ListarActividadesOperativasPas implements ComportamientoListarActividadesOperativas{

    @Override
    public List<Catalogo> listar() {
        List<Catalogo> lista = new ArrayList();
        System.out.println("ListarActividadesOperativasPas...");
        
        return lista;
    }       
}
