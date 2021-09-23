import java.util.ArrayList;

public class Branch {

    private String nameOfBranch;
    private ArrayList<Customer> listOfCustomers;

    public String getNameOfBranch() {
        return nameOfBranch;
    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public Branch(String nameOfBranch) {
        this.nameOfBranch = nameOfBranch;
        this.listOfCustomers = new ArrayList<Customer>();

    }

    public void addCustomer(String name){
        if (findCustomer(name)){
            System.out.println("Customer already exist on record.");
        } else {
            Customer customer = new Customer(name);
            listOfCustomers.add(customer);
            customer.addTransaction(666d);
            System.out.println("Customer added");
        }
    }

    public void addCustomersTransaction(String name, Double value){
        if (findCustomer(name)){
            Customer customer = listOfCustomers.get(getCustomersPosition(name));
            customer.addTransaction(value);
        } else {
            System.out.println("Customer doesn't exist on the record");
        }
    }

    public void removeCustomer(String name){
        if (!findCustomer(name)){
            System.out.println("Customer doesn't exist on record.");
        } else {
            listOfCustomers.remove(getCustomersPosition(name));
            System.out.println("Customer removed");
        }

    }

    public void renameCustomer(String oldName, String newName){
        if (findCustomer(oldName)){
            Customer customer = listOfCustomers.get(getCustomersPosition(oldName));
            customer.setName(newName);
            System.out.println("Customer renamed");
        } else System.out.println("Customer with name "+oldName+" doesn't exist on the record");
    }


    public boolean findCustomer(String name){
        for (int i =0; i<listOfCustomers.size();i++){
            Customer customer = listOfCustomers.get(i);
            if (customer.getCustomer().equals(name)){
                return true;
            }
        }
        return false;
    }

    public int getCustomersPosition(String name){
        for (int i =0; i<listOfCustomers.size();i++){
            Customer customer = listOfCustomers.get(i);
            if (customer.getCustomer().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void showBCustomersList(){
        for(int i= 0; i<listOfCustomers.size();i++){
            System.out.println((i+1)+". customer"+listOfCustomers.get(i).getCustomer());
            Customer customer = listOfCustomers.get(i);
            System.out.println("List of transactions");
            customer.showTransactionsList();
        }
    }


}
