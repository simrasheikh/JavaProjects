public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Boolean right = true;
        int n = 0;
        System.out.println("Give the number till where you want the sequence");
        do {
            try {
                n = input.nextInt();
                right = false;
            }
            catch(InputMismatchException ex) {
                System.out.println("Wrong input, enter again");
                input.nextLine();
            }
        } 
        while (right);
        
        String inv = "";
        String temp = seq(n);
        for (int i = (temp.length() - 1); i >= 0; i--) {
            inv = inv + temp.charAt(i);
        }
        System.out.println("your sequence is: " + inv);
    }
    public static String seq(int n) {
        String rev = "";        
        if (n == 1) {
            return "1";
        }
        else {
            rev = rev + n + seq(n-1);
        }
        return rev;
    }
