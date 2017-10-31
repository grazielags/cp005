algoritmo "07SomaIndices"
var
   m : vetor [1..10, 1..10] de inteiro
   l, c : inteiro
inicio
      para l de 1 ate 10 passo 1 faca
           escreva("|")
           para c de 1 ate 10 passo 1 faca
                m[l,c] <- l + c
                escreva(m[l,c])
           fimpara
           escreval("|")
      fimpara
fimalgoritmo
