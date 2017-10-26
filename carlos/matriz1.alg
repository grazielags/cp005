algoritmo "matriz1"

var
   i, j, maior, menor : inteiro
   mat : vetor[1..4,1..4] de inteiro
inicio
   para i de 1 ate 4 faca
      para j de 1 ate 4 faca
         escreva("digite o termo [", i, "][", j, "] da matriz: ")
         leia(mat[i,j])
         se (i=1) e (j=1) entao
            maior <- mat[i,j]
            menor <- mat[i,j]
         senao
            se mat[i,j] > maior entao
               maior <- mat[i,j]
            fimse
            se mat[i,j] < menor entao
               menor <- mat[i,j]
            fimse
         fimse
      fimpara
   fimpara
   para i de 1 ate 4 faca
      escreva("|")
      para j de 1 ate 4 faca
         escreva(mat[i,j])
      fimpara
      escreval("|")
   fimpara
   escreval("maior valor: ", maior)
   escreva("menor valor: ", menor)
fimalgoritmo
