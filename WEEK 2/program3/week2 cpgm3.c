#include<stdio.h>

int main()
{
int n,i,j,k=1;
printf("enter the value of rows ");
scanf("%d",&n);
 for(i=1;i<=n;i++)
   {
      for(j=1;j<=i;j++)
         {
         printf("%d\t",k);
         k++;
          }
      printf("\n");
    }
 
return 0;
}