package sortingAlgo;

import java.util.Arrays;
import java.util.Random;

/**
 * Selection sort: find smallest element-put it at the front. Find next smallest item, put it
 * to the next of the first smallest item. Repeat this until you are done.
 */

// selection sort
class SelectionSortImplementation{
   // private int minValIndex = 0;

    public int[] sort(int arr[]){  // {6, 3, 1}
        for(int i = 0; i < arr.length; i++){  // do length -1 for last element
            int minimumValue = arr[i];
            int minValIndex = i;
            // compare minval with other elements
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < minimumValue){
                    minimumValue = arr[j];
                    minValIndex = j;
                }
            }
            // once found the smallest element, swap it the minimum value
           swap(arr, i, minValIndex);
        }
        return arr;
    }

    private void swap(int[] array, int a, int b){ // a, b = indices
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

public class SelectionSort {
    public static void main(String []args){
        // instantiate the class SelectionSortImplementation
        SelectionSortImplementation ssi = new SelectionSortImplementation();

        // creat an array of random integers.use random number to genrator random integers
        int [] intArray = new int[5];
        Random random = new Random();
        for(int i = 0; i< intArray.length; i++){
            intArray[i] = random.nextInt(100); // random integers from 0 to 100
        }

        // invoke the sort method
        //int randomArray[] = ssi.sort(intArray);
        System.out.print("Random array before sorting is - ");
        System.out.println(Arrays.toString(intArray));

        int randomArray[] = ssi.sort(intArray);
        System.out.println(Arrays.toString(randomArray));
    }
}
