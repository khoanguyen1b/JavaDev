package baokeola;
import java.util.Random;
import java.util.Scanner;
 
public class BaoKeoLa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Xin ch�o c�c b?n d?n v?i chuong tr�nh o?n t� t�");
        System.out.println("Quy u?c nhu sau:");
        System.out.println("Bao l� s? 1");
        System.out.println("B�a l� s? 2");
        System.out.println("K�o l� s? 3");
        System.out.println();
        int dem=0;
        do{
        System.out.println("B?n ra ");
        int toi=0,ban;
        Random rd = new Random(); 
        Scanner nhapdulieu= new Scanner(System.in);
        ban=nhapdulieu.nextInt();
        System.out.println("T�i ra ");
        //c�ng th?c sinh ngau nhi�n trong kho?ng cho tru?c;
        toi= 1+rd.nextInt(3);
        System.out.println(toi);
        if (ban==toi) System.out.println("H�a nh�");
        else if ((((ban==1)&&(toi==2))||((ban==2)&&(toi==3)))||((ban==3)&&(toi==1))) 
        System.out.println("B?n th?ng r?i nh�!");
        else System.out.println("T�i  th?ng r?i nh�!");
        System.out.println("C� mu?n choi ti?p kh�ng! nh?p 1 d? ti?p t?c");
        dem=nhapdulieu.nextInt();
        }while(dem==1);
                        
}
}