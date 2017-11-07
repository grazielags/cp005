algoritmo "06SomaNumerosImpares"
var
   soma, i : inteiro
   numeros : vetor[0..4] de inteiro
procedimento inserir()
inicio
   para i de 0 ate 4 faca
      Escreva("Digite um número [", i, "]: ")
      Leia(numeros[i])
   fimpara
fimprocedimento
procedimento somaImparesEExibe()
inicio
   para i de 0 ate 4 faca
      se ((numeros[i] % 2) <> 0) entao
         soma <- soma + numeros[i]
      fimse
   fimpara
fimprocedimento
inicio
      inserir()
      somaImparesEExibe()
      Escreval("A soma dos valores ímpares do vetor é igual a: ", soma)
fimalgoritmo
