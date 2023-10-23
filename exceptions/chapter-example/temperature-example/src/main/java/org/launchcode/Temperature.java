package org.launchcode;

public class Temperature {
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

//        if (aFahrenheit < absoluteZeroFahrenheit) {
////            System.out.println("Value is below absolute zero!");
//            try {
//                throw new TemperatureException("Value is below absolute zero!");
//            } catch (TemperatureException e) {
//                e.printStackTrace();
//            }
//        }

        try {
            if (aFahrenheit < absoluteZeroFahrenheit) {
                throw new TemperatureException("Value you have entered "+aFahrenheit+" is below absolute zero!");
            }
        } catch (TemperatureException e) {
                e.printStackTrace();
                aFahrenheit = absoluteZeroFahrenheit;
            }

        fahrenheit = aFahrenheit;
    }
}
