def main():
    arr = list(map(int, input().split()))
    print(partition(arr))


swap = 0


def merge(arr_a, arr_b):
    global swap
    final_arr = []
    i = 0
    j = 0
    while i < len(arr_a) and j < len(arr_b):
        if arr_a[i] <= arr_b[j]:
            final_arr.append(arr_a[i])
            i += 1
        elif arr_b[j] < arr_a[i]:
            final_arr.append(arr_b[j])
            j += 1
            swap += len(arr_a) - i
    final_arr.extend(arr_a[i:])
    final_arr.extend(arr_b[j:])
    return final_arr


def partition(arr):
    left = 0
    right = len(arr)
    if left < right - 1:
        mid = left + (right - left) // 2
        arr = merge(partition(arr[left:mid]), partition(arr[mid:right]))
    return arr


if __name__ == '__main__':
    main()
    print(swap)
