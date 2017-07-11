def gcd(m,n):
    if m>=n:
        if m%n==0:
            return n
        else:
            cd=gcd(n,m-n)
            return cd
    elif n>m:
        if n%m==0:
            return m
        else:
            cd=gcd(m,n-m)
            return cd
a,b=map(int,input("ENTER 2 NUMBERS:").split())
hcf=gcd(a,b)
print(hcf," is the highest common factor of ",a," and ",b)
