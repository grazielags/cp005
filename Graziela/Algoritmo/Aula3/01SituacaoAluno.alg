algoritmo "01SituacaoAluno"
var
   nota1, nota2, nota3, media : real
   nome : caractere
inicio
   Escreva("DIgite o seu nome: ")
   Leia(nome)
   Escreva("Digite a nota 1: ")
   Leia(nota1)
   Escreva("Digite a nota 2: ")
   Leia(nota2)
   Escreva("Digite a nota 3: ")
   Leia(nota3)
   media <- (nota1 + nota2 + nota3) / 3
   se media >= 7.0 entao
      Escreva(nome, " voc� foi aprovado com m�dia: ", media)
   senao
      Escreva(nome, " voc� foi reprovado com m�dia: ", media)
   fimse
fimalgoritmo
