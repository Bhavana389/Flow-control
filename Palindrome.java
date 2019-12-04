import java.util.*;
class Palindrome
 {public static void main(String[] args)
 { int n, rn = 0, remainder, on;
    Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     on = n;
         while( n != 0 )
        {
            remainder = n % 10;
            rn = rn * 10 + remainder;
            n  /= 10;
        }
        if (on == rn)
            System.out.println(on + " is a palindrome.");
        else
            System.out.println(on + " is not a palindrome.");
    
}
}