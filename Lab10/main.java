/*Write a program that creates a user interface to perform integer divisions. The user enters two
numbers in the text fields, Num1 and Num2. The division of Num1 and Num2 is displayed in
the Result field when the Divide button is clicked. If Num1 or Num2 were not an integer, the
program would throw a NumberFormatException. If Num2 were Zero, the program would
throw an Arithmetic Exception Display the exception in a message dialog box.*/

import java.awt.*;
import java.awt.event.*;

class Dialogbox extends Dialog implements ActionListener
{
	main obj;
	Dialogbox(Frame parent,String title)
	{super(parent,title,true);
	obj=(main)parent;
	setLayout(new FlowLayout());
	setSize(400,400);
	add(new Label(obj.amit));
	
	Button b;
	add(b = new Button("OK"));
	b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		dispose();
	}
}

public class main extends Frame implements ActionListener
{
TextField Num1,Num2,Result;
Button Divide;
String amit="";
public main()
{
setLayout(new FlowLayout());
Divide =new Button("Divide");
Label num1=new Label("Number1:",Label.RIGHT);
Label num2 =new Label("Number2:",Label.RIGHT);
Num1=new TextField(10);
Num2=new TextField(10);
Result=new TextField(10);
add(num1);
add(Num1);
add(num2);
add(Num2);
add(Divide);
add(Result);
Divide.addActionListener(this);

addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we)
{
 System.exit(0); }
 });
}
 public void actionPerformed(ActionEvent ae)
 {
 int a=0,b=1,r=0;
 try
 {
  a=Integer.parseInt(Num1.getText());
  b=Integer.parseInt(Num2.getText());
  }
  catch(NumberFormatException e)
  {
  amit="caught:" + e;
  Dialogbox d1=new Dialogbox(this,"Dialog");
  d1.setVisible(true);
  }
  try
  {
  r=a/b;
  }
  catch(ArithmeticException e)
  {
  amit="caught:" +e+"Num2=" +b;
  Dialogbox d2=new Dialogbox(this,"Dialog");
  d2.setVisible(true);
  }
  Result.setText("" + r);
  }
  
 public static void main(String args[])
 {
 main appwin=new main();
 appwin.setSize(new Dimension(400,500));
 appwin.setTitle("Interger division");
 appwin.setVisible(true);
 
 }
}
