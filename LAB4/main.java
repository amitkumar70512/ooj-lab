/*Develop a Java program to create an abstract class named Shape that contains two integers and
an empty method named printArea( ). Provide three classes named Rectangle, Triangle and
Circle such that each one of the classes extends the class Shape. Each one of the classes contain
only the method printArea( ) that prints the area of the given shape.*/

import java.util.Scanner;
abstract class shape{
Scanner sc=new Scanner(System.in);
int a;
int b;

shape(){System.out.print("---*---");
}
abstract void printArea();
}

class rectangle extends shape{
void printArea(){
System.out.println("\n ---------------:>>");
System.out.println("\n length of rectangle:");
a=sc.nextInt();
System.out.println("\n breadth of rectangle:");
b=sc.nextInt();

int area=a*b;
System.out.print("\n Area of rectangle :");
System.out.print(area);
}
}

class triangle extends shape{
void printArea(){
System.out.println("\n ---------------:>>");
System.out.println("\n\n base of triangle:");
a=sc.nextInt();
System.out.println("\n altitude of triangle:");
b=sc.nextInt();
int area=(int)(a*b*(0.5));
System.out.print("\n Area of triangle :");
System.out.print(area);
}
}

class circle extends shape{
void printArea(){
System.out.println("\n ---------------:>>");
System.out.println("\n\n radius of circle:");
a=sc.nextInt();
 float pi=(float)3.14;
float area=a*a*pi;
System.out.print("\n Area of circle : ");
System.out.print(area);
System.out.println("\n ---------------:");
}
}
class main{
public static void main(String args[]){
rectangle s1=new rectangle();
triangle s2= new triangle();
circle s3=new circle();
s1.printArea();
s2.printArea();
s3.printArea();

}
}
