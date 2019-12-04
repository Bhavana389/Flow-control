import java.util.*;

class Pattern
{public static void main(String[] args)
 {
    int  rows, i,  j;
    Scanner sc = new Scanner(System.in);
                System.out.println("please enter an integer value");    
    rows = sc.nextInt();
    for ( i = 1 ; i <= rows; i++ ){
      for ( j = 1 ; j <= i; j++ ) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}