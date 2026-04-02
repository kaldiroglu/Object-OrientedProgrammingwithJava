package org.javaturk.oopj.ch07.factory.downcast;

import org.javaturk.oopj.ch07.factory.domain.*;
import org.javaturk.oopj.ch07.factory.hr.HR;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class SwitchPatternMatching {

    public static void main(String[] args) {
//        run1();
//        run2();
        run3();
//        run4();
    }

    public static void run1() {
        Object object = new ObjectFactory().createObject();
//        Object object = null;

        switch (object) {
            case null -> System.out.println("Null");
            case String s -> System.out.println(String.format("String and its first char: %s", s.charAt(0)));
//            case String s -> System.out.println(String.format("String and its value: %s", s)); // Error:
            case Integer i -> System.out.println(String.format("Integer and its value: %s", i));
            case Boolean b -> System.out.println(String.format("Boolean and its value: %s", b));
            case LocalDateTime ldt -> System.out.println(String.format("LocalDateTime and its value: %d", ldt.getYear()));
            case Object obj -> System.out.println(String.format("Object and its value: %s", obj));

        }
    }
    public static void run2() {
        HR hr = new HR();
        Employee employee = hr.getAnEmployee();

        switch (employee) {
            case Director d1 -> d1.makeStrategicPlan();
            case Manager m -> m.manage();
//            case Manager m1 -> m1.manage(); // Error! The upper line catches Manager type!
            case Secretary s -> s.serve();
            case Engineer e -> e.assignTask("A new task.");
//            default -> employee.work();
            case Employee emp -> emp.work();
        }
    }

    public static void run3() {
        Object object = new ObjectFactory().createObject();

        switch (object) {
            case String s when s.length() > 20 ->
                    System.out.println(String.format("String with a length more than 20 chars: %s has %d chars", s, s.length()));
            case String s when s.length() < 20 ->
                    System.out.println(String.format("String with a length less than 20 chars: %s has %d chars", s, s.length()));
            case Integer i1 when i1 > 0 -> System.out.println(String.format("Positive integer: %s", i1));
            case Integer i2 when i2 < 0 -> System.out.println(String.format("Negative integer: %s", i2));
            case Boolean b1 when b1 -> System.out.println(String.format("Boolean: %s", b1));
            case Boolean b2 when !b2 -> System.out.println(String.format("Boolean: %s", b2));
            case LocalDateTime ldt when ldt.getYear() == 2024 -> System.out.println(String.format("In 2024: %s", ldt));
            case LocalDateTime ldt when ldt.get(ChronoField.YEAR) < 2024 ->
                    System.out.println(String.format("Before 2024: %s", ldt));
            case Character c -> System.out.println(String.format("Character: %s", c));
            case Object obj -> System.out.println(String.format("Object and its value: %s", obj));
//            default -> System.out.println("Naber?");
        }
    }
    public static void run4() {
        HR hr = new HR();
        Employee employee = hr.getAnEmployee();

        switch (employee) {
            case Director d when d.calculateSalary() > 50000 -> d.makeStrategicPlan();
            case Manager m when m.getYear() > 10 -> m.manage();
            case Secretary s when s.getManager().getName().equals("Kamil") -> s.serve();
            case Engineer e when e.getDepartment().equals("Production") -> e.assignTask("A new task.");
            case Employee emp1 when true -> emp1.work();
//            case Employee emp2 when !false -> emp2.work(); // Error: Duplicate unconditional pattern!
        }
    }

    public static void run5() {
        HR hr = new HR();
        Employee employee = hr.getAnEmployee();

        String role = switch (employee) {
            case Employee e -> { e.work(); yield "Employee";}
//            case Director d ->  {d.makeStrategicPlan(); yield "Director";} // Label is dominated by a preceding case label 'Employee e'
//            case Manager m -> {m.manage(); yield "Manager";} // Label is dominated by a preceding case label 'Employee e'
//            case Secretary s -> {s.serve(); yield "Secretary";} // Label is dominated by a preceding case label 'Employee e'
//            case Engineer e -> {e.assignTask("A new task."); yield "Engineer";} // Label is dominated by a preceding case label 'Employee e'
//            default -> "No role!"; // Error!'switch' has both unconditional pattern and a default label
        };

        System.out.println(role);
    }

    public static void run6() {
        HR hr = new HR();
        Employee employee = hr.getAnEmployee();

        String role = switch (employee) {
            case Employee e -> {
                e.work();
                yield "Employee";
            }
//            case Director d ->  {d.makeStrategicPlan(); yield "Director";} // Label is dominated by a preceding case label 'Employee e'
//            case Manager m -> {m.manage(); yield "Manager";} // Label is dominated by a preceding case label 'Employee e'
//            case Secretary s -> {s.serve(); yield "Secretary";} // Label is dominated by a preceding case label 'Employee e'
//            case Engineer e -> {e.assignTask("A new task."); yield "Engineer";} // Label is dominated by a preceding case label 'Employee e'
//        default -> "No role!";
        };

        System.out.println(role);
    }
}

class ObjectFactory {
    Object createObject() {
        Object o = null;

        int i = (int) (10 * Math.random());

        return switch (i) {
            case 0:
                yield "I love Java!";
            case 1:
                yield 5;
            case 3:
                yield true;
            case 4:
                yield LocalDateTime.now();
            case 5:
                yield "I love Java very very much!";
            case 6:
                yield -100;
            case 7:
                yield false;
            case 8:
                yield LocalDateTime.now().minusDays(365);
            case 9:
                yield 'J';
            default:
                yield new Object();
        };
    }
}
