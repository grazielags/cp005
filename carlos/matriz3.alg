algoritmo "matriz3"

var
   i, j: inteiro
   mat : vetor[1..5,1..5] de inteiro
   vet : vetor[1..5] de inteiro
inicio
   para i de 1 ate 5 faca
      para j de 1 ate 5 faca
      escreva("digite o termo [", i, "][", j, "]: ")
         leia(mat[i,j])
         se i = j entao
            vet[i] <- mat[i,j]
         fimse
      fimpara
   fimpara
   para i de 1 ate 5 faca
      escreva("|")
      para j de 1 ate 5 faca
         escreva(mat[i,j])
      fimpara
      escreval("|")
   fimpara
   para i de 1 ate 5 faca
      escreva(vet[i])
   fimpara
fimalgoritmo
