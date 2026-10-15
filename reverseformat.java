import java.util.Scanner;
public class reverseformat{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int k=sc.nextInt();
int digit;
for(int i=k;i>0;i/=10)
{
System.out.println(i%10);
digit = i%10;
System.out.print(digit);
}
sc.close();
}
}
