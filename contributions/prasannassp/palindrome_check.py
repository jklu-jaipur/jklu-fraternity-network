def pcheck(k):
	if k == k[::-1]:
		return "Palindrome"
	else:
		return "Not a Palindrome"

print(pcheck(input()))