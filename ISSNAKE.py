T=int(input())
flag=0
if T>0 and T<=500:
    while T>0:
        n=int(input())
        if n>0 and n<=500:
            l1=input()
            l2=input()
            if l1.count('#')!=0 or l2.count('#')==0:
                for i in range(1,n):
                    if l1[i]=='.' and l2[i-1]=='.':
                        flag=1
                        print("if1")
                        break
                    elif l2[i]=='.' and l1[i-1]=='.':
                        flag=1
                        print("if2")
                        break
            if flag==0:
                print('yes')
            elif flag==1:
                print('no')
            T=T-1
