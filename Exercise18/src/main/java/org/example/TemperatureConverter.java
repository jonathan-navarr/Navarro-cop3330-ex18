package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class TemperatureConverter {
    public static void main(String[] args){
        String initialTemp;
        Double temp, tempconverted;

        Scanner scnr = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius\nPress F to convert from Celsius to Fahrenheit");
        initialTemp = scnr.next();
        System.out.println("Your choice: "+ initialTemp);

        if(initialTemp.equals("C") || initialTemp.equals("c")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = scnr.nextDouble();
            tempconverted = ((temp-32)*(5.0/9.0));
            System.out.print("The temperature in Celsius is: "+ tempconverted);
        }
        else{
            System.out.print("Please enter the temperature in Celsius: ");
            temp = scnr.nextDouble();
            tempconverted = ((temp*9.0/5.0)+32);
            System.out.print("The temperature in Fahrenheit is: " + tempconverted);
        }
    }
}
