package com;
import java.util.*;
public class menudrive {
  double cylinder(double h,double  r) {
	  return 3.14*r*r*h;
  }
  int factorial(int n) {
	   int i=1,sum=1;
	   while(i<=n) {
		   sum *=i;
		   i++;
	   }
	   return sum;
  }
  boolean armstrong(int n) {
	   int t,count=0,id=0,sum=0;
	   t=n;
	   while(t>0) {
		   t=t/10;
		   count ++;
	   }
	   t=n;
	   while(t>0) {
		   id=t%10;
		   sum +=(Math.pow(id, count));
		   t=t/10;
	   }
	   if(n==sum) 
	     return true;
	   else
	     return false;
  }
	   public static void main(String[] args) {
		   menudrive md=new menudrive();
		   while(true) {
			   Scanner sc=new Scanner(System.in);
			   System.out.print("----MENU----\n"
			   		+ "1.volume of cylinder.\n"
					+ "2.factorial\n"
			   		+ "3.armstrong\n"
					+ "4.exit\n"
			   		+ "enter your choice");
			   int ch=sc.nextInt();
			   switch(ch) {
			   case 1:
				   System.out.println("radius");
				   double r=sc.nextDouble();
				   System.out.println("height");
				   double h=sc.nextDouble();
				   System.out.println("volume of cylinder="+(md.cylinder(h, r)));
				   break;
			   case 2:
				   System.out.println("Enter number;");
				   int n=sc.nextInt();
				   System.out.println(md.factorial(n));
				   break;
			   case 3:
				    System.out.println("enter number:");
				    int num=sc.nextInt();
				    if(md.armstrong(num))
				    	System.out.println("armstrong");
				    else
				    	System.out.println("not armstrong");
				    break;
			   case 4:
				   System.exit(0);
				   break;
			   default:
				    System.out.println("enter valid choice");
				sc.close();
			   }
		   }
		   
	   }
  }
