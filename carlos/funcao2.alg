algoritmo "funcao2"
var
   parar : caractere
   operacao : caractere
   procedimento soma()
   var
      n1, n2, resultado : real
   inicio
      escreva("digite um numero: ")
      leia(n1)
      escreva("digite outro numero: ")
      leia(n2)
      resultado <- n1 + n2
      escreval(n1, " + ", n2, " = ", resultado)
   fimprocedimento
   procedimento subtracao()
   var
      n1, n2, resultado : real
   inicio
      escreva("digite um numero: ")
      leia(n1)
      escreva("digite outro numero: ")
      leia(n2)
      resultado <- n1 - n2
      escreval(n1, " - ", n2, " = ", resultado)
   fimprocedimento
   procedimento multiplicacao()
   var
      n1, n2, resultado : real
   inicio
      escreva("digite um numero: ")
      leia(n1)
      escreva("digite outro numero: ")
      leia(n2)
      resultado <- n1 * n2
      escreval(n1, " * ", n2, " = ", resultado)
   fimprocedimento
   procedimento divisao()
   var
      n1, n2, resultado : real
   inicio
      escreva("digite um numero: ")
      leia(n1)
      escreva("digite outro numero: ")
      leia(n2)
      resultado <- n1 / n2
      escreval(n1, " / ", n2, " = ", resultado)
   fimprocedimento
inicio
repita
   repita
      escreva("Digite a operacao: ")
      leia(operacao)
   ate (operacao = "+") ou (operacao = "-") ou (operacao = "*") ou (operacao = "/")
   escolha operacao
      caso "+"
         soma()
      caso "-"
         subtracao()
      caso "*"
         multiplicacao()
      caso "/"
         divisao()
      outrocaso
         escreva("opção invalida.")
   fimescolha
escreva("deseja parar: ")
leia(parar)
ate parar = "sim"
fimalgoritmo
