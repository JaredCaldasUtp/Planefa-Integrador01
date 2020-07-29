
package pe.gob.oefa.planefa.bo.comportamiento.listarsectores;

import java.util.ArrayList;
import java.util.List;
import pe.gob.oefa.planefa.bo.catalogo.ActividadOperativa;
import pe.gob.oefa.planefa.bo.catalogo.Catalogo;
import pe.gob.oefa.planefa.bo.catalogo.Sector;

public class ListarSectoresSupervision implements ComportamientoListarSectores{

   @Override
    public List<Catalogo> listar() {
        List<Catalogo> lista = new ArrayList();
        int i = 1;
        lista.add(new Sector("0"+(i++), "Agricultura"));
        lista.add(new Sector("0"+(i++), "Comunicaciones"));
        lista.add(new Sector("0"+(i++), "Construcción"));
        lista.add(new Sector("0"+(i++), "Forestal"));
        lista.add(new Sector("0"+(i++), "Minería"));
        lista.add(new Sector("0"+(i++), "Pesca"));
        lista.add(new Sector("0"+(i++), "Producción"));
        lista.add(new Sector("0"+(i++), "Salud"));
        lista.add(new Sector("0"+(i++), "Saneamiento"));
        lista.add(new Sector("0"+(i++), "Transportes"));
        lista.add(new Sector("0"+(i++), "Turismo"));
        lista.add(new Sector("0"+(i++), "Vivienda"));
                
        System.out.println("ListarSectoresSupervision...");
        
        return lista;
    }  
}
