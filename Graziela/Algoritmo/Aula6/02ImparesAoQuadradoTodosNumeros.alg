algoritmo "02ImparesAoQuadradoTodosNumeros"
var
   numeros : vetor[1..5] de inteiro
   i : inteiro
inicio
   para i de 1 ate 10 passo 1 faca
      se (i mod 2 = 1) entao
         numeros[i] <- i * i
      senao
         numeros[i] <- i
      fimse
   fimpara
   para i de 1 ate 10 passo 1 faca
      escreval("[",i,"] - ", numeros[i])
   fimpara
fimalgoritmo
