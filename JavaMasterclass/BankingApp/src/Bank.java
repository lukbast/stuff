import java.util.ArrayList;

public class Bank {

    private String nameOfBank;
    private ArrayList<Branch> listOfBranches;

    public Bank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
        this.listOfBranches = new ArrayList<Branch>();
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public ArrayList<Branch> getListOfBranches() {
        return listOfBranches;
    }

    public void addBranch(String name) {
        if (findBranch(name)) {
            System.out.println("Branch already exist on record.");
        } else {
            Branch branch = new Branch(name);
            listOfBranches.add(branch);
            System.out.println("Branch added");
        }
    }

    public void addCustomerToBranch(String branchName, String name){
        if (findBranch(branchName)){
          Branch branch =  listOfBranches.get(getBranchPosition(branchName));
                branch.addCustomer(name);

        } else {
            System.out.println("Branch named " + branchName + " doesn't exist");
        }
    }

    public void newCustomersTransaction(String branchName, String name, double value){
        if (findBranch(branchName)){
            Branch branch =  listOfBranches.get(getBranchPosition(branchName));
                branch.addCustomersTransaction(name, value);
        } else {
            System.out.println("Branch named " + branchName + " doesn't exist");
        }
    }


    public int getBranchPosition(String name){
        for (int i =0; i<listOfBranches.size();i++){
            Branch branch = listOfBranches.get(i);
            if (branch.getNameOfBranch().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean findBranch(String name){
        for (int i =0; i<listOfBranches.size();i++){
            Branch branch = listOfBranches.get(i);
            if (branch.getNameOfBranch().equals(name)){
                return true;
            }
        }
        return false;
    }


    public void showBranchesList(){
        for(int i= 0; i<listOfBranches.size();i++){
            System.out.println((i+1)+". branch"+listOfBranches.get(i).getNameOfBranch());
            Branch branch = listOfBranches.get(i);
            branch.showBCustomersList();
        }
    }




}
