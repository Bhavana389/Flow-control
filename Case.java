import java.util.*;
import java.lang.*;
class Case
{public static void main(String args[])
 { char ch,y;
   Scanner sc=new Scanner(System.in);
   ch=sc.next().charAt(0);
   if(ch>=65 && ch<=90)
    {y=Character.toLowerCase(ch);
     System.out.println(ch+"->"+y);
    }
   else
    {y=Character.toUpperCase(ch);
     System.out.println(ch+"->"+y);
    }
}
}