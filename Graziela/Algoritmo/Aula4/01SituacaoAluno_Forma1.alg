algoritmo "01SituacaoAluno_Forma1"
var
   nome : caractere
   nota1, nota2, nota3, nota4, media : real
inicio
   escreva("DIgite o nome: ")
   leia(nome)
   escreva("DIgite a nota 1: ")
   leia(nota1)
   escreva("DIgite a nota 2: ")
   leia(nota2)
   escreva("DIgite a nota 3: ")
   leia(nota3)
   escreva("DIgite a nota 4: ")
   leia(nota4)
   media <- (nota1 + nota2 + nota3 + nota4) / 4
   se media >= 7 entao
      escreva(nome, " voc� est� APROVADO")
   senao
        se media <= 3 entao
           escreva(nome, " voc� est� REPROVADO")
        senao
           escreva(nome, " voc� est� em RECUPERA��O")
        fimse
   fimse
fimalgoritmo
