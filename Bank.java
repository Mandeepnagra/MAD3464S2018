/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Bank {
    public static void main(String[] args) {
        //BankDetails RBC = new BankDetails();
        //RBC.BankId = "RBC1";
        //RBC.BankName = "Royal Bank Of Canada";
        
        //RBC.setBankId();
        //System.out.println("Bank Id : " + RBC.getBankId());
        //RBC.setBankName();
        //System.out.println("Bank Name : " + RBC.getBankName());
        //System.out.println("Bank Id : " + RBC.BankId );
        //System.out.println("Bank Name : " + RBC.BankName );
        
        //RBC.setData();
        BankDetails RBC = new BankDetails("RBC1", "Royal Bank");
        //BankDetails TD = new BankDetails(RBC);
        //System.out.println(RBC.toString());
        
        BankAccount BA = new BankAccount("RBC101", "Royal Bank", "B101", "Mandeep", 20000);
        System.out.println(BA.toString());
        
        //BA.withdraw();
        //BA.deposit();
        
        OverdraftAccount BA2 = new OverdraftAccount("RBC101", "Royal Bank", "B101", "Mandeep", 5000);
        System.out.println(BA2.toString());
        BA2.withdrawOverdraft();
    }
    
}
