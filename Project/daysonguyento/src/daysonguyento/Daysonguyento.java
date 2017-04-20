/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysonguyento;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author K-P-P-K
 */



public class Daysonguyento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in); 
            int n=0; 
            double max=0; 
            try{ 
                    System.out.println("nhap so phan tu mang: "); 
                    n=in.nextInt(); 
            }catch(InputMismatchException e) 
            { 
                System.out.println("sai kieu"); 
            } 

                    double[] d=new double[n]; 
                    for(int i=0;i<n;i++) 
                    { 
                        System.out.println("Nhap Phan tu thu "+i); 
                        d[i]=in.nextDouble(); 
                    } 
             
            //xuat mang: 
            for(int i=0;i<d.length;i++) 
            { 
                System.out.println("Phan tu thu "+i+"la :"+d[i]); 
            } 
    }
}

