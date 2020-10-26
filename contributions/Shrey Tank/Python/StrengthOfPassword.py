p=int(input())
list=[]

for x in range(0,p):

    a=input()
    list.append(a)

for x in range(0,p):

    i,j,k,l,count=0,0,0,0,0

    if len(list[x])>=8:
        count+=1

    for z in list[x]:
        if z.isupper():
            j+=1

        if z.islower():
            k+=1

        if z.isdigit():
            l+=1

        if (not (ord(z)>47 and ord(z)<58) and not(ord(z)>64 and ord(z)<91) and not (ord(z)>96 and ord(z)<123)):
            i+=1

    if i>=1:
        count+=1
    if j>=1:
        count+=1
    if k>=1:
        count+=1
    if l>=1:
        count+=1


    if count<3:
        print("weak")

    elif count==4 or count==3:
        print("moderate")
        
    else:
        print("strong")
