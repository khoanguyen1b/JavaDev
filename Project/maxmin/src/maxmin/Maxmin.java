/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import java.util.Scanner;

/**
 *
 * @author K-P-P-K
 */
public class Maxmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        Scanner nhapdl=new Scanner(System.in);
        System.out.println("nhap a=");
        a=nhapdl.nextInt();
        System.out.println("nhap b=");
        b=nhapdl.nextInt();
        if(a<b) System.out.println(b+"là max trong 2 số");
        else System.out.println(a+" là max trong 2 số");
    }
    
}
