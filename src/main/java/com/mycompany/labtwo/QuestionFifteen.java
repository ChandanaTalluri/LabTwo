/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labtwo;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Chandana
 */
public class QuestionFifteen {
    public static void main(String[] args) {
       
        String strCheckscount = JOptionPane.showInputDialog("Please enter number of checks used per month :");

        try {
            int checkCount = Integer.parseInt(strCheckscount);
            float amount = 0.0F;
            if(checkCount<20){
                amount= 0.10F;      
            }
            else if(checkCount>=20 && checkCount<=39){
                amount= 0.08F;        
            }
            else if(checkCount>=40 && checkCount<=59){
                amount= 0.06F; 
            }
            else {
                amount= 0.04F; 
            }
            float serviveFee = (amount * checkCount)+10;
            String strRounded = df.format(serviveFee);
            JOptionPane.showMessageDialog(null, "Bank service fee per month is :"+strRounded);
            System.out.println("Bank service fee per month is :"+strRounded);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alphabets and special charecters are not allowed.");
        }  
    }
    private static DecimalFormat df = new DecimalFormat("0.00");
}
