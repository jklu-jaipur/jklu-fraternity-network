str = str(input())
x = str.find("o")
# i=0
count=0
a = len(str)    # length of array

while count < x :
    count = count+1   # no. of z

o = a-count
if 2*count == o:
        print("Yes")
else:
    print("No")
