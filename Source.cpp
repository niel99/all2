/*#include<iostream>
#include<string>
using namespace std;
void main()
{
	char rep[500],dummy[5],a[500];
	int n, r, c=0,flag=0;
	cin >> n;
	while (n--)
	{
		cin >> r;
		gets_s(dummy);
		cin.getline(rep, r);
		gets_s(dummy);
		c = 0;
		for (int i = 0; i < r; i++)
		{
			while (isalpha(rep[c]))
			{
				a[c] = rep[c];
				c++;
			}
			a[c] = '/0';
		}
		if (a[c - 1] == 'H' || a[0] == 'T')
			flag++;
		else
		{
			while (--c)
			{
				if (a[c] == a[c - 1])
					flag++;
			}
	    }
		if (flag==0)
			cout << "VALID";
		else
			cout << "INVALID";
	}
	system("pause");
}*/