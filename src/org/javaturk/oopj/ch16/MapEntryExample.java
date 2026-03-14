package org.javaturk.oopj.ch16;

import org.javaturk.oopj.ch14.util.CollectionUtil;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntryExample {
	public static void main(String[] args) {
		Map map = CollectionUtil.getMap();

		System.out.println("*** Entry set *** ");
		Set entrySet = map.entrySet();
		entrySet.forEach(System.out::println);

		System.out.println("\n*** Processing map entries ***");
		Iterator it = entrySet.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry) it.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " - " + value);
		}
		
		System.out.println();
		
		Comparator<Entry<String, Integer>> keyComparator = Entry.comparingByKey();
		Comparator<Entry<String, Integer>> valueComparator = Entry.comparingByValue();
		
		// Map.entry() creates a new Map.Entry object.
		Entry entryForAKeyAndValue1 = Map.entry("x", 100);
		Entry entryForAKeyAndValue2 = Map.entry("x", 100);
		Entry entryForAKeyAndValue3 = Map.entry("y", 1000);
		Entry entryForAKeyAndValue4 = Map.entry("five", 15);
		
		System.out.println("entryForAKeyAndValue1 ve entryForAKeyAndValue2 kıyası: " + keyComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue1));
		System.out.println("entryForAKeyAndValue1 ve entryForAKeyAndValue3 kıyası: " + keyComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue3));
		System.out.println("entryForAKeyAndValue3 ve entryForAKeyAndValue4 kıyası: " + keyComparator.compare(entryForAKeyAndValue3, entryForAKeyAndValue4));
		
		System.out.println("entryForAKeyAndValue1 ve entryForAKeyAndValue2 kıyası: " + valueComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue1));
		System.out.println("entryForAKeyAndValue1 ve entryForAKeyAndValue3 kıyası: " + valueComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue3));
		System.out.println("entryForAKeyAndValue3 ve entryForAKeyAndValue4 kıyası: " + valueComparator.compare(entryForAKeyAndValue3, entryForAKeyAndValue4));
		
		System.out.println();
		
		keyComparator = Entry.comparingByKey((String k1, String k2) -> k1.length() - k2.length());
		System.out.println("entryForAKeyAndValue1 ve entryForAKeyAndValue2 kıyası: " + keyComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue4));
		
		valueComparator = Entry.comparingByValue((Integer v1, Integer v2) -> v1%2 - v2%2);
		System.out.println("entryForAKeyAndValue1 ve entryForAKeyAndValue2 kıyası: " + valueComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue4));
	}
}
