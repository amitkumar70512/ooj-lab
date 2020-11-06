import java.util.*;
import java.lang.Math;
class mango{
public static void main(String args[]){
Scanner op=new Scanner (System.in);
System.out.println("*******welcome to world of java created by amit********\n ");
System.out.println("enter the valid entry :\n 1. cylinder \n 2.cone \n 3. sphere \n");
System.out.println("if you want to quit   \t press 4");
int command=op.nextInt();
 double pi= 3.14;

	 switch(command)
	{
	  case 1:
	   {
	   float r,h;
	   double  area,volume;
	   System.out.println("\n enter the radius and height of the cylinder \t");
	   r =op.nextFloat();
	   h=op.nextFloat();
		area= (2*pi*r*h)+(2*pi*r*r);
		volume=pi*r*r*h;
		System.out.println("\nthe area of cylinder is :\t" +  area);
		System.out.println("the volume of cylinder is :\t" + volume);
		break;
		}
		case 2:
		{
		 float r,h;
		  double area,volume;
		 System.out.println("\nEnter the radius and height of cone \t");
		 r=op.nextFloat();
		 h=op.nextFloat();
		 volume=pi*r*r*(h/3);
		 area =(pi*r)*(r + Math.sqrt(h*h + r*r));
		 System.out.println("\n The area of cone is :\t" + area );
		 System.out.println("\n The volume of cone is :\t" + volume);
		 break;
		
		}
		case 3:
		{
		float  r;
		double area,volume;
		System.out.println("\n Enter the radius of the sphere ");
		r=op.nextFloat();
		area=4*pi*r*r;
		volume=(4.0/3.0)*pi*r*r*r;
		System.out.println("\n The area of sphere is :\t" + area );
		 System.out.println("\n The volume of  sphere is :\t" + volume);
		 break;
		 }
		 case 4:
		  break;
		 
		default:
		 System.out.println("Enter the valid input :");
		 
	}
}
}