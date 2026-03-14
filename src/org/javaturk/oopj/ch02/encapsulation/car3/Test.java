package org.javaturk.oopj.ch02.encapsulation.car3;

public class Test {

    public static void main(String[] args) {
//        Car car = new Car("Mercedes", "A200", "2024", 0, 0);
//        car.accelerate(100);

        F1Car f1Car = new F1Car("Mercedes", " F1", "2024", 0, 0, "Mercedes");
//        f1Car.accelerate(200);
        f1Car.startRace(600);
    }
}
