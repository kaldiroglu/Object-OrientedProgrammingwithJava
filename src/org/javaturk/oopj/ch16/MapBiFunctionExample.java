
package org.javaturk.oopj.ch16;

import org.javaturk.oopj.ch14.util.CollectionUtil;

import java.util.Map;
import java.util.function.BiFunction;

public class MapBiFunctionExample {
	
 public static void main(String[] args) {
	 
		Map<String, Integer> map = CollectionUtil.getMap();

		BiFunction<String, Integer, Integer> aSingleDigitBiFunction = (t, u) -> {
			if (t.equals("one") | t.equals("five"))
				return u;
			else
				return -1;
		};
		
		int result = map.compute("eleven", aSingleDigitBiFunction);
		System.out.println(result);
		
		result = map.compute("five", aSingleDigitBiFunction);
		System.out.println(result);
	}

}
