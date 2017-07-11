a=3
b=2
n=int(input())
for i in range(n):
    for k in range(n-i,1,-1):
        print(" ",end=' ')
    for j in range(0,i+1):
        print(str(a*b).zfill(5),end=' ')
        a+=4
        b+=2
    print("\n")

