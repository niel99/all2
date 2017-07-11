def fact(n):
	fac=1
	for i in range(1,n+1):
		fac*=i
	print(fac)
	
t=int(input())
if t>=0 and t<=100:
        while t>0:
                a=int(input())
                if a>=0 and a<=100:
                        fact(a)
                t=t-1



