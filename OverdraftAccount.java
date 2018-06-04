/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class OverdraftAccount extends BankAccount{
    int overdraftLimit = 1500;
    int withdrawalAmount;
    
    public void withdrawOverdraft(){
        System.out.println("Enter Withdrawal Amount");
        withdrawalAmount = in.nextInt();
        
        
        if(withdrawalAmount > balance){
              if((withdrawalAmount)>(balance+overdraftLimit)){
                  System.out.println("Insufficient balance.");
              }
              else{
                  int finalBalance = ((balance+overdraftLimit)-withdrawalAmount)-overdraftLimit;
                  System.out.println("Balance after withdrawal : " + finalBalance);
              }
        }
        else{
            int finalBalance = balance-withdrawalAmount;
            System.out.println("Balance after withdrawal : " + finalBalance);
        }
   
        
    }

    OverdraftAccount(String BankId, String BankName,String accountNo, String ownerName, int balance) {
        this.BankId = BankId;
        this.BankName = BankName;
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    
    
    
}
