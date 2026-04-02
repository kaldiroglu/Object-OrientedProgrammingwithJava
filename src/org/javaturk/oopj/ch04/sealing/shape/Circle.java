package org.javaturk.oopj.ch04.sealing.shape;

public final class Circle extends Shape  {
    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

//    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
