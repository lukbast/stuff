#ifndef __SAVINGS_ACCOUNT_H__
#define __SAVINGS_ACCOUNT_H__

#include "Account.h"
#include <string>


class SavingsAccount: public Account{ //Base abstract class

private:
    double intrest_rate;

public:
    SavingsAccount(string name, double initial_balance, double intrest_rate);//consturctor

    virtual ~SavingsAccount() {} //Destructor
     
    virtual bool withdraw(double ammount) override;
    virtual bool deposit(double ammount) override;
    virtual void print(std::ostream &os) const override;
    
};

#endif