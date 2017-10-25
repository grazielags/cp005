algoritmo "01ValoresEPosicao"
var
   valores : vetor [0..4] de inteiro
   i : inteiro
inicio
     para i de 0 ate 4 passo 1 faca
          Escreval("Digite um número na posição [", i, "]: ")
          leia(valores[i])
      fimpara
      para i de 0 ate 4 passo 1 faca
           Escreval("Número: ", valores[i], " na posição: ", i)
      fimpara
fimalgoritmo
