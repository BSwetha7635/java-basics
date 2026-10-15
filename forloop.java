import java.util.Scanner;
public class Forloop{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int sum =0;
for (int i=1;i<=n;i++)
System.out.println("enter number" +i+ ":");
int num=sc.nextInt();
sum=sum + num;

{
System.out.println("sum="+sum);
sc.close();
}
}
}