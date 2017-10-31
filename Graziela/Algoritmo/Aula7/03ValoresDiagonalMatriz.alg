algoritmo "03ValoresDiagonalMatriz"
var
   notas : vetor [0..1, 0..1] de inteiro
   l, c : inteiro
inicio
     para l de 0 ate 1 passo 1 faca
          para c de 0 ate 1 passo 1 faca
               Escreval("Digite a nota [", l, "][", c, "]")
               leia(notas[l, c])
          fimpara
     fimpara
     para l de 0 ate 1 passo 1 faca
          para c de 0 ate 1 passo 1 faca
               se l = c entao
                  Escreval("[", l, "][", c, "] = ", notas[l, c])
               fimse
          fimpara
     fimpara
fimalgoritmo

