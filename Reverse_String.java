/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Reverse_String {
    String Str;
    int i;
    Scanner in = new Scanner(System.in);
    
    void setStr(){
        System.out.println("Enter String to reverse:");
        Str = in.nextLine();
    }
    
    String getStr(){
        return Str;
    }
    
    public void reversing(){
        StringBuffer Rev_Str = new StringBuffer();
        String words[] = Str.split(" ");

        for(i=words.length-1; i>=0; i--){
            Rev_Str.append(words[i]).append(' ');
        }
        Rev_Str.setLength(Rev_Str.length()-1);
        System.out.println("Reversed String : " + Rev_Str);
    }
    
}
