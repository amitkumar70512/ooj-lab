import java.util.Scanner;

class gene<T,U,V>{

T obj1;// an object of type T
U obj2;// an object of type U
V obj3;// an object of type V

	gene (T obj1,U obj2, V obj3 )
	{System.out.println("\n Inside the generic class:>");
	this.obj1=obj1;
	this.obj2=obj2;
	this.obj3=obj3;
	}

	void display(){
	System.out.println("\n Value of obj1  :>"+obj1);
	System.out.println("\t Type  of "+ obj1+ " is " + obj1.getClass().getName());
	System.out.println("\n Value of obj2  :>"+obj2);
	System.out.println("\t Type  of "+ obj2+ " is " + obj2.getClass().getName());
	System.out.println("\n Value of obj3  :>"+obj3);
	System.out.println("\t Type  of "+ obj3+ " is " + obj3.getClass().getName());
	}
}

class generics{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

	System.out.println("enter the Integr value -->");
	int val1=sc.nextInt();
	System.out.println("\n enter the String value -->");
	String val2=sc.next();
	System.out.println("\n enter the double value -->");
	Double val3=sc.nextDouble();
	System.out.println("enter the Integr value -->");
	int val4=sc.nextInt();
	System.out.println("\n enter the String value -->");
	String val5=sc.next();
	System.out.println("\n enter the double value -->");
	Double val6=sc.nextDouble();
	
	gene <Integer,String,Double> g1 =new gene <Integer,String,Double>(val1,val2,val3);// calling parameterised const
	gene <Boolean,Character,Double> g2 =new gene <Boolean,Character,Double>(val4,val5,val6);// calling parameterised const
	g1.display();
	g2.display();
 
 }
}
