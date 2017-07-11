T=int(input())
while T>0:
    S=input()
    holes=0
    for i in range(len(S)):
        if S[i]=='A' or S[i]=='D' or S[i]=='O' or S[i]=='P' or S[i]=='R' or S[i]=='Q':
            holes+=1
        elif S[i]=='B':
            holes+=2
    print(holes)
