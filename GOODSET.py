from random import randint
T=int(input())
for i in range(T):
    n=int(input())
    r=[]
    while len(r)!=n:
        if n<=2:
            for j in range(n):
                r.append(randint(1,500))
        else:
            a=randint(1,500)
            for x in range(len(r)):
                for y in range(len(r)):
                    if a==r[i]+r[j] || a==abs(r[i]-r[j]):
                        break
                    
