package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i==1 || i==0)   return 1;
        else if (i > 1)  return i*compute(i-1);
        return -1;
    }
}
