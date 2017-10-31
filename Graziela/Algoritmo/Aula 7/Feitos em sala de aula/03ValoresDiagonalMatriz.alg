algoritmo "03
var
   m1 : vetor [0..4, 0..4] de inteiro
   l, c : inteiro
inicio
      para l de 0 ate 4 passo 1 faca
           para c de 0 ate 4 passo 1 faca
                Escreva("Digite um número [",l,", ",c,"]: ")
                leia(m1[l, c])
           fimpara
      fimpara
      para l de 0 ate 4 passo 1 faca
           Escreva("|")
           para c de 0 ate 4 passo 1 faca
                Escreva(m1[l, c], " ")
           fimpara
           Escreval("|")
      fimpara
      para l de 0 ate 4 passo 1 faca
           para c de 0 ate 4 passo 1 faca
                se l = c entao
                   Escreval("m[",l,", ",c,"] = ",m1[l,c])
                fimse
           fimpara
      fimpara
fimalgoritmo
