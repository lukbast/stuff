#include "Savings_account.h"
#include <string>

using std::string;


SavingsAccount::SavingsAccount(string name = "Unnamed sav acc ", double initial_balance = 0.0, double interst_rate= 0.05)
    :Account(name, initial_balance), intrest_rate{interst_rate}{
}

bool SavingsAccount::deposit(double amount){
    amount += amount *(intrest_rate);
    return Account::deposit(amount);
    
}

bool SavingsAccount::withdraw(double amount){
    return Account::withdraw(amount);
}

void SavingsAccount::print(std::ostream &os) const {
    os.precision(2);
    os << std::fixed;
    os << "[Savings_Account: " << name << ": " << balance << ", " << intrest_rate<< "]";
}
