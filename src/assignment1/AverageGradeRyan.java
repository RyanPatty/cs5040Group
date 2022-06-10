package assignment1;

import java.util.Arrays;
import java.util.Scanner;
/*
// Class:      CS 5040
// Term:       Summer 2022 
// Name:       Ryan O'Connor 
// Program Number: Assignment 1 Program 2 AverageGrade
// IDE : 	   VS-Code
*/
public class AverageGradeRyan{
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        //Gets the student count from the user
        System.out.println("Please enter a number of students");
        int studentCount = scan.nextInt();

        //Create array for grades, with size of student count
        int [] gradeArray = new int[studentCount];
        int baseCase = 0;

        //Recursively asks for user to set grades for each index of the gradeArray
        while(baseCase<studentCount){
        int index = baseCase+1;
        System.out.println("Input a grade for student: " + index);
        int grade = scan.nextInt();
        gradeArray[baseCase] = grade;
        ++baseCase;
        }
        System.out.println("These are the grades:  " + Arrays.toString(gradeArray));

        //Call the method to find average from grade array
        findAverage(gradeArray);
    }

    //Find the average of all the values in the grade array.
    public static int[] findAverage(int[] gradeArray) throws InterruptedException{
        int baseCase = 0;
        int sumValue = 0;
        int averageValue =0;

        while(baseCase < gradeArray.length)
        {
            int gradeValue = gradeArray[baseCase];

            sumValue += gradeValue;

            ++baseCase;

            averageValue = sumValue/baseCase;

            System.out.println("--------------------------------");
            System.out.println("Value added: " + gradeValue);
            System.out.println("Average value = " + averageValue );

            Thread.sleep(1000);

        }
        return gradeArray;
    }
}
