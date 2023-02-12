public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
                
        /*  Return the number of even ints in the given array. 
            Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
            countEvens([2, 1, 2, 3, 4]) → 3
            countEvens([2, 2, 0]) → 3
            countEvens([1, 3, 5]) → 0*/
        
        System.out.println("give ur list length");
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
        System.out.println("number of even numbers in your list is: " + count);
}
