algoritmo "vetor3"

var
   vet : vetor[1..10] de inteiro
   i : inteiro

inicio
   para i de 1 ate 10 passo 1 faca
      escreva("digite o ", i, "º termo do vetor: ")
      leia(vet[i])
   fimpara
   para i de 1 ate 10 passo 1 faca
      escreval(vet[i] / 2)
   fimpara
fimalgoritmo
