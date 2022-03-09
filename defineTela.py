n = 4;
menor = n;
saida = [0,0];
a = 1;
while(a <= n):
    b = n;
    while(b >= 1):
        if(a*b == n and a <= b):
            if(abs(b - a)< menor):
                menor = abs(b - a);
            saida = [a,b]
        b -= 1;
    a += 1;

print(saida);