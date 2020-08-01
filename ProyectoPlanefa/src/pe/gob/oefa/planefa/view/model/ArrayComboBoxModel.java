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

public class ArrayComboBoxModel extends AbstractListModel implements ComboBoxModel {

    String selection = null;
    
    private final List<String> items;
    
    public ArrayComboBoxModel(List<String> items) {
        List<String> itemsLocal = new ArrayList<>();
        itemsLocal.add("-Seleccione-");
        itemsLocal.addAll(items);
        this.items = itemsLocal;
    }

    @Override
    public Object getElementAt(int index) {
        return items.get(index);
    }

    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selection = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selection;
    }
    
}
