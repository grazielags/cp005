algoritmo "par ou impar"
var
   num : inteiro
   funcao fun(num : inteiro): caractere
inicio
   se num % 2 = 0 entao
      retorne "O numero é par"
   senao
      retorne "O numero é impar"
   fimse
   fimfuncao
inicio
   escreva("digite um número: ")
   leia(num)
   escreva(fun(num))
fimalgoritmo
