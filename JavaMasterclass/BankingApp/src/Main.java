import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static  Bank bank = new Bank("CykaBlyatBankingCorp");

    public static void main(String[] args) {

        boolean quit = false;
        printactions();

        while(!quit) {
            System.out.println("Enter your choice...");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    performTransaction();
                    break;
                case 4:
                    showList();
                    break;
                case 5:
                    printactions();
                    break;
                case 6:
                    quit =true;
                    break;
                default:
                    System.out.println("Invalid command");
            }//end of switch
        }//end of while loop
    }//end of main method

    public static void printactions(){
        System.out.println("Press...");
        System.out.println("1 - to add branch");
        System.out.println("2 - to add customer");
        System.out.println("3 - to make transaction");
        System.out.println("4 - to show list of branches, customers and their history of transactions");
        System.out.println("5 - to show possible actions");
        System.out.println("6 - to quit");


    }

    public static void addBranch(){
        System.out.println("Please, enter name of branch.");
        bank.addBranch(scanner.next());
    }

    public static void addCustomer(){
        System.out.println("Please, enter name of branch in witch you want place new customer");
        String branch = scanner.next();
        System.out.println("Please, enter name of customer.");
        String name = scanner.next();
        bank.addCustomerToBranch(branch, name);
    }

    public static void performTransaction(){
        System.out.println("Please, enter name of branch that customer belongs to");
        String branch = scanner.next();
        System.out.println("Please, enter name of customer.");
        String name = scanner.next();
        System.out.println("Please, enter value of transactions.");
        double value = scanner.nextDouble();
        bank.newCustomersTransaction(branch,name,value);
    }

    public static void showList(){
        bank.showBranchesList();
    }


}// end of main class
