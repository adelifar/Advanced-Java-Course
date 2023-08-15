package model;

import java.util.ArrayList;

public class Section{
    private ArrayList<Item> items;

    public Section() {
        items=new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
