a = input();
b = input();


def solve(a, b):
    if(recursiveSolve(a,b)):
        return "YES"
    return "NO"
def recursiveSolve(a,b):
        if (a == b):
            return True
        if(len(a) % 2):
            return False;

        meio = int((len(a) / 2));
        fim = len(a);
        a1 = (a[0:meio]);
        a2 = (a[meio:fim]);
        b1 = (b[0:meio]);
        b2 = (b[meio:fim]);

        if((recursiveSolve(a1,b2) and recursiveSolve(a2,b1))):
            return True;
        else:
            if((recursiveSolve(a1,b1) and recursiveSolve(a2,b2))):
                return True;
            else:
                return False;




print(solve(a, b));
