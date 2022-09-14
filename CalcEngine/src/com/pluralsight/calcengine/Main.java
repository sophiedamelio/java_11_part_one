package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        
        double value1 = 100d;
        double value2 = 0.0d;
        double result = 0.0d;

        char opCode = 'd'; // a or s, d or m

        switch (opCode) {

            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value1 != 0 ? value1 / value2 : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d; //  invalid op code
                break;
            }


        System.out.println(result);



    }
}
