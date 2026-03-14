/**
 * 
 */
package org.javaturk.oopj.ch03.covariant;


import org.javaturk.oopj.ch03.factories.factory1.Employee;
import org.javaturk.oopj.ch03.factories.factory1.Manager;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class HRTest {

	public static void main(String[] args) {
		HR hr = new HR();
		Employee employee1 = hr.getAnEmployee();
		employee1.work();

		System.out.println();
		
		HRForManagers hrForManagers = new HRForManagers();
		Employee employee2 = hrForManagers.getAnEmployee();
		employee2.work();
		
		Manager manager = hrForManagers.getAnEmployee();
		manager.manage();
	}
}
