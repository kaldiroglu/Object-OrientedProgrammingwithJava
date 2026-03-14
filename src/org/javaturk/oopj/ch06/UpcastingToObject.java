package org.javaturk.oopj.ch06;

import java.time.ZonedDateTime;

public class UpcastingToObject {

    public static void main(String[] args) {
        String s = "Java";
        Object o = s;
        o = "Java";

        ZonedDateTime time = ZonedDateTime.now();
        o = time;
        o = ZonedDateTime.now();

        int[] ints = {1, 2, 3};
        o = ints;
        o = new int[]{1, 2, 3};

        Size smallSize = Size.SMALL;
        o = smallSize;
        o = Size.SMALL;

//        o.equals(o);
    }
}

enum Size{
    SMALL, MEDIUM, LARGE, X_LARGE
}
