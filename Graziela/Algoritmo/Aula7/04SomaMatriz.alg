algoritmo "04SomaMatriz"
var
   m : vetor [0..4, 0..4] de inteiro
   l, c, soma : inteiro
inicio
      Escreval("Lendo números da matriz!")
      para l de 0 ate 4 passo 1 faca
           para c de 0 ate 4 passo 1 faca
                Escreva("Digite um número [", l, "][", c,"]: ")
                leia(m[l, c])
                soma <- soma + m[l, c]
           fimpara
      fimpara
      Escreval("O resultado da soma dos valores da matriz é: ",soma)
fimalgoritmo
