#ifndef __MYSTRING__
#define __MYSTRING__

#include <iostream>

class Mystring
{
private:
    char *str;
public:
    //constructor   
    Mystring(const char *s);
    //destructor
    ~Mystring();
    //copy constructor
    Mystring(const Mystring &source);
    //move constuctor
    Mystring(Mystring &&source);

    //operators
    Mystring operator+(Mystring &rhs);
    void operator+=(Mystring &rhs);
    friend std::ostream &operator<<(std::ostream &os, Mystring &rhs);
    Mystring operator*(int rhs);
    bool operator==(Mystring &rhs);
    bool operator!=(Mystring &rhs);
    bool operator>(Mystring &rhs);
    bool operator<(Mystring &rhs);
};

#endif