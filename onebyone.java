import java.util.Scanner;
public class onebyone{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n =sc.nextInt();
//int n =5;
for(int i=0;i<5;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print((j+1)+" ");
}
System.out.println();
sc.close();
}
}
}