t=int(input())
x=0
y=0
s=[]
lead=[]
while t>0:
    a, b = map(int,input().split())
    x+=a
    y+=b
    if x-y>0:
        s.append(x-y)
        lead.append(1)
    elif y-x>0:
        s.append(y-x)
        lead.append(2)
    t=t-1
i=max(s)
j=s.index(i)
print(lead[j]," ",i)
    
