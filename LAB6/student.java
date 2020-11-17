/*Create a package CIE which has two classes- Student and Internals. The class student has
members like usn, name, sem. The class internals has an array that stores the internal marks
scored in five courses of the current semester of the student.

 Create another package SEE which has the class External which is a derived class of Student. This class has an array that
stores the SEE marks scored in five courses of the current semester of the student. Import the
two packages in a file that declares the final marks of n students in all five courses.*/

package  cie;
import java.util.*;

public class student{
 Scanner sc=new  Scanner(System.in);
public  String usn=" ";
public String name=" ";
public  int sem=0;

public  void getdata(){

System.out.println("Usn:>");
usn=sc.next();
System.out.println("Name:>");
name=sc.next();
System.out.println("Semester:>");
sem=sc.nextInt();
}



}


