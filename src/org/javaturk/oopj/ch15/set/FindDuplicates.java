/* Ch 14
 * FindDuplicates.java
 */

package org.javaturk.oopj.ch15.set;

import org.javaturk.oopj.ch14.util.CollectionUtil;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class FindDuplicates {
	public static void main(String args[]) {

//		Set set = CollectionUtil.getEmptySet(); // Supply as arguments: zeynep ali mahmut zeynep tansu ali ahmet nuri elif zeynep
		Set set = new TreeSet();
		for (int i = 0; i < args.length; i++) {
			CollectionUtil.listElements(set);
			if (!set.add(args[i]))
				System.out.println("=> Duplicate detected: " + args[i]);
		}

		System.out.println(set.size() + " distinct words detected: " + set);
		CollectionUtil.listElements(set);
	}	
}
