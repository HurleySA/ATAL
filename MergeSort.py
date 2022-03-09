n, k = [int(i) for i in input().split(' ')]
test = [None] * 100010;

def unsort(l, r):
    global k;
    if (not k or l >= r - 1):
        return;
    mid = int((l + r) >> 1);
    test[mid], test[mid - 1] = test[mid - 1], test[mid];
    k -= 1;

    unsort(l,mid);
    unsort(mid,r);

def solve():
    global k;
    if (k&1 == 0):
        return "-1";
    k /= 2;

    for i in range(0, n, 1):
        test[i] = i + 1;

    unsort(0, n);

    if (k):
        saida = "";
        for j in range(0, n, 1):
            if (j + 1 < n):
                saida += str(test[j]) + " ";
            else:
                saida += str(test[j])
        return saida;
    else:
        return "-1"


print(solve());