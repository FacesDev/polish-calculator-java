package com.company;

/**
 * Created by solderedmachd on 7/20/17.
 */

public class ReversePolishCalculator {
    // You'll need a variable here to keep track of the top of the stack
    int topOfStack = 0;
    double firstNumber;
    double secondNumber;
    // The array of the input string split up
    private String[] tokens;

    // The stack
    private String[] stack;

    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas

        tokens = input.split(",");


        // 2. Allocate a stack as big as the number of tokens
        stack =  new String[tokens.length];

        // 3. write the algorithm
        for(String token: tokens) {
            switch(token){

                case "+":
                    secondNumber = pop();
                    firstNumber = pop();
                    push(firstNumber + secondNumber);
                    break;
                case "-":
                    secondNumber = pop();
                    firstNumber = pop();
                    push(firstNumber - secondNumber);
                    break;
                case "*":
                    secondNumber = pop();
                    firstNumber = pop();
                    push(firstNumber * secondNumber);
                    break;
                case "/":
                    secondNumber = pop();
                    firstNumber = pop();
                    push(firstNumber / secondNumber);
                    break;
                default:
                    push(token);
                    break;
            }


        }

        // 4. return the result
        return pop();
    }

    private void push(String number) {
        // push on the stack
        stack[topOfStack] = number;
        topOfStack++;
    }

    private void push(double d) {
        // change the double to a string and then push it on the stack
       String number = Double.toString(d);
       stack[topOfStack] = number;
       topOfStack++;

    }

    private double pop() {
        // remove the string from the top of the stack and convert it to a double and return it

        topOfStack--;
        double number = Double.parseDouble(stack[topOfStack]);
        return number;
    }
}
