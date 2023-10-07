package com.company;

public class Outlander extends Car{
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths){
        super("Out lander","4WD",4,5,6,false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void printWheels(){
        System.out.println(getWheels());
    }
}
