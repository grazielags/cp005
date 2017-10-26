algoritmo "fatorial"

var

   i, sexo, corolhos : caractere
   maioridade, idade, qtdpessoas : inteiro
   
   
inicio
para i de 1 ate 5 passo 1 faca
   escreva("Digite a idade: ")
   leia(idade)
   escreva("digite a cor dos olhos: ")
   leia(corolhos)
   escreva("digite o sexo (F ou M): ")
   leia(sexo)
   se idade > maioridade entao
      maioridade <- idade
   fimse
   se (sexo = "F") e (idade>= 18) e (idade<=35) e (corolhos = "A") entao
      qtdpeossoas <- qtdpessoas
   
fimalgoritmo
