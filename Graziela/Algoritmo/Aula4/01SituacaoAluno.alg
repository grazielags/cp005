algoritmo "01SituacaoAluno"
var
   nota, somaNotas, media : real
   contador : inteiro
   nome : caractere
inicio
   contador <- 1
   Escreva("Digite o nome do aluno: ")
   Leia(nome)
   enquanto contador <= 4 faca
      Escreva("Digite a nota ", contador, ": ")
      leia(nota)
      somaNotas <- somaNotas + nota
      contador <- contador + 1
   fimenquanto
   media <- somaNotas / 4
   //Utiliza��o de condicional simples.
   //se media <= 3 entao
   //   Escreval("Reprovado com media: ", media)
   //fimse
   //se (media > 3) e (media < 7) entao
   //   Escreval("Recupera��o com media: ", media)
   //fimse
   //se media >= 7 entao
   //   Escreval("Aprovado com media: ", media)
   //fimse

   //Outra forma de utiliza��o de condiciona com se e sen�o
   //se media <= 3 entao
   //    Escreval("Reprovado com media: ", media)
   //senao
   //     se (media > 3) e (media < 7) entao
   //         Escreval("Recupera��o com media: ", media)
   //     senao
   //         Escreval("Aprovado com media: ", media)
   //     fimse
   //fimse

   //Outra forma de utiliza��o de condiciona com se e sen�o
   escolha media
      caso 0 ate 3
          Escreval(nome, "voc� foi Reprovado com media: ", media)
      caso 3.1 ate 6.9
          Escreval(nome, "voc� ficou em Recupera��o com media: ", media)
      caso 7 ate 10
          Escreval(nome, "voc� foi Aprovado com media: ", media)
      outrocaso
          Escreval("Media inv�lida")
   fimescolha
fimalgoritmo
