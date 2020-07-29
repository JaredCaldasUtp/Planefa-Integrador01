
package pe.gob.oefa.planefa.bo.comportamiento.listaractividadesoperativas;

import java.util.ArrayList;
import java.util.List;
import pe.gob.oefa.planefa.bo.catalogo.Catalogo;

public class ListarActividadesOperativasInstrumentoNormativo implements ComportamientoListarActividadesOperativas{

    @Override
    public List<Catalogo> listar() {
        List<Catalogo> lista = new ArrayList();
        System.out.println("ListarActividadesOperativasInstrumentoNormativo...");
        
        return lista;
    }    
}
