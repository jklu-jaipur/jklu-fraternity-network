#!/usr/bin/env python
# coding: utf-8

# In[ ]:


def letter_distribution(sentence):
    all_freq = {} 
    for i in sentence: #loop through characters of sentence
        if i.isalpha():
            if i in all_freq: # characters is not a key in all_freq
                all_freq[i] += 1
            else: 
                all_freq[i] = 1
    return (all_freq)


# In[ ]:


def snowball(sentence):
    freq = letter_distribution(sentence)
    frequency = []
    for v in freq.values():
        frequency.append(v) # making a list of values of freq
    freq_1 = []
    for i in frequency:
        if(i not in freq_1): 
            freq_1.append(i) # making a unique list of all elements in frequency
    if(len(freq_1) < len(frequency)): # elemnts in frequency were duplicate
        return False
    else:
        return True


# In[ ]:


def pyramid(sentence):
    freq = letter_distribution(sentence)
    frequency = []
    for v in freq.values():
        frequency.append(v) # making a list of values of freq
    freq_1 = []
    for i in range(len(frequency)):
        count =0
        for j in range(i+1,len(frequency)):
            if(frequency[i]==frequency[j]): # if the element occurs again in list
                count+=1
        freq_1.append(count)
    flag=0
    for i  in freq_1:
        if(i==1): # if 1 occurs in freq_1
            flag =1
    if(flag==1):   
        return True
    else:
        return False


# In[ ]:


def pi(sentence):
    from mpmath import mp
    freq = letter_distribution(sentence)
    frequency = []
    for v in freq.values():
        frequency.append(str(v)) # making a list of values of freq
    string = ""   
    for i in frequency:  
        string += i   
    sort_string = sorted(string) #sorting string elements
    mp.dps = len(frequency)   
    pi_num = mp.pi #to get value of pi till 50 decimal places
    pi_num = str(pi_num)
    PI_n = ""
    for i in pi_num: 
        if(i == "."): 
            pass
        else:
            PI_n += i 
    sort_pi = sorted(PI_n)     
    if(sort_string == sort_pi): 
        return True
    else:
        return False 

