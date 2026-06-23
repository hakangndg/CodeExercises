import java.beans.DesignMode;

public class Main {

    public static void main(String args[]){
        /*Car car = new Car();
        car.describeCar();
        System.out.println(car.getModel()); */

        BankAccount acc = new BankAccount();
        acc.setAccountBalance(20);
        acc.withdraw(5);
        System.out.println(acc.getAccountBalance());
        acc.deposit(100);
    }
    
}
