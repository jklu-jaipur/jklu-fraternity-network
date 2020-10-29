T = int(input())
while T > 0:
    green,purple = input().split()
    n = int(input())
    list1 = []
    list2 = []
    for i in range(n):
        l1,l2 = input().split()
        list1.append(int(l1))
        list2.append(int(l2))
        sum1=0
        sum2=0
    for k in range(n):
        sum1 = sum1 + list1[k]
        sum2 = sum2 + list2[k]
    if sum1 >= sum2:
        if int(green)>=int(purple):
            cost = int(purple)*sum1+int(green)*sum2
        else:
            cost = int(purple) * sum2 + int(green) * sum1
    else:
        if int(green) >= int(purple):
            cost = int(purple) * sum2 + int(green) * sum1
        else:
            cost = int(purple) * sum1 + int(green) * sum2
    print(cost)
    T-=1
