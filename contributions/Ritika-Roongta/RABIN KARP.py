RABIN KARP Algorithm               //for string pattern matching


d = 26

def RabinK(P, T, q):
    M = len(P)
    N = len(T)
    i = 0
    j = 0
    p = 0 
    t = 0 
    h = 1

    for i in range(M-1):
        h = (h*d)%q

    for i in range(M):
        p = (d*p + ord(P[i]))%q
        t = (d*t + ord(T[i]))%q

    for s in range(N-M+1):
        if p==t:
            for j in range(M):
                if T[s+j] != P[j]:
                    break
                else: j+=1

            if j==M:
                print ("Pattern found at index " + str(s))

        if s < N-M:
            t = (d*(t-ord(T[s])*h) + ord(T[s+M]))%q

            if t < 0:
                t = t+q

T = input("Enter the text: ").lower()
P = input("Enter the pattern: ").lower()
q = int(input("Enter the prime number: "))
RabinK(P,T,q)
