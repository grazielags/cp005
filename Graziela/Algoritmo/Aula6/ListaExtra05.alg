algoritmo "ListaExtra05"
var
   v : vetor [0..4] de inteiro
   i, auxiliar : inteiro
inicio
     para i de 0 ate 4 passo 1 faca
          Escreva("Digite um número [", i, "]: ")
          leia(v[i])
     fimpara
     para i de 0 ate 2 passo 1 faca
          auxiliar <- v[i]
          v[i] <- v[4-i]
          v[4-i] <- auxiliar
     fimpara
     para i de 0 ate 4 passo 1 faca
          Escreval("[", i, "]: ", v[i])
     fimpara
fimalgoritmo
