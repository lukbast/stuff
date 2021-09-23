#include "Account.h"
#include <string>
#include <iostream>

using std::string;
using std::cout;
using std::endl;

Account::Account(string name,double balance)
    :name{name}, balance{balance}{

}

double Account::get_balance(){
    return balance;
}


bool Account::withdraw(double amount){
    if(balance < amount){
        cout<< "lack of account funds"<<endl;
        return -1;
    }
    balance -= amount;
    return 0;
}

bool Account::deposit(double amount){
    balance += amount;
    return 0;
}

 void Account::print(std::ostream &os) const {
    os.precision(2);
    os << std::fixed;
    os << "[Account: " << name << ": " << balance << "]";
}
