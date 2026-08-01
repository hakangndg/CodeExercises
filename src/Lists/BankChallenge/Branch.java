package Lists.BankChallenge;
import java.util.ArrayList;
public class Branch {
    
    private String name;
    private ArrayList<Customer> customers;
    
    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    
    public boolean newCustomer(String customerName, double initialTransaction){
        
        for (Customer customer : customers){
            if (customer.getName().equals(customerName)){
                return false;
            }
        }
        
        Customer customer = new Customer(customerName, initialTransaction);
        customers.add(customer);
        return true;
    }
    
    public boolean addCustomerTransaction(String customerName, double amount) {
        
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    
    private Customer findCustomer(String customerName) {
        
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
    
    
    
    
    
}