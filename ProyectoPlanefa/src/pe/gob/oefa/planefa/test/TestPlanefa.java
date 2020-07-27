
package pe.gob.oefa.planefa.test;

import java.util.Date;
import java.util.List;
import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadEvaluacion;
import pe.gob.oefa.planefa.bo.actividad.ActividadInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.actividad.ActividadPas;
import pe.gob.oefa.planefa.bo.catalogo.ActividadOperativa;
import pe.gob.oefa.planefa.bo.actividad.ActividadSupervision;
import pe.gob.oefa.planefa.bo.catalogo.ObjetoSupervision;
import pe.gob.oefa.planefa.bo.catalogo.Sector;
import pe.gob.oefa.planefa.bo.catalogo.UnidadMedida;
import pe.gob.oefa.planefa.bo.actividades.Actividades;
import pe.gob.oefa.planefa.bo.actividades.ActividadesEvaluacion;
import pe.gob.oefa.planefa.bo.actividades.ActividadesInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.actividades.ActividadesPas;
import pe.gob.oefa.planefa.bo.actividades.ActividadesSupervision;
import pe.gob.oefa.planefa.bo.catalogo.Ambito;
import pe.gob.oefa.planefa.bo.catalogo.ClasificacionMef;
import pe.gob.oefa.planefa.bo.catalogo.Efa;
import pe.gob.oefa.planefa.bo.catalogo.FuncionNormada;
import pe.gob.oefa.planefa.bo.catalogo.OficinaDesconcentrada;
import pe.gob.oefa.planefa.bo.catalogo.TipoEvaluacion;
import pe.gob.oefa.planefa.bo.catalogo.TipoGobierno;
import pe.gob.oefa.planefa.bo.catalogo.Ubigeo;
import pe.gob.oefa.planefa.bo.planefa.Periodo;
import pe.gob.oefa.planefa.bo.planefa.Planefa;

public class TestPlanefa {
    
    public static void main(String[] args) throws  Exception{
        
        //Periodo
        Periodo periodo = new Periodo(2020, new Date(), new Date());
        
        //Datos de la EFA
        Ubigeo ubigeo = new  Ubigeo();
        Ambito ambito = new Ambito("1100", "Ncional");//Regional//Local
        TipoGobierno tipoGobierno = new TipoGobierno("1200", "Distrital");//Distrital, Provincial, Centro poblado
        ClasificacionMef clasificacionMef = new ClasificacionMef("1300", "A");
        OficinaDesconcentrada oficinaDesconcentrada = new OficinaDesconcentrada("2000", "OD x");                
        Efa efa = new Efa("1000", "20425856214", "Municipalidad Distrital de Surco", ubigeo, ambito, tipoGobierno, clasificacionMef, oficinaDesconcentrada);
        
        //Datos del Planefa
        Planefa planefa = new Planefa(periodo, efa);
        
        //----------------------------------------------------------------------------------------
        //1. Actividades de supervisión
        //----------------------------------------------------------------------------------------
        if(1==1){
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
            System.out.println("Agregando actividades de supervisión");
            System.out.println("==========================================");        
            planefa.getActividadesSupervision().agregar((ActividadSupervision)actividad.clone());
            planefa.getActividadesSupervision().agregar((ActividadSupervision)actividad.clone());
            planefa.getActividadesSupervision().agregar((ActividadSupervision)actividad.clone());
            planefa.getActividadesSupervision().agregar((ActividadSupervision)actividad.clone());

            System.out.println("Listando actividades de supervisión");
            System.out.println("==========================================");
            List<Actividad> programacion = planefa.getActividadesSupervision().getProgramacion();
             programacion.stream().map((actividadRow) -> (ActividadSupervision)actividadRow).forEachOrdered((row) -> {
                System.out.println(row);
            });   
            
        }
        
        
        //----------------------------------------------------------------------------------------
        //2. Actividades PAS
        //----------------------------------------------------------------------------------------
        if(1==1){
            //Actividad PAS
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

            //Agregar actividad PAS   
            System.out.println("");
            System.out.println("Agregando actividades PAS");
            System.out.println("==========================================");            
            planefa.getActividadesPas().agregar((ActividadPas)actividad.clone());
            planefa.getActividadesPas().agregar((ActividadPas)actividad.clone());
            planefa.getActividadesPas().agregar((ActividadPas)actividad.clone());
            planefa.getActividadesPas().agregar((ActividadPas)actividad.clone());

            System.out.println("Listando actividades PAS");
            System.out.println("==========================================");
            List<Actividad> programacionPas = planefa.getActividadesPas().getProgramacion();
            programacionPas.stream().map((actividadRow) -> (ActividadPas)actividadRow).forEachOrdered((row) -> {
                System.out.println(row);
            });     
        }
        
        //----------------------------------------------------------------------------------------
        //3. Actividades de evaluación
        //----------------------------------------------------------------------------------------
        if(1==1){
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
            System.out.println("");
            System.out.println("Agregando actividades de evaluación");
            System.out.println("==========================================");            
            planefa.getActividadesEvaluacion().agregar((ActividadEvaluacion)actividad.clone());
            planefa.getActividadesEvaluacion().agregar((ActividadEvaluacion)actividad.clone());
            planefa.getActividadesEvaluacion().agregar((ActividadEvaluacion)actividad.clone());
            planefa.getActividadesEvaluacion().agregar((ActividadEvaluacion)actividad.clone());

            System.out.println("Listando actividades de evaluación");
            System.out.println("==========================================");
            List<Actividad> programacionEvaluacion = planefa.getActividadesEvaluacion().getProgramacion();
            programacionEvaluacion.stream().map((actividadRow) -> (ActividadEvaluacion)actividadRow).forEachOrdered((row) -> {
                System.out.println(row);
            });
        }
        
        //----------------------------------------------------------------------------------------
        //4. Programación de instrumentos normativos a aprobarse
        //----------------------------------------------------------------------------------------
        if(1==1){      
            //Instrumento normativo a aprobarse       
            FuncionNormada funcionNormada = new FuncionNormada("600", "Monitoreo");                        
            ActividadInstrumentoNormativo actividad = new ActividadInstrumentoNormativo(funcionNormada, "Resolución que aprueba el instrumento normativo x", 1);

            //Agregar instrumentos normativos a aprobarse    
            System.out.println("");
            System.out.println("Agregando programación de instrumentos normativos a aprobarse");
            System.out.println("==========================================");            
            planefa.getActividadesInstrumentoNormativo().agregar((ActividadInstrumentoNormativo)actividad.clone());
            planefa.getActividadesInstrumentoNormativo().agregar((ActividadInstrumentoNormativo)actividad.clone());
            planefa.getActividadesInstrumentoNormativo().agregar((ActividadInstrumentoNormativo)actividad.clone());
            planefa.getActividadesInstrumentoNormativo().agregar((ActividadInstrumentoNormativo)actividad.clone());

            System.out.println("Listando programación de instrumentos normativos a aprobarse");
            System.out.println("==========================================");
            List<Actividad> programacionInstrumentosNormativos = planefa.getActividadesInstrumentoNormativo().getProgramacion();
            programacionInstrumentosNormativos.stream().map((actividadRow) -> (ActividadInstrumentoNormativo)actividadRow).forEachOrdered((row) -> {
                System.out.println(row);
            });          
        }
    }
}
