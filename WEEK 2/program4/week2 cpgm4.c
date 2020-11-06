#include<stdio.h>

int main()
{
    float cie_marks, see_marks;
    printf("Enter cie and see marks:");
    scanf("%f %f",&cie_marks,&see_marks);
    float total = cie_marks + (see_marks/2);
    printf("The Grade of student:");
    if(total>=90)
        printf("S\n");
    else if(total>=80 && total<90)
        printf("A\n");
    else if(total>=70 && total<80)
        printf("B\n");
    else if(total>=60 && total<70)
        printf("C\n");
    else if(total>=50 && total<60)
        printf("D\n");
    else if(total>=40 && total<50)
        printf("E\n");
    else
        printf("F\n");

    return 0;
}
