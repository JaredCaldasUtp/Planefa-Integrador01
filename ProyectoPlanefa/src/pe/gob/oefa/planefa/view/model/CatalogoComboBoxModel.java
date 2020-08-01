/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.planefa.view.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import pe.gob.oefa.planefa.bo.catalogo.Catalogo;

public class CatalogoComboBoxModel extends AbstractListModel implements ComboBoxModel {

    String selection = null;
    
    private final List<Catalogo> items;
    
    public CatalogoComboBoxModel(List<Catalogo> items) {
        List<Catalogo> itemsLocal = new ArrayList<>();
        itemsLocal.add(new Catalogo("00","-Seleccione-"));
        itemsLocal.addAll(items);
        this.items = itemsLocal;
    }

    @Override
    public Object getElementAt(int index) {
        return items.get(index).getNombre();
    }

    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selection = (String) anItem; // to select and register an
    } // item from the pull-down list

    // Methods implemented from the interface ComboBoxModel
    @Override
    public Object getSelectedItem() {
        return selection; // to add the selection to the combo box
    }
    /*
    String itemsActividadOperativa[]=new String[]{"-Seleccione-","Seguimiento y verificación del cumplimiento de las obligaciones","Supervisión", "Evaluación de la calidad ambiental"}; 
    String itemsSectores[]=new String[]{"-Seleccione-","Agricultura","Comunicaciones", "Construcción"}; 
    String itemsObjetosSupervision[]=new String[]{"-Seleccione-","Residuos","Ruido", "Vertimientos", "Emisiones"}; 
    String itemsUnidadMedida[]=new String[]{"-Seleccione-","Informe de supervisión","Informe de evaluación", "Expediente concluido"}; 
    String itemsComponenteAmbiental[]=new String[]{"-Seleccione-","Agua","Aire", "Ruido", "Suelo"}; 
    String itemsTipoEvaluacion[]=new String[]{"-Seleccione-","Monitoreo","Vigilancia"}; 
    String itemsFuncionNormada[]=new String[]{"-Seleccione-","Evaluadora","Fiscalizadora - Sancionadora", "Supervisora"}; 
    */
}
