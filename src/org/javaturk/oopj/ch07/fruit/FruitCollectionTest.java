package org.javaturk.oopj.ch07.fruit;

public class FruitCollectionTest {

	public static void main(String[] args) {
//		run1();
		run2();
//		run3();
	}

	public static void run1(){
		FruitCollection coll = new FruitCollection();
		coll.add(new Melon());
		coll.add(new Banana());
		coll.add(new Apple());

		Fruit f = coll.get(0);
		f.eat();
//		f.cut();
//		System.out.println(o.toString());

//		Melon m = f;
		Melon m = (Melon) f;   // Isn’t this risky? Are you sure it is a melon?
		m.cut();
		m.eat();
		
		f = coll.get(1);
		Banana b = (Banana) f;   // Isn’t this risky? Are you sure it is a banana?
		b.peel();
		b.eat();

		f = coll.get(2);
		Apple a = (Apple) f;   // Isn’t this risky? // Are you sure it is a apple?
		a.eat();
	}

	public static void run2(){
		FruitCollection coll = FruitCollection.getInstance();

		Object o = coll.get(0);
		Melon m = (Melon) o;   // Isn’t this risky? Are you sure it is a melon?
		m.cut();
		m.eat();
	}

	public static void run3(){
		FruitCollection coll = FruitCollection.getInstance();

		Object o = coll.get(0);
		if(o instanceof Melon) {
			Melon m = (Melon) o;   // Isn’t this risky? Are you sure it is a melon?
			m.cut();
			m.eat();
		}
		else if(o instanceof Apple) {
			Apple a = (Apple) o;   // Isn’t this risky? Are you sure it is a melon?
			a.eat();
		}
		else if(o instanceof Banana) {
			Banana b = (Banana) o;   // Isn’t this risky? Are you sure it is a melon?
			b.peel();
			b.eat();
		}
	}

	public static void run4(){
		FruitCollection coll = FruitCollection.getInstance();

		Object o = coll.get(0);

		if(o instanceof Melon m) {
			m.cut();
			m.eat();
		}
		else if(o instanceof Apple a) {
			a.eat();
		}
		else if(o instanceof Banana b) {
			b.peel();
			b.eat();
		}
	}
}
