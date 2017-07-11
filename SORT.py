n=[]
t=int(input())
for i in range(0,t):
    a=int(input())
    n.append(a)
n.sort()
for i in range(0,t):
    print(n[i])
    print('\n')
