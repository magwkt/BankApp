import java.sql.SQLOutput;
import java.util.Scanner;

public class Account {
    private String name;
    private String surname;
    private String accNumber;
    private long balance;

    Scanner scanner = new Scanner(System.in);

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getAccNumber(){
        return accNumber;
    }
    public void setAccNumber(String accNumber){
        this.accNumber = accNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void createAccount(){
        System.out.println("Eneter your name");
        name = scanner.next();
        System.out.println("Enter your surname");
        surname = scanner.next();
        System.out.println("Eneter your account number");
        accNumber = scanner.next();
        System.out.println("Eneter your balance");
        balance = scanner.nextLong();

    }


    public void showAccount() {
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("accNumber:" + accNumber);
        System.out.println("balance:" + balance);


    }

    public void depositMoney() {
        System.out.println("How much money you want to deposit?");
        long amount = scanner.nextLong();
        balance = balance + amount;
        System.out.println("Your current balance is:" + balance);


    }

    public void withdraw() {
        System.out.print("How much You want to take?: ");
        long amount = scanner.nextLong();

        if(balance >= amount){
            balance = balance - amount;
            System.out.println("Your current balance is" + balance);
    }
    else {
            System.out.println("your balance is less than" + amount);
        }
    }

    public boolean search(String accountNumber) {
        if(accountNumber.equals(accountNumber)) {
            return true;
        }
        else
        {
            return false;

        }


    }
}



