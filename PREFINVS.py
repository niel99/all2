S=input()
a=[]
c=0
for i in range(len(S)):
    a.append(int(S[i]))
a.reverse()
while a.count(1)!=0:
    l=len(S)-a.index(1)-1
    a.reverse()
    for i in range(l):
        if a[i]==1:
            a[i]==0
        else:
            a[i]==1
    a.reverse()
    c+=1
print(c)
