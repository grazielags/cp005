algoritmo "potencia"

var

   i, x, y, potencia : inteiro
   
inicio
   i <- 1
   escreval("digite o numero: ")
   leia(x)
   escreval("digite a potencia: ")
   leia(y)
   potencia <- x
   enquanto i < y faca
      potencia <- potencia*x
      i <- i +1
   fimenquanto
   escreva(x, " elevado à ", y, " = ", potencia)

fimalgoritmo
