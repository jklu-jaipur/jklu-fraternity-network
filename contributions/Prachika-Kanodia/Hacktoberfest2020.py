# Python program to find largest 
# number in a list 
  
# list of numbers 
list1 = [10, 20, 4, 45, 99] 
  
# sorting the list 
list1.sort() 
  
# printing the last element 
print("Largest element is:", list1[-1]) 


# Python3 program to add two numbers 
  
num1 = 15
num2 = 12
  
# Adding two nos 
sum = num1 + num2 
  
# printing values 
print("Sum of {0} and {1} is {2}" .format(num1, num2, sum)) 


# Python program to check if year is a leap year or not

year = 2000

# To get year (integer input) from the user
# year = int(input("Enter a year: "))

if (year % 4) == 0:
   if (year % 100) == 0:
       if (year % 400) == 0:
           print("{0} is a leap year".format(year))
       else:
           print("{0} is not a leap year".format(year))
   else:
       print("{0} is a leap year".format(year))
else:
   print("{0} is not a leap year".format(year))
