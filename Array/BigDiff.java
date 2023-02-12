public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        /*Given an array length 1 or more of ints, return the difference between
        the largest and smallest values in the array. 
        Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) 
        methods return the smaller or larger of two values.
        bigDiff([10, 3, 5, 6]) → 7
        bigDiff([7, 2, 10, 9]) → 8
        bigDiff([2, 10, 7, 2]) → 8*/
        
        System.out.println("give ur list length");
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
        System.out.println("differnce between max value and min value is: " + (max - min));
}
