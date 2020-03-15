/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rps;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author travi
 */
public class rps {
    public static void main(String[] args) {
        
        int rndPlay;
        int rock = 1, paper = 2, scissors = 3;
        int tie = 0, userWin = 0, compWin = 0;
        //String keepPlaying = "y";
        
        Scanner sc = new Scanner(System.in);
        
        String keepPlaying = "y";
        while (keepPlaying.equals("y")) {
        
        System.out.print("How many rounds do you want to play? ");
        rndPlay = sc.nextInt();     
        
        
        for (int i = 1; i <= rndPlay; i++) {
                 
            
            if (rndPlay < 1 || rndPlay > 10){
                System.out.println("Your selection is \"OUT OF BOUNDS\"!");
                break;
            } else {
                System.out.print("Please select: 1 = Rock, 2 = Paper, 3 = Scissors : ");                        
                int playerChoice = sc.nextInt();                
                //System.out.println(playerChoice);              
             
               
                Random rGen = new Random();                
                int compChoice = rGen.nextInt(3) + 1;                
                   
                if (compChoice == 1){
                    if (playerChoice == 1){
                        System.out.println("Tie");
                        tie++;
                    } else if (playerChoice == 2){
                        System.out.println("userWin");
                        userWin++;
                    } else if (playerChoice == 3){
                        System.out.println("compWin");
                        compWin++;
                    }                    
                    
                } else if (compChoice == 2){
                    if (playerChoice == 2){
                        System.out.println("Tie");
                        tie++;
                    } else if (playerChoice == 3){
                        System.out.println("userWin");
                        userWin++;
                    } else if (playerChoice == 1){
                        System.out.println("compWin");
                        compWin++;
                    } 
                    
                } else if (compChoice == 3){
                    if (playerChoice == 3){
                        System.out.println("Tie");
                        tie++;
                    } else if (playerChoice == 1){
                        System.out.println("userWin");
                        userWin++;
                    } else if (playerChoice == 2){
                        System.out.println("compWin");
                        compWin++;
                    }
                    
                }  
                
                System.out.println("Tie # :"+tie);
                System.out.println("UserWin # :"+userWin);
                System.out.println("CompWin # :"+compWin);               
            }           
                
        } // -- FOR LOOP --
            
        if (userWin > compWin){
                System.out.println("The user is the \"Winner\".");
            } else if (userWin < compWin){
                System.out.println("The computer is the \"Winner\".");
            } else {
                 System.out.println("Tie Score!");   
            }
        
            System.out.println("Would you like to play again? (y or n)");
            sc.nextLine();
            keepPlaying = sc.nextLine();
            
            if (keepPlaying.equals("y")){
                continue;
            } else {
                System.out.println("Thanks for playing!");
                break;
            }   
        
        } // -- WHILE LOOP --        
        
    } // -- MAIN METHOD --
} // -- class rps --
