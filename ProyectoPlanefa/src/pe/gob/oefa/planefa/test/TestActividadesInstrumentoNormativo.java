
package pe.gob.oefa.planefa.test;

import java.util.List;
import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.actividades.Actividades;
import pe.gob.oefa.planefa.bo.actividades.ActividadesInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.catalogo.FuncionNormada;

public class TestActividadesInstrumentoNormativo {
    
    public static void main(String[] args) throws  Exception{
        
        //Actividad de instrumento normativo        
        FuncionNormada funcionNormada = new FuncionNormada("600", "Monitoreo");                        
        ActividadInstrumentoNormativo actividad = new ActividadInstrumentoNormativo(funcionNormada, "Resolución que aprueba el instrumento normativo x", 1);
        
        //Agregar actividad de evaluación        
        System.out.println("Agrenado programación de instrumentos normativos a aprobarse");
        System.out.println("==========================================");
        Actividades actividades = new ActividadesInstrumentoNormativo();
	actividades.agregar((ActividadInstrumentoNormativo)actividad.clone());
        actividades.agregar((ActividadInstrumentoNormativo)actividad.clone());
        actividades.agregar((ActividadInstrumentoNormativo)actividad.clone());
        actividades.agregar((ActividadInstrumentoNormativo)actividad.clone());
        
        System.out.println("Listando programación de instrumentos normativos a aprobarse");
        System.out.println("==========================================");
        List<Actividad> programacion = actividades.getProgramacion();
        programacion.stream().map((actividadRow) -> (ActividadInstrumentoNormativo)actividadRow).forEachOrdered((row) -> {
            System.out.println(row);
        });        
    }
}
