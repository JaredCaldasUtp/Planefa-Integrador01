
package pe.gob.oefa.planefa.view.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadPas;
import pe.gob.oefa.planefa.bo.planefa.Planefa;

public class PasTableModel extends AbstractTableModel {
   
    private final String[] columnNames = {
        "N°", "Año", "Sector", "Unidad de Medida",
        "Enero", "Febrero", "Marzo", "Abril", 
        "Mayo", "Junio", "Julio", "Agosto", 
        "Septiembre", "Octubre", "Noviembre", "Diciembre", 
        "Meta física anual", "Presupuesto anual"};
    private final ArrayList<ActividadPas> actividades;
    
    public PasTableModel(Planefa planefa) {
        actividades = new ArrayList<>();
        System.out.println("Actividades:"+planefa.getActividadesPas().getProgramacion().size());
        for (Actividad actividadRow : planefa.getActividadesPas().getProgramacion()) {
            ActividadPas actividad = (ActividadPas) actividadRow;
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
        Object value;
        switch (columnIndex) {
            case 0:
                value = this.actividades.get(rowIndex).getCorrelativo();
                break;
            case 1:
                value = this.actividades.get(rowIndex).getAnio();
                break;
            case 2:
                value = this.actividades.get(rowIndex).getSector().getNombre();                
                break;            
            case 3:
                value = this.actividades.get(rowIndex).getUnidadMedida().getNombre();
                break;
            case 4:
                value = this.actividades.get(rowIndex).getProgramacionEnero().toString();
                break;
            case 5:
                value = this.actividades.get(rowIndex).getProgramacionFebrero().toString();
                break;
            case 6:
                value = this.actividades.get(rowIndex).getProgramacionMarzo().toString();
                break;
            case 7:
                value = this.actividades.get(rowIndex).getProgramacionAbril().toString();
                break;
            case 8:
                value = this.actividades.get(rowIndex).getProgramacionMayo().toString();
                break;
            case 9:
                value = this.actividades.get(rowIndex).getProgramacionJunio().toString();
                break;
            case 10:
                value = this.actividades.get(rowIndex).getProgramacionJulio().toString();
                break;
            case 11:
                value = this.actividades.get(rowIndex).getProgramacionAgosto().toString();
                break;
            case 12:
                value = this.actividades.get(rowIndex).getProgramacionSeptiembre().toString();
                break;
            case 13:
                value = this.actividades.get(rowIndex).getProgramacionOctubre().toString();
                break;
            case 14:
                value = this.actividades.get(rowIndex).getProgramacionNoviembre().toString();
                break;
            case 15:
                value = this.actividades.get(rowIndex).getProgramacionDiciembre().toString();
                break;
            case 16:
                value = this.actividades.get(rowIndex).getMetaFisicaAnual().toString();
                break;
            case 17:
                value = this.actividades.get(rowIndex).getPresupuestoAnual();
                break;
            default:
                value = "";
                break;
        }
        return value;
    }
    
    @Override
    public String getColumnName(int col) {
       return this.columnNames[col];
    }
   
    @Override
    public Class getColumnClass(int col) {
         switch (col) {
             case 17:
                 return Double.class;
             case 1:
                 return String.class;
             default:
                 return String.class;
         }
    }
}
