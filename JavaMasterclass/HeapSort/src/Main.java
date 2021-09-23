public class Main {

    // Driver code
    public static void main(String args[])
    {
//        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int[] arr = {7,15,-5,0,17,56,-32,18,7,31};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
