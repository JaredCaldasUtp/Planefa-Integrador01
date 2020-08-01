
package pe.gob.oefa.planefa.view.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pe.gob.oefa.planefa.bo.planefa.Planefa;
import pe.gob.oefa.planefa.resources.PlanefaUtils;

public class PlanefaTableModel extends AbstractTableModel {
   
    private final String[] columnNames = {
        "EFA", "Año","Usuario", "Ambito", "OD Competente", "Estado", "Fecha de envío"};
    private final List<Planefa> listado;
    
    public PlanefaTableModel(List<Planefa> listado) {
        this.listado = new ArrayList<>();
        System.out.println("listado:"+listado.size());
        for (Planefa row : listado) {            
            this.listado.add(row);
        }
    }

    @Override
    public int getRowCount() {
        int size;
        if (this.listado == null) {
            size = 0;
        } else {
            size = this.listado.size();
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
                value = this.listado.get(rowIndex).getEfa().getNombre();
                break;
            case 1:
                value = this.listado.get(rowIndex).getPeriodo().getAnio().toString();
                break;
            case 2:
                if(this.listado.get(rowIndex).getEfa().getAmbito()!=null)
                    value = this.listado.get(rowIndex).getEfa().getAmbito().getNombre();
                else
                    value = "";
                break;
            case 3:
                if(this.listado.get(rowIndex).getEfa().getOficinaDesconcentrada()!=null)
                    value = this.listado.get(rowIndex).getEfa().getOficinaDesconcentrada().getNombre();
                else
                    value = "";
                
                break;
            case 4:
                if(this.listado.get(rowIndex).getEstadoPlanefa()!=null)
                    value = this.listado.get(rowIndex).getEstadoPlanefa().getNombre();                
                else
                    value = "Pendiente"; 
                break;            
            case 5:
                if(this.listado.get(rowIndex).getFechaEnvio()!=null)
                    value = PlanefaUtils.dateToString(this.listado.get(rowIndex).getFechaEnvio());
                else
                    value = "";
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
            case 1:
                return Integer.class;            
            default:
                return String.class;
        }
   }
    
}
