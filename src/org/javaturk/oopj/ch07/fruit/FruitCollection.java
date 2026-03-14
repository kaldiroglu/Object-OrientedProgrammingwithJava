package org.javaturk.oopj.ch07.fruit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FruitCollection {
    private List list = new ArrayList();

    public void add(Fruit fruit) {
        list.add(fruit);
    }

    public Fruit get(int index) {
        return (Fruit) list.get(index);
    }

    public int getSize(){
        return list.size();
    }

    public static FruitCollection getInstance(){
        FruitCollection coll = new FruitCollection();
        coll.add(new Apple());
        coll.add(new Apple());
        coll.add(new Apple());
        return coll;
    }
}
