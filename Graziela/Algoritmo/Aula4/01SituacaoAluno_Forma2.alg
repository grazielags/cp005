algoritmo "01SituacaoAluno_Forma2"
var
   nome : caractere
   nota, notas, media : real
   contador : inteiro
inicio
   escreva("DIgite o nome: ")
   leia(nome)
   contador <- 1
   enquanto contador <= 4 faca
      escreva("DIgite a nota ", contador, ": ")
      leia(nota)
      notas <- notas + nota
      contador <- contador + 1
   fimenquanto
   media <- (notas) / 4
   se media >= 7 entao
      escreva(nome, " você está APROVADO com média: ", media)
   senao
        se media <= 3 entao
           escreva(nome, " você está REPROVADO com média: ", media)
        senao
           escreva(nome, " você está em RECUPERAÇÃO com média: ", media)
        fimse
   fimse
fimalgoritmo
