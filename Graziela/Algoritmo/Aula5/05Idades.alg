algoritmo "05Idades"
var
   i, idade, maiorIdade, menorIdade, soma : inteiro
   media : real
inicio
   maiorIdade <- 0
   soma <- 0
   para i de 1 ate 10 passo 1 faca
       Escreva("Entre com a idade: ")
       Leia(idade)
       soma <- soma + idade
       se i = 1 entao
          menorIdade <- idade
       senao
          se idade < menorIdade entao
             menorIdade <- idade
          fimse
       fimse
       se idade > maiorIdade entao
          maiorIdade <- idade
       fimse
   fimpara
   media <- soma div (i-1)
   escreval("Media: ", media)
   escreval("Maior Idade: ", maiorIdade)
   escreval("MenorIdade: ", menorIdade)
fimalgoritmo
