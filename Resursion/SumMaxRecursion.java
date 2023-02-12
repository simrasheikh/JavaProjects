package summaxrecursion;
import java.util.Scanner;
public class SumMaxRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give size of array");
        int size = input.nextInt();
        int [] arr = new int [size];
        int i = 0;
        int j = 0;
        int temp = arr[0];
        for (int r = 0; r < size; r++) {
            System.out.println("enter value number " + (r + 1) + ":");
            arr [r] = input.nextInt();
        }
        System.out.println("sum is: " + summer(arr, i));
        System.out.println("max is: " + maxer(arr, j, temp));
    }
    
    public static int summer (int[] arr, int i) {
        int sum;
        if (i == arr.length-1)
            return arr[i];
        else
            sum = arr[i] + summer(arr, i+1);
        return sum;        
    }
    
    public static int maxer (int[] arr, int j, int temp){
        int size = arr.length;        
        if (j == size) 
            return temp;
        if (arr[j] >= temp) {
            temp = arr[j];
            temp = maxer(arr, j+1, temp);
        }        
        return temp;
    }
}
