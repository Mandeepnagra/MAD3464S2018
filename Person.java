
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
public class Person {
    String name;
    String address;
    String phoneNo;
    int age;
    char gender;
    Scanner in = new Scanner(System.in);
    
    void setName(){ 
        System.out.println("Enter Name: ");
        name = in.nextLine();
    }
    
    String getName(){
        return name;
    }
    
    void setAddress(){
        System.out.println("Enter Address : ");
        address = in.nextLine();
    }
    
    String getAddress(){
        return address;
    }
    
    void setGender(){
        System.out.println("Enter Gender : ");
        gender = (char)in.nextInt();
        in.nextLine();
    }
    char getGender(){
        return gender;
    }
    
    void setAge(){
        System.out.println("Enter Age : ");
        //age = in.nextInt();
        //age = in.nextLine();
        age = Integer.parseInt(in.nextLine());
    }
    
    int getAge(){
        return age;
    }
    
    void setPhoneNo(){
        System.out.println("Enter Phone : ");
        phoneNo = in.nextLine();
    }
    
    String getPhoneNo(){
        return phoneNo;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        String data = "Name : " + name + "\n" + "Address : " + address + "\n" + "PhoneNo : " + phoneNo + "\n" + "Gender : " + gender + "\n" + "Age : " + age + "\n";
        return data;
    }
    
    void setData(){
        setName();
        setAddress();
        setPhoneNo();
        setAge();
        setGender();
    }
}
