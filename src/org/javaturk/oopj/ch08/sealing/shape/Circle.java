package org.javaturk.oopj.ch08.sealing.shape;

import static java.lang.Math.PI;

public final class Circle extends Shape {
    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public void erase() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public double calculateArea() {
        return PI * r * r;
    }

    @Override
    public double calculateCircumference() {
        return 2 * PI * r;
    }
}
