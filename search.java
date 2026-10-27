public class search{
public static void main(String[]args)
{
int [] n = {10,20,10,40,20,20,20,10};
int target =10;
boolean found = false;
for(int i:n){
if (i == target){
System.out.println(i);
break;
}
}
if (!found){
System.out.println("none");
}
}
}
