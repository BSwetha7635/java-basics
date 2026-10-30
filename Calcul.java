public class Calcul{
int a;
int b;
int add(int a, int b){
return a+b;
}
int sub(int a, int b){
return a-b;
}
int multi(int a, int b){
return a*b;
}
double div(int a, int b){
return a/b;
}
public static void main(String []args){
Calcul c1=new Calcul();
int Addition=c1.add(8,2);
int Substraction=c1.sub(8,2);
int Multiplication=c1.multi(8,2);
double Division=c1.div(8,2);
System.out.println(Addition);
System.out.println(Substraction);
System.out.println(Multiplication);
System.out.println(Division);
}
}