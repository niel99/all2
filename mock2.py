def C(n,r):
    if r>n/2:
        r=n-r
    c=1;
    for i in range(1,r+1):
        c*=n-r+i
        c/=i
    return c
m,n = map(int,input().split())
out=0;
for j in range(0,n+1,2):
    out+=C(m,j)
print(int(out%1000000007))
