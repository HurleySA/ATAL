kiritoStrenght, numDragons = [int(i) for i in input().split(' ')]

i = 0;
Dragons = [];

while(i < numDragons):
    dragonStrenght, bonusDefeating = [int(i) for i in input().split(' ')];
    infoDragon = (dragonStrenght, bonusDefeating);
    Dragons.append(infoDragon);
    i+=1;

Dragons.sort(key=lambda  x:x[0]);
j = 0;
isAlive = True;
while(j < numDragons and isAlive):
    dragonStrenght = Dragons[j][0];
    bonusDefeating = Dragons[j][1];
    if(kiritoStrenght > dragonStrenght):
        kiritoStrenght += bonusDefeating;
    else:
        isAlive = False;
    j+=1;


if(isAlive):
    print("YES");
else:
    print("NO")