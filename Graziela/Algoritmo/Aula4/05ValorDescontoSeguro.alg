algoritmo "05ValorDescontoSeguro"
var
   valor, desconto : real
inicio
   Escreva("Digite o valor do seguro: ")
   Leia(valor)
   escolha valor
      caso 0 ate 800
         desconto <- 0;
      caso 801 ate 1000
         desconto <- 5
      caso 1001 ate 1500
         desconto <- 10
      outrocaso
         desconto <- 15
   fimescolha
   Escreva("O valor: ", valor, " terá um descondo de: ", desconto, "%")
fimalgoritmo
