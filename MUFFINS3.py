def leftover(n):
    if n%2==0:
        l=n/2+1
    else:
        l=(n+1)/2
    l=int(l)
    print(l,"\n")
t=int(input())
while t>0:
    n=int(input())
    leftover(n)
    t=t-1
