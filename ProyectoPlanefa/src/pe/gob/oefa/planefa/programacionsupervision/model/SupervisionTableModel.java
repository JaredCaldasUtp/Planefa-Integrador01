
package pe.gob.oefa.planefa.programacionsupervision.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadSupervision;
import pe.gob.oefa.planefa.bo.planefa.Planefa;

public class SupervisionTableModel extends AbstractTableModel {
    
    /*
   
            
            String[][] data = new String[programacion.size()][17];
            int i=0;
            for(Actividad actividadRow: programacion){
                ActividadSupervision actividadSupervision = (ActividadSupervision)actividadRow;
                System.out.println(actividadSupervision.getActividadOperativa().getNombre());
                System.out.println(actividadSupervision.getSector().getNombre());
                System.out.println(actividadSupervision.getObjetoSupervision().getNombre());
                System.out.println(actividadSupervision.getUnidadMedida().getNombre());
                String rowData[] = {
                    ""+(i++),
                    actividadSupervision.getActividadOperativa().getNombre(),
                    actividadSupervision.getSector().getNombre(),
                    actividadSupervision.getObjetoSupervision().getNombre(),
                    actividadSupervision.getUnidadMedida().getNombre(),
                    actividadSupervision.getProgramacionEnero().toString(),
                    actividadSupervision.getProgramacionFebrero().toString(),
                    actividadSupervision.getProgramacionMarzo().toString(),
                    actividadSupervision.getProgramacionAbril().toString(),
                    actividadSupervision.getProgramacionMayo().toString(),
                    actividadSupervision.getProgramacionJunio().toString(),
                    actividadSupervision.getProgramacionJulio().toString(),
                    actividadSupervision.getProgramacionAgosto().toString(),
                    actividadSupervision.getProgramacionSeptiembre().toString(),
                    actividadSupervision.getProgramacionOctubre().toString(),
                    actividadSupervision.getProgramacionNoviembre().toString(),
                    actividadSupervision.getProgramacionDiciembre().toString(),
                };
                data[i] = rowData;
                i++;
            }
                          
            String column[]={"N°","Actividad Operativa","Sector","Objeto de Supervisión", "Unidad de Medida", 
                "Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre",
                "Meta física anual", "Presupuesto anual"
            };   
   */
    private String[] columnNames = {
        "N°", "Actividad Operativa", "Sector", "Objeto de Supervisión", "Unidad de Medida",
        "Enero", "Febrero", "Marzo", "Abril", 
        "Mayo", "Junio", "Julio", "Agosto", 
        "Septiembre", "Octubre", "Noviembre", "Diciembre", 
        "Meta física anual", "Presupuesto anual"};
    private ArrayList<ActividadSupervision> actividades;
    public SupervisionTableModel(Planefa planefa) {
        actividades = new ArrayList<>();
        System.out.println("Actividades:"+planefa.getActividadesSupervision().getProgramacion().size());
        for (Actividad actividadRow : planefa.getActividadesSupervision().getProgramacion()) {
            ActividadSupervision actividad = (ActividadSupervision) actividadRow;
            actividades.add(actividad);
        }
    }

    @Override
    public int getRowCount() {
        int size;
        if (this.actividades == null) {
            size = 0;
        } else {
            size = this.actividades.size();
        }
        return size;
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null;
        switch (columnIndex) {
            case 0:
                temp = this.actividades.get(rowIndex).getCodigo();
                break;
            case 1:
                temp = this.actividades.get(rowIndex).getActividadOperativa().getNombre();
                break;
            case 2:
                temp = this.actividades.get(rowIndex).getSector().getNombre();                
                break;            
            case 3:
                temp = this.actividades.get(rowIndex).getObjetoSupervision().getNombre();
                break;
            case 4:
                temp = this.actividades.get(rowIndex).getUnidadMedida().getNombre();
                break;
            case 5:
                temp = this.actividades.get(rowIndex).getProgramacionEnero().toString();
                break;
            case 6:
                temp = this.actividades.get(rowIndex).getProgramacionFebrero().toString();
                break;
            case 7:
                temp = this.actividades.get(rowIndex).getProgramacionMarzo().toString();
                break;
            case 8:
                temp = this.actividades.get(rowIndex).getProgramacionAbril().toString();
                break;
            case 9:
                temp = this.actividades.get(rowIndex).getProgramacionMayo().toString();
                break;
            case 10:
                temp = this.actividades.get(rowIndex).getProgramacionJunio().toString();
                break;
            case 11:
                temp = this.actividades.get(rowIndex).getProgramacionJulio().toString();
                break;
            case 12:
                temp = this.actividades.get(rowIndex).getProgramacionAgosto().toString();
                break;
            case 13:
                temp = this.actividades.get(rowIndex).getProgramacionSeptiembre().toString();
                break;
            case 14:
                temp = this.actividades.get(rowIndex).getProgramacionOctubre().toString();
                break;
            case 15:
                temp = this.actividades.get(rowIndex).getProgramacionNoviembre().toString();
                break;
            case 16:
                temp = this.actividades.get(rowIndex).getProgramacionDiciembre().toString();
                break;
            case 17:
                temp = this.actividades.get(rowIndex).getMetaFisicaAnual().toString();
                break;
            case 18:
                temp = this.actividades.get(rowIndex).getPresupuestoAnual();
                break;
            default:
                temp = "";
                break;
        }
        
        /*
        actividadSupervision.getObjetoSupervision().getNombre(),
                    actividadSupervision.,
                    actividadSupervision.getProgramacionEnero().toString(),
                    actividadSupervision.getProgramacionFebrero().toString(),
                    actividadSupervision.().toString(),
                    actividadSupervision.().toString(),
                    actividadSupervision.().toString(),
                    actividadSupervision.().toString(),
                    actividadSupervision.().toString(),
                    actividadSupervision.().toString(),
                    actividadSupervision.().toString(),
                    actividadSupervision.().toString(),
                    actividadSupervision.().toString(),
                    actividadSupervision.().toString(),
        */
        return temp;
    }
    
    @Override
   public String getColumnName(int col) {
      return this.columnNames[col];
   }
   
    @Override
   public Class getColumnClass(int col) {
        switch (col) {
            case 18:
                return Double.class;
            case 1:
                return String.class;
            default:
                return String.class;
        }
   }
    
}
