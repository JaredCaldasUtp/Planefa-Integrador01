
package pe.gob.oefa.planefa.test;

import java.util.List;
import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadEvaluacion;
import pe.gob.oefa.planefa.bo.catalogo.ActividadOperativa;
import pe.gob.oefa.planefa.bo.catalogo.UnidadMedida;
import pe.gob.oefa.planefa.bo.actividades.Actividades;
import pe.gob.oefa.planefa.bo.actividades.ActividadesEvaluacion;
import pe.gob.oefa.planefa.bo.catalogo.TipoEvaluacion;

public class TestActividadesEvaluacion {
    
    public static void main(String[] args) throws  Exception{
        
        //Actividad de evaluación
        ActividadOperativa actividadOperativa = new ActividadOperativa("101", "Evaluación de la calidad ambiental");
        TipoEvaluacion tipoEvaluacion = new TipoEvaluacion("500", "Monitoreo");        
        UnidadMedida unidadMedida = new UnidadMedida("401", "Informe de evaluación");
                
        ActividadEvaluacion actividad = new ActividadEvaluacion(actividadOperativa, tipoEvaluacion, unidadMedida);
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
        System.out.println("Agrenado actividades de evaluación");
        System.out.println("==========================================");
        Actividades actividades = new ActividadesEvaluacion();
	actividades.agregar((ActividadEvaluacion)actividad.clone());
        actividades.agregar((ActividadEvaluacion)actividad.clone());
        actividades.agregar((ActividadEvaluacion)actividad.clone());
        actividades.agregar((ActividadEvaluacion)actividad.clone());
        
        System.out.println("Listando actividades de evaluación");
        System.out.println("==========================================");
        List<Actividad> programacion = actividades.getProgramacion();
        programacion.stream().map((actividadRow) -> (ActividadEvaluacion)actividadRow).forEachOrdered((row) -> {
            System.out.println(row);
        });         
    }
}
