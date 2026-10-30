import java.util.*;
public class insertion_sort{
public static void main(String[]args){
int arr[]={5,3,1,2};
for(int i=1;i<arr.length;i++){
int key=arr[i];
int j =1-1;
while(j>=0&& arr[j]>key){
arr [j+1]=ar [j];
j--;
}
arr[j+1]=key;
}
System.out.println("Sorted Array");
}
}