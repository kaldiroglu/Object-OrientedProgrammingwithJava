package org.javaturk.oopj.ch09.factories.factory3;

public class InstanceOfExample {

    public static void main(String[] args) {

        HR hr = new HR();
        int n = 10;
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++)
            employees[i] = hr.getAnEmployee();

        for (Employee e : employees) {
            if (e instanceof Comparable)
                System.out.println("It is Comparable!");
            else
                System.out.println("It is NOT Comparable!");
        }
    }
}
