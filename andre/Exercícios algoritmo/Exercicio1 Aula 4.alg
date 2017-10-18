algoritmo "Notas"
var
nota1,nota2,nota3,media:real
inicio
escreval("Digite nota 1")
leia(nota1)
escreval("Digite nota 2")
leia(nota2)
escreval("Digite nota 3")
leia(nota3)
media<-(nota1+nota2+nota3)/3
se (media >= 7) entao
   escreval("aprovado")
senao
   se (media <= 3) entao
      escreval("reprovado")
   senao
      escreval("recuperaçao")
   fimse
fimse
fimalgoritmo

