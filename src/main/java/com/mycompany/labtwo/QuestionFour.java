/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labtwo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Chandana
 */
//Test Scores and grades
public class QuestionFour {
 private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the marks for three testscores :");
        try {
            float testScoreOne = keyboard.nextFloat();
            float testScoreTwo = keyboard.nextFloat();
            float testScoreThree = keyboard.nextFloat();
            float averageScore = (testScoreOne+testScoreTwo+testScoreThree)/3;
            System.out.println("Test scores were: \n" + testScoreOne + "\n"
                + testScoreTwo + "\n" + testScoreThree);
            String strRoundedScore = df.format(averageScore);
            String strGrade = null;
            if(averageScore>=90 && averageScore<=100){
                strGrade= "A";      
            }
            else if(averageScore>=80 && averageScore<=89){
                strGrade= "B";        
            }
            else if(averageScore>=70 && averageScore<=79){
                strGrade= "C";
               
            }
            else if(averageScore>=60 && averageScore<=69){
                strGrade= "D";
            }
            else{
                strGrade= "F";
            }
           
            System.out.println("Congratulations!! Your average test score is:"+ strRoundedScore +" and grade is :" +strGrade);
        } catch (Exception e) {
             System.out.println( "Alphabets and special charecters are not allowed.");
        }  
    }   
}
