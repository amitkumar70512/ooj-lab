import java.util.*;
class extra2{
public static void main (String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the range of an array");
int range=sc.nextInt();
 int[] arr = new int[range];
int zero=0,pos=0,neg=0;
		for(int i=0;i<range;i++)
		{
		 System.out.println("Enter the integer");
		 int value=sc.nextInt();
			 if(value==0){
					zero++;
				}
				else if (value<0){
					neg++;
				}
				else
					pos++;
		  int [i] arr= {value};
		}
System.out.println("The total positive integers entered are: \t"+ pos);
System.out.println(" The total zeros entered are: \t"+ zero);
System.out.println(" The total negative integers entered are: \t"+ neg);
}
} 