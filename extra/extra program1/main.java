/*Write a program to create a thread  and find the sum  of odd integers from 1 to 100 in this thread. 
find the sum of even integers for the same range in the main thread.*/


class newthread extends Thread{
  int sumodd=0;
  int i=1;
	public void run(){
	
	 try{
	 Thread.sleep(2000);
		  while(i<=100){
				if(i%2==0){
				}
				else
				{
				sumodd=sumodd+i;
				}
			i++;
		   }
		System.out.println("Sum of odd numbers between 1 & 100  -->" + sumodd);  
	 }
	 catch(InterruptedException e){
	 System.out.println("Interrupted Exception"+ e);
	 
	 }
	}
}
class main{
public static void main(String args[]){
newthread t1= new newthread();
t1.start();
	int sumeven =0;	
	int i=1;
		try{
		Thread.sleep(2000);
		  while( i<=100){
				if(i%2==0){
				sumeven=sumeven+i;
				}
				else{}
		  i++;
		   }
		  	System.out.println("Sum of even numbers between 1 & 100  -->" + sumeven);  

	 }
	 catch(InterruptedException e){
	 System.out.println("Interrupted Exception"+ e);
	 
	 }
}
}