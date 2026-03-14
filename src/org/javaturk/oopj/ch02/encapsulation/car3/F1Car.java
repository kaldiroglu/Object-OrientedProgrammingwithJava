package org.javaturk.oopj.ch02.encapsulation.car3;

public class F1Car extends Car {
    private String team;

    public F1Car(String make, String model, String year, int speed, int distance, String team) {
        super(make, model, year, speed, distance);
        this.team = team;
    }

    /**
     * What happens to the performance of F1Car?
     */
    void startRace(int length){
        accelerate(300);
        double time = go(length);
        System.out.println("After " + time + " hour.");
        stop();
    }
}
