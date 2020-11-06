#include <stdio.h>
#include <math.h>
int main() {
    char operator;
    double first, second;
    int command;
		while(command!=2)
		{
			printf("\n\nEnter an operator (+, -, *,s for squareroot,g to check greater ,l to find log,e  to check equality): ");
			scanf("%c", &operator);
			printf("Enter two operands: ");
			scanf("%lf %lf", &first, &second);
		
			switch (operator) {
			case '+':
				printf("%lf + %lf = %lf", first, second, first + second);
				break;
			case '-':
				printf("%lf - %lf = %lf", first, second, first - second);
				break;
			case '*':
				printf("%lf * %lf = %lf", first, second, first * second);
				break;
			case '/':
				printf("%lf / %lf = %lf", first, second, first / second);
				break;
			case 's':
				printf(" squareroot  %lf is  \t%lf and  squareroot of %lf is \t%lf", first, sqrt(first),second,sqrt( second));
				break;
			case 'l':
				printf(" logarithm of  %lf is  \t%lf and  logarithm of %lf is \t%lf", first, log(first),second,log( second));
				break;
			case 'g':
				{
					if (first>second)
				{
					printf(" %lf is greater than %lf ",first,second);  }
					else 
					{
					printf(" %lf is not  greater than %lf ",first,second);
					}
				}	
				case 'a':
				{
					if (first<second)
				{
					printf(" %lf is lesser than %lf ",first,second);  }
					else 
					{
					printf(" %lf is not lesser than %lf ",first,second);
					}
					break;
				}	
				case 'e':
				{
					if (first==second)
					{
						printf(" %lf is equal to %lf",first,second); 
					}
					else
					{
					 printf(" %lf is not equal to %lf ",first,second); 
					}
					break;
				}	
				
					
			default:
				printf("Error! operator is not correct");
			}
			printf("\n\nTo exit press 2  \nelse press any character ");
			scanf("%d",&command);
		 }
	 
    return 0;
}
