n = 5;
pop = [96,80,45,10,20];
dur = [3,4,5,2,8]
tempo = 15;

def show_kay(popularidades, duracoes, n_musicas, tempo_maximo):
    t = []
    for i in range(n_musicas):
        t.append(i);
    for j in range(n):
        indexMaior = j;
        for k in range(j+1,n,1):
            if(popularidades[k] > popularidades[indexMaior]):
                indexMaior = k
        temp = popularidades[j];
        popularidades[j] = popularidades[indexMaior];
        popularidades[indexMaior] = temp;

        temp2 = t[j];
        t[j] = t[indexMaior];
        t[indexMaior] = temp2;
    saida = [];
    for l in range(n_musicas):
        saida.append(l);

    tempoAtual = 0;
    for m in t:
        print(duracoes[m], tempoAtual, tempo_maximo, m)
        if (duracoes[m] + tempoAtual <= tempo_maximo):
            tempoAtual += duracoes[m];
            saida[m] = 1;
        else:
            if (tempoAtual <= tempo_maximo):
                saida[m] = (tempo_maximo - tempoAtual) / duracoes[m];
                tempoAtual += duracoes[m];
            else:
                saida[m] = 0;
    print(saida)

show_kay(pop, dur,n,tempo);
