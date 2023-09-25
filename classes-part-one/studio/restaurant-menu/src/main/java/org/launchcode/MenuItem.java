package org.launchcode;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private Integer price;
    private final LocalDate dateAdded;

    public MenuItem(String name, Integer price, String description, String category) {
        LocalDate todaysDate = LocalDate.now();
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.dateAdded = todaysDate;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString(){
        String text = "\n" + name + (isNew() ? " - NEW !" : "") + "\n" + description + " || $" + price;
        return text;
    };

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return (daysBetween < 91);
    }
}
