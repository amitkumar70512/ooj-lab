/* Write a program that demonstrates handling of exceptions in inheritance tree. Create a base
class called “Father” and derived class called “Son” which extends the base class. In Father
class, implement a constructor which takes the age and throws the exception Wrong Age( )
when the input age<0. In Son class, implement a constructor that cases both father and son’s
age and throws an exception if son’s age is >=father’s age.*/

import java.util.Scanner;
class wrongAge extends Exception {
String str1;
wrongAge(String str2){
str1=str2;
}
	public String toString()
	{
	return	("An exception has occurred:  "+str1);
	}

}


 class father{
static int fatherAge;
 
father (){ System.out.println("<--------------->");}
father(int x){
	fatherAge=x;
		
	
	 try{
	 if (fatherAge<=0)
	 throw new wrongAge("age cant be less than zero ");
	 }
	 catch(wrongAge e){
	 System.out.println(e);
	 }
 }
}


class son extends father{
static int sonAge;
	 
	 son(int y)
    {
	 sonAge=y;
		
		 try{
		 if(sonAge>=fatherAge)
				throw new wrongAge("Son's Age cant be greater than Father's Age");
		 }
		 catch(wrongAge e) {
		 System.out.println(e);
		 }
	}	
}

class main {
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter the father's Age");
int age1=sc.nextInt();
 new father(age1);
 
System.out.println("Enter the Son's Age");
int age2=sc.nextInt();
new son(age2);
System.out.println("\n Father's age:>" + father.fatherAge + "\t Son's age:> "+  son.sonAge );
		
}
}
