n, m, k = map(int, input().split())
arr = [list(input()) for _ in range(n)]
if k == 0:
    for row in arr:
        for element in row:
            print(element, end="")
        print("")
    exit(0)

x, y = -1, -1
to_visit = -k
for i in range(n):
    for j in range(m):
        if arr[i][j] == '.':
            to_visit += 1
            x = i
            y = j
s = [(x, y)]
while to_visit > 0 and len(s) > 0:
    i, j = s.pop()
    arr[i][j] = '?'
    to_visit -= 1
    if i > 0 and arr[i - 1][j] == '.':
        s.append((i - 1, j))
        arr[i-1][j] = '@'
    if i < n - 1 and arr[i + 1][j] == '.':
        s.append((i + 1, j))
        arr[i+1][j] = '@'
    if j > 0 and arr[i][j - 1] == '.':
        s.append((i, j - 1))
        arr[i][j-1] = '@'
    if j < m - 1 and arr[i][j + 1] == '.':
        s.append((i, j + 1))
        arr[i][j+1] = '@'


for row in arr:
    for element in row:
        if element == '?':
            print('.', end="")
        elif element == '.' or element == '@':
            print('X', end="")
        else:
            print(element, end="")
    print("")