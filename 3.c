#include<stdio.h>
int main()
{
	long long a[4];
	long long b[4];
	long long flag, i, t;
	scanf_s("%lli", &t);
	while (t--)
	{
		flag = 0;
		for (i = 0; i<4; i++)
			scanf_s("%lli", a + i);
		for (i = 0; i<4; i++)
			scanf_s("%lli", b + i);
		if (((a[0] == a[2]) || (a[1] == a[3])) && ((b[0] == b[2]) || (b[1] == b[3])))
		{
			if (a[0] == a[2] && b[0] == b[2])
			{
				if ((a[1] < b[1] && a[1] < b[3] && a[3] < b[1] && a[3] < b[3]) || (a[1] > b[1] && a[1] > b[3] && a[3] > b[1] && a[3] > b[3]))
					flag = 1;
				else if (a[0] != b[0])
					flag = 1;

			}
			else if (a[1] == a[3] && b[1] == b[3])
			{
				if ((a[0] < b[0] && a[0] < b[2] && a[2] < b[0] && a[2] < b[2]) || (a[0] > b[0] && a[0] > b[2] && a[2] > b[0] && a[2] > b[2]))
					flag = 1;
				else if (a[1] != b[1])
					flag = 1;


			}

			else if (a[0] == a[2] && b[1] == b[3])
			{
				if ((b[1] != a[1]) && (b[3] != a[3]))
					flag = 1;
				if ((b[1] == a[1]) && (a[0] != b[0]) && (a[0] != b[2]))
					flag = 1;
				if ((b[3] == a[3]) && (b[2] != a[2]) && (b[0] != a[2]))
					flag = 1;

			}
			else if ((b[0] == b[2]) && (a[1] == a[3]))
			{
				if ((a[1] != b[1]) && (a[3] != b[3]))
					flag = 1;
				if ((a[1] == b[1]) && (b[0] != a[0]) && (b[0] != a[2]))
					flag = 1;
				if ((a[3] == b[3]) && (b[2] != a[2]) && (b[2] != a[0]))
					flag = 1;
			}
			if (flag == 1)
				printf("no\n");
			else
				printf("yes\n");
		}

	}
	system("pause");
	return 0;
}