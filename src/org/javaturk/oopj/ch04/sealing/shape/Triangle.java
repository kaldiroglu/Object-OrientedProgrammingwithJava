package org.javaturk.oopj.ch04.sealing.shape;

//public class Triangle extends Shape{
public class Triangle{
    private int height;
    private int base;

    public Triangle(int height, int base){
//        super("Triangle");
        this.height = height;
        this.base = base;
    }

//    @Override
    public void draw() {
        System.out.println("Drawing a triangle with height: " + height + " and base: " + base);
    }
}
