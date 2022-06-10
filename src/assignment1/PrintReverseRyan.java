package assignment1;

import java.util.*;

/*
// Class:      CS 5040
// Term:       Summer 2022 
// Name:       Ryan O'Connor 
// Program Number: Assignment 1 Program 1 PrintReverse
// IDE : 	   VS-Code
*/

public class PrintReverseRyan{
    public static void main(String[] args)
    {
        
        //Ask the user for an input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the string you want to reverse: ");
        final String userWord = scan.nextLine();
        
        //Call our recursive function
        printCharsReverse(userWord);
        tryAgain();
    }

    //This recursive method requires an initial input
    public static String printCharsReverse(String str){
        //Parses the method's string into a char array.
        char [] charry = str.toCharArray();
        
        //Make a base case
        int baseCase = charry.length;
        int index = baseCase -1;

        //Print the char array from the last index to the beginning index (reverse)
        while(index>=0)
        {
            System.out.print(charry[index]);
            --index;
        }
        
        return str;
    }
    
    //This recursive method doesnt require an initial user input
    public static String printCharsReverseAgain(){
        //Get string from user within the method
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the string you want to reverse: ");
        final String str = scan.nextLine();

        //Parse user input into a char array
        char [] charry = str.toCharArray();
        int baseCase = charry.length;
        int index = baseCase-1;


        while(index>=0)
        {
            System.out.print(charry[index]);
            --index;
        }
        
        return str;
    }




    public static void tryAgain(){

        Scanner scan = new Scanner(System.in);
        //Ask the user if they want to try again, parse the first letter of their answer to a character.
        System.out.println("\nTry again?");
        char answerChar = scan.next().charAt(0);

        //Create conditions to handle the try again answer.
        char yesAnswer = 'Y';
        char yesAnswer2 = 'y';
        char noAnswer = 'N';
        char noAnswer2= 'n';

        //Calls a different recursive function that asks for a new string
        if(answerChar == yesAnswer)
        {
            printCharsReverseAgain();
        }
        if(answerChar == yesAnswer2)
        {
            printCharsReverseAgain();
        }

        //Quits program
        if(answerChar == noAnswer)
        {
            System.out.println("Terminating....");
            return;
        }
        if(answerChar == noAnswer2)
        {
            System.out.println("Terminating....");
            return;
        }

        tryAgain();
    }










}