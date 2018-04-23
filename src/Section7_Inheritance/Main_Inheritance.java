/*
 * @author: Guilherme Ruschel Kelling 
 *  
 * 
 */

package Section7_Inheritance;

public class Main_Inheritance {
	
	public static void main(String args[]) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		Dog dog = new Dog("YorkiE", 8, 20, 2, 4, 1, 20, "longsilky");
		dog.eat();
	}

}

