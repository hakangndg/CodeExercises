package Lists.AutoBoxingChallenge;
import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){

    public Customer(String name, double initialDeposit){

      this(name.toUpperCase(), new ArrayList<Double>(500));
      transactions.add(initialDeposit);
    }
  }

public class Main {

  public static void main(String[] args) {
    
    Customer bob = new Customer("Bob S", 1000.0);
    System.out.println(bob);

    Bank bank = new Bank("Chase");
    bank.addCustomer("Jane A", 500);
    System.out.println(bank);

    bank.addTransaction("Jane A", -10.25);
    bank.addTransaction("jane A", -75.01);
    bank.printStatement("Jane a");

    bank.addCustomer("bob s",25);  
    bank.addTransaction("Bob s", 100);
    bank.printStatement("bob s");
  }
}

class Bank{
  private String name;
  private ArrayList<Customer> customers = new ArrayList<>(5000);

  public Bank(String name){
    this.name = name;
  }

  private Customer getCustomer(String customerName){
    
    for(var customer : customers){
      if (customer.name().equalsIgnoreCase(customerName)){ //equals ignore case assumes "type" and "tYpE" are equal oppose to .equals
        return customer;
      }
    }
    System.out.printf("Customer (%s) was not found %n", customerName);
    return null;
  }

  public void addCustomer(String name, double initialDeposit){
    if (getCustomer(name) == null){
      Customer customer = new Customer(name, initialDeposit);
      customers.add(customer);
      System.out.println("New customer added: " + name);
    }
  }

  public void addTransaction(String name, double transactionAmount){
    Customer customer = getCustomer(name);
    if (customer != null){
      customer.transactions().add(transactionAmount);
    }
  }

  public void printStatement(String customerName){
    
    Customer customer = getCustomer(customerName);

    if (customer == null){
      return;
    }

    System.out.println("-".repeat(30));
    System.out.println("Customer name: " + customer.name());
    System.out.println("Transactions:");

    for (double d : customer.transactions()){
      System.out.printf("$%10.2f (%s)%n" , d , d < 0 ? "debit" : "credit");
    }
  }


}
