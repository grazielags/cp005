algoritmo "par ou impar"
var
   num : inteiro
   funcao fun(num : inteiro): caractere
inicio
   se num % 2 = 0 entao
      retorne "O numero � par"
   senao
      retorne "O numero � impar"
   fimse
   fimfuncao
inicio
   escreva("digite um n�mero: ")
   leia(num)
   escreva(fun(num))
fimalgoritmo
