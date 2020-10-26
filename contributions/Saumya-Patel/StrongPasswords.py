#!/usr/bin/env python
# coding: utf-8

# In[1]:


test = int(input())
psswrd = []
i=0
while(i<test):
    a=input()
    psswrd.append(a)
    i+=1
A =[] 
characters = "!@#$%^&*()_+-={}[]<>?,./|"
for j in psswrd:
    count=0
    if(any(i.islower() for i in j)):
        count+=1
    if(any(i.isupper() for i in j)):
        count+=1
    if(any(i.isdigit() for i in j)):
        count+=1
    if(len(j)>=8):
        count+=1
    if(any(i in characters for i in j)):
        count+=1
    A.append(count)
for i in A:
    if(i == 5):
        print("strong")
    elif(i == 3 or i == 4):
        print("moderate")
    else:
        print("weak")


# In[ ]:
