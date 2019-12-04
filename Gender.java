import java.util.*;
class Gender
{ public static void main(String[]args)
    { String a,b;
      int i;
      b="female";
      Scanner sc = new Scanner(System.in);
       System.out.println( " enter gender");
             a =  sc.nextLine();
         for(i=0;i<args.length;i++)
          {  int k = Integer.parseInt(args[0]);
             if(a.equals(b))
               
                 {  if (k<59)
                        { System.out.println(" percentage is 8.2");
                         }
                    else
                       { System.out.println(" percentage is 7.6");
                        }
                  }
             else
               { if (k<61)
                        { System.out.println(" percentage is 9.2");
                         }
                    else
                       { System.out.println(" percentage is 8.3");
                        }
            }
}
}
}