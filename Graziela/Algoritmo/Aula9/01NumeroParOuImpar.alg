algoritmo "01NumeroParOuImpar"
var
   numero : inteiro
   resultado : logico
funcao ehPar(valor :inteiro) : logico
inicio
      se (valor % 2 = 0) entao
         retorne verdadeiro
      senao
         retorne falso
      fimse
fimfuncao
inicio
      escreva("Digite um n�mero: ")
      leia(numero)
      resultado <- ehPar(numero)
      escreva("O n�mero � par? ", resultado)
fimalgoritmo

