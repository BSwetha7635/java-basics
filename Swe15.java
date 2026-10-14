import java.util.Scanner;
public class Swe15{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int num = sc.nextInt();
if (num >= 0)
{
    if(num == 0)
    {
        System.out.println("zero");
    }
    else
    {
        System.out.println("positive");
     }
}
else
{
System.out.println("negative");
}
sc.close();
}
}

