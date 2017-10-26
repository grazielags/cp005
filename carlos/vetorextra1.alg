algoritmo "vetorextra1"

var
   n : vetor[0..4] de real
   maior, menor : real
inicio
   para i de 0 ate 4
      escreva("digite um numero: ")
      leia(n[i])
      maior <- n[i]
      menor <- n[i]
      se n[i+1] > maior entao
         maior <- n[i+1]
      fimse
      
   fimpara
fimalgoritmo
