package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int revertNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            revertNumber = revertNumber * 10 + digit;
            number /= 10;
        }
        System.out.println(revertNumber);
    }
}
