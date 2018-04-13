package Section4Section5;
/*
 * @author: Guilherme Ruschel Kelling 
 * Expressions, Statements, Code blocks, Methods and more 
 * 
 */

public class Section5_MainExpressionsStatementsCodeBlocksMethods {
	
	public static void main(String[] args) {
		
		//Code Blocks And The If Then Else Control Statements
		
		// a mile is equal to 1.609344 kilometres
		double kilometres = (100 * 1.609344);
		int highScore = 50;

		if (highScore == 50) {
			System.out.println("This is an expression");
		}

		// In the following code that I will type below, write down what parts of the
		// code
		// are expressions
		int score = 100;
		if (score > 99) {
			System.out.println("You got the high score!");
			score = 0;
		}

		int myVariable = 50;
		if (myVariable == 50) {
			System.out.println("Printed");
		}

		myVariable++;
		myVariable--;
		System.out.println("Thist is a test");
		System.out.println("This is" + " another" + "still more.");

		int anotherVariable = 50;
		myVariable--;
		System.out.println("This is another one");

		
		boolean gameOver = true;
		int score2 = 5000;
		int levelCompleted = 5;
		int bonus = 100;

		if (score2 < 5000 && score2 > 1000) {
			System.out.println("Your score was less that 5000 but greater than 1000");
		} else if(score2 < 1000) {
			System.out.println("Your score was less that 1000");
		} else {
			System.out.println("Got here");
		}
		
		if (gameOver == true) {
			int finalScore = score2 + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
		// Print out a second score on the screen with the following 
		// score set to 10000
		// levelCompleted set to 8
		// bonus set to 200
		// But make sure the first printou above still displays as well
		
		boolean newGameOver = true;
		int newScore2 = 10000;
		int newLevelCompleted = 8;
		int newBonus = 200;

     	if (newGameOver == true) {
			int finalScore = newScore2 + (newLevelCompleted * newBonus);
			System.out.println("Your final score was " + finalScore);
		}		
   	
     	score2 = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if (gameOver == true) {
			int finalScore = score2 + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
     	calculateScore(gameOver,score2,levelCompleted,bonus);
     	highScore = calculateScore(true, 10000, 8, 200);
     	System.out.println("YYour final score wass " + highScore);
     	
     	// Create a method called displayScorePosition
     	// it should a players name as a parameter, and a 2nd parameter as a position in the high score table
     	// You should display the players name along with a message like " managed to get into position " and the
     	// position they got and a further message " on the high score table".
     	//
     	// Create a 2nd method called calculateHighScore Position
     	// it should be sent one argument only, the player score
     	// it should return an int
     	// the return date should be
     	// 1 if the score is > 1000
     	// 2 if the score is > 500 and < 1000
     	// 3 if the score is > 100 and < 500
     	// 4 in all other cases
     	// call both methods and display the results of the following 
     	// a score of 1500, 900, 400, and 50
     	//     	
     	
     	int highScorePosition = calculateHighScorePosition(1500);
     	displayHighScorePosition("Tim",  highScorePosition);
		
     	highScorePosition = calculateHighScorePosition(900);
     	displayHighScorePosition("Bob",  highScorePosition);

     	highScorePosition = calculateHighScorePosition(400);
     	displayHighScorePosition("Percy",  highScorePosition);
     	
     	highScorePosition = calculateHighScorePosition(50);
     	displayHighScorePosition("Gilbert",  highScorePosition);
     	
     	highScorePosition = calculateHighScorePosition(1000);
     	displayHighScorePosition("Louise",  highScorePosition);
     	
     	highScorePosition = calculateHighScorePosition(500);
     	displayHighScorePosition("Carol",  highScorePosition);
     	
     	highScorePosition = calculateHighScorePosition(100);
     	displayHighScorePosition("Frank",  highScorePosition);
     	
     	
     	// Method Overloading 
     	int newScore = calculateScore("Tim", 500);
     	System.out.println("New score is " + newScore);
     	calculateScore(75);
     	calculateScore();
     	
    	
        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >=0 and <=12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm  and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.    	
     	
     	calcFeetAndInchesToCentimeters(157);

	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

		if ((feet < 0) || ((inches < 0) || (inches > 12))) {
			System.out.println("Invalid feet or inches parameters");
			return -1;
		}

		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
		return centimeters;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {

		if (inches < 0) {
			return -1;
		}

		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " managed to get into position "
				+ highScorePosition + " on the high socre table");
	}
	
	public static int calculateHighScorePosition(int playrScore){
		if(playrScore >= 1000)
			return 1;
		else if (playrScore >= 500 && playrScore < 1000)
			return 2;
		else if (playrScore >= 100 && playrScore < 500)
			return 3;
		else
			return 4;
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {			

     	if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("Your final score was " + finalScore);
			return finalScore;
     	} else{
			return -1;			
		}
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player" + playerName + " scored " + score + " points");
		return score * 1000;
	}
     	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;
	}

}
