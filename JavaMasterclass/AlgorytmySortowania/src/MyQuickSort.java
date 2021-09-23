public class MyQuickSort {

    public void sort(int[] arr, int first, int last){
        if(first<last){
            int partIndex = partition(arr, first,last);

            sort(arr, first,partIndex-1);
            sort(arr, partIndex+1, last);


        }

    }

    private int partition(int[] arr, int first, int last){
        int pivot = arr[last];
        int j = first-1;

        for(int i = first ;i<last; i++){
            if(arr[i]<pivot){

                j++;

                int temp = arr[i];
                arr[i]=  arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[j+1];
        arr[j+1]=  pivot;
        arr[last] = temp;

        return j+1;

    }

}
