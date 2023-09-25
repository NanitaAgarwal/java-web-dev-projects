package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private static ArrayList<MenuItem> mainMenu = new ArrayList<>();

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public static ArrayList<MenuItem> getMainMenu() {
        return mainMenu;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public static void addMenuItem(MenuItem itemToAdd){
       mainMenu.add(itemToAdd);
    }
    public static void removeMenuItem(MenuItem itemToRemove){
        mainMenu.remove(itemToRemove);
    }

//    @Override
//    public String toString(){
//        String text = MenuItem
//    }

    public static void displayMenuItem(){

        for (MenuItem displayItem : mainMenu)
        {
            System.out.println(displayItem);
        }
    }

}
