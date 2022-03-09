T = [["R", ".", ".", ".", "#", "."], [".","#","#",".",".","."], [".",".",".",".","#","."], ["#",".","#","#","#","#"], [".",".",".",".",".","D"]]

def relampago(i, j):
    if(i > 4 or j > 5):
        return False;
    if(T[i][j] == "D"):
        return True;
    else:
        if(T[i][j] == "R" or T[i][j] == "."):
            return (relampago(i + 1, j) or relampago(i, j + 1));
        else:
            return False;
print(relampago(0,0))