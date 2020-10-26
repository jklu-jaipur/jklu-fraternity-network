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


# Python program to find the factorial of a number provided by the user.

# change the value for a different result
num = 7

# To take input from the user
#num = int(input("Enter a number: "))

factorial = 1

# check if the number is negative, positive or zero
if num < 0:
   print("Sorry, factorial does not exist for negative numbers")
elif num == 0:
   print("The factorial of 0 is 1")
else:
   for i in range(1,num + 1):
       factorial = factorial*i
   print("The factorial of",num,"is",factorial)
