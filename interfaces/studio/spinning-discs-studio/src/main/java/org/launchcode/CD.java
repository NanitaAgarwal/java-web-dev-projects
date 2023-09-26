package org.launchcode;

import java.util.*;

public class CD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private final Integer minRPM = 200;
    private final Integer maxRPM = 500;

    public CD(Integer storageCapacity, Integer minRPM, Integer maxRPM, Integer storageUsed) {
        super(storageCapacity, minRPM, maxRPM, storageUsed);
    }

    @Override
    public void reportInformation() {
        //TODO: Implement For loop that prints out each key and data pair

        HashMap<String, Integer> infoToReport = getStoredInformation();

        if (infoToReport.isEmpty()){
            System.out.println("No data on the disc");
            return;
        }

        System.out.println("Here is the info stored on the disc: ");
        for ( Map.Entry<String, Integer> item : infoToReport.entrySet()){
            System.out.println("Name: " + item.getKey() + " | Size: " + item.getValue());
        }
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + minRPM + " - " + maxRPM + ".\n");
    }

    @Override
    public HashMap<String, Integer> readData() {
        return getStoredInformation();
    }
}
