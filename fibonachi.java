import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

class fibonachi{
    static int a1=-1,b1=1,c1=0;
    public static void main(String[] args) {
      try {
        System.out.println("ENter the lim ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());       

        int a =-1;
        int b=1;
        int c=0;
        System.out.println("without recursion: ");
        for(int i=0;i<l;i++)
        {
            
                c= a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            
           
        }  
        System.out.println("Via recursion: ");   
        fibo(l);
        
      } catch (Exception e) {
         System.out.println(e+" Came");
      }
        
    }
    
    public static void fibo(int lim)
    {
        if(lim>0)
        {
         c1 = a1+b1;
         System.out.print(c1+" ");
         a1=b1;
         b1=c1;
         fibo(lim-1);

        } 
    }
}