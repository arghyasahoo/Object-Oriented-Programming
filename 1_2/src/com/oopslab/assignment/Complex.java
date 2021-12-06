package com.oopslab.assignment;

public class Complex {
    public ComplexNumber additionInPlace(ComplexNumber a, ComplexNumber b) {
        a.setReal(a.getReal() + b.getReal());
        a.setImaginary(a.getImaginary() + b.getImaginary());

        return a;
    }

    public ComplexNumber addition(ComplexNumber a, ComplexNumber b) {
        ComplexNumber sum = new ComplexNumber();

        sum.setReal(a.getReal() + b.getReal());
        sum.setImaginary(a.getImaginary() + b.getImaginary());

        return sum;
    }

    public ComplexNumber subtractionInPlace(ComplexNumber a, ComplexNumber b) {
        a.setReal(a.getReal() - b.getReal());
        a.setImaginary(a.getImaginary() - b.getImaginary());

        return a;
    }

    public ComplexNumber subtraction(ComplexNumber a, ComplexNumber b) {
        ComplexNumber diff = new ComplexNumber();

        diff.setReal(a.getReal() - b.getReal());
        diff.setImaginary(a.getImaginary() - b.getImaginary());

        return diff;
    }

    public ComplexNumber multiplication(ComplexNumber a, ComplexNumber b) {
        ComplexNumber mul = new ComplexNumber();

        mul.setReal((a.getReal() * b.getReal()) - (a.getImaginary() * b.getImaginary()));
        mul.setImaginary((a.getReal() * b.getImaginary()) + (a.getImaginary() * b.getReal()));

        return mul;
    }
}
