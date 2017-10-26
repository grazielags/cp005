algoritmo "02ImparesAoQuadrado"
var
   numeros : vetor [0..9] de real
   i : inteiro
inicio
     Escreval("Prencha abaixo os 10 valores do vetor: ")
     para i de 0 ate 9 passo 1 faca
          Escreva("Entre com um valor: ")
          Leia(numeros[i])
          numeros[i] <- numeros[i] / 2
     fimpara
     Escreval("Abaixo os valores do vetor divididos por 2: ")
     para i de 0 ate 9 passo 1 faca
          Escreval(numeros[i])
     fimpara
fimalgoritmo
