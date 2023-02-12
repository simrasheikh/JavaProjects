package primenumberfirst50;
public class Primenumberfirst50 {
    public static void main(String[] args) {        
        
        /*Write a program that displays the first 50 prime numbers in five 
        lines, each of which contains 10 numbers. An integer greater than 1 
        is prime if its only positive divisor is 1 or itself. For example, 
        2, 3, 5, and 7 are prime numbers, but 4, 6, 8, and 9 are not.*/
        
        int prime;
        int pc = 1;
        int nzrc = 0; //nonzero remainder count
        System.out.print("2 ");        
        
            for (int p = 3; p <= 229; p++) { //counter to test nums for primes, gon start with 2 and go till 299 (50th prime)
                for (int d = 2; d < p; d++) { //eg we have 7. when we divide seven with 2 till 6, the remainder is never 0
                    if (p%d != 0) {               //for every number, if it's prime, the remainder won't be zero when u run
                        nzrc++;                   //a divison loop from 2 till 1 less than the number 
                    }                    
                }                
                if (nzrc == (p - 2)) { //if it's a prime number the nzrc will always be prime - 2
                    prime = p;         //eg for 7 the nzrc from 1 till 7 is 5 (basically excluding 1 and 7)
                    pc++;
                    System.out.print(prime + " ");
                    if (pc%10 == 0) {
                        System.out.println("");
                    }
                }
                nzrc = 0;               
            }
    }
}