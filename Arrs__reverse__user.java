import java.util.*;
public class Arrs__reverse__user{
public static void main (String[] args){
int mark[] = new int[5];
Scanner sc = new Scanner(System.in);
for(int i=0;i<mark.length;i++){
System.out.println("enter the "+i+" index:");
mark [i]= sc.nextInt();
System.out.println(Arrays.toString(mark));
}
}
}