public class bankAccound {

    private long accountNumber;
    private double balance;
    private String name;
    private String email;
    private long phoneNumber;

    public bankAccound(long accountNumber, double balance, String name, String email, long phoneNumber ){

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;

    }





    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }


    public String getName() {
        return name;
    }

    public void deposit(int dep){
        balance+= dep;
        System.out.println(balance);
    }

    public void withdraw(int withdrw){
        if(balance>=withdrw){
            balance-=withdrw;
            System.out.println(balance);
        }
        else System.out.println("You are too poor");
    }
}// end of bnk class
