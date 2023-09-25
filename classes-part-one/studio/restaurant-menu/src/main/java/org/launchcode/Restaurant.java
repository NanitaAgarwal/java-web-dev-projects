package org.launchcode;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem pavBhaji = new MenuItem("Pav Bhaji", 5,"Pav Bhaji","Appetizer");
        MenuItem samosa = new MenuItem("Samosa",3,"Samosa","Appetizer");
        MenuItem pizza = new MenuItem("Pizza", 5,"Pizza","Main Course");
        MenuItem pasta = new MenuItem("Pasta", 5,"Pasta","Main Course");
        MenuItem biryani = new MenuItem("Biryani", 5,"Biryani","Main Course");
        MenuItem iceCream = new MenuItem("Ice Cream", 5,"Ice Cream","Desert");
        MenuItem paneerMasala = new MenuItem("Paneer Butter Masala", 5,"Paneer Butter Masala","Main Course");
        MenuItem roti = new MenuItem("Roti", 5,"Roti","Main Course");
        MenuItem noodles = new MenuItem("Noodles", 5,"Noodles","Appetizer");
        MenuItem applepie = new MenuItem("Apple Pie", 5,"Apple Pie","Desert");

        Menu.addMenuItem(pavBhaji);
        Menu.addMenuItem(samosa);
        Menu.addMenuItem(pizza);
        Menu.addMenuItem(pasta);
        Menu.addMenuItem(biryani);
        Menu.addMenuItem(iceCream);
        Menu.addMenuItem(paneerMasala);
        Menu.addMenuItem(roti);
        Menu.addMenuItem(noodles);
        Menu.addMenuItem(applepie);

        Menu.displayMenuItem();
    }


}
