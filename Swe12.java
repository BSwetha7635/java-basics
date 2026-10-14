import java.util.Scanner;
public class Swe12{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the 1 number");
int a = sc.nextInt();

System.out.println("enter the 2 number");
int b = sc.nextInt();

System.out.println("enter the 3 number");
int c = sc.nextInt();

if(a>b && a>c){
System.out.println("enter the number is:" +a);
} 
else if (b>a && b>c)
{
System.out.println("enter the number is:" +b);
}
else
{
System.out.println("enter the number is:" +c);
}
}
}



 