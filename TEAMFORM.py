T=int(input())
if T>0 and T<=100:
    while T>0:
        n, m = map(int,input().split())
        if n>=2 and m>=1 and n<=100 and m<=n/2:
            for i in range(m):
                u, v = map(int,input().split())
            if n%2==0:
                print("yes\n")
            else:
                print("no\n")
        T-=1
