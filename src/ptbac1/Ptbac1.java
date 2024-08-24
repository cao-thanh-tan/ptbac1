
package ptbac1;

import java.util.Scanner;
        

public class Ptbac1
{

    public static void main(String[] args)
    {
     Scanner scanner= new Scanner(System.in);
    
        System.out.println("nhap a:");
        int a = scanner.nextInt();
        
        System.out.println("nhap b: ");
        int b =scanner.nextInt();
        
        double x=-b/a;
        
         if (a == 0)
        {
            if (b == 0)
            {
                System.out.println("Phuong trinh vo so nghiem.");
            }
            else
            {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
        else
        {
 
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }
      
        }
        
        
    }
    
}
