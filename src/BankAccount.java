public class BankAccount {
    private String accountHolder;
    private double accountBalance;
    private int accountNumber;

    public BankAccount (String accountHolder, double accountBalance, int accountNumber) {
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public BankAccount () {
        
    }

    public double deposit(double depositAmount) {
        return accountBalance += depositAmount;
    }

    public double withdrawl(double withdrawlAmount) {
        return accountBalance -= withdrawlAmount;
    }

    public void transfer(BankAccount ba, double transAmount){
        this.withdrawl(transAmount);
        ba.deposit(transAmount);
    }

    public void setName(String accName){
        this.accountHolder = accName;
    }

    public void setBal(double accBal){
        this.accountBalance = accBal;
    }

    public void setAcc(int accNum){
        this.accountNumber = accNum;
    }

    public String getAcc(){
        return accountHolder;
    }

    public double getBal(){
        return accountBalance;
    }

    public int getAccNum(){
        return accountNumber;
    }

    public void accountInfo() {
        System.out.println("Account Holder: " + this.accountHolder + " Account Balance: " + this.accountBalance + "\n Account Number: " + this.accountNumber);
    }
}