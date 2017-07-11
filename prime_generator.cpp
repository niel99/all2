#include <iostream>
using namespace std;

long long fac(int n)
{
	if (n == 0)
		return 1;
	long long fact = n;
	while (--n)
	{
		fact = fact*n;
	}
	return fact;
}
int main() {
	for (int i = 0; i<6; i++)
	{
		for (int j = 5 - i; j >= 0; j--)
			cout << " ";
		for (int k = 0; k <= i; k++)
			cout << fac(i) / (fac(i)*fac(i - k)) << " ";
		cout << endl;
	}
	return 0;
}