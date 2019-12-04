import java.util.*;
class Trainer
  { public static void main(String[]args)
        { int opt , a, b, c;
          char d='y',k;
           Scanner sc = new Scanner(System.in);
System.out.println("  case 1: addition operation");
                     
     System.out.println(" case 2: subraction operation");
 System.out.println("enter option");          
   opt = sc.nextInt();
            System.out.println("enter the value 1");
            a = sc.nextInt();
         System.out.println("enter the value 2");
            b = sc.nextInt();
   switch(opt)
{  case 1:  System.out.println("addition operation");
                      c=a+b;
                   System.out.println("sum is " + c);
                    break;
  case 2:     System.out.println("subraction operation");
                      c=a-b;
                   System.out.println("subraction  is  " + c);
                    break;
default:
              System.out.println("invalid option");
}
System.out.println(" Want to continue ?");
k=sc.next().charAt(0);
 if(d==k)
    {      
{   System.out.println("  case 1: addition operation");
                     
     System.out.println(" case 2: subraction operation");
 }  
   }
else
{   System.out.println(" process done");
   
}
}
}
  
                  
   
        