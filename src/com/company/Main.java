package com.company;

/**
 * Test Driven Development (TDD)
 * Write your tests first and watch them fail.
 * Then write the algorithm and watch the tests pass.
 */
public class Main {
    public static void main(String[] args) {
        ReversePolishCalculator rpc = new ReversePolishCalculator();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        // Write tests for the other operators (-, *, /)
        rpnExpression = "6.2,5.2,-";
        expectedResult = 1;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);
        System.out.println("Aww snap " + expectedResult + " totally equals " + actualResult);

        rpnExpression = "12.5,4.2,*";
        expectedResult = 52.5;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);
        System.out.println("Aww snap " + expectedResult + " totally equals " + actualResult);

        rpnExpression = "100,2,/";
        expectedResult = 50;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);
        System.out.println("Aww snap " + expectedResult + " totally equals " + actualResult);



        rpnExpression = "5,1,2,+,4,*,+,3,-";
        expectedResult = 14.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}

