l1, r1, l2, r2 = [int(i) for i in input().split(' ')]

def solve(l1, r1, l2, r2, step = 30):
    if(l1 > r1 or l2 > r2):
        return 0;
    ovl = max(l1, l2);
    ovr = min(r1,r2);
    overlap = ((ovr - ovl + 1) if (ovl <= ovr) else 0 );
    if ((l1 <= l2 and r1 >= r2) or (l1 >= l2 and r1 <= r2)): return overlap;
    m = (1 << (step - 1));
    res = overlap;
    res = max( res , solve( min( l1 , m ) , min( r1 , m - 1 ) , min( l2 , m ) , min( r2 , m - 1 ) , step - 1 ));
    res = max(res, solve(min(l1, m), min(r1, m - 1), max(l2, m + 1) - m, max(r2, m) - m, step - 1));
    res = max(res, solve(max(l1, m + 1) - m, max(r1, m) - m, min(l2, m), min(r2, m - 1), step - 1));
    res = max(res, solve(max(l1, m + 1) - m, max(r1, m) - m, max(l2, m + 1) - m, max(r2, m) - m, step - 1));
    return res;

print(solve(l1,r1,l2,r2));
