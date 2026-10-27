public class first_missing{
public static void main(String[]args)
{
int [] n = {5,3,-1,2,1,8};
int target =4;
boolean found = false;
for(int i=0;i<n.length;i++){
if (i == target){
System.out.println(i);
found = true;
break;
}
}
}}

