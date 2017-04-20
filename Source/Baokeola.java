package baokeola;
import java.util.Random;
import java.util.Scanner;
 
public class BaoKeoLa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Xin chào các b?n d?n v?i chuong trình o?n tù tì");
        System.out.println("Quy u?c nhu sau:");
        System.out.println("Bao là s? 1");
        System.out.println("Búa là s? 2");
        System.out.println("Kéo là s? 3");
        System.out.println();
        int dem=0;
        do{
        System.out.println("B?n ra ");
        int toi=0,ban;
        Random rd = new Random(); 
        Scanner nhapdulieu= new Scanner(System.in);
        ban=nhapdulieu.nextInt();
        System.out.println("Tôi ra ");
        //công th?c sinh ngau nhiên trong kho?ng cho tru?c;
        toi= 1+rd.nextInt(3);
        System.out.println(toi);
        if (ban==toi) System.out.println("Hòa nhé");
        else if ((((ban==1)&&(toi==2))||((ban==2)&&(toi==3)))||((ban==3)&&(toi==1))) 
        System.out.println("B?n th?ng r?i nhé!");
        else System.out.println("Tôi  th?ng r?i nhé!");
        System.out.println("Có mu?n choi ti?p không! nh?p 1 d? ti?p t?c");
        dem=nhapdulieu.nextInt();
        }while(dem==1);
                        
}
}