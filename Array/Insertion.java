package insertion;
import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int total = input.nextInt();
        int [] arr = new int [total + 1];
        
        System.out.println("Enter the elements in ascending order:");
        for (int i = 0; i < total; i++) {
            arr[i] = input.nextInt();
        }
        
        int newArr [] = new int [total + 1];
        newArr = arr;
        System.out.println("Enter the element to be inserted");
        newArr[total] = input.nextInt();
        
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total + 1; j++) {              
                if (newArr[i] > newArr[j]) {
                    int temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr [j] = temp;
                }
            }
        }
        System.out.println("Array after insertion is ");
        for (int i = 0; i < total + 1; i++) {            
            System.out.print(newArr[i] + "  ");
        }
    }
    
}
