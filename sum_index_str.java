public class sum_index_str{
public staticvoid main(String[]args){
String s="456";
String t="123";
int a=0;
for(char c:s.tocharArray());
{
a=a*10;
a+=c-'0';
}
int b=0;
for (char c:t.tocharArray());{
b=b*10;
b+=-'0';
}
Sysytem.out.println(a+b);
}
}