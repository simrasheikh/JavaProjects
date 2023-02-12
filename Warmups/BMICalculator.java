/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi.calculator;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        if (age < 16) {
            System.out.println("Sorry you're too young, u shud play, not ur age to worry about bmi yet, bye");
        }
        else {
             
        System.out.println("Enter the value of your Weight in kilograms");
        double w = input.nextDouble();
        System.out.println("Enter the value of your Height in meters:");
        double h = input.nextDouble();
        double bmi = w/Math.pow(h, 2);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal");
        }
        else if (bmi >= 25 && bmi < 30.0) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
        
        }

    }
    
}
