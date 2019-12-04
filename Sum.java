import java.util.*;
import java.lang.*;
class Sum
{ public static void main(String[]args)
      { int i,a,b=0,k,s=0,n;
     
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
                 a= sc.nextInt();
      n=a;
         while (a != 0) 
    {
        a /= 10;     
        b++;
    }
System.out.println(b);
 for(i=b;i>=1;i--)
            {  s=n%10+s; 
                n=n/10;
             }
   System.out.println(" sum of digits  " +s);
      }
}