import java.util.*;
class Prk
 { public static void main(String[]args)
    { int r,i,flag=0;
      Scanner sc =new Scanner(System.in);
         r = sc.nextInt();
        for (i = 2; i < r / 2; ++i)
 {    if (r % i == 0) {
            flag = 1;
            break;
        }
 else {
        if (flag == 0)
            System.out.println(r+" is a prime number.");
        else
            System.out.println(r+" is not a prime number.");
}
}
}
}