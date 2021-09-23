
public class Main {

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        Quicksort quicksort = new Quicksort();
        myHeap myHeap =new myHeap();


        int[] unsortedArray = {7,15,-5,0,17,56,-32,18,7,31};

        heapSort.sort(unsortedArray);

        for (int i : unsortedArray) {
            System.out.println(i);
        }
    }

    public static void prosteWybieranie(int[] array){

        for (int i=0; i<array.length; i++){
            int min=array[i];
            int indexOfMinElement = i;
            for(int k=i; k<array.length;k++){
                if(min>array[k]){
                    min=array[k];
                    indexOfMinElement =k;
                }
            }
            int temp = array[i];
            array[i]=array[indexOfMinElement];
            array[indexOfMinElement]=temp;
        }

    }


    public static void sortowaniePrzezZamiane(int[] array){

        for(int i=0; i<array.length;i++ ){

            for(int k=0; k< array.length-1; k++ ){
                if(array[k]>array[k+1]){
                    int temp = array[k];
                    array[k]=array[k+1];
                    array[k+1]=temp;
                }
            }
        }

    }


    public static void sortowaniePrzezWstawianie(int[] array) {


        for(int i =1; i<array.length; i++ ){
            int temp= array[i];
            int j = i-1;

            while(j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1] = temp;
        }



    }







} // end of main class

