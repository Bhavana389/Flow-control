import java.util.*;
class Colour
{ public static void main(String[]args)
     { char b,c,d,e,f,h;
        char a ;
       Scanner sc = new Scanner(System.in);
       System.out.println(" enter the letter");
         a = sc.next().charAt(0);
         b='r';
         c='g';
         d='b';
         e='o';
        f='y';
        h='w';
         if(a==b)
            { System.out.println("red");
             }
       else if(a==c)
            { System.out.println("green");
             }
       else if(a==d)
            { System.out.println("blue");
             }
       else if(a==e)
            { System.out.println("orange");
             }
       else if(a==f)
            { System.out.println("yellow");
             }
       else if(a==h)
            { System.out.println("white");
             }
         else
            System.out.println("invalid");
        }
}