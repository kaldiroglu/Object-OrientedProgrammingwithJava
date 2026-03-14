package org.javaturk.oopj.ch07.factory.downcast;

import org.javaturk.oopj.ch07.factory.hr.HR;
import org.javaturk.oopj.ch07.factory.domain.*;

public class InstanceofExample {

    public static void main(String[] args) {
//		 run1();
//        run2();
//        run3();
        run4();
    }

    /**
     * Some examples of instanceof
     */
    public static void run1() {
        Employee e1 = new Employee(1, "Ali", 4, "Production");

        if (e1 instanceof Manager) {
            System.out.println("e1 is an instance of Manager");
            Manager m1 = (Manager) e1;
            System.out.println(m1.toString());
        } else
            System.out.println("e1 isn't an instance of Manager");

        System.out.println();

        Employee e2 = new Manager(5, "İsmail", 14, "Production", "Production");
        if (e2 instanceof Manager) {
            System.out.println("e2 is an instance of Manager");
            Manager m2 = (Manager) e2;
            m2.manage();
        } else
            System.out.println("e2 isn't an instance of Manager");

        System.out.println();

        Employee e3 = new Manager(5, "İsmail", 14, "Production", "Production");

        boolean b = e3 instanceof Director;
        if (b) {
            System.out.println("e3 is an instance of Director");
            Director d1 = (Director) e3;
        } else
            System.out.println("e3 isn't an instance of Director");
    }

    /**
     * Misuse of instanceof in if-else if statement
     */
    public static void run2() {
        Employee e1 = new Director(4, "Mehmet", 20, "Management", "Management", 3000);

        HR hr = new HR();
        e1 = hr.getAnEmployee();
        // Do not use instanceof in if-else statements starting from most generic type!
        if (e1 instanceof Employee)
            e1.work();
         else if (e1 instanceof Manager) {
			Manager m1 = (Manager) e1;
            m1.manage();
        } else if (e1 instanceof Director) {
            Director d1 = (Director) e1;
            d1.makeStrategicPlan();
        }
    }

    /**
     * Correct use of instanceof in if-else if statement
     */
    public static void run3() {
        HR hr = new HR();
        Employee e1 = hr.getAnEmployee();
        if (e1 instanceof Director) {
            System.out.println("Instance of Director");
            Director d1 = (Director) e1;
            d1.makeStrategicPlan();
        } else if (e1 instanceof Manager) {
            System.out.println("Instance of Manager");
            Manager m1 = (Manager) e1;
            m1.manage();
        } else if (e1 instanceof Employee) {
            System.out.println("Instance of Employee");
            e1.work();
        } else
            System.out.println("Not an instance of Employee!");
    }

    /**
     * Use of null reference in instanceof in if-else if statement
     */
    public static void run4() {
        Employee e1 = null;

        if (e1 instanceof Director) {
            System.out.println("Instance of Director");
            Director d1 = (Director) e1;
            d1.makeStrategicPlan();
        } else if (e1 instanceof Manager) {
            System.out.println("Instance of Manager");
            Manager m1 = (Manager) e1;
            m1.manage();
        } else if (e1 instanceof Employee) {
            System.out.println("Instance of Employee");
            e1.work();
        } else
            System.out.println("Not an instance of Employee!");
    }
}
