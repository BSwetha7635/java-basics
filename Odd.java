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
       even=even+i;
      }
     else{
        odd=odd+i;
      }
      System.out.println("sum  of no:" +even);
     System.out.println("sum  of no:" +odd)
           
sc.close();
}
}


