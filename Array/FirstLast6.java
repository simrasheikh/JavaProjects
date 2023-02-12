public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean flag = false;
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
        System.out.println("Your flag is " + flag);
}
