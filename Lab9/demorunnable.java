class minethread implements Runnable{
int delay=0;
String name="";
int i=0;	
Thread t;

minethread(int delay,String name,int rep) {
this.name = name;
this.delay=delay;
i=rep;
t = new Thread(this,name);
System.out.println("New thread: " + t);
t.start(); // Start the thread
}
	public void run(){
	   while(i>0){
			try{
			Thread.sleep(delay);
			System.out.println(name);
			}
			catch(InterruptedException e){
			System.out.println("Interruption exception" + e);
			}
			i--;
		}
	}
	
}
class demorunnable{
public static void main(String args[]){
new minethread(10000,"BMS COLLEGE OF ENGINNERING",5);
new minethread(2000,"CSE",5);

}
}