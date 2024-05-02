import java.util.Scanner;

public class SortingAlgo {

    /*This will iterate over each element in the list.
    * it will look at each element and check if it is greater
    * than the next elemenet in line. If it is it will swap the
    * values. This makes sure that after each iteration the
    * biggest value is the last item in the array.
    * @param array The array that is going to be sorted.*/
    public void bubblesort(int[] array){

        int tempVal;

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    tempVal = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempVal;
                }
            }
        }

    }

    /*This will divide the array by a midpoint until
     * there is only one element in each side. It will
     * then sort each of the levels
     * @param array The array that's going to be sorted
     * @param i the starting value of what will be sorted.
     * @param k the ending value of what will be sorted.*/
    public void mergeSort(int [] array, int i, int k){


        //J is the midpoint
        int j;

        if (i < k){
            j = (i + k) / 2;

            //Recursively sort left and right partitions
            mergeSort(array,i,j);
            mergeSort(array,j+1,k);

            //Merge left and right
            merge(array,i,j,k);

        }
    }

    /*Helper function for the merge sort. This is the
     * method that actually does the sorting.
     * @param i the start value of what will be sorted
     * @param k the end value of what will be sorted
     * @param j the midpoint*/
    public void merge(int[] array,int i, int j, int k){

        int mergedSize = k - i + 1;
        int mergedNumbers [] = new int[mergedSize];
        int mergePos;
        int leftPos;
        int rightPos;

        mergePos = 0;
        leftPos = i;
        rightPos = j + 1;

        while (leftPos <= j && rightPos <= k){

            if (array[leftPos] < array[rightPos]){
                mergedNumbers[mergePos] = array[leftPos];
                ++leftPos;
            }else{
                mergedNumbers[mergePos] = array[rightPos];
                ++rightPos;
            }
            ++mergePos;
        }

        while (leftPos <= j){
            mergedNumbers[mergePos] = array[leftPos];
            ++leftPos;
            ++mergePos;
        }

        while (rightPos <= k){
            mergedNumbers[mergePos] = array[rightPos];
            ++rightPos;
            ++mergePos;
        }

        //Copy merge numbers back to numbers
        for (mergePos = 0; mergePos < mergedSize;++mergePos){
            array[i+ mergePos] = mergedNumbers[mergePos];
        }

    }

    /*This will iterate over every item
     * in the list as well. It will look if
     * the element behind the current element is
     * less than. If it is it will make a swap.
     * It will keep moving backwards until the
     * element is in it's sorted position or it
     * is at the first element in the array.
     * @param array The array that will be sorted*/
    public void insertionSort(int[] array){

        int i;
        int j;
        int temp;

        for (i = 1; i < array.length; ++i){
            j = i;


            while (j > 0 && array[j] < array[j-1]){

                temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                --j;
            }

        }

    }

    /*This will sort the array by paritioning both
     * sides.
     * @param array The array that will be sorted
     * @param i the start value of what will be sorted
     * @param k the end value of what will be sorted.*/
     public void quickSort(int[] array,int i, int k){

        int j;

        if(i >= k){
            return;
        }

        j = partition(array,i,k);

        quickSort(array,i,j);
        quickSort(array, j + 1,k);

    }

    /*This will partition the array. It will
     * look at a pivot and move everything less than
     *the pivot to the left, and everything right of
     * the pivot to the right. It will then keep breaking it
     * down until there are only two elements.
     * @param array The array that is being sorted
     * @param i the start value of what will be sorted.
     * @param k the end value of what will be sorted*/
    public int partition(int[] array, int i, int k){

        int l;
        int h;
        int midpoint;
        int pivot;
        int temp;
        boolean done;

        /* Pick middle element as pivot */
        midpoint = i + (k - i) / 2;
        pivot = array[midpoint];

        done = false;
        l = i;
        h = k;

        while (!done) {
            /* Increment l while numbers[l] < pivot */
            while (array[l] < pivot) {
                ++l;
            }

            /* Decrement h while pivot < numbers[h] */
            while (pivot < array[h]) {
                --h;
            }

         /* If there are zero or one items remaining,
            all numbers are partitioned. Return h */
            if (l >= h) {
                done = true;
            }
            else {
            /* Swap numbers[l] and numbers[h],
               update l and h */
                temp = array[l];
                array[l] = array[h];
                array[h] = temp;

                ++l;
                --h;
            }
        }

        return h;
    }

    /*This iterates of every item in the array
     * and looks for the smallest value. It will
     * then swap that value with the position of i.
     * @param array The array that will be sorted*/
    public void selectionSort(int[] array){

        for (int i = 0; i < array.length-1; i++){

            int min = i;

            for (int j = min + 1; j < array.length;j++){

                if(array[j] < array[min]){
                    min = j;
                }

            }

            int temp;
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }
}
