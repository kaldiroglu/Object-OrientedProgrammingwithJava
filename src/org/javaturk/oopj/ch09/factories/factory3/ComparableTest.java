package org.javaturk.oopj.ch09.factories.factory3;

public class ComparableTest {
    static void main() {
        HR hr = new HR();

        Employee e1 = hr.getAnEmployee();
        System.out.println(e1);

        Employee e2 = hr.getAnEmployee();
        System.out.println(e2);

        if(e1 instanceof Comparable)
            System.out.println("It is Comparable!");
        else
            System.out.println("It is NOT Comparable!");

        System.out.println(e1);
        System.out.println(e2);


        int comparison = e1.compareTo(e2);
		System.out.println("\nComparison: " + comparison);

		comparison = e2.compareTo(e1);
		System.out.println("Comparison: " + comparison);

		comparison = e1.compareTo(e1);
		System.out.println("Comparison: " + comparison);
    }
}
