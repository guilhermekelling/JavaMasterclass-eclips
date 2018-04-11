/*
 * @author: Guilherme Ruschel Kelling 
 * Variables, Datatypes and Operators 
 * 
 */

import sun.management.counter.Variability;

public class MainVariablesDatatypesOperators {
	public static void main(String[] args) {
        System.out.println("Hello Tim!");

        int myFistNumber = 10;
        System.out.println(myFistNumber);

        //*ByteShortInt
        System.out.println("ByteShortInt");
        byte b =10;
        short s = 20;
        int i = 50;
        long l = 50000L + 10L* (b + s + i);

        System.out.println(b + "\n" + s + "\n" + i + "\n" + l);

        //FloatAndDouble
        System.out.println("FloatAndDouble");
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1.  Create a variable to store the number of pounds.
        // 2.  Calculate the number of kilograms for the number above and store in a variable.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.
        double numPounds = 200d;
        double convertdKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertdKilograms);
        // 90.7185
        double pi = 3.141_592_7d;

        //CharAndBoolean
        System.out.println("CharAndBoolean");
        //  Width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen
        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol:" + registeredSymbol);

        //Primitive types: byte, short, int, long, float, double, char, boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myBoolean);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);

        //operatos
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);
        previousResult = result;
        System.out.println(previousResult + " / 5 = " + result);
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " %¨3 = " + result);
        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        
        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);
        
        boolean isAlien = false;
        if(isAlien == true)
        	System.out.println("It is not an alient!");
        
        int topScore = 80;
        if (topScore < 100)
        	System.out.println("You got the high score!");
        
        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100))
        	System.out.println("Greater than top score and less then 100");
        
        if((topScore > 90) || (secondTopScore <= 90))
        	System.out.println("One of these tests is true");
        
        int newValue = 50;
        if(newValue == 50)
        	System.out.println("This is true");
        
        boolean isCar = false;
        if(isCar)
        	System.out.println("This is not supposed to happen");
        
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
        	System.out.println("wasCar is true");
        
        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less.
        
        double varDouble = 20d;
        double varDouble2 = 80;
        double result3 = (varDouble + varDouble2) * 25;
        System.out.println("Result3: " + result3);
        double result4 = result3 % 40;
        System.out.println("Result4: " + result4);
        if(result4 <= 20)
        	System.out.println("Total was over the limit");              

    }

}
