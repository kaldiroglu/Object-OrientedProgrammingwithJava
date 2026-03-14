package org.javaturk.oopj.ch02.encapsulation.car2;

public class Car{

    protected String make;
    protected String model;
    protected String year;
    protected int speed;
    protected int distance;
    protected boolean convertable;

    public Car(String make, String model, String year, int speed, int distance, boolean convertable) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.distance = distance;
        this.convertable =  convertable;
    }

    public double go(int newDistance) {
        distance += newDistance;
        double period = (double) newDistance / speed;
        return period;
    }

    public void accelerate(int newSpeed) {
        speed = newSpeed;
    }

    public void stop() {
        speed = 0;
    }

    public String getInfo() {
        return "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
    }
}