algoritmo "semnome"

var
   nome : caractere
   somanotas, nota, media : real
   cont: inteiro
inicio
escreval("Escreva nome do aluno: ")
leia(nome)
cont <- 1
   enquanto cont <= 4 faca
      escreval("Digite a ", cont, "� nota: ")
      leia(nota)
      somanotas <- somanotas + nota
      cont <- cont + 1
   fimenquanto
   media <- somanotas / cont
   escreval(nome, ", a sua m�dia �: ", media)
   se media <= 3 entao
      escreval("reprovado")
   senao
      se (3.1 <= media) e (media <= 6.9) entao
        escreval("recupera��o")
      senao
        escreval("aprovado")
      fimse
   fimse
fimalgoritmo
