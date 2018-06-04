
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
public class BankDetails {
    String BankId;
    String BankName;
    
    Scanner in = new Scanner(System.in);
    
    BankDetails(){
        this.BankId = null;
        this.BankName = null;
    }
    
    BankDetails(String BankId, String BankName){
        this.BankId = BankId;
        this.BankName = BankName;
    }
    
    BankDetails(BankDetails otherBankDetails){
        this.BankId = otherBankDetails.BankId;
        this.BankName = otherBankDetails.BankName;
    }
    
    void setBankId(){
        System.out.println("Enter Bank Id : ");
        BankId = in.nextLine();
    }
    
    String getBankId(){
        return BankId;
    }
    
    void setBankName(){
        System.out.println("Enter Bank Name : ");
        BankName = in.nextLine();
    }
    
    String getBankName(){
        return BankName;
    }
    
    void setData(){
        setBankId();
        setBankName();
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        String data = "Bank Id : " + BankId + "\n" + "Bank Name : " + BankName + "\n";
        return data;
    }
}
