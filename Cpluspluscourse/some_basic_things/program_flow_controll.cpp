#include <iostream>
#include <vector>

using std::cin;
using std::cout;
using std::endl;
using std::vector;


void print_menu() {
    cout<<"\nP - Print numbers\n";
    cout<<"A - Add number\n";
    cout<<"M - Display mean of the numbers\n";
    cout<<"S - Display the smallest number\n";
    cout<<"L - Display the largest number\n";
    cout<<"D - Display menu again\n";
    cout<<"O - Sort the list\n";
    cout<<"C - Clear list with numbers\n";
    cout<<"Q - Quit\n";
}

void print_numbers(vector<int> numbers){
    cout<<"[ ";
    for (int number: numbers){
        cout<<number<< " ";
    }
    cout<<"]";
}

int add_number(){
    cout<< "Please, enter an integer to add to list\n";
    int number = {};
    cin>> number;
    cout<<number<<" added.";
    return number;
} 

void smallest_number(vector<int> numbers){
    if(numbers.size() == 0){
        cout<<"Unable to determine smallest number - no data";
    } else {
        int smallest {numbers[0]};
        for (int num: numbers){
            if(num < smallest){
                smallest = num;
            }
        }
        cout<<"Smallest number in the list: "<< smallest<<endl;
    }
}

void biggest_number(vector<int> numbers){
    if(numbers.size() == 0){
        cout<<"Unable to determine smallest number - no data";
    } else {
        int biggest {numbers[0]};
        for (int num: numbers){
            if(num > biggest){
                biggest = num;
            }
        }
        cout<<"Largest number in the list: "<< biggest<<endl;
    }
}

void calculate_mean(vector<int> numbers){
    if(numbers.size() == 0){
        cout<<"Unable to calculate the mean - no data";
    } else {
        double sum {0};
        for (int num: numbers){
            sum += num;
        }
        cout<<"Averge of numbers in the list: "<< sum / numbers.size()<<endl;
    }
} 

vector<int> sort_numbers(vector<int> numbers){
    int min_index {};
    for(int i{0}; i<numbers.size(); i++){
            min_index = i;
        for(int j{i}; j<numbers.size(); j++){
            if(numbers[j]<numbers[min_index]){
                min_index=j;
            }
        }
        int temp =numbers[i];
        numbers[i] = numbers[min_index];
        numbers[min_index] = temp;
    }

    print_numbers(numbers);
    return numbers;
}

int main(){

    vector<int> numbers {};

    print_menu();
    char choice {};
    
    while (true){
        print_menu();
        cout<<"\nPlease choose one of the options:\n";
        cin>> choice;

        if (choice == 'a' || choice == 'A'){
            numbers.push_back(add_number());
        } else if (choice == 'p' || choice == 'P'){
            print_numbers(numbers);
        } else if (choice == 'd' || choice == 'D'){
            print_menu();
        } else if (choice == 'm' || choice == 'M'){
            calculate_mean(numbers);
        } else if (choice == 's' || choice == 'S'){
            smallest_number(numbers);
        } else if (choice == 'o' || choice == 'o'){
            numbers=sort_numbers(numbers);
        } else if (choice == 'l' || choice == 'L'){
            biggest_number(numbers);
        } else if (choice == 'c' || choice == 'C'){
            numbers.clear();
        } else if (choice == 'q' || choice == 'Q'){
            break;
        }else{
            cout<<"\nPlease, choose valid option\n";
        }
    }

    return 0;
}

