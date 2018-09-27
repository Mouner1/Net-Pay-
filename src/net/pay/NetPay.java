/*
 * This page was created by Mouner Dabjan   
 * on September 20 
 * To calculate the net pay 
 */

package net.pay;

/**
 *
 * @author modab5310
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hours = 40;
        double wage = 5.00; 
        double insurance = 2.00;
        double tax = 0.22; 
        
        // algortihm for finding the net pay
        double Netpay = ( hours*wage-insurance)- tax*(hours*wage- insurance); 
        
        System.out.println("The net pay is "+ Netpay);
                
        
    }
    
}
