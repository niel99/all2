#include <iostream>
using namespace std;
long long int C(int ,int);
int main(){
	long long int m,n,out=0;
	cin>>m>>n;
	for(int i=1;i<=n;i=i+2)
		out+=C(m,i);
	cout<<out%1000000007;
	return 0;
}
long long int C(int n, int r){
	if(r>n/2)
		r=n-r;
	int c=1;
	for(int i=1;i<=r;i++)
	{
		c*=n-r+1;
		c/=i;
	}
	return c;
}