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
public class SumOfNumbers {
    public static void main(String[] args) {
       
        String strCheckscount = JOptionPane.showInputDialog("Please enter positive nonzero integer value :");

        try {
            int sum = 0;
            int checkCount = Integer.parseInt(strCheckscount);
            if(checkCount>0){
                for(int i=1;i<=checkCount;i++){
                sum = sum+i;
            }
            JOptionPane.showMessageDialog(null, "Sum of "+ strCheckscount +" integers is :"+sum);
            System.out.println("Sum of "+ strCheckscount +" integers is :"+sum);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter only positive and nonzero integer values");
        }  
    }
    private static DecimalFormat df = new DecimalFormat("0.00");
}
