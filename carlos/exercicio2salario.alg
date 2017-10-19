algoritmo "semnome"

var
   nome, nivel: caractere
   horas: inteiro
   salario : real
inicio
   escreval("Nome do funcionário: ")
   leia(nome)
   escreval("Nível do funcionário: ")
   leia(nivel)
   escreval("Horas trabalhadas: ")
   leia(horas)
   se nivel = "Senior" entao
      salario <- horas * 50
      escreval("O salário do funcionario ", nome, " é: ", salario)
   senao
      se nivel = "Pleno" entao
         salario <- horas * 25
         escreval("O salário do funcionario ", nome, " é: ", salario)
      senao
         salario <- horas * 12
         escreval("O salário do funcionario ", nome, " é: ", salario)
      fimse
   fimse



fimalgoritmo
