#include "Mystring.h"
#include <iostream>

using std::cout;


int main(){
    Mystring test {"Bruh"};
    Mystring test_2 {"Bruh"};
    if (test == test_2){
        cout<< true;
    } else{
        cout<<false;
    }

    if (test < test_2){
        cout<< true;
    } else{
        cout<<false;
    }

    if (test > test_2){
        cout<< true;
    } else{
        cout<<false;
    }
    return 0;
}