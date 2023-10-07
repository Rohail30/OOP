package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Outlander outlander =  new Outlander(36);
        outlander.Steer(45);
        outlander.printWheels();
        Car c = new Car("A","Big",4,4,5,true);
        c.ChangeVelocity(22,90);

    }
}
