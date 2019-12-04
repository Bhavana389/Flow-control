import java.util.*;
class Pri
 { public static void main(String[]args)
    { int r,flag=0,i;
      Scanner sc =new Scanner(System.in);
         r = sc.nextInt();
        for (i = 2; i < r/ 2; ++i)
 { if (r % i == 0) {
            flag = 1;
            break;
        }
    }
    if (r == 1) {
        System.out.println("1 is neither prime nor composite.");
    }
    else {
        if (flag == 0)
            System.out.println(r+" is a prime number.");
        else
            System.out.println(r+" is not a prime number.");
}
}
}