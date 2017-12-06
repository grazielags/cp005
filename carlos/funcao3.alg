algoritmo "funcao3"
var
   n1, n2, maior : inteiro
funcao maiorNumero() : inteiro
   inicio
      se n1 > n2 entao
         retorne n1
      senao
         retorne n2
      fimse
fimfuncao
inicio
   escreva(n1)
   leia(n1)
   escreva(n2)
   leia(n2)
   maior <- maiorNumero()
   escreva("O maior número é: ", maior)
fimalgoritmo
