def high(n):
    if n==1:
        return 1
    elif n<1:
        return 0
    else:
        cur=[]
        temp=1
        for i in range(0,n):
            temp=temp*2
            cur.append(temp)
            if cur[i]>=n:
                break
        if abs(n-cur[i])>=abs(n-cur[i-1]):
                              return cur[i-1]
        else:
                              return cur[i]
T=int(input())
for j in range(T):
    if T>0:
        a=int(input())
        if a>0:
            print(abs(a-high(a)),"\n")
