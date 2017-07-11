#include<stdio.h>
#include<ctype.h>
/*int main()
{
	int n, t, i, c = 0, flag = 0, u1 = 0, l1 = 0, u2 = 0, l2 = 0, u, l, c1 = 0;
	char s1[500];
	char s2[500];
	char dummy[5];
	scanf_s("%d", &t);
	while (t != 0)
	{
		t--;
		gets(dummy);
		scanf_s("%d", &n);
		gets(dummy);
		for (i = 0; i<n; i++)
		{
			flag = 0;
			s1[i] = getchar();
			if (s1[i] == '#'&&c == 0)
			{
				l1 = i;
				c++;
			}

		}
		gets(dummy);
		for (i = 0; i<n; i++)
		{
			s2[i] = getchar();
			if (s2[i] == '#'&&c1 == 0)
			{
				l2 = i;
				c1++;
			}

		}
		if ((c1 != 0 || c != 0) && (n >= 1 && n <= 500))
		{

			for (i = n - 1; i >= l1; i--)
			{
				if (s1[i] == '#')
				{
					u1 = i;
					break;
				}

			}
			for (i = n - 1; i >= l2; i--)
			{
				if (s2[i] == '#')
				{
					u2 = i;
					break;
				}

			}
			/*printf("%d %d\n",l1,u1);
			printf("%d %d\n",l2,u2);
			if (u1>u2)
			{
				u = u1;
				if (s1[u2 + 1] == '#'&&s1[u2 - 1] == '#')
				{
					flag = 1;
					//printf("flag1");
				}
			}
			else if (u2>u1)
			{
				u = u2;
				if (s2[u1 + 1] == '#'&&s2[u1 - 1] == '#')
				{
					//printf("flag2");
					flag = 1;
				}

			}
			else
				u = u1;
			if (l1<l2)
			{
				l = l1;
				if (s1[l2 - 1] == '#'&&s1[l2 + 1] == '#')
				{
					flag = 1;
					//printf("flag3");
				}

			}
			else if (l2<l1)
			{
				l2 = l1;
				if (s2[l1 - 1] == '#'&&s2[l1 + 1] == '#')
				{
					flag = 1;
					//printf("flag7");
				}

			}
			else
				l = l1;
			if (flag == 0)
			{
				for (i = 0; i<n - 1; i++)
				{
					if (s1[i] == '.'&&s1[i + 1] == '#')
					{
						if ((i + 2) <= u1&&s1[i + 2] == '.')
						{
							//printf("%d\n",i);
							flag = 1;
							//printf("flag8");
							break;

						}
					}
					if (s2[i] == '.'&&s2[i + 1] == '#')
					{
						if ((i + 2) <= u2&&s2[i + 2] == '.')
						{
							flag = 1;
							//printf("flag4");
							break;
						}


					}
					if ((s1[i] == '.'&&s2[i] == '.') && (i >= l) && (i <= u) && (c == 1 && c1 == 1))
					{
						//printf("%d %d",l,u);
						flag = 1;
						//printf("flag5");
						break;
					}
					if ((s1[i] == '.'&&s2[i + 1] == '.'&&s1[i + 1] == '#'&&s2[i] == '#') || (s1[i + 1] == '.'&&s2[i] == '.'&&s2[i + 1] == '#'&&s1[i] == '#'))
					{
						flag = 1;
						//printf("flag6");
						break;
					}
				}

			}

			if (flag == 0)
				printf("yes\n");
			else
				printf("no\n");

		}
	}
	return 0;

}*/