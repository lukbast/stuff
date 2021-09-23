#ifndef __ACCOUNT_H__
#define __ACCOUNT_H__
#include <string>
#include <iostream>

#include "I_Printable.h"

using std::string;


class Account: public I_Printable{ //Base abstract class

protected:
    string name;
    double balance;

public:
    Account(string name,double balance);
    double get_balance();
    virtual bool withdraw(double amount) = 0;
    virtual bool deposit(double amount) = 0;
    virtual ~Account() {}
    
    virtual void print(std::ostream &os) const override;
};

#endif