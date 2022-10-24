public class BubbleSort {
    public void sort(int[] arr){
        boolean isSorted;   //isSorted is used to stop extra comparisons after array is already sorted
        for(int i=0; i<arr.length; i++){
            isSorted = true;    //assuming the array is already sorted
            for(int j=1; j<arr.length-i; j++){      //array.length-1 is used since after every i iteration largest number moves to end
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    isSorted = false;   //since a swap happened array is not sorted, will run the outer loop again
                }
            }
            if(isSorted){   //array is already sorted
                return;
            }
        }
    }

    // a method to swap two index variables in an array
    private void swap(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}
