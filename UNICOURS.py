T=int(input())
for t in range(T):
    n=int(input())
    s=list(map(int,input().split()))
    print(n-max(s))
