/*Develop a multithreaded Java program to create three threads. First thread generates
random integer for every second and if the value is even, second thread computes the
square of number and prints. If the value is odd, the third thread will print the value of
cube of number.*/
import java.util.Random;
class onethread extends Thread{

Random rand= new Random();
int upbound=1000;
 int randint=rand.nextInt(upbound);
 
}
class twothread extends onethread implements Runnable{

 static int square(int x){
return x*x;
}
}
class threethread extends twothread  implements Runnable{

 static int cube(int x){
return x*x*x;
}
}
class main{
public static void main(String args[]){
onethread t1=new onethread();
new Thread(new twothread());
new Thread(new threethread());
if(t1.randint%2==0){
int square=twothread.square(t1.randint);
System.out.println("Square of two numbers is :"+ square);
}
else{
int cube=threethread.cube(t1.randint);
System.out.println("cube of two numbers is :" + cube);
}

}
}