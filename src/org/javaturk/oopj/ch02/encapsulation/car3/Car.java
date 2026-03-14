package org.javaturk.oopj.ch02.encapsulation.car3;

public class Car{

    protected String make;
    protected String model;
    protected String year;
    protected int speed;
    protected int distance;

    public Car(String make, String model, String year, int speed, int distance) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.distance = distance;
    }

    public double go(int newDistance) {
        distance += newDistance;
        double period = (double) newDistance / speed;
        return period;
    }

    public void accelerate(int newSpeed) {
        System.out.println("Accelerating to " + newSpeed);
        int count = 0;
        while(speed < newSpeed){
            speed++;
            try {
                Thread.sleep(100); // Increasing speed 1 kph for each 0.1 second.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
        }
        System.out.printf("New speed is %d after %d milliseconds.", speed, 100 * count);
    }

    public void stop() {
        speed = 0;
    }

    public String getInfo() {
        return String.format("Car Info: %s %s %s. Distance: %d km. and traveling at %d kmph.", year, make, model, distance, speed);
    }
}