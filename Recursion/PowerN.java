package powern;

import java.util.Scanner;

public class PowerN {
    public static void main(String[] args) {
        /*Given base and n that are both 1 or more, compute recursively (no loops)
        the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
        powerN(3, 1) → 3
        powerN(3, 2) → 9
        powerN(3, 3) → 27*/
        Scanner input = new Scanner(System.in);
        System.out.println("give base");
        int base = input.nextInt();
        System.out.println("give number");
        int n = input.nextInt();
        System.out.println("your computation results in: " + answer(base, n));
    }
    public static int answer(int base, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return base;
        }
        else {
            n--;
            return base * answer(base, n);
        }
    }
}
