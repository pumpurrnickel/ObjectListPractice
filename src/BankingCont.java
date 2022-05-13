import java.util.Scanner;
import java.util.ArrayList;

public class BankingCont {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<BankAccount> bankAcc = new ArrayList<BankAccount>();

    public static void main(String[] args) {

        System.out.println("Welcome to the Bank of Hell, Michigan!");
        System.out.println("Are you an existing customer? Enter 'yes' or 'no' \n (enter nothing to exit)");

        while (true) {
            String yesOrNo = input.nextLine();

            if (yesOrNo.contains("yes")) {
                System.out.println("Please enter your account number: ");
                int accountNum;

                if (accountNum < 0 || accountNum > bankAcc.size() - 1) {
                    System.out.println("No account exists under that number.");
                }
                bankMenu(bankAcc.get(accountNum));
            } else if (yesOrNo.contains("no")) {

                System.out.println("Let's get you started!");
                System.out.println("What is the name for the account?");
                BankAccount newBank = new BankAccount();
                bankAcc.add(newBank);
                newBank.setAcc(bankAcc.size() - 1);
                newBank.setName(input.nextLine());

                System.out.println("How much is your initial account balance?");
                bankAcc.setBal(Double.parseDouble(input.nextLine()));

                bankMenu(newBank);
            }
        }
    }

    public static void bankMenu(BankAccount newBank) {

        System.out.println("Greetings, " + newBank.getAcc());
        System.out.println("What can we do for you today?");

        while (true) {
            System.out.println("1. Check account balance" + "\n" + "2. Withdraw from account" + "\n" +
                    "3. Deposit into account" + "\n" + "4. Transfer into another account" + "\n" +
                    "0. Exit menu");
        }
        int menuSelect = input.nextInt();

        if (menuSelect == 1) {

            System.out.println("Please enter an amount you'd like to deposit.");
            double depAmount = input.nextDouble();
            newBank.deposit(depAmount);

        }
        if (menuSelect == 2) {

            System.out.println("Please enter an amount you'd like to withdraw.");
            double withAmount = input.nextDouble();
            newBank.withdrawl(withAmount);
        }
        if (menuSelect == 3) {

            newBank.accountInfo();

        }
        if (menuSelect == 4) {

            System.out.println("Please enter the number of the account you are transfering to.");
            int accNum;
            double transAmount;

            while (true) {
                accNum = Integer.parseInt(input.nextLine());
                System.out.println("Please enter an amount you'd like to transfer.");
                transAmount = Double.parseDouble(input.nextLine());
                break;
            }
            bankAcc.transfer(bankAcc.get(accNum), transAmount);
            System.out.println(transAmount + "transferred to " + bankAcc.get(accNum).getAcc());
            break;
        }
        if (menuSelect == 0) {
            break;
        }

    }
}