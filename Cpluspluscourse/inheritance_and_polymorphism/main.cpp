#include "Account.h"
#include "Savings_account.h"

#include <iostream>

using std::cout;

int main(){

    SavingsAccount sav_acc = SavingsAccount("bruh", 100, 1.00);
    cout<< sav_acc.get_balance();
    sav_acc.deposit(20);
    cout << sav_acc;
    
    

    return 0;
}