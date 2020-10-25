"""
Recursion program for:
GCD: Greatest Common Divider
LCM: Least Common Multiple
"""

# Recursive Function for GCD


def gcd(a, b):
    if(b == 0):
        return a
    else:
        return gcd(b, a % b)

# Recursive Function for LCM


def lcm(a, b):
    return int((a / gcd(a, b)) * b)

# main function for getting inputs


def main():
    # GCD input Code
    a = int(input("Enter first number:"))
    b = int(input("Enter second number:"))
    GCD = gcd(a, b)
    print("GCD is: ")
    print(GCD)
    # LCM input Code
    lcm.multiple = 0
    a = int(input("Enter first number:"))
    b = int(input("Enter second number:"))
    if(a > b):
        LCM = lcm(b, a)
    else:
        LCM = lcm(a, b)
    print(LCM)


# Executing the main function
if __name__ == "__main__":
    main()


"""
Input/Output:

Enter first number:15   
Enter second number:20
GCD is:
5
Enter first number:15
Enter second number:20
60

"""
