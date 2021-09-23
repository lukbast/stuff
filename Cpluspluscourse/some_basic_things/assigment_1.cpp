#include <iostream>
#include <string>
#include <unordered_map>

using std::cin;
using std::cout;
using std::endl;
using std::string;
using std::getline;

// Function to reverse a string
string reverse_string(string str){
    string reversed {};
    for (int i=str.length()-1; i>=0; i--){
        reversed += str.at(i);
    }
    return reversed;
}
string create_spaces(int num_of_spaces){
    string spaces {};
    for (int i = 0; i<=num_of_spaces; i++ ){
        spaces += " ";
    }
    return spaces;
}

int main(){

    cout<<"Please enter words to create Letter Pyramid from them.\n";
    string msg {};
    getline(cin, msg);
    cout<<endl;
  
    string line_to_display {};
    string previous_line {};

    for(char letter: msg){
        line_to_display += letter;
        
        string letters = line_to_display +reverse_string(previous_line);
        int num_of_spc = (msg.length()*2 - letters.length())/2;
        string spaces = create_spaces(num_of_spc);
        cout<<spaces<< letters<<endl;

        previous_line = line_to_display;
    }


    return 0;
}