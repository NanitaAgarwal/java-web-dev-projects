package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD mixCD = new CD(250, 200, 500, 0);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        mixCD.spinDisc();
        mixCD.writeData("The Less I know the Better", 10);
        mixCD.writeData("Yes I'm Changing", 8);

    }
}