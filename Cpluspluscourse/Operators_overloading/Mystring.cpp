#include <cstring>
#include "Mystring.h"
#include <iostream>

using std::strcmp;
using std::strlen;
using std::strcpy;
using std::strcat;
using std::cout;
using std::endl;

//Constructor
Mystring::Mystring(const char *s)
    :str{nullptr}{
        if(s == nullptr){
            str = new char[1];
            *str = '\0';
        } else {
            str = new char[strlen(s)+ 1];
            strcpy(str, s);
        }
}
//Destructor
Mystring::~Mystring(){
    delete [] str;
}
//Copy constructor
Mystring::Mystring(const Mystring &source)
    :str{nullptr}{
        str = new char[strlen(source.str +1)];
        strcpy(str, source.str);
}
//Move constructor
Mystring::Mystring(Mystring &&source)
    :str{source.str}{
        source.str = nullptr;
}


//operators
Mystring Mystring::operator+(Mystring &rhs){
    char *buffer = new char [(strlen(rhs.str) + strlen(str) + 1)];
    strcpy(buffer, str);
    strcat(buffer, rhs.str);
    Mystring new_mystring {buffer};
    return new_mystring;
    delete buffer;
}

void Mystring::operator+=(Mystring &rhs){
    char *buffer = new char [(strlen(rhs.str) + strlen(str) + 1)];
    strcpy(buffer, str);
    strcat(buffer, rhs.str);
    delete str;
    str = buffer;
    buffer = nullptr;
}


std::ostream &operator<<(std::ostream &os, Mystring &rhs){
        os<<rhs.str;
        return os;
}

Mystring Mystring::operator*(int rhs){

    if(rhs <=0){
        return *this;
    }

    char *buffer = new char [(strlen(str)*rhs +1)];
    strcpy(buffer, str);
    for (int i{0}; i<rhs-1; i++){
        strcat(buffer, str);
    }
    Mystring new_str {buffer};
    delete buffer;
    return new_str;
}

bool Mystring::operator==(Mystring &rhs){
    if(strcmp(rhs.str, str) == 0){
        return true;
    }
    return false;
}

bool Mystring::operator!=(Mystring &rhs){
    if(strcmp(rhs.str, str) == 0){
        return false;
    }
    return true;
}

bool Mystring::operator<(Mystring &rhs){
    if(strcmp(str, rhs.str) <0){
        return true;
    }
    return false;
}

bool Mystring::operator>(Mystring &rhs){
    if(strcmp(str, rhs.str) >0){
        return true;
    }
    return false;
}




