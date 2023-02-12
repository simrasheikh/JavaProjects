public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("give first string:");
        String s1 = input.next().toLowerCase();        
        System.out.println("give second string:");
        String s2 = input.next().toLowerCase();
        
        int a = s2.lastIndexOf(s1.charAt(0));
        int b = s1.lastIndexOf(s2.charAt(0));
        int i = 0;
        int j = 0;
        
        Boolean secondHalf = true;
        Boolean firstHalf = true;
        
        String s = "";

        do {
            if (s1.charAt(i) == s2.charAt(a)) {
                s += s1.charAt(i);
            } 
            else {
                secondHalf = false;
                break;
            }
            i++;
            a++;
        } 
        while (a < s1.length());
        
        do {
            if (s2.charAt(j) == s1.charAt(b)) {
                s += s2.charAt(j);
            } 
            else {
                firstHalf = false;
                break;
            }
            j++;
            b++;
        } 
        while (b < s2.length());
        
        if (firstHalf == false || secondHalf == false) {
            System.out.println("No rotations founds");
        } 
        else {
            System.out.println("Rotation exists");
        }
    }
