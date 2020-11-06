import java.util.*;
class apple{
public static void main( String args[]){
Scanner ab = new Scanner (System.in);
System.out.println("enter the values of a and b:");
int a=ab.nextInt();
int b=ab.nextInt();
int i,j,k=1;
	
	for(i=a;i<=b;i++)
		{
			 for(j=2;j<=i/2;j++)
			 {
				  if(i%j==0)
				  {
				  k=0;
				  break;
				  }
					  else
					  {
					  k=1;
					  }
		    }
		 
			 if (k==1)
				 {
				 System.out.print(i);
				 System.out.print("\t");
				 
				 }
		 }
		 
		 
	 }
 }