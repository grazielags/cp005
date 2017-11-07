algoritmo "Fatorial"
var resultado, valor : inteiro

funcao fatorial(numero :inteiro) : inteiro
inicio
      se numero = 1 entao
         retorne numero
      senao
         retorne numero * fatorial(numero)
      fimse
fimfuncao
inicio
      escreva("Digite um valor: ")
      leia(valor)
      resultado <- fatorial(valor)
      escreva("O fatorial de ", valor," é ", resultado)
fimalgoritmo

