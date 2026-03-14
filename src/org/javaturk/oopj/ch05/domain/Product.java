package org.javaturk.oopj.ch05.domain;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 * </p>
 */
public class Product {
    int no;
    String name;
    double price;

    public Product(int no, String name, double price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [no=" + no + ", name=" + name + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object o) {
        Product p1 = (Product) o;
        boolean b = false;
//        if (no == p1.no & price == p1.price & name.toLowerCase().equals(p1.name.toLowerCase()))
        if (no == p1.no)
            b = true;
        return b;
    }

//    @Override
//	public boolean equals(Object o) {
//		Product p1 = (Product)o;
//		boolean b = false;
//		if (no == p1.no)
//			b = true;
//		return b;
//	}

    public int hashCode() {
        return no + (int) price + name.toLowerCase().hashCode();
    }

//	public int hashCode(){
//		return no;
//	}

	public Object clone() {
        return new Product(no, name, price);
	}
}
