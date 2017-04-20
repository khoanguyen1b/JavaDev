public class KiemtraSonguyento {

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
               System.out.println(a+ "không là s? nguyên t?");
               dem++;
               break;
            }
        if(dem==0) System.out.println(a+ "là s? nguyên t?");
    }
    
}
