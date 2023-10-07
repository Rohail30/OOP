package com.company;

import java.util.Arrays;

public class Cars {
    private double price;
    private String make;
    private int year;
    private String color;
    private String[] parts;


    public Cars(double price, String make, int year, String color, String[] parts) {
        this.price = price;
        this.make = make;
        this.year = year;
        this.color = color;
        this.parts= Arrays.copyOf(parts,parts.length);
    }
    public Cars(Cars source){
        this.make = source.make;
        this.price = source.price;
        this.color = source.color;
        this.year = source.year;
        this.parts=Arrays.copyOf(source.parts,source.parts.length);
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drive(){
        System.out.println("You bought the beautiful car from the year"+getYear()+" of color"+getColor()+" for $"+getPrice()+" of manufacturer "+getMake());
        System.out.println("Please drive your car to the nearest exit");
    }

    public void sell(){

    }

    @Override
    public String toString() {
        return "Cars{" +
                "price=" + price +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", parts=" + Arrays.toString(parts) +
                '}';
    }
}


