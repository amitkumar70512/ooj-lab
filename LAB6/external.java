

package see;
import cie.*;

import java.util.Scanner;


public class external extends cie.student{

Scanner sc=new Scanner(System.in);

double seemarks[]=new double[5];
int i;
double total;
	public double getmarks(){
	System.out.println("\n\tEnter the SEE marks:>");
			for(i=0;i<5;i++){

			System.out.println("subject"+ (i+1));
			seemarks[i]=sc.nextDouble();
			total=total+seemarks[i];
			
			}
			return total;
			
	}
}
