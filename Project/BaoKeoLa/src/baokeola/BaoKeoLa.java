
package baokeola;
import java.util.Random;
import java.util.Scanner;
 
public class BaoKeoLa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Xin chào các bạn đến với chương trình oẳn tù tì");
        System.out.println("Quy ước như sau:");
        System.out.println("Bao là số 1");
        System.out.println("Búa là số 2");
        System.out.println("Kéo là số 3");
        System.out.println();
        int dem=0;
        do{
        System.out.println("Bạn ra ");
        int toi=0,ban;
        Random rd = new Random(); 
        Scanner nhapdulieu= new Scanner(System.in);
        ban=nhapdulieu.nextInt();
        System.out.println("Tôi ra ");
        //công thức sinh ngau nhiên trong khoảng cho trước;
        toi= 1+rd.nextInt(3);
        System.out.println(toi);
        if (ban==toi) System.out.println("Hòa nhé");
        else if ((((ban==1)&&(toi==2))||((ban==2)&&(toi==3)))||((ban==3)&&(toi==1))) 
        System.out.println("Bạn thắng rồi nhé!");
        else System.out.println("Tôi  thắng rồi nhé!");
        System.out.println("Có muốn chơi tiếp không! nhập 1 để tiếp tục");
        dem=nhapdulieu.nextInt();
        }while(dem==1);
                        
}
}