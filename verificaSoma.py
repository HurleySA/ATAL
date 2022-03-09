#Complexidade n³
t = [3,5,7,8];
n = 25;
l = len(t)
achou = False;

i = 0;
while(i < l and not achou):
    j = 0;
    while (j < l and not achou):
        k = 0;
        while(k < l and not achou):
            if(t[i] + t[j] + t[k] == n):
                print(i, j, k)
                achou = True;
            k+=1;
        j+=1;
    i+=1;