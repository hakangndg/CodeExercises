package Lists.MobilePhoneContacts;
import java.util.ArrayList;
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
    
   public boolean addNewContact(Contact contact){
 
    for(Contact c : myContacts) {
        if(c.getName().equals(contact.getName())) {
            return false;
        }
    }
    return myContacts.add(contact); 
}
    
    public boolean updateContact(Contact oldContact, Contact newContact){
        if(!myContacts.contains(oldContact)){
            return false;
        }
        int index = myContacts.indexOf(oldContact); 
        myContacts.set(index, newContact);
        return true;
    }
    
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }
    
    private int findContact(Contact contact){
        if(!myContacts.contains(contact)){
            return -1;
        }
        return myContacts.indexOf(contact);
    }
    
    private int findContact(String name){
        for(Contact contact : myContacts){
            if(contact.getName().equals(name)){
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }
    
    public Contact queryContact(String name){
        for(Contact contact : myContacts){
            if(contact.getName().equals(name)){
                return contact;
            }
        } 
        return null;
    }
    
    public void printContacts(){
        int counter = 1;
        System.out.println("Contact List:");
        for (Contact contact : myContacts){
            System.out.println(counter + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            counter++;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}