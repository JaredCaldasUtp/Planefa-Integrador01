
package pe.gob.oefa.planefa.test;

import java.util.List;
import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.catalogo.ActividadOperativa;
import pe.gob.oefa.planefa.bo.actividad.ActividadSupervision;
import pe.gob.oefa.planefa.bo.catalogo.ObjetoSupervision;
import pe.gob.oefa.planefa.bo.catalogo.Sector;
import pe.gob.oefa.planefa.bo.catalogo.UnidadMedida;
import pe.gob.oefa.planefa.bo.actividades.Actividades;
import pe.gob.oefa.planefa.bo.actividades.ActividadesSupervision;

public class TestActividadesSupervision {
    
    public static void main(String[] args) throws  Exception{
        
        //Actividad de supervisión
        ActividadOperativa actividadOperativa = new ActividadOperativa("100", "Supervisión");
        Sector sector = new Sector("200", "Minería");
        ObjetoSupervision objetoSupervision = new ObjetoSupervision("300", "Vertimientos");
        UnidadMedida unidadMedida = new UnidadMedida("400", "Informe de Supervisión");
                
        ActividadSupervision actividad = new ActividadSupervision(actividadOperativa, sector, objetoSupervision, unidadMedida);
        actividad.setProgramacionEnero(1);
        actividad.setProgramacionFebrero(0);
        actividad.setProgramacionMarzo(1);
        actividad.setProgramacionAbril(0);
        actividad.setProgramacionMayo(1);
        actividad.setProgramacionJunio(0);
        actividad.setProgramacionJulio(1);
        actividad.setProgramacionAgosto(0);
        actividad.setProgramacionSeptiembre(1);
        actividad.setProgramacionOctubre(2);
        actividad.setProgramacionNoviembre(0);
        actividad.setProgramacionDiciembre(3);
        
        //Agregar actividad de supervisión        
        System.out.println("Agrenado actividades de supervisión");
        System.out.println("==========================================");
        Actividades actividades = new ActividadesSupervision();
	actividades.agregar((ActividadSupervision)actividad.clone());
        actividades.agregar((ActividadSupervision)actividad.clone());
        actividades.agregar((ActividadSupervision)actividad.clone());
        actividades.agregar((ActividadSupervision)actividad.clone());
        
        System.out.println("Listando actividades de supervisión");
        System.out.println("==========================================");
        List<Actividad> programacion = actividades.getProgramacion();
         programacion.stream().map((actividadRow) -> (ActividadSupervision)actividadRow).forEachOrdered((row) -> {
            System.out.println(row);
        });    
                    
    }
}
