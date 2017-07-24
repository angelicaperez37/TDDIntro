package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) throws IllegalArgumentException {
        if (i==1 || i==0)   return 1;
        else if (i > 1)  return i*compute(i-1);
        throw new IllegalArgumentException("Cannot compute factorial of negative number.");
    }
}
