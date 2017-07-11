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
