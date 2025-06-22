package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Cars[] cars = new Cars[]{
                new Cars(9000, "Nissan", 2020, "Red", new String[]{"Wheels", "Keys"}),
                new Cars(8000, "Honda", 2020, "Blue", new String[]{"Wheels", "Keys"}),
                new Cars(2000, "Toyota", 2020, "Blue", new String[]{"Wheels", "Keys"})
        };

        Dealership dealership = new Dealership();
        for (int i = 0; i <cars.length ; i++) {
            dealership.setCars(cars[i],i);
        }

        Cars car1 = new Cars(9000, "Nissan", 2020, "Red", new String[]{"Wheels", "Keys"});
        dealership.printCar(car1);

        //Scanner input = new Scanner(System.in);
        ////dealership.sell(2);
        //System.out.println("What is your budget");
        //double budget = input.nextDouble();
        //input.nextLine();
        //System.out.println("Which car make do you want?");
        //String make = input.nextLine();
        //System.out.println(dealership.search(make,budget));
        //System.out.println(cars[0].toString());

        //for (int i = 0; i < cars.length; i++) {
        //    System.out.println(cars[i].toString());
        //}
    }


}
