package com.shoppinglist.bean;

import com.shoppinglist.transport.ItemDTO;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

@SessionScoped
@Named("listBean")
public class ListBean implements Serializable {

    private ItemDTO item = new ItemDTO();
    private MeasureEnum measureChoice;
    private List<ItemDTO> list = new ArrayList<>();
    private List<String> selectedItems = new ArrayList<>();
    private EnumSet<MeasureEnum> measureList = EnumSet.allOf(MeasureEnum.class);

    // GETTERS AND SETTERS
    public ItemDTO getItem() {
        return item;
    }

    public void setItem(ItemDTO item) {
        this.item = item;
    }

    public MeasureEnum getMeasureChoice() {
        return measureChoice;
    }

    public void setMeasureChoice(MeasureEnum measureChoice) {
        this.measureChoice = measureChoice;
    }

    public List<ItemDTO> getList() {
        return list;
    }

    public void setList(List<ItemDTO> list) {
        this.list = list;
    }

    public List<String> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(List<String> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public EnumSet<MeasureEnum> getMeasureList() {
        return measureList;
    }

    public void setMeasureList(EnumSet<MeasureEnum> measureList) {
        this.measureList = measureList;
    }

    // METHODS
    public void add() {
        list.add(item);
        item = new ItemDTO();
    }

    public void remove() {
        for (String item : selectedItems) {
            list.removeIf(i -> i.getName().equalsIgnoreCase(item));
        }
    }
}
