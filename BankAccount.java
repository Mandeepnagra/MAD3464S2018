
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class BankAccount extends BankDetails {
    String accountNo;
    String ownerName;
    int balance;
    
    Scanner in = new Scanner(System.in);
    
    public void withdraw(){
        System.out.println("Enter Withdrawal Amount");
        int withdarawalAmount = in.nextInt();
        int finalBalance = balance-withdarawalAmount;
        System.out.println("Balance after withdrawal : " + finalBalance);
    }
    
    public void deposit(){
        System.out.println("Enter Deposit Amount");
        int depositAmount = in.nextInt();
        int finalBalance = balance+depositAmount;
        System.out.println("Balance after withdrawal : " + finalBalance);
    }
    
    BankAccount() {
        super();
        this.accountNo = null;
        this.ownerName = null;
        this.balance = 0;
    }

    BankAccount(String BankId, String BankName,String accountNo, String ownerName, int balance) {
        super(BankId,BankName);
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return (super.toString() + "Account Number : " + accountNo + "\n" + "Owner Name : " + ownerName +
                "\n" + "Balance : " + balance);
    }
    
    void setaccountNo(){
        System.out.println("Enter Account No : ");
        accountNo = in.nextLine();
    }
    
    String getaccountNo(){
        return accountNo;
    }
    
    void setownerName(){
        System.out.println("Enter Owner name : ");
        ownerName = in.nextLine();
    }
    
    String getownerName(){
        return ownerName;
    }
    
    void setbalance(){
        System.out.println("Enetr Amount : ");
        balance = in.nextInt();
    }
    
    int getbalance(){
        return balance;
    }
    
    
    
    
}
