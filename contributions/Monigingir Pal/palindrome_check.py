#Function to check if a string is palindrome
def check_palindrome(input_string):
    input_string = input_string.casefold()
    # if string is equal to its reverse it is palindrome
    if input_string == input_string[::-1]:
        print("Palindrome string")
    else:
        print("Not a Palindrome String")

#Input method
if __name__=='__main__':
    input_string = input("Enter string to check : ")
    check_palindrome(input_string)

