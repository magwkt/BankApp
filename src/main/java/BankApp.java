import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello in our Bank");
        System.out.println("How many users you want to add");
        int amountNewUsers = scanner.nextInt();
        Account tableOfNewCustomers[] = new Account[amountNewUsers];
        for(int i = 0; i < tableOfNewCustomers.length; i++){
            tableOfNewCustomers[i] = new Account();
            tableOfNewCustomers[i].createAccount();
            tableOfNewCustomers[i].showAccount();
        }

        int choice;
        do {
            System.out.println("1. display all accounts details");
            System.out.println("2. Deposit money");
            System.out.println("3.Withdraw money");
            System.out.println("4. Exit app");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
//                    account.showAccount();
                    break;

                case 2:
                    System.out.println("Enter account number to deposit:");
                    String accountNumber = scanner.next();
                    boolean found = false;
                    for(int i = 0; i < tableOfNewCustomers.length; i++){
                        found = tableOfNewCustomers[i].search(accountNumber);
                        if(found){
                            tableOfNewCustomers[i].depositMoney();

                        }
                    }
//                    account.depositMoney();
                    break;
                case 3:
//                    account.withdraw();
                    break;

                case 4:
                    System.out.println("bye bye");
                    break;
            }

            }
            while (choice != 4);
        }
    }


