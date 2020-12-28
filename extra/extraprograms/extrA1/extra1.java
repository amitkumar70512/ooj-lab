/*Write a program which has an abstract class Solid and implements cylinder, cone and
sphere by inheriting from solid to find surface area and volume.*/


import java.util.Scanner;

abstract class solid {
Scanner aa=new Scanner (System.in);

float area;
float volume;
float height;
float base;
float radius;
float pi=(float)3.14;

solid(){
System.out.print("----<>----");
}

public abstract void area();
public abstract void volume();
}
class cylinder extends solid{
cylinder(){
System.out.println("\nEnter the dimensions for cylinder::>");
System.out.println("\n Radius:");
super.radius=aa.nextFloat();
System.out.println("\n height:");
super.height=aa.nextFloat();
}
	public void area()
	{
	super.area=(2*pi*super.radius*(super.radius+super.height));
	System.out.println("\n Area: "+ super.area);
	}
    
	public void  volume(){
	super.volume=pi*super.radius*super.radius*super.height;
	System.out.println("\n Volume: "+ super.volume);
	}

}

class cone extends solid{
cone(){
System.out.println("\nEnter the dimensions for cone::>");
System.out.println("\n Radius:");
super.radius=aa.nextFloat();
System.out.println("\n height:");
super.height=aa.nextFloat();
}
 public void area(){
super.area=pi*super.radius*(super.radius+super.height);
System.out.println("\n Area: "+ super.area);
}

 public void volume(){
super.volume=(pi*super.radius*super.radius*super.height)/3;
System.out.println("\n Volume: "+ super.volume);
}

}



class sphere extends solid{
sphere(){
System.out.println("\nEnter the dimensions for sphere::>");
System.out.println("\n Radius:");
super.radius=aa.nextFloat();
}
 public void area(){
super.area=4*pi*super.radius*super.radius;
System.out.println("\n Volume: "+ super.area);
}

 public void  volume(){
super.volume=(4*pi*super.radius*super.radius*super.radius)/3;
System.out.println("\n Volume: "+ super.volume);
}

}

class extra1{
public static void main(String args[]){
cylinder s1=new cylinder();
s1.area();
s1.volume();
cone s2=new cone();
s2.area();
s2.volume();
sphere s3= new sphere();
s3.area();
s3.volume();

}
}
