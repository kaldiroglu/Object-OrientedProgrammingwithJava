
package org.javaturk.oopj.ch14.util;

import org.javaturk.oopj.ch14.domain.Employee;

import java.util.*;

public class CollectionUtil {
    private static Set<String> stringSet;
    private static Set<Integer> intSet;

    static {
        stringSet = new HashSet<>();
        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("three");
        stringSet.add("four");
        stringSet.add("five");

        intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(10);
        intSet.add(100);
        intSet.add(1000);
    }

    public static Collection<String> getCollection() {
        return stringSet;
    }

    public static Collection<Integer> getIntCollection() {
        return intSet;
    }

    public static Set getEmptySet() {
        return new HashSet();
    }

    public static void listElements(Collection coll) {
        System.out.println("\n******      Elements  in  the  Collection      ******");
        for (Object o : coll)
            System.out.println(o);
        System.out.println("****************************************************\n");
    }

    public static void listElements(List list) {
        System.out.println("\n******      Elements  in  the  List      ******");
        ListIterator i = list.listIterator();
        while (i.hasNext())
            System.out.println(i.nextIndex() + ": " + i.next());

        System.out.println("****************************************************\n");
    }

    public static void listElements(Map<Object, Object> map) {
        System.out.println("\n******      Elements  in  the  Map      ******");
        Set<Object> keys = map.keySet();
        Iterator<Object> i = keys.iterator();
        while (i.hasNext()) {
            Object key = i.next();
            Object value = map.get(key);
            System.out.println(key + " - " + value);
        }
        System.out.println("****************************************************\n");
    }

    public static Set<String> getSet() {
        return (Set<String>) getCollection();
    }

    public static List<String> getStringList() {
        return new ArrayList<String>(getSet());
    }

    public static Map<String, Integer> getMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("five", 5);
        map.put("eleven", 11);
        map.put("nineteen", 19);
        map.put("ondokuz", 19);
        return map;
    }

    public static List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(999, "Salih", "Guzel", 3));
        employees.add(new Employee(111, "Mihrimah", "Kaldiroglu", 5));
        employees.add(new Employee(222, "Ali", "Can", 3));
        employees.add(new Employee(333, "Salih", "Ozturk", 11));
        employees.add(new Employee(444, "Ali", "Mutlu", 12));
        employees.add(new Employee(555, "Turgut", "Yesil", 1));
        employees.add(new Employee(666, "Zeynep", "Telli", 2));
        employees.add(new Employee(777, "Selin", "Guclu", 20));
        employees.add(new Employee(888, "Mahmut", "Telli", 12));

        return employees;
    }

    public static Collection getCollectionWithDuplicates() {
        List list = new ArrayList();
        list.add(3);
        list.add("Veli");
        list.add(3);
        list.add("Veli");
        list.add("Televizyon");
        list.add(new Date());
        return list;
    }

    public static Collection getAnotherCollection() {
        Set<String> set = new HashSet<>();
        set.add("hundered");
        set.add("thousand");
        set.add("ten thousand");
        set.add("hundred thousand");
        set.add("million");
        return set;
    }

    public static List getList() {
        List list = new ArrayList(); // Change it to LinkedList to see if there is any effect!
        list.add(3);
        list.add("Akin");
        list.add(3);
        list.add("Veli");
        list.add("Televizyon");
        list.add(new Date());
        list.add(3);
        return list;
    }
}
