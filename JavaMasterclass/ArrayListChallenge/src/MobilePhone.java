import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private  ContactsList contactsList = new ContactsList();

    public   void mobilePhone(){

    boolean quitFlag = false;
    int choice =0;
    printinstructions();
        while(!quitFlag){
        System.out.println("Enter your choice");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 0:
                printinstructions();
                break;
            case 1:
                contactsList.printContactsList();
                break;
            case 2:
                addContact();
                break;
            case 3:
                modifyContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                searchContact();
                break;
            case 6:
                quitFlag = true;
                break;
        }
    }

}

    public  void printinstructions(){
        System.out.println("Contact book main menu. Enter ");
        System.out.println("0 - Show menu.");
        System.out.println("1 - Show contacts list.");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Modify contact");
        System.out.println("4 - Remove Contact");
        System.out.println("5 - Search for a contact");
        System.out.println("6 - Quit");
    }

    public  void addContact(){
        System.out.println("Enter contact name.");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Enter phone number");
        int number = scanner.nextInt();
        scanner.nextLine();

        Contacts contacts = new Contacts(name, number);
        if (contactsList.findContact(contacts)==null){
            contactsList.addContactsList(contacts);
        } else System.out.println("Contact already exist.");



    }


    public  void modifyContact(){
        System.out.println("Enter contact number.");
        int contactNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter contact name.");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Enter phone number");
        int number = scanner.nextInt();
        scanner.nextLine();

        Contacts contacts = new Contacts(name, number);
        if (contactsList.findContact(contacts)==null){
            contactsList.modifyContact(contactNo, contacts);
        } else System.out.println("Contact already exist.");

    }


    public  void removeContact(){
        System.out.println("Write number of contact that you want to delete");
        int position = scanner.nextInt();
        scanner.nextLine();
        contactsList.removeContact(position);

    }

    public  void searchContact(){


    }




}
