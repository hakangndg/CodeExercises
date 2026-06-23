public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("you cannot deposit 0 or less");
            return;
        }
        accountBalance += amount;
        System.out.println("operation is successfull");
        System.out.println("the new balance : " + accountBalance);
    }
    public void withdraw(double amount){
        if(accountBalance - amount < 0){
            System.out.println("you can not withdrawt more money than you have");
            return;
        }
        accountBalance -= amount;
        System.out.println("operation succesful,new balance is "+ accountBalance);
    }

    
}
