public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        /*Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
        except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, 
        ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
        You may assume that the array is length 3 or more.
        centeredAverage([1, 2, 3, 4, 100]) → 3
        centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
        centeredAverage([-10, -4, -2, -4, -2, 0]) → -3*/
        
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
        
        
        for (int i = 0; i < size; i++) {
            if (list [i] == max) {
                list[i] = 0;
                break;
            }
        }
        for (int i = 0; i < size; i++) {
            if (list [i] == min) {
                list[i] = 0;
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + list[i];
        }
        int avg = sum/(size-2);
        System.out.println("centered average is: " + avg);       
             
    }
    
