
package pe.gob.oefa.planefa.bo.comportamiento.listarunidadesdemedida;

import java.util.ArrayList;
import java.util.List;
import pe.gob.oefa.planefa.bo.catalogo.Catalogo;
import pe.gob.oefa.planefa.bo.catalogo.UnidadMedida;

public class ListarUnidadesMedidaSupervision implements ComportamientoListarUnidadesMedida{

    @Override
    public List<Catalogo> listar() {
        List<Catalogo> lista = new ArrayList();
        int i = 1;
        lista.add(new UnidadMedida("0"+(i++), "Informe de supervisión"));
        System.out.println("ListarUnidadesMedidaSupervision...");
        
        return lista;
    }  
}
