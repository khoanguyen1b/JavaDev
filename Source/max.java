public class Maxmin 
    { 
        public static void main(String[] args)
          {
         	int a,b;
        	Scanner nhapdl=new Scanner(System.in);
        	System.out.println("nhap a=");
       		a=nhapdl.nextInt();
       	        System.out.println("nhap b=");
       		b=nhapdl.nextInt();
        	   if(a<b) 
                       System.out.println(b+"là max trong 2 s?");
                   else 
                       System.out.println(a+" là max trong 2 s?");
          }
}