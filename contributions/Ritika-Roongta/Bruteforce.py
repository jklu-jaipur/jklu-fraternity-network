1.  BRUTE FORCE Algorithm for string pattern matching    //in python

def bruteF(P, T): 
    M = len(P) 
    N = len(T) 
    for i in range(N - M + 1): 
        j = 0 
        while(j < M): 
            if (T[i + j] != P[j]): 
                break
            j += 1
        
        if (j == M): 
            print("Pattern found at index ", i) 


if __name__ == '__main__': 
    T = input("Enter the text: ")
    P = input("Enter the pattern: ")
    bruteF(P, T)
