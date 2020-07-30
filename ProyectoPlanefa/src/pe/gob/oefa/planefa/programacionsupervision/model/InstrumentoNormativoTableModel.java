
package pe.gob.oefa.planefa.programacionsupervision.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.planefa.Planefa;

public class InstrumentoNormativoTableModel extends AbstractTableModel {
   
    private final String[] columnNames = {
        "N°", "Función normada", "Instrumento normativo a aprobarse",
        "Enero", "Febrero", "Marzo", "Abril", 
        "Mayo", "Junio", "Julio", "Agosto", 
        "Septiembre", "Octubre", "Noviembre", "Diciembre", 
        "Presupuesto anual"};
    private final ArrayList<ActividadInstrumentoNormativo> actividades;
    
    public InstrumentoNormativoTableModel(Planefa planefa) {
        actividades = new ArrayList<>();
        System.out.println("Actividades:"+planefa.getActividadesInstrumentoNormativo().getProgramacion().size());
        for (Actividad actividadRow : planefa.getActividadesInstrumentoNormativo().getProgramacion()) {
            ActividadInstrumentoNormativo actividad = (ActividadInstrumentoNormativo) actividadRow;
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
                value = this.actividades.get(rowIndex).getFuncionNormada();
                break;
            case 2:
                value = this.actividades.get(rowIndex).getInstrumentoNormativo();                
                break;            
            case 3:
                System.out.println("rowIndex:"+rowIndex);
                System.out.println("Mes0:"+this.actividades.get(rowIndex));
                System.out.println("Mes1:"+this.actividades.get(rowIndex).getMes());
                System.out.println("Mes2:"+Meses.Enero.getDescription());
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Enero.getDescription()))
                    value = "X";
                else
                    value = "";
                break;
            case 4:
                System.out.println("Mes1:"+this.actividades.get(rowIndex).getMes());
                System.out.println("Mes2:"+Meses.Enero.getDescription());
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Febrero.getDescription()))
                    value = "X";
                else
                    value = "";
                break;
            case 5:
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Marzo.getDescription()))
                    value = "X";
                else
                    value = "";
                break;
            case 6:
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Abril.getDescription()))
                    value = "X";
                else
                    value = "";
                break;
            case 7:
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Mayo.getDescription()))
                    value = "X";
                else
                    value = "";
                break;
            case 8:
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Junio.getDescription()))
                    value = "X";
                else
                    value = "";
                break;
            case 9:
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Julio.getDescription()))
                    value = "X";
                else
                    value = "";
                break;
            case 10:
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Agosto.getDescription()))
                    value = "X";
                else
                    value = "";
                break;
            case 11:
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Septiembre.getDescription()))
                    value = "X";
                else
                    value = "";
                break;
            case 12:
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Octubre.getDescription()))
                    value = "X";
                else
                    value = "";
                break;
            case 13:
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Noviembre.getDescription()))
                    value = "X";
                else
                    value = "";
                break;
            case 14:
                if(this.actividades.get(rowIndex).getMes().equalsIgnoreCase(Meses.Diciembre.getDescription()))
                    value = "X";
                else
                    value = "";
                break;            
            case 15:
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
             case 15:
                 return Double.class;
             case 1:
                 return String.class;
             default:
                 return String.class;
         }
    }
}
