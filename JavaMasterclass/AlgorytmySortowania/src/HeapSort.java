public class HeapSort {

    public void sort(int arr[]){
        int n = arr.length;

        //rearrange array (create a heap)

        for(int i = n/2-1; i>=0;i--){
            heapify(arr, n, i);
        }


        //next step is to move current root to an end

        for(int i = n-1; i>0; i--){

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i]= temp;

            //now, rearrange reduced tree

            heapify(arr,i,0);

        }


        }


    private void heapify(int arr[], int n, int i){
         int largest = i;
         int l = i*2+1;
         int p = i*2+2;


         //if l is larger than i, l becomes new largest
        // and is in range of array of course :)

         if(l<n && arr[l]>arr[largest] ){
             largest=l;
         }

         // check the same conditions for p
        if(p<n && arr[p]>arr[largest] ){
            largest=p;
        }

        // if largest in not an i, swap i with new largest
        if(largest!=i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest]  = swap;

        // now, recursively rearrange subtrees

            heapify(arr,n ,largest);

        }

    }

}
