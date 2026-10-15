import java.util.Scanner;
class palindrome{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n=sc.nextInt();
int rev=0;
for(int i=n;i>0;i/=10){
    rev=rev*10;
    rev=rev+(i%10);
}
if(rev==n){
    System.out.print("true");
}
else{
    System.out.print("fasle");
}
sc.close();
}
}

