import java.util.Scanner;
public class sum_divisibli_by_3{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n=sc.nextInt();
int sum =0;
for (int i=1;i<=n;i++)
     if(i%3==0){
         sum=sum+i;
      }
     else{
      }
System.out.print("sum.of divisible:"+sum);
sc.close();
}
}
 
