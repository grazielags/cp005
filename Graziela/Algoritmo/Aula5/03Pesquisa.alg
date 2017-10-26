algoritmo "03Pesquisa"
var
   i, idade, maiorIdade, qtdPessoas : inteiro
   sexo, corOlhos : caractere
inicio
   para i de 1 ate 5 passo 1 faca
      Escreva("Digite a idade: ")
      Leia(idade)
      Escreva("Digite a cor do olhos (A - Azul, V - Verde, C - Castanho): ")
      Leia(corOlhos)
      Escreva("Digite o sexo (F - Feminino, M - Masculino): ")
      Leia(sexo)
      se idade > maiorIdade entao
         maiorIdade <- idade
      fimse
      se (sexo = "F") e (idade >= 18) e (idade <= 35) e (corOlhos = "A") entao
          qtdPessoas <- qtdPessoas + 1
      fimse
   fimpara
   escreval("A maior idade é: ", maiorIdade)
   escreva("Quantidade de pessoas com olhos azuis, entre 18 e 35 anos e do sexo feminino: ", qtdPessoas)
fimalgoritmo
