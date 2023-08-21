package Pract;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Rev 
{
	public static void main(String[] args)
	{
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter");
	      int start=in.nextInt();
	      int end=in.nextInt();
	     int result= burg(start,end);
	      System.out.println("Sum of Primes is :"+result);
	 }
	   public static int burg(int start,int end)
	   {
	      int i,j,answer=0,count=0,a=0,b=0;
	      for(i=start;i<=end;i++)
	      {
	         count=0;
	         for(j=i;j>0;j--)
	         {
	            if(i%j==0)
	            {
	               count++;
	            }
	         }
	         if(count==2)
	         {
	            ArrayList<Integer> l=new ArrayList<>();
	            l.add(i);
	            System.out.println(l);
	            a=Collections.min(l);
	            b=Collections.max(l);
	            answer=a+b;
	         }
	      }
	      System.out.println("Lowest Prime No is: "+a);
//
	      System.out.println("Highest Prime No is: "+b);
	      return answer;
	   }
}
