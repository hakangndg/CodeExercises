public class Main {

    public static void main(String args[]){
        Car car = new Car();
        car.describeCar();
        System.out.println(car.getModel()); 

        BankAccount acc = new BankAccount();
        acc.setAccountBalance(20);
        acc.withdraw(5);
        System.out.println(acc.getAccountBalance());
        acc.deposit(100);

        Customer customer = new Customer("Brad Pitt", 100, "bradpitt@gmail.com"); //customer object with all fields
        Customer randomCustomer = new Customer(); //customer with default constructor (assigning pre determined default values for it)
        Customer person = new Customer("Nolan", "nolan@gmail.com"); //different constructor with no creditLimit field, assigning creditLimit to default by calling another constructor
        customer.getCustomerInfo();
        randomCustomer.getCustomerInfo();
        person.getCustomerInfo();
    }
    
}
