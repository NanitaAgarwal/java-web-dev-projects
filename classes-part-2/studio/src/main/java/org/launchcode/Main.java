package org.launchcode;

public class Main {

    public static void main(String[] args) {

        // Create 5 Menu Items
        MenuItem item01 = new MenuItem("Vada Pav", 5.50, "Savory and spicy soft dinner rolls stuffed with a fried batter coated potato dumpling fritter and laced with spicy and sweet chutneys", "Appetizer");
        MenuItem item02 = new MenuItem("Paneer Biryani", 11.00, "Mildly spiced and delicately flavored dum/slow cooked layered casserole of paneer cubes in a curd (yogurt) based gravy, fried onions and par-cooked rice flavored with spices, saffron or rose water", "Main Course");
        MenuItem item03 = new MenuItem("Jalebi", 7.50, "Spiral shaped crisp & juicy sweet made with all-purpose flour, gram flour and sugar syrup", "Dessert");
        MenuItem item04 = new MenuItem("Puri",5.00,"Indian fried bread made with wheat flour, salt and water","Main Course");
        MenuItem item05 = new MenuItem("Aloo Sabzi",6.0,"Indian curry made with potatoes, sauteed onions, tomatoes, ginger, garlic, spices and herbs","Main Course");

        // Create Menu
        Menu menu = new Menu();

        // Adding the 5 MenuItems to Menu
        menu.addItem(item01);
        menu.addItem(item02);
        menu.addItem(item03);
        menu.addItem(item04);
        menu.addItem(item05);

        // For Bonus Mission test .. Trying to add an existing item.
        menu.addItem(item05);

        // Printing the Menu after Adding 5 Menu Items
        System.out.println(menu);

        // Removing 2 MenuItems from Menu
        menu.removeItem(item04);
        menu.removeItem(item05);

        // Printing the Menu after Deletion of 2 MenuItems
        System.out.println(menu);

        // Testing "equals" method
        System.out.println(item01.equals(item02));

        // Creating MenuItem same as an existing MenuItem to test "equals" method
        MenuItem item06 = new MenuItem("Aloo Sabzi",6.0,"Indian curry made with potatoes, sauteed onions, tomatoes, ginger, garlic, spices and herbs","Main Course");

        // Testing "equals" method
        System.out.println(item05.equals(item06));

        // Printing a MenuItem
        System.out.println(item04);

    }
}