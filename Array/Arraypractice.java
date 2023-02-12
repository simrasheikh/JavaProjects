package arraypractice;

import java.util.Scanner;

public class Arraypractice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        /*boolean flag = false;
        System.out.println("enter size of array");
        int size = input.nextInt();
        int [] list = new int [size];
            for (int i = 0; i < size; i++) {
              System.out.println("enter value number " + (i+1) + " of array:");
              list[i] = input.nextInt();
            }
            if (list[0] == 6 && list[size-1] != 6)
              flag = true;
            if (list[size-1] == 6 && list[0] != 6)  
              flag = true;
        System.out.println("Your flag is " + flag);*/
        
        /*  Return the number of even ints in the given array. 
            Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
            countEvens([2, 1, 2, 3, 4]) → 3
            countEvens([2, 2, 0]) → 3
            countEvens([1, 3, 5]) → 0*/
        
        /*System.out.println("give ur list length");
        int size = input.nextInt();
        int [] list = new int [size];
            for (int i = 0; i < size; i++) {
              System.out.println("enter value number " + (i+1) + " of array:");
              list[i] = input.nextInt();
            }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (list[i]%2 == 0) {
                count++;
            }
        }
        System.out.println("number of even numbers in your list is: " + count);*/
        
        /*Given an array length 1 or more of ints, return the difference between
        the largest and smallest values in the array. 
        Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) 
        methods return the smaller or larger of two values.
        bigDiff([10, 3, 5, 6]) → 7
        bigDiff([7, 2, 10, 9]) → 8
        bigDiff([2, 10, 7, 2]) → 8*/
        
        /*System.out.println("give ur list length");
        int size = input.nextInt();
        int [] list = new int [size];
            for (int i = 0; i < size; i++) {
              System.out.println("enter value number " + (i+1) + " of array:");
              list[i] = input.nextInt();
            }
        int max = list[0];
        int min = list[0];
        for (int i = 0; i < size; i++) {            
            if (list[i] > max) {
                max = list[i];
            } 
            if (list[i] < min) {
                min = list[i];
            }
        }
        //System.out.println("differnce between max value and min value is: " + (max - min));
        for (int i = 0; i < size; i++) {
            if (list [i] == max) {
                list[i] = 0;
                break;
            }
        }
        for (int i = 0; i < size; i++) {
            if (list [i] == min) {
                list[i] = 0;
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + list[i];
        }
        int avg = sum/(size-2);
        System.out.println("centered average is: " + avg);*/
        
        /*Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. 
        Compute the result recursively (without loops).*/      
              
    }
    
}
