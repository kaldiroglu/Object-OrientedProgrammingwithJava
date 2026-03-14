package org.javaturk.oopj.ch02.init;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 * </p>
 */
public class ClassInitializationForStatics {

    public static void main(String[] args) {
//        run1();
//        run2();
//        run3();
//        run4();
//        run5();
//        run6();
//        run7();
//        run8();
//        run9();
    }

    public static void run1() {
        ClassA.f();
    }

    public static void run2() {
        ClassB.f();
//        System.out.println(ClassB.j);
    }

    public static void run3() {
        ClassC.f();
    }

    public static void run4() {
        ClassA.f();
        ClassC.f();
    }

    public static void run5() {
        System.out.println("ClassA.i: " + ClassA.i);
        System.out.println("ClassB.i: " + ClassB.i);
        System.out.println("ClassC.i: " + ClassC.i);
    }

    public static void run6() {
        System.out.println(ClassC.j);
    }

    public static void run7() {
        new ClassA().f();
    }

    public static void run8() {
        new ClassB().f();
    }

    public static void run9() {
        new ClassC().f();
    }
}

class ClassA {
    public static int i = 5;

    static {
        int k = i;
        System.out.println("in static initializer block of ClassA");
    }

    protected static void f() {
        System.out.println("in f()");
    }
}

class ClassB extends ClassA {
    static int j = 5;

    static {
        System.out.println("in static initializer block of ClassB");
    }
}

class ClassC extends ClassB {
    static int k = 5;

    static {
        System.out.println("in static initializer block of ClassC");
    }
}
