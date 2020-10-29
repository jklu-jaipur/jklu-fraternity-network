'''
# Sample code to perform I/O:

name = input()                  # Reading input from STDIN
print('Hi, %s.' % name)         # Writing output to STDOUT

# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''

# Write your code here
d=int(input())
t = 0
while d>0:
    l=list(map(int,input().split()))
    r=l[0]
    x=l[1]

    if 44*r<=x*700:
        t+=1

    d-=1
print(t)
