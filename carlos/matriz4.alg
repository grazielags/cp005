algoritmo "matriz4"

var
   i, j, soma: inteiro
   mat : vetor[1..5,1..5] de inteiro
inicio
   para i de 1 ate 5 faca
      para j de 1 ate 5 faca
         escreva("digite o termo [", i, "][", j, "]: ")
         leia(mat[i,j])
         soma <- soma + mat[i, j]
      fimpara
   fimpara
   escreva("a soma de todos os termos deu: ", soma)

fimalgoritmo
