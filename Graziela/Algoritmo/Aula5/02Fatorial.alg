algoritmo "02Fatorial"
var
   i, n, resultado : inteiro
inicio
   Escreva("Digite um valor para saber seu fatorial: ")
   Leia(n)
   resultado <- n
   para i de n-1 ate 1 passo -1 faca
      resultado <- resultado * i
   fimpara
   escreva(resultado)
fimalgoritmo
