
n, m = [int(i) for i in input().split(' ')]
matrix = [];
for i in range(0, n, 1):
    matrix.append([]);
    entrada = [];
    for letra in input():
        entrada.append(letra)
    for j in range(0, len(entrada), 1):
        matrix[i].append(entrada[j]);

        if (matrix[i][j] == '.'):
            if ((i + j) % 2 == 0):
                matrix[i][j] = 'B'
            else:
                matrix[i][j] = 'W'

for i in range(n):
    saida = "";
    for j in range(m):
        saida += matrix[i][j];
    print(saida);
