package com.oopslab.assignment;

public class Main {

    public static void main(String[] args) {
        Complex c = new Complex();
        ComplexNumber num1 = new ComplexNumber(5, 2);
        ComplexNumber num2 = new ComplexNumber(6, 4);

        ComplexNumber sum = c.addition(num1, num2);
        ComplexNumber sumInPlace = c.additionInPlace(num1, num2);

        ComplexNumber diff = c.subtraction(num1, num2);
        ComplexNumber diffInPlace = c.subtractionInPlace(num1, num2);

        ComplexNumber mul = c.multiplication(num1, num2);

        // display results
        System.out.println("Sum of " + num1 + " & " + num2 + " = " + sum);
        System.out.println("Sum in place of " + num1 + " & " + num2 + " = " + sum);

        System.out.println("Hashcode of sum: " + sum.hashCode()+ "\nSum in place hashcode: " + sumInPlace.hashCode() + " Hashcode of num1: " + num1.hashCode() );

        System.out.println("Difference of " + num1 + " & " + num2 + " = " + diff);
        System.out.println("Difference in place of " + num1 + " & " + num2 + " = " + diff);

        System.out.println("Hashcode of diff: " + diff.hashCode()+ "\nDiff in place hashcode: " + diffInPlace.hashCode() + " Hashcode of num1: " + num1.hashCode());

        System.out.println("Multiplication of " + num1 + " & " + num2 + " = " + mul);
    }
}
