import java.util.*;
class Rev
{public static void main(String args[])
{int n,i,count=0,p,s;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
s=n;
 while(n!=0)
{n/=10;
 count++;
}
for(i=count;i>=1;i--)
{p=(s%10);
System.out.print(p);
 s=s/10;
}
}
}