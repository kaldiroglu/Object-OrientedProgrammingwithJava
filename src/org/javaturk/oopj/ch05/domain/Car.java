package org.javaturk.oopj.ch05.domain;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Car extends Object{
	public String make;
	public String model;
	public String year;
	public int speed;
	public int distance;
	
	public Car(String make, String model, String year, int speed, int distance) {
		this.make = make;
		this.year = year;
		this.model = model;
		this.year = year;
		this.speed = speed;
		this.distance = distance;
	}
	
	public double go(int newDistance) {
		distance += newDistance;
		double period = (double )newDistance / speed;
		return period;
	}

	public void accelerate(int newSpeed) {
		speed = newSpeed;
	}

	public void stop() {
		speed = 0;
	}

	public String getInfo() {
		String info = "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
		return info;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nCar Info\n");
		sb.append("Make: ").append(make).append("\n");
		sb.append("Model: ").append(model).append("\n");
		sb.append("Year: ").append(year).append("\n");
		sb.append("Distance: ").append(distance).append("\n");
		sb.append("Speed: ").append(speed).append(" kmph. \n");
		return sb.toString();
	}
}