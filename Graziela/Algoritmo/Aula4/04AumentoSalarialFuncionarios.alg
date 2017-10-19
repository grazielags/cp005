algoritmo "04AumentoSalarialFuncionarios"
var
   salario, novoSalario : real
   cargo : inteiro
inicio
   escreva("Digite o salário: ")
   leia(salario)
   escreval("Digite o código do cargo: ")
   escreval("1 - Estagiário ")
   escreval("2 - Desenvolvedor ")
   escreval("3 - Analista ")
   escreval("Outros ")
   leia(cargo)
   escolha cargo
       caso 1
            novoSalario <- salario * 1.1
       caso 2
            novoSalario <- salario * 1.2
       caso 3
            novoSalario <- salario * 1.3
       outrocaso
            novoSalario <- salario * 1.4
   fimescolha
   escreval("Novo salário: ", novoSalario, " salário antigo: ", salario, " diferença salarial: ", (novoSalario - salario))
fimalgoritmo
