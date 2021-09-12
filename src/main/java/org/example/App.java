/*
 * UCF COP3330 Fall 2021 Assignment 19 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight: ");
        float weight = input.nextFloat();
        System.out.println("Enter your height: ");
        float height = input.nextFloat();

        float bmi = (weight / (height * height)) * 703;

        if (bmi < 18.5 && bmi >= 0) {
            System.out.println("Your BMI is " + bmi + ".\n" +
                    "You are underweight. You should see your doctor.");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Your BMI is " + bmi + ".\n" +
                    "You are within the ideal weight range.");
        } else if (bmi > 25) {
            System.out.println("Your BMI is " + bmi + ".\n" +
                    "You are overweight. You should see your doctor.");
        }
    }
}
