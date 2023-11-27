package set;
import java.util.*;
public class reverse {
 public void reverseArray(int a[],int n) {
	 Scanner sc=new Scanner(System.in);
	 for(int i=0;i<n;i++) {
		 System.out.println("enter value:");
		 a[i]=sc.nextInt();
	 }
	 for(int i=n-1;i>=0;i--) {
		 System.out.println(""+a[i]+"");
	 }
	 sc.close();
 }
 public static void main(String[] args) {
	 reverse rs=new reverse();
	 Scanner sc=new Scanner(System.in);
	 int []a=new int[20];
	 System.out.println("how many numbers you want:");
	 int n=sc.nextInt();
	 rs.reverseArray(a,n);
	 sc.close();
 }
}
