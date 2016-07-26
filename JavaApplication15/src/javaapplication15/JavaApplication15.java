/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author zdelc
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        
        double mult3 = n / 3;
        double mult3Adjusted = mult3 / 2;
        int a3 = 3;
        double aN = mult3 * a3;
        double sumMult3 = (mult3Adjusted * (a3 + aN));
        
        System.out.println(sumMult3);
        
        double mult5 = n / 5;
        double mult5Adjusted = mult5 / 2;
        int a5 = 5;
        double aM = mult5 * a5;
        double sumMult5 = (mult5Adjusted * (a5 + aM));
        
        System.out.println(sumMult5);
        
    }
    
}
