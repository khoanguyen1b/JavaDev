/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author K-P-P-K
 */
public class Songuyento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,i,dem=0;
        System.out.println("a=");
        Scanner nhapdl=new Scanner(System.in);
        a=nhapdl.nextInt();
        for(i=2;i<=(a/2);i++)
            if(a%i==0) 
            {
               System.out.println(a+ "không là số nguyên tố");
               dem++;
               break;
            }
        if(dem==0) System.out.println(a+ "là số nguyên tố");
    }
    
}
