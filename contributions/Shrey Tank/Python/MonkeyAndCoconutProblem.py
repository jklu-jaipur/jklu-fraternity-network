i=int(input())
n=int(input())
for x in range(1,i+1):
    j=n//i
    k=n%i
    if(k>1):
        z="nuts"
    elif(k==1):
        z="nut"
    else:
        z="no nuts"
    print(n,"nuts =",j,"nuts for pirate#",x,"and",k,(z),"for the monkey")
    n=n-(j+k)
j=n//i
k=n%i
if(k>1):
    z="nuts"
elif(k==1):
    z="nut"
else:
    z="no nuts"
print("each pirate gets",j,"nuts and",z,"for the monkey")
