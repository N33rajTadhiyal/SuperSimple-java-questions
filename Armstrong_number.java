import java.io.*;
public class Armstrong_number {
    
    public static void main(String[] args) {
        // to check if a givern number is a armstrong number or not
        
        try {     
            System.out.println("enter the number");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            int x = num;
            int sum =0;

            while(num>=1)
            {
                int  a= num%10;
                sum = sum+(a*a*a);
                num=num/10;

            }
            if(sum == x)
            {
                System.out.println("it is armstrong");
            }
            else{
                System.out.println("is not ");
            }            
        
        }
         catch (Exception e) {
            System.out.println(e+" came");
        }
    }
}
