t=int(input())

results = [];
for i in range(t):
    n=int(input())
    weights=[]
    sm=0
    for i in range(1,n+1):
        weights.append(2**i)
    ns=(n//2-2)
    for i in range(n-2,ns,-1):
        sm=sm+weights[i]
        weights.remove(weights[i])
    n=sum(weights)
    mode=abs(sm-n)
    results.append(mode)

for result in results:
    print(result);