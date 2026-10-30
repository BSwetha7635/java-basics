public class Student{
String name;
String dept;
void display() {
System.out.println("name:" +name);
System.out.println("dept:" +dept);
}
public static void main(String[]args){
Student s1 =new Student();
s1.name="rahul";
s1.dept="cse";
s1.display();
}
}