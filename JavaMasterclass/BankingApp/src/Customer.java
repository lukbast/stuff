import java.util.ArrayList;



public class Customer {

    private String name;

    private ArrayList<Double> doubleArrayList;

    public Customer(String name) {
        this.name = name;
        this.doubleArrayList = new ArrayList<Double>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomer() {
        return name;
    }

    public void addTransaction(double valueOfTransaction){
        if(valueOfTransaction<0){
            System.out.println("Invalid value of transaction");
        } else {
            Double aDouble = new Double(valueOfTransaction);
            doubleArrayList.add(aDouble);
            System.out.println("Transaction completed");
        }
    }

    public void showTransactionsList(){
        for(int i= 0; i<doubleArrayList.size();i++){
            System.out.println((i+1)+". "+doubleArrayList.get(i).intValue());
        }
    }





}
