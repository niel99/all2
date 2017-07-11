#include<stdio.h>
int main(void)
{
  int s,n,h[100],flag=0,i;
  scanf("%d",&s);
  while(s--)
  {
	scanf("%d",&n);
	if(n>=1&&n<=100)
	{
		for(i=0;i<n;i++)
			scanf("%d",*(a+i));
		if(n%2==0)
			flag=1;
		else
			if(a[0]!=1)
				flag=1;
			else if(a[n-1]!=1)
				flag=1;
			else
				for(i=0;i<n/2;i++)
				{
					if(a[i+1]-a[i]!=1)
					{	
						flag=1;
						break;
					}	
					else if(a[n-i-2]-a[n-i-1]!=1)
					{
						flag=1;
						break;
					}	
				}
	}
	if(flag==0)
		printf("Yes");
	else
		printf("No");
  }
  return 0;
}