t=int(input())
i=count=z=0
a=[]
b=[]
c=[]#for counting characters
while z<t:
    count=0
    c=[0]*26

    a=input()
    b=input()
    a=list(a)
    b=list(b)
    la = len(a)
    lb = len(b)
    for i in range(la):
        c[ord(a[i])-ord('a')]+=1
    for j in range(lb):
        c[ord(b[j])-ord('a')]-=1
    for k in range(26):
        if c[k]!=0:
            if c[k]<0:
                c[k]=-c[k]
            count+=c[k]
            
    print(count)
    z=z+1
