#include<stdio.h>

int main()
{
    int a,b;
    printf("Enter two integers:");
    scanf("%d %d",&a,&b);

    int i,j,k;
    printf("The prime numbers between %d and %d:\n",a,b);
    for(i=a;i<=b;i++)
    {
        for(j=2;j<=i/2;j++)
        {
            if(i%j==0)
            {
                k=0;
                break;
            }
            else
                k=1;
        }
        if(k==1)
            printf("%d\n",i);

    }
    return 0;
}
