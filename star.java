import java.util.Scanner;
public class star{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n =sc.nextInt();
int k=1;
int space=n/2;
for(int i=0;i<k;i++){
    for(int j=0;j<space;j++)
       Systm.out.print(" ");
    }
    for(int j=0;j<=i;j++){
       System.out.println("*"+"");
    }
    k+=i<n/2?2:-2;
    space+=i<n/2?:-1:1;
    System.out.println();
sc.close();
}
}
