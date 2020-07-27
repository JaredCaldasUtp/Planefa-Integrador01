package View;

import pe.gob.oefa.planefa.bo.planefa.Planefa;

public class PlanefaSingleton {
    
     private PlanefaSingleton(){}
    
    private static class PlanefaSingletonHelper{
        private static Planefa INSTANCE = new Planefa();
    }
    
    public static Planefa getInstance(){
        return PlanefaSingletonHelper.INSTANCE;
    }
    
    public static Planefa getNewInstance(){
        PlanefaSingletonHelper.INSTANCE = new Planefa();
        return PlanefaSingletonHelper.INSTANCE;
    }
}
