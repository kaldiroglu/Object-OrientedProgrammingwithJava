
package org.javaturk.oopj.ch16;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class MapPerformance {
	private static int n = 10_000_000;
	private static Random random = new Random();

	public static void main(String[] args) {
		hashMapInsertion();
		treeMapInsertion();
	}

	public static void hashMapInsertion() {
		Map<Integer, Integer> map = new HashMap<>();
		double start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			int j = random.nextInt();
			map.put(i, j);
		}
		double end = System.currentTimeMillis();
		System.out.println("Time to insert into HashMap is " + (end - start));
	}
	
	public static void treeMapInsertion() {
		Map<Integer, Integer> map = new TreeMap<>();
		double start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			int j = random.nextInt();
			map.put(i, j);
		}
		double end = System.currentTimeMillis();
		System.out.println("Time to insert into TreeMap " + (end - start));
	}
}
