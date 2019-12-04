import java.util.*;
class String123
{ public static void main(String[]args)
{ int i;
 for(i=0;i<args.length;i++)
      { if( args[0] == " ")
          System.out.println(" No values");
          else
             for(i=0;i<args.length;i++)
            System.out.print( args[i]  +" , ");
      }
}
}