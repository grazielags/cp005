algoritmo "ListaExtra04"
var
   v : vetor [0..9] de inteiro
   i, qtdPares : inteiro
inicio
     para i de 0 ate 9 passo 1 faca
          Escreva("Digite um número [", i, "]: ")
          leia(v[i])
          se v[i] mod 2 = 0 entao
             qtdPares <- qtdPares + 1
          fimse
     fimpara
     Escreva("Quantidade de número pares: ", qtdPares)
fimalgoritmo
