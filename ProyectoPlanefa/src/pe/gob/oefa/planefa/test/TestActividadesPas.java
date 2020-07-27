
package pe.gob.oefa.planefa.test;

import java.util.List;
import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadPas;
import pe.gob.oefa.planefa.bo.catalogo.Sector;
import pe.gob.oefa.planefa.bo.catalogo.UnidadMedida;
import pe.gob.oefa.planefa.bo.actividades.Actividades;
import pe.gob.oefa.planefa.bo.actividades.ActividadesPas;

public class TestActividadesPas {
    
    public static void main(String[] args) throws  Exception{
        
        //Actividad de evaluación
        Sector sector = new Sector("200", "Minería");        
        UnidadMedida unidadMedida = new UnidadMedida("402", "Expediente concluido");
                
        ActividadPas actividad = new ActividadPas(2020, sector, unidadMedida);
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
        
        //Agregar actividad de evaluación        
        System.out.println("Agrenado actividades PAS");
        System.out.println("==========================================");
        Actividades actividades = new ActividadesPas();
	actividades.agregar((ActividadPas)actividad.clone());
        actividades.agregar((ActividadPas)actividad.clone());
        actividades.agregar((ActividadPas)actividad.clone());
        actividades.agregar((ActividadPas)actividad.clone());
        
        System.out.println("Listando actividades PAS");
        System.out.println("==========================================");
        List<Actividad> programacion = actividades.getProgramacion();
        programacion.stream().map((actividadRow) -> (ActividadPas)actividadRow).forEachOrdered((row) -> {
            System.out.println(row);
        });           
    }
}
