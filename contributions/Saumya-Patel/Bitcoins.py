#!/usr/bin/env python
# coding: utf-8

# In[ ]:


def profit(seq,a):
    r = list(seq)
    sum = 0
    flag = 0
    error = "AssertionError : invalid actions"
    if(type(a)== str and len(a) == len(r) ): 
        for i in a:
            if(i in "BS-"): #if i is 'B' or 'S' or '-'
                flag =1
        if(flag):
            for i in range(len(a)-1):
                if(a[i] == a[i+1] and a[i] in "BS"):
                    flag = 0
            if (flag): 
                if(a[len(a)-1]!='B' and a[0] !='S'): #if nothing is bought on last day and sold on frst day
                    for i in range(len(r)):
                        if(a[i] == 'B'):
                            sum -= int(r[i]) # subtracting cost of bitcoin bought
                        elif (a[i] == 'S'):
                            sum += int(r[i]) #adding cost of bitcoin sold
                        else:
                            pass
                    return sum   
                else:
                    return (error)    
            else:
                return(error)     
        else:
            return(error)
    else:
        return(error)


# In[ ]:


def maximal_profit(seq):
    r = list(seq)
    sum = 0
    a = []
    flag = 0
    for i in range(len(r)-1):
        if (int(r[i+1])>int(r[i])):
            if(i>0):    
                if(a!='B'):
                    sum -= int(r[i])#buy
                    a = 'B'
                    flag = 1
                else:
                    pass  
            else:
                sum -= int(r[i])#buy
                a ='B' 
                flag = 1
        elif(int(r[i+1])<int(r[i])):
            if(i>0):
                if (a!='S' and flag !=0):
                    sum += int(r[i])#sell
                    a ='S'
                    flag = 1
                else: 
                    pass    
            else:
                pass 
    if(int(r[len(r)-1])>int(r[len(r)-2])):
        if (a!='S' and sum !=0):
            sum += int(r[len(r)-1])#sell
            a ='S'
        else:          
            pass 
    return sum        


# In[ ]:


def optimal_actions(seq):
    r = list(seq)
    ac =[]
    sum =0
    flag = 0
    a=[]
    for i in range(len(r)-1):
        if (int(r[i+1])>=int(r[i])):
            if(i>0):    
                if(a!='B'):
                    sum -= int(r[i]) #buy
                    a = 'B'
                    ac.append('B')
                    flag =1
                else:
                    ac.append('-')
                    pass  
            else:
                sum -= int(r[i]) #buy
                a ='B' 
                ac.append('B')
                flag =1
        elif(int(r[i+1])<=int(r[i])):
            if(i>0):
                if (a!='S' and flag!=0):
                    sum += int(r[i]) #sell
                    a ='S'
                    ac.append('S')
                    flag =1
                else: 
                    ac.append('-')
                    pass    
            else:
                ac.append('-')
                pass        
    if(int(r[len(r)-1])>int(r[len(r)-2])):
        if (a!='S' and sum !=0): #sell
            a ='S'
            ac.append('S')
        else: 
            ac.append('-')
            pass
    ac = str(ac)    
    ac = ac.strip("[]") #emove square bracket from ends
    k = ", "
    ac = ac.replace(k,"")
    k = "'"
    ac = ac.replace(k,"") #remove , and' 
    return ac 


# In[ ]:

