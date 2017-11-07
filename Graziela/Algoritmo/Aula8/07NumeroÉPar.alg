algoritmo "07NumeroÉPar"
var
   numero : inteiro
funcao ehPar() : logico
inicio
   se ((numero % 2) = 0) entao
      retorne verdadeiro
   senao
      retorne falso
   fimse
fimfuncao
inicio
      escreval("Digite um número: ")
      leia(numero)
      escreval("O número: ", numero, " é par? ", ehPar())
fimalgoritmo
