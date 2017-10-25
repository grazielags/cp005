algoritmo "ListaExtra02"
var
   v1, v2, v3 : vetor[1..5] de inteiro
   i : inteiro
inicio
   para i de 1 ate 5 passo 1 faca
      escreva("Digite um número para o v1[", i, "]: ")
      leia(v1[i])
      escreva("Digite um número para o v2[", i, "]: ")
      leia(v2[i])
      v3[i] <- v1[i] * v2[i]
   fimpara
   para i de 1 ate 5 faca
      escreval(v1[i], " * ", v2[i], " = ", v3[i])
   fimpara
fimalgoritmo
