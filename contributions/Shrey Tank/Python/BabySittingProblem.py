import math
h1= int(input("Enter start hr"))
m1= int(input("Enter start min"))
h2= int(input("Enter end hr"))
m2= int(input("Enter end min"))

t1 = h1 + (m1/60)

if(h2==0):
    h2=24
t2 = h2 + (m2/60)

if(t1>=18.5 and t2<=24.0):
    
    if (t1>=18):
        
        if (t2<=21.5):
            
            time = t2-t1
            price = 2*time
            
        else:
            
            time1 = 21.5 - t1
            time2 = t2 - 21.5
            price = (2*time1) + (4*time2)
            
    elif(t1>=21.5):
        
        time = t2-t1
        price = 4*time
        
    print(price)  
    
else:
    
    print("invalid input")
    
