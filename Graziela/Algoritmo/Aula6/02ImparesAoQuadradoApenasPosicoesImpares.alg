algoritmo "02ImparesAoQuadradoApenasPosicoesImpares"
var
   numeros : vetor[1..5] de inteiro
   i, count : inteiro
inicio
   count <- 1
   para i de 1 ate 10 passo 1 faca
      se (i mod 2 = 1) entao
         numeros[count] <- i * i
         count <- count + 1
      fimse
   fimpara
   para i de 1 ate 5 passo 1 faca
      escreval("[",i,"] - ", numeros[i])
   fimpara
fimalgoritmo
