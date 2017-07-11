#include<stdio.h>
int main(void)
{
	long long n, a, fac;
	scanf_s("%lli", &n);
	if (n >= 1 && n <= 100)
	{
		while (n--)
		{
			scanf_s("%lli", &a);
			if (a >= 1 && a <= 100)
			{
				fac = a;
				while (--a)
					fac *= a;
				printf("%lli\n", fac);
			}
		}
	}
}