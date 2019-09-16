/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labtwo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chandana
 */
public class BarChart {
    public static void main(String[] args) {
       try {
            ArrayList arrlistSales = new ArrayList();
            for (int i =1;i<=5;i++){
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter today's salte for store "+i+" : ");
                arrlistSales.add(keyboard.nextFloat());
            }
            System.out.println("SALES BAR CHART");
            int iSize = arrlistSales.size();
            if(null != arrlistSales && arrlistSales.size()>0){
                int storeCount = 0 ;
                for(int iCount =0; iCount<iSize ;iCount++){
                    float slaes =  (float) arrlistSales.get(iCount);
                    int asterisk = (int) (slaes/100); 
                    String strasterisk = "";
                    for(int jCount=0;jCount<asterisk; jCount++ ){
                    strasterisk =strasterisk+"*";
                    }
                storeCount = iCount+1;
                System.out.println("Store"+storeCount+" : "+strasterisk); 
                }
            }
        } catch (Exception e) {
             System.out.println( e);
             System.out.println( "Alphabets and special charecters are not allowed.");
        }  
    }   
}
