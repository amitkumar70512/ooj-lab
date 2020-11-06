import java.util.*;
class javagrade{
public static void main (String args[]){
Scanner gd= new Scanner (System.in);
System.out.println("enter the Cie marks:");
int Cie =gd.nextInt();
System.out.println("Enter the Sie marks :");
int Sie= gd.nextInt();
int total = Cie + Sie;
System.out.println("Total marks  you got is :\t" + total +"\n your grade is ");
		if(total>=90)
			System.out.print("S\n");
		else if(total>=80 && total<90)
		   System.out.print("A\n");
		else if(total>=70 && total<80)
		   System.out.print("B\n");
		else if(total>=60 && total<70)
		   System.out.print("C\n");
		else if(total>=50 && total<60)
		   System.out.print("D\n");
		else if(total>=40 && total<50)
		   System.out.print("E\n");
		else
		   System.out.print("F\n");
		 
	System.out.print("*****Thanks******");
}
}
	