package  cie;
import java.util.Scanner;

public  class internal{
Scanner sc=new Scanner(System.in);
 double ciemarks[]=new double[5];
int i;
double total=0.0;
	public double getmarks(){
	System.out.println("\n\tEnter the cie-marks:");
			for(i=0;i<5;i++){

			System.out.println((i+1)+" subject :");
			ciemarks[i]=sc.nextDouble();
			total=total+ciemarks[i];
			
			}
			return total;
	}
}