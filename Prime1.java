import java.util.*;
class Prime1
 { public static void main(String[]args)
    { int r;
     for(r=10;r<=99;r++)   
      {  
        boolean flag = false;
        for(int i = 2; i <= r/2; ++i)
        {
             if(r % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(r );
        else
          continue;
}
}
}