package Section6_ControlFlowStatements;
/*
 * @author: Guilherme Ruschel Kelling 
 *  
 * 
 */

public class Main {

	public static void main(String[] args) {
		int value = 2;
		if (value == 1) {
			System.out.println("Value was 1");
		} else if (value == 2) {
			System.out.println("Value was 2");
		} else {
			System.out.println("Was not 1 or 2");
		}
		
		int switchValeu = 1;
		
		switch(switchValeu) {
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Valeu was 2");
				break;
			case 3: case 4: case 5:
				System.out.println("was a 3, or a 4, or a 5");
				System.out.println("Actually it was a " + switchValeu);
				break;
			default:
				System.out.println("Was not 1,2,3,4 or 5");
				break;
		}		
		
		//  Create a new switch statemnet using char instead of int
		// create a new char variable
		// A, B, C, D, or E
		// display a message if any of these are found and then break
		// Add a default which displays a message saying not found 
		
		char charValeur = 'B';		
		switch(charValeur) {
			case 'A':
				System.out.println("Value was A");
				break;
			case 'B':
				System.out.println("Value was B");
				break;
			case 'C': 
				System.out.println("Value was C");
				break;
			case 'D': 
				System.out.println("Value was D");
				break;
			case 'E':
				System.out.println("Value was E");
				break;
			default:
				System.out.println("Don't find!");
				break;
		}		
		
		String month = "JAnuary";
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
			break;
		case "june":
			System.out.println("Jun");
			break;
		default:
			System.out.println("Not sure");
			
		}
		
	}

}
