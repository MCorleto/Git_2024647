/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024647;

import java.util.scanner;

/**
 *
 * @author corle
 */
public class Git_2024647 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Created by: 2024647
        
        // TODO code application logic here
        
        // Keyboard input ready to use 
        Scanner MyKB = new Scanner (System.in);
        
        // Declaration of variables  
        String userName,nameToUpper;
    
        try{
            // Loop code active
            System.out.println("Hi");
            System.out.println("What is your name? ...");
            System.out.println("Remember: you're only allowed to type letters!");
            System.out.println("");
            
            // line in use for user's answer, notice has a string method to cut off extra spaces in the user's answer
            userName = MyKB.nextLine().trim();
            
            // Condition that  activates if user types numbers or names lenght is less than 3
            if(!userName.matches("[a-zA-Z]+") || userName.length() < 3){
                
                // Loop code beginning 
                do{
                        // Output message
                        System.out.println("ERROR!");
                        System.out.println("Numbers are not allowed! also there's a minimum of at least 3 letters for a name...");
                        System.out.println("Try again!");
                        System.out.println("");

                        // line in use for user's answer, notice has a string method to cut off extra spaces in the user's answer
                        userName = MyKB.nextLine().trim();

                    }
                    // The loop will still working until the user type a letter-based answer
                    while(!userName.matches("[a-zA-Z]+") || userName.length() < 3);
            }
            
            
            // String that Convert the first letter to upper case
            nameToUpper = userName.substring(0, 1).toUpperCase() + userName.substring(1);
            
            // output message
            System.out.println("");
            System.out.println("Your answer was: " + userName);
            
            // this output message will show the user the lenght of the user's answer
            System.out.println("The length of your name is: " + userName.length() + " letters");
            System.out.println("");
            System.out.println("And Remember that every 1st letter of a name should in upper case");
            
            // We use the Capital Letter variable here 
            System.out.println("so, your name should be like this: " + nameToUpper);
            System.out.println("");
            System.out.println("That's all, thanks for using my program! :D");
        }
        
        // Code that will catch an error during execution, output message for an error
        catch (Exception e){
            System.out.println("Sorry! something unexpected happened...");

        System.out.println("Hi!");
        System.out.println("My name is Miguel - 20246476");

        
    }
    
}
