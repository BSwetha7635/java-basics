import java.util.Scanner;
public class Odd{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int odd =0;
int even=0;
for (int i=1;i<=n;i++)
     if(i%2==0){
        System.out.println(odd+i);
      }
     else{
         System.out.println(even+i);
      }
sc.close();
}
}


