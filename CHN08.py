T=int(input())
while T>0:
    a,b,n=map(int,input().split())
    def f(n):
        if n==1:
            return a
        elif n==2:
            return b
        else:
            return f(n-1)-f(n-2)
    print(f(n)%1000000007)
    T=T-1
