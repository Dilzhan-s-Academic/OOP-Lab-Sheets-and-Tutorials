public class ex03{
    public static void main(String[] arg){
        BankAccount bAcc1 = new BankAccount("213143211","Kamal",137824.00);
        BankAccount bAcc2 = new BankAccount("213423432","Piyal",4253243.00);

        System.out.println( "######### Bank Account 1 #########" );
        bAcc1.display();
        System.out.println( "######### Bank Account 2 #########" );
        bAcc2.display();

    }
}

public class BankAccount {
    private String accountNum;
    private String name;
    private double balance;

    BankAccount(){
        accountNum = "0000000000";
        name = "";
        balance = 0.00;
    }

    BankAccount(String accountNum, String name, double balance){
        this.accountNum = accountNum;
        this.name = name;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void Withdraw(double amount){
        balance -= amount;
    }

    public void Deposit(double amount){
        balance += amount;
    }

    public void display(){
        System.out.println("Account Number : " + accountNum);
        System.out.println("Account holder's Name : " + name);
        System.out.println("Account Balance : " + balance);
        System.out.println();
    }
}