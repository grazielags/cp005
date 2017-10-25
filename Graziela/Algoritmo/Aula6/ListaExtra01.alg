algoritmo "ListaExtra01"
var
   N : vetor[1..5] de inteiro
   i, menor, posicaoMenor : inteiro
inicio
   para i de 1 ate 5 passo 1 faca
      escreva("DIgite um número: ")
      leia(N[i])
      se i = 1 entao
         menor <- N[i]
         posicaoMenor <- i
      senao
         se N[i] < menor entao
            menor <- N[i]
            posicaoMenor <- i
         fimse
      fimse
   fimpara
   escreva("O menor elemento de N é: ", menor, " e sua posição dentro do vetor é:",posicaoMenor)
fimalgoritmo
