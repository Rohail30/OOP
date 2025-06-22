package com.company;

public class Dealership {
    private Cars[] cars;
    private Cars car;


    public Dealership(){
        this.cars = new Cars[3];
    }

    public void setCars(Cars cars,int index) {
        this.cars[index] = cars;
    }
    public Cars getCars(int index){
        return this.cars[index];
    }
    public void sell(int index){
        this.cars[index].drive();
        this.cars[index]=null;
    }
    public String search(String make,double budget){
        for (int i = 0; i <this.cars.length ; i++) {
            if(this.cars[i]==null) {
                continue;
            }
            else if(this.cars[i].getMake().equals(make) && this.cars[i].getPrice()<= budget){
                return " We found one in spot: "+i+"\n"+this.cars[i].toString()+"\n Are you interested ?";
            }
        }
        return "Sorry we couldn't find any car on your budget!";
    }

    public void printCar(Cars car){
        System.out.println(car);
    }

}
