#include <iostream>
using namespace std;

void print(int arr[],  int size);

int *apply_all(int *arr1,const int arr1_size, int *arr2 ,const int arr2_size);

int main(){

    const int arr1_size = 3;
    int arr1[arr1_size] {10, 20, 30};
    const int arr2_size = 5;
    int arr2[arr2_size] {1, 2, 3, 4, 5};


    print(arr1, arr1_size);
    print(arr2, arr2_size);
    
    int arr3_size = arr1_size * arr2_size;
    int *arr3 = apply_all(arr1, arr1_size, arr2, arr2_size);
    print(arr3, arr3_size);
    return 0;
}


void print(int arr[],  int size){
    for(int i = 0; i<size; i++){
        cout<<arr[i]<<endl;
    }
    cout<<endl;
}

int *apply_all(int *arr1,const int arr1_size, int *arr2,const int arr2_size){
    int *result = {nullptr};
    result = new int[arr1_size*arr2_size];
    
    int index = 0;

    for (int i = 0; i<arr1_size; i++){
        for (int j = 0; j<arr2_size; j++){
            result[index] = arr1[i] * arr2[j];
            index ++;
        } 
    } 

    return result;
}
