algoritmo "funcao1"
procedimento metodo()
var
   categoria : inteiro
inicio
   repita
      escreva("Digite a categoria: ")
      leia(categoria)
   ate (categoria >= 3) e (categoria <= 6)
   escolha categoria
      caso 3
         escreva("Triangulo")
      caso 4
         escreva("Quadrado")
      caso 5
         escreva("Pentagono")
      caso 6
         escreva("Hexagono")
      outrocaso
         escreva("categoria invalida, digite outro numero.")
   fimescolha
fimprocedimento
inicio
   metodo()
fimalgoritmo
