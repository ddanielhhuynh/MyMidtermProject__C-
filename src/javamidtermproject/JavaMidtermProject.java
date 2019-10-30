/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamidtermproject;
import java.util.Scanner;


/**
 *
 * @author SJHS-DHuynh
 */
public class JavaMidtermProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int choice1;
        int choice1count = 0;
        do
        {
            choice1count = (choice1count + 1);
        System.out.println("Q1: " + "How many days are in a week");
        choice1 = input.nextInt();
        
        if (choice1 != 7)
        {
            System.out.println("Incorrect! Try Again!");
        }
            else if (2 == choice1count){
             System.out.println("LOOK IT UP! GET HELP");
            }
            else if (4 == choice1count) {
                System.out.println("Ok...Lets just move on");
            }
        } while (choice1 != 7);
        
    }
    
}
