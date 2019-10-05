package com.company;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // initiate a new instance of Scanner to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello!\nThis is a financial calculator\nLets start with a time frame.");
        System.out.println("How many years until retirement : ");

        // read input to time var
        byte time = scanner.nextByte();

        System.out.println("How much are you beginning with (just invested) : ");
        int start = scanner.nextInt();

        System.out.println("What is the expected market return as a fraction of 1 : ");
        float annualReturn = scanner.nextFloat();

        // print the return value of formatted into currency
        System.out.println("Future value : " + NumberFormat.getCurrencyInstance().format(start * Math.pow(1+annualReturn, time)));
    }
}
