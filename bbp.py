from decimal import Decimal
from decimal import getcontext

#Implementação do algoritmo BBP em Python.

def BBP(casasPrecisao):
    #Definindo a precisão em quantidade de casas
    #getcontext().prec transforma a precisão em quantidade de bits significantes,
    # como temos o primeiro sendo um 3 que é não é uma casa decimal então é passado + 1
    getcontext().prec = casasPrecisao + 1;
    #aplicando a formula
    #Somatório de 0 até casasPrecisão (1/16^k*(4/8k+1  - 2/8k+4 - 1/8k+5 - 1/8k+6))
    #Usando Decimal para ter precisão
    saida = sum(1/Decimal(16)**k *
        (Decimal(4)/(8*k+1) -
         Decimal(2)/(8*k+4) -
         Decimal(1)/(8*k+5) -
         Decimal(1)/(8*k+6)) for k in range(casasPrecisao))

    return saida;
print(BBP(100))

