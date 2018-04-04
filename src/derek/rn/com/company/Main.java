package derek.rn.com.company;

import java.util.Random;

public class Main {

    private static int low = 0;
    private static int high = 5000000;

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();

        long startTime = System.currentTimeMillis();

        int array[] = new int[high];
        for(int i = 0;i < high;i++){
            array[i] = random.nextInt(high-low) + low;
        }


        System.out.println("Given Array");
//        MergeSort.printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(array, 0, array.length-1);

        System.out.println("\nSorted array");
//        MergeSort.printArray(arr);

        System.out.println("The sorting took: " + (System.currentTimeMillis()- startTime) + " milliseconds");
    }
}
