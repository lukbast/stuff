import java.util.ArrayList;

public class ContactsList {

    private   ArrayList<Contacts> contactsList = new ArrayList<Contacts>();

    public   void addContactsList(Contacts contacts){
        contactsList.add(contacts);
    }

    public   void printContactsList(){
        System.out.println("Contacts List");
        for(int i=0; i<contactsList.size(); i++){
            System.out.println((i+1)+". "+ Contacts.ge);
        }




    }
    public  void modifyContact(int position, Contacts newContact){
        contactsList.set(position, newContact);
        System.out.println("Contact No."+(position+1)+ "has been modified");
    }

    public  void removeContact(int position){
       contactsList.remove(position);

    }

    public   Contacts findContact(Contacts contact){
   //     boolean exists = contactsList.contains(contact);

        int position = contactsList.indexOf(contact);
        if(position>=0){
            return contactsList.get(position);
        }

        return null;
    }



}
