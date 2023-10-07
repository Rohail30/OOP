package com.company;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size){
        this.name=name;
        this.size=size;
        this.currentDirection=0;
        this.currentVelocity=0;
    }
    public void Steer(int direction){
        this.currentDirection=+direction;
        System.out.println("Vehicle.steer(): Steering at "+currentDirection+" Degrees");
    }
    public void move(int velocity,int direction){
        currentDirection=direction;
        currentVelocity=velocity;
        System.out.println("Moving at "+currentVelocity+"in direction: "+currentDirection);
    }
    public void stop(){
        this.currentVelocity = 0;
    }

}
