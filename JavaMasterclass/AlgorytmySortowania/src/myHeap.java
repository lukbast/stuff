public class myHeap {

    public  void sort(int arr[]){
        int n = arr.length;

        for(int i = n/2-1; i>=0; i--){
            heapify(arr, i,n);
        }



        for (int i = n-1; i>=0; i--){

            int temp = arr[i];
            arr[i] = arr[0];
            arr[0]= temp;

            heapify(arr, 0, i);

        }

    }

   private  void heapify(int arr[], int i, int n){
        int subroot = i;
        int l = i*2+1;
        int p = i*2+2;

        if(l<n && arr[l] > arr[subroot]){
            subroot = l;
        }

       if(p<n && arr[p] > arr[subroot]){
           subroot = p;
       }

       if(subroot!=i){

           int temp = arr[i];
           arr[i]= arr[subroot];
           arr[subroot]=temp;


           heapify(arr, subroot,n);

       }

   }

}
