import java.util.*;
class Divi
{ public static void main(String[]args)
   { int i,s=0;
       for(i=1;i<=500;i++)
          { if(i%2==0 && i%3==0 && i%5==0)
                { System.out.println(i);
                  s++;
                if(s>4)
                   {  break;
                    }
                 else
                   continue;
                 }
            }
}
}