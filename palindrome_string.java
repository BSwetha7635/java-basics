public class Palindrome_String {
public static void main(String[] args) {
String str1 = "mam";
String str2 = "leetel";
String str3 = "letterettl";
System.out.println(str1 + " = " + isPalindrome(str1));
System.out.println(str2 + " = " + isPalindrome(str2));
System.out.println(str3 + " = " + isPalindrome(str3));
}
public static boolean isPalindrome(String str) {
for (int i = 0; i < str.length() / 2; i++) {
if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
return false;
}
}
return true;
}
}