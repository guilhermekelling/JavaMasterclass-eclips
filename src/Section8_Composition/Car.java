/*
 * @author: Guilherme Ruschel Kelling 
 *  
 * 
 */

package Section8_Composition;

public class Car extends Vehicle {
	private int doors;
	private int engineCapacity;
	
	public Car(String name, int doors, int engeniCapacity) {
		super(name);
		this.doors = doors;
		this.engineCapacity = engeniCapacity;
	}

}

