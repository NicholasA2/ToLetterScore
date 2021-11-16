/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toletterscore;
import java.util.Scanner;
/**
 *
 * @author Nicholas Adiohos
 */
public class ToLetterScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your score: ");
        int score = input.nextInt();
        
        //Giving results with if else structure
        if (score >= 0 && score < 60)
        {System.out.println("F. Better try again.");}
        else if (score >= 60 && score < 70)
        {System.out.println("D. Passed.");}
        else if (score >= 70 && score < 80)
        {System.out.println("C. Well done.");}
        else if (score >= 80 && score < 90)
        {System.out.println("B. Well done.");}
        else if (score >= 90 && score <= 100)
        {System.out.println("A. Excellent.");}
        
        //Same thing but with switch case structure
        switch (score) {
            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59: System.out.println("F. Better try again."); break;
            case 60,61,62,63,64,65,66,67,68,69:  System.out.println("D. Passed."); break;
            case 70,71,72,73,74,75,76,77,78,79: System.out.println("C. Well done."); break;
            case 80,81,82,83,84,85,86,87,88,89: System.out.println("B. Well done."); break;
            case 90,91,92,93,94,95,96,97,98,99,100: System.out.println("A. Excellent."); break;
            
        }
        }
        }