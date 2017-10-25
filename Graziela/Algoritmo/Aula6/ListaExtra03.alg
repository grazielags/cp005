algoritmo "ListaExtra03"
var
   v : vetor [0..4] de inteiro
   i, auxiliar : inteiro
inicio
     para i de 0 ate 4 passo 1 faca
          Escreva("Digite um número para o vetor 1 [", i, "] : ")
          leia(v[i])
     fimpara
     para i de 0 ate 4 passo 1 faca
          se (i mod 2 <> 0) e (i < 4) entao
             auxiliar <- v[i]
             v[i] <- v[i+1]
             v[i+1] <- auxiliar
          fimse
     fimpara
     para i de 0 ate 4 passo 1 faca
          Escreval("[", i, "]: ", v[i])
     fimpara
fimalgoritmo
