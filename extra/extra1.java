import java.util.*;
class extra1{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the size of an array :");
int n=sc.nextInt();
  int i,j;
  int sumeven=0,sumodd=0;

    for(i=0;i<=n;i+=2)
    {
        sumeven=sumeven+i;

    }
    for(j=1;j<=n;j+=2){
     sumodd =sumodd +j;
    }
System.out.println("the sum of even indices  is :" + sumeven);
 System.out.println("the sum of odd indices is :"  + sumodd);
 }
 }
 /*
#include<stdio.h>
void main()
{   int n;
    printf("enter the range of an array: \t");
    scanf("%d",&n);
    int i,j;
    int sumeven,sumodd;

    for(i=0;i<=n;i+=2)
    {
        sumeven=sumeven+i;

    }
    for(j=1;j<=n;j+=2){
     sumodd =sumodd +j;
    }
    printf("%d",sumeven);
    printf("%d",sumodd);
}
*/