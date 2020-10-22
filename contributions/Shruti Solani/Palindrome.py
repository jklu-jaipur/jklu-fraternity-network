def check_palindrome(str):
    n = len(str)
    str_list = list(str)
    for i in range(n//2 + 1):
        if(str_list[i] == str_list[n-i-1]):
            pass
        else:
            print("Not Palindrome")
            exit()
    print("Palindrome")


if __name__ == '__main__':
    str = input()
    check_palindrome(str)
