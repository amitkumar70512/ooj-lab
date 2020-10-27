import java.util.Scanner;
class student {
//char usn[]=new char[20];
//char name[]=new char[20];
String usn="";
String name="";
int sem=0;
}
class test extends student
{
Float cie_marks;
int credits ;
}
class exam extends test{
Float see_marks;
}


class Result extends exam{
public static void main (String args[]){
Scanner sc= new Scanner (System.in);
char grade ;
System.out.println("Enter the total number of Students::");
int n=sc.nextInt();
System.out.println("------note* enter the cie and see marks out of 50 only------");
Result r[]=new Result[n];
		for (int i=0;i<n;i++)
		{
		r[i]= new Result();
		System.out.println("Enter the details of the Student "+ (i+1) );
		System.out.println("USN::");
		r[i].usn=sc.next();
		System.out.println("name::");
		r[i].name=sc.next();
		System.out.println("Semester::");
		r[i].sem=sc.nextInt();
		System.out.println("cie_marks::");
		r[i].cie_marks=sc.nextFloat();
		System.out.println("Credits::");
		r[i].credits=sc.nextInt();
		System.out.println("see_marks::");
		r[i].see_marks=sc.nextFloat();
		
		}
		
		 for(int i=0;i<n;i++){
		
		 Float mark=r[i].cie_marks+r[i].see_marks;
		int credit=0;
		credit =  r[i].credits;
			int  SGPA=0;
			if(mark>=90&&mark<=100)
					SGPA = SGPA + (10*credit);
			
			else if(mark>=80 && mark<=89)
					SGPA = SGPA + (9*credit);
			
			else if(mark>=70&&mark<=79)
					SGPA = SGPA + (8*credit);
			
			else if(mark>=60&&mark<=69)
					SGPA = SGPA + (7*credit);
			
			else if(mark>=50 && mark<=59)
					SGPA = SGPA + (6*credit);
			else if(mark>=40&&mark<=49)
					SGPA = SGPA + (5*credit);
			else
			System.out.println("Failed in subject ");
			int j=i;
			{	
			   int Gradepoints=SGPA/credit;
			if(Gradepoints>=9&&Gradepoints<=10)	
				   grade = 'A';
			else if(Gradepoints>=9&&Gradepoints<=10)
			 grade = 'B';
			else if	(Gradepoints>=8&&Gradepoints<=9)
			  grade = 'C';
			else if	(Gradepoints>=7&&Gradepoints<=8)
			 grade = 'D';
			else if (Gradepoints>=6&&Gradepoints<=7)
			 grade = 'E';
			else 
			System.out.println("Student"+i+ " " +" is failed with  'F' grade");
			}	
		{
		System.out.println("\n\n"+"---------------------------");
		System.out.println("Details of the Student"+(j+1)+"\n");
		
				System.out.println("Name :"+r[j].name);
				System.out.println("USN: "+r[j].usn);
				System.out.println("Semester: "+""+r[j].sem);
				System.out.println("cie-marks::" +r[j].cie_marks); 
				System.out.println("See-marks::" +r[j].see_marks); 
				System.out.println("SGPA of student:: "+(SGPA/credit)+"points");

			}
	}

}
}
 
