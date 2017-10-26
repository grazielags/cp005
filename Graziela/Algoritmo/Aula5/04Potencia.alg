algoritmo "04Potencia"
var
   i, base, potencia, resultado : inteiro
inicio
   resultado <- 1
   Escreva("Entre com o valor da base: ")
   Leia(base)
   Escreva("Entre com o valor da potência: ")
   Leia(potencia)
   para i de 1 ate potencia passo 1 faca
       resultado <- resultado * base
   fimpara
   escreval("A potência de base: ", base, " na potência: ", potencia, " é: ", resultado)
fimalgoritmo
