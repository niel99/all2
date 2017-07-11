#include<stdio.h>
#include<stdlib.h>
#define _CRT_SECURE_NO_WARNINGS
/*struct emp {
	int ecode, deptno,salary;
	char ename[20];
	struct dofj {
		int day, month, year;
	}doj;
};
void maxmin(struct emp *a,int n)
{
	struct emp max, min;
	int j;
	max = *a;
	min = *a;
	for (j = 1; j < n; j++)
	{
		if (max.salary <(a + j)->salary)
			max = *(a+j);
		if (min.salary >(a + j)->salary)
			min = *(a + j);
	}
	printf("Maximum Salaried employee \n %d \n %s \n %d \n %d \n\n\n", max.ecode, max.ename, max.salary, max.deptno);
	printf("Minimum Salaried employee \n %d \n %s \n %d \n %d \n", min.ecode, min.ename, min.salary, min.deptno);

}
int main(void)
{
	int n,i;
	struct emp *e;
	printf("Enter no of employee records you wanna enter:");
	scanf_s("%d", &n);
	e = (struct emp*)malloc(n * sizeof(struct emp));
	for (i = 0; i < n; i++)
	{
		printf("\nEnter records of employee %d\n\n", i + 1);
		printf("Employee name:"); scanf_s("%s",(e+i)->ename);
		printf("Employee code:"); scanf_s("%d", &(e+i)->ecode);
		printf("Employee salary:"); scanf_s("%d", &(e + i)->salary);
		printf("Department no:"); scanf_s("%d", &(e+i)->deptno);
	}
	maxmin(e,n);
	system("pause");
}*/