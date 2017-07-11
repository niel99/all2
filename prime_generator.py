T=int(input())
for i in range(T):
    m, n=map(int,input().split())
    for j in range(m,n+1):
        count=0
        for k in range(2,int(j/2)+1):
            if j%k==0:
                count+=1
                break
        if count==0 and j!=1:
            print(j)
    print("\n")
