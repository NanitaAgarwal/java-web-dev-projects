package org.launchcode;

import java.util.*;
import java.time.LocalDate;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

//    public Menu(LocalDate lastUpdated, ArrayList<MenuItem> item) {
//        this.lastUpdated = lastUpdated;
//        this.menuItems = item;
//    }

//    public void setLastUpdated(LocalDate lastUpdated) {
//        this.lastUpdated = lastUpdated;
//    }

//    public void setItems(ArrayList<MenuItem> items) {
//        this.menuItems = items;
//    }

//    public LocalDate getLastUpdated() {
//        return lastUpdated;
//    }

//    public ArrayList<MenuItem> getItems() {
//        return menuItems;
//    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("Appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("Main Course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("Dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "Nannu's Kitchen\n" +
                 "---------------\n" +
                "Updated: " + lastUpdated + "\n\n" +
                "APPETIZER:" + appetizers.toString() + "\n" +
                "MAIN COURSE:" + mainCourses.toString() + "\n" +
                "DESSERTS:" + desserts.toString() + "\n";

//        return "Menu{" +
//                "lastUpdated=" + lastUpdated +
//                ", items=" + menuItems +
//                '}';
    }

    public void addItem(MenuItem newItem){
        if (!this.checkItem(newItem)) {
            menuItems.add(newItem);
            System.out.println(newItem.getName()+" added to the Menu.\n");
        } else {
            System.out.println("WARNING:\n--------\n" + newItem.getName() + " already exists in the Menu.\n");
        }
        lastUpdated = LocalDate.now();
    }

    public void removeItem(MenuItem oldItem){
        menuItems.remove(oldItem);
        System.out.println(oldItem.getName()+" removed from the Menu.\n");
        lastUpdated = LocalDate.now();
    }

    public Boolean checkItem(MenuItem chkItem){
        return(menuItems.contains(chkItem));
    }
}


