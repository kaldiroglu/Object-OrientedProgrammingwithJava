package org.javaturk.oopj.ch02.factories.factory3;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 * </p>
 */
public class Manager extends Employee {
    protected String departmentManaged;

    public static final int MANAGEMENT_PAYMENT = 5000;

    public Manager(){

    }

    // Olması gereken!
//    public Manager(int no, String name, int year, String workingDepartment, String departmentManaged) {
//        super(no, name, year, workingDepartment);
//        this.departmentManaged = departmentManaged;
//        System.out.println("in Manager()");
//    }

    // Olmaması gereken!
    public Manager(int no, String name, int year, String workingDepartment, String departmentManaged) {
        super();
        this.no = no;   // Kod tekrarı
        this.name = name;   // Kod tekrarı
        this.year = year;   // Kod tekrarı
        this.department = workingDepartment;   // Kod tekrarı
        this.departmentManaged = departmentManaged;
        System.out.println("in Manager()");
    }
}
