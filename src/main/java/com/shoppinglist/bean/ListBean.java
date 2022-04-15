package com.shoppinglist.bean;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@Named("listBean")
public class ListBean implements Serializable {

    private String item;
    private List<String> list = new ArrayList<>();
    private List<String> selectedItems = new ArrayList<>();

    // GETTERS AND SETTERS
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<String> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(List<String> selectedItems) {
        this.selectedItems = selectedItems;
    }

    // METHODS
    public void add() {
        list.add(item);
        item = "";
    }

    public void remove() {
        for (String item : selectedItems) {
            list.removeIf(value -> value.equalsIgnoreCase(item));
        }
    }
}
