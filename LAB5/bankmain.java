/*Develop a Java program to create a class Bank that maintains two kinds of account for its
customers, one called savings account and the other current account. 
The savings account provides compound interest and withdrawal facilities but no cheque book facility. 
The current account provides cheque book facility but no interest.
 Current account holders should alsomaintain a minimum balance and if the balance falls below this level, a service charge is
imposed.
 Create a class Account that stores customer name, account number and type of account. From this derive the classes currentacc and savingacc to make them more specific to
their requirements. Include the necessary methods in order to achieve the following tasks: •
Accept deposit from customer and update the balance. • Display the balance. • Compute and
deposit interest • Permit withdrawal and update the balance • Check for the minimum balance,
impose penalty if necessary and update the balance*/

import java.util.Scanner;
class account
{
Scanner ss=new Scanner (System.in);
 static String customer_name="";
 static int accno=0;
 static String acctype="";
int option;
final int minbalance=2000;
int currentbalance=2500;
int withdraw=0;
int moneydeposit=0;
int ch=1;
}

class currentacc extends account
{

 
 int penalty=50;
 
	currentacc(){
	
	System.out.print("\n-----current account----");
	System.out.println("\n\t<< compound interest and withdrawal facilities are available but no cheque book facility. >>");
	System.out.print("\t\tAlert:  penality, if current balance is less than ");
	System.out.print(minbalance);
	System.out.println("\n Account details\n\t  account holder number-->"+super.customer_name);
	System.out.println("\n\t  account number-->"+super.accno);
	System.out.println("\n\t  account type-->"+super.acctype);
			do{
			System.out.println("\n\n***Choose option::");
			System.out.println("\t 1. current balance \n\t2. money withdrawl\n\t3. money deposit");

			option=ss.nextInt();

			if(option==1){System.out.println("\n\tCurrent Balance=Rs"+super.currentbalance);
			}
			else if (option==2){
			System.out.println("\nEnter amount in digits to withdraw");
			withdraw=ss.nextInt();
			
			    if (withdraw>super.currentbalance){
				System.out.println("\n***alert: Insufficient Balancee***");
				}
				
				else if(super.currentbalance-withdraw<minbalance){
				super.currentbalance=super.currentbalance-withdraw;
				System.out.println("\n Minimum account limit  is reached");
				System.out.println("\n Rs"+50+"will be  deducted as penaltity");
				
				System.out.println("\n New balance:"+(super.currentbalance-(int)penalty));
				super.currentbalance=super.currentbalance-(int)penalty;
				}
				else{
				super.currentbalance=super.currentbalance-withdraw;
				System.out.println("\n New balance:"+super.currentbalance);
				}
			
			}
			
			else if(option==3){
			System.out.println("\nEnter amount to be deposit:");
			moneydeposit=ss.nextInt();
			super.currentbalance=super.currentbalance+moneydeposit;
			System.out.println("\n Updated balance:"+super.currentbalance);
			}
			else{
			System.out.println("\nwarning: invalid input ");
			}
			System.out.println("\n***press 0 to repeat again*** \nelse exit");
			 ch=ss.nextInt();
			}while(ch==0);
	}
}




class savingacc extends account{
Boolean cheque= true;
int interestrate=5;
 

	savingacc(){
	
	System.out.println("\n--------saving account------");
	System.out.println("\n\t<<cheque book facility but no interest. >>\n");
	System.out.println("Account details \n\t  account holder number-->"+super.customer_name);
	System.out.println("\n\t  account number-->"+super.accno);
	System.out.println("\n\t  account type-->"+super.acctype);
	System.out.println("\n\t  Cheque availability:"+cheque);
do{
		System.out.println("\n\n**Choose option::");
		System.out.println("\t 1.current balance \n\t2. money withdrawl\n\t3. money deposit");

		option=ss.nextInt();

		if(option==1){
		System.out.println("\n\tCurrent Balance=Rs"+super.currentbalance);

		}
		else if (option==2)
		{
		System.out.println("\nEnter amount in digits to withdraw");
		withdraw=ss.nextInt();
		if (withdraw>super.currentbalance){
				System.out.println("\n***alert: Insufficient Balancee***");
				}
				else
		super.currentbalance=super.currentbalance-withdraw;
		
		calculate(super.currentbalance);
		}
		
		else if(option==3){
		System.out.println("\nEnter amount to be deposit:");
		moneydeposit=ss.nextInt();
		super.currentbalance+=moneydeposit;
		calculate(super.currentbalance);
		}
		else{
		System.out.println("\nwarning: invalid input ");
		}
		System.out.println("\n***press 0 to repeat again*** \nelse exit");
		 ch=ss.nextInt();
}while(ch==0);
  
	}
	void calculate(int p){
	
  int amount=p*(1+(interestrate/100));
  System.out.println("\n Updated balance:"+amount);
  }
}
	
		
		class bankmain{
		public static void main(String args[]){
		Scanner ss=new Scanner (System.in);
		account a =new account();
		System.out.println("\n Enter account holder name:");
		a.customer_name=ss.next();
		System.out.println("\n Account number:");
		a.accno=ss.nextInt();
		
		
		System.out.println("\n<<<< Enter the account type:::::>>>>\n 1.current account \n 2.saving account\t");
			int choice=ss.nextInt();
				if(choice==1)
				{
				a.acctype="current_account";
				currentacc acc1=new currentacc();
				}
				else if(choice==2){
				a.acctype="saving_account";
				savingacc acc2= new savingacc();
				}
				else
				System.out.println("\nwarning: invalid input ");
				
				}

	}
