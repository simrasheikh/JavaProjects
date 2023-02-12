package commonprefix;
import java.util.Scanner;
public class Commonprefix {
	
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string:");
		String one = input.nextLine();
		System.out.print("Enter the second string:");
		String two = input.nextLine();

		int index = 0;				
		String prefix = "";		
		
		while (one.charAt(index) == two.charAt(index)) {
			prefix += one.charAt(index);
			index++;
		}
		
		if (prefix.length() > 0)
			System.out.println("The commmon prefix is " + prefix);
		else
			System.out.println(one + " and " + two +
				" have no commmon prefix");
    }    
}
