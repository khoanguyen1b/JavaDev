package insole;

import java.util.Scanner;

/**
 *
 * @author K-P-P-K
 */
public class Insole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i;
        Scanner nhapdl=new Scanner(System.in);
        System.out.println("n=");
        n=nhapdl.nextInt();
        for (i=1;i<=n;i=i+2)
            System.out.println(i+" ");
            
    }
    
}