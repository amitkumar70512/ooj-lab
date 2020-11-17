import cie.*;
import see.*;
import java.util.Scanner;


class main{
public static void main(String args[]){
Scanner aa=new Scanner(System.in);
int n;
System.out.println("Enter the Number of cie.students :>");
n=aa.nextInt();
cie.student s[]=new cie.student[n];
cie.internal cie[]=new cie.internal[n];
see.external e[]=new see.external[n];
double total_ciemarks[]=new double[n];
double total_seemarks[]=new double[n];

// for inputting data of n students 
for(int i=0;i<n;i++){
s[i]=new cie.student();
System.out.println("****************************");
System.out.println("\n\n\tEnter the details of the student"+(i+1)+":>");
s[i].getdata();
// for getting cie marks of 5 subjects
cie[i]=new cie.internal();
 total_ciemarks[i]=cie[i].getmarks();
e[i]=new see.external();
 total_seemarks[i]=e[i].getmarks();
}

// for displaying students total marks
for(int j=0;j<n;j++){
System.out.println("\n\n<------------"+s[j].name+"-------------->");
System.out.println("\t USN:>"+s[j].usn);
System.out.println("\t SEM:>"+ s[j].sem);
System.out.println("\nCIE_marks:>"+total_ciemarks[j]+ "\t"+ "SEE_marks:>"+ total_seemarks[j]);
System.out.println("\nTotal marks(cie+see)==>"+ " " + (total_ciemarks[j]+(total_seemarks[j]/2) ));
System.out.println("\t<------END------>\n\n");
}

}
}