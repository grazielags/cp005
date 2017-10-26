algoritmo "matriz2"

var
   i, j: inteiro
   mat1, mat2, mat3 : vetor[1..2,1..2] de inteiro
inicio
   para i de 1 ate 2 faca
      para j de 1 ate 2 faca
         leia(mat1[i,j])
         leia(mat2[i,j])
         mat3[i,j] <- mat1[i,j] * mat2[i,j]
      fimpara
   fimpara
   escreval("")
   escreval("matriz 1")
   para i de 1 ate 2 faca
      escreva("|")
      para j de 1 ate 2 faca
         escreva(mat1[i,j])
      fimpara
      escreval("|")
   fimpara
   escreval("")
   escreval("matriz 2")
   para i de 1 ate 2 faca
      escreva("|")
      para j de 1 ate 2 faca
         escreva(mat2[i,j])
      fimpara
      escreval("|")
   fimpara
   escreval("")
   escreval("matriz multiplicação")
   para i de 1 ate 2 faca
      escreva("|")
      para j de 1 ate 2 faca
         escreva(mat3[i,j])
      fimpara
      escreval("|")
   fimpara
fimalgoritmo
