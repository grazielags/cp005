algoritmo "06SOmarValoresDigitados"
var
   valor, soma : inteiro
inicio
   enquanto (valor mod 2) = 0 faca
      soma <- soma + valor
      escreva("Digite um n�mero: ")
      leia(valor)
   fimenquanto
   escreval("Soma dos valores: ", soma)
fimalgoritmo
