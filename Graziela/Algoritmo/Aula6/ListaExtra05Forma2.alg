algoritmo "ListaExtra05Forma2"
var
   v : vetor[1..5] de inteiro
   i, contador, auxiliar : inteiro
inicio
   contador <- 5
   para i de 1 ate 5 passo 1 faca
      escreva("Digite um número para o v[", i, "]: ")
      leia(v[i])
   fimpara
   escreval("Listagem inicial")
   para i de 1 ate 5 faca
      escreval("v[", i, "] = ", v[i])
   fimpara
   para i de 1 ate (5 div 2) faca
      auxiliar <- v[i]
      v[i] <- v[contador]
      v[contador] <- auxiliar
      contador <- contador - 1
   fimpara
   escreval("Listagem após a troca")
   para i de 1 ate 5 faca
      escreval("v[", i, "] = ", v[i])
   fimpara
fimalgoritmo
