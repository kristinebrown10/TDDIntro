package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) throws IllegalArgumentException{
        if (i < 0)
            throw new IllegalArgumentException();
        else if (i < 2)
            return 1;
        else if (i >= 2)
            return (i*compute(i-1));
        return -1;
    }
}
