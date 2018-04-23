/*
 * @author: Guilherme Ruschel Kelling 
 *  
 * 
 */

package Section7_ClassesConstructorsInheritance;

public class Main_Classes {
	
	public static void main(String[] args) {
		Car porsche = new Car();
		Car holden = new Car();
		porsche.setModel("Carrera");
		System.out.println("Model is " + porsche.getModel());
	}

}

