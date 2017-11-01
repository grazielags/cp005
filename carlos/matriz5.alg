algoritmo "matriz5"

var
   i, j, soma, linha: inteiro
   m : vetor[1..4,1..4] de inteiro

inicio
   para i de 1 ate 4 faca
      para j de 1 ate 4 faca
         escreva("digite um numero [", i, "][", j, "]: ", i)
         leia(m[i,j])
      fimpara
   fimpara
   escreva("digite a linha que deseja fazer a soma: ")
   leia(linha)
   para j de 1 ate 4 faca
      soma <- soma + m[linha, j]
   fimpara
   escreva("Soma: ", soma)
fimalgoritmo
