T = [6,7,8,15,19,24,32,41];

def pontoX(T, ordem):
    print(T)
    if(len(T) == 1):
        if(ordem):
            return -1;
        else:
            return T[0];
    if (len(T) == 2):
        if(T[0] < T[1]):
            return pontoX([T[1]])
        else:
            return pontoX([T[0]])

    mid = int(len(T) / 2);
    esq = mid - 1;
    dir = mid + 1;
    print(T[esq], T[mid], T[dir])
    if(T[esq] < T[mid] and T[mid] > T[dir]):
        return T[mid];
    if(T[esq] > T[mid]  and T[mid] > T[dir]):
        return pontoX(T[0:mid])
    else:
        if (T[esq] < T[mid] and T[mid] < T[dir]):
            return pontoX(T[mid:len(T)])
        else:
            return -1;
print(pontoX(T, True))

