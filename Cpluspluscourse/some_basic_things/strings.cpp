#include <iostream>
#include <string>
#include <unordered_map>

using std::cin;
using std::cout;
using std::endl;
using std::string;
using std::unordered_map;
using std::getline;

string translate(string msg, unordered_map<char, char> key){
        string translated_msg {};
        for(size_t i = 0; i<msg.length(); i++){
            translated_msg += key[msg[i]];
        }
        return translated_msg;
}

int main(){
    unordered_map<char, char> encrypt_key {
        {'a', 'l'}, {'b', 'K'}, {'c', '>'}, {'d', 'u'}, {'e', 'q'}, {'f', 'a'}, {'g', 'G'}, {'h','w'}, {'i', '='}, {'j', '|'},
        {'k', ';'}, {'l', 'c'}, {'m', 'A'}, {'n', 'Q'}, {'o', 'U'}, {'p', '5'}, {'r', '<'}, {'s','?'}, {'t', 'F'}, {'u', 'L'},
        {'v', 'b'}, {'w', 'C'}, {'x', 'T'}, {'y', 'z'}, {'A', '2'}, {'B', '-'}, {'C', 'E'}, {'D', '!'}, {'E', '@'}, {'F', '#'},
        {'G', '$'}, {'H', '%'}, {'I', '^'}, {'J', '&'}, {'K', '*'}, {'L', 'V'}, {'M', 'd'}, {'O', 'X'}, {'P', 'R'}, {'R', 'W'},
        {'S', 'v'}, {'T', 'e'}, {'U', 'n'}, {'V', 'i'}, {'W', 'o'}, {'X', 'y'}, {'Y', '+'}, {'Z', '_'}, {' ', 'g'}, {'z', 'f'}
    };
    unordered_map<char, char> decrypt_key {
        {'l', 'a'}, {'K', 'b'}, {'>', 'c'}, {'u', 'd'}, {'q', 'e'}, {'a', 'f'}, {'G', 'g'}, {'w','h'}, {'=', 'i'}, {'|', 'j'},
        {';', 'k'}, {'c', 'l'}, {'A', 'm'}, {'Q', 'n'}, {'U', 'o'}, {'5', 'p'}, {'<', 'r'}, {'?','s'}, {'F', 't'}, {'L', 'u'},
        {'b', 'v'}, {'C', 'w'}, {'T', 'x'}, {'z', 'y'}, {'2', 'A'}, {'-', 'B'}, {'E', 'C'}, {'!', 'D'}, {'@', 'E'}, {'#', 'F'},
        {'$', 'G'}, {'%', 'H'}, {'^', 'I'}, {'&', 'J'}, {'*', 'K'}, {'V', 'L'}, {'d', 'M'}, {'X', 'O'}, {'R', 'P'}, {'W', 'R'},
        {'v', 'S'}, {'e', 'T'}, {'n', 'U'}, {'i', 'V'}, {'o', 'W'}, {'y', 'X'}, {'+', 'Y'}, {'_', 'Z'}, {'g', ' '}, {'f', 'z'}
    };
    
    cout<<"\n1: Encrypt message\n2: Decrypt message"<<endl;
    int choice {};
    cin>> choice;

    string msg {};

    if (choice == 1){
            cout<<"Enter message to encrypt"<<endl;
            cin.ignore();
            getline(cin, msg);
            cout<< translate(msg, encrypt_key);
    }
    if (choice == 2){
            cout<<"Enter message to decrypt"<<endl;
            cin.ignore();
            getline(cin, msg);
            cout<< translate(msg, decrypt_key);
    }
    return 0;
}