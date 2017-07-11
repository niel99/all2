T=int(input())
while T>0:
    for i in range(4):
        s,a=input().split()
        if s=='RealMadrid':
            x=int(a)
        elif s=='Malaga':
            y=int(a)
        elif s=='Barcelona':
            c=int(a)
        elif s=='Eibar':
            d=int(a)
    if y>x and c>d:
        print('Barcelona')
    else:
        print('RealMadrid')
    T-=1
