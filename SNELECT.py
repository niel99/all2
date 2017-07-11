T=int(input())
for i in range(T):
    s=str(input())
    S=[]
    count=[]
    for j in range(len(s)):
        S.append(s[j])
        count.append(0)
    snakes=S.count('s')
    mong=S.count('m')
    print(snakes," ",mong)
    for j in range(1,len(S)):
        if j<2 and S[j]=='m' and S[j-1]=='s':
            snakes-=1
            count[j]=1
            print(snakes," ",mong," flag1")
        elif j<2 and S[j]=='s' and S[j-1]=='m':
            snakes-=1
            count[j-1]=1
            print(snakes," ",mong," flag2")
        elif j>1 and S[j]=='s' and S[j-1]=='m':
            if count[j-1]!=1:
                snakes-=1
                count[j-1]=1
                print(snakes," ",mong," flag3")
        elif j>1 and S[j]=='m' and S[j-1]=='s':
            if count[j]!=1 and count[j-2]!=1:
                snakes-=1
                count[j]=1
                print(snakes," ",mong," flag4")
    if snakes>mong:
        print("snakes")
    elif snakes<mong:
        print("mongooses")
    else:
        print("tie")
