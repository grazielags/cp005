algoritmo "01MaiorMenorNumeroMatriz"
var
   numeros : vetor [0..1, 0..1] de inteiro
   l, c, menor, maior : inteiro
inicio
      para l de 0 ate 1 passo 1 faca
           para c de 0 ate 1 passo 1 faca
                Escreval("Digite um número: ")
                leia(numeros[l, c])
                se (l = 0) e (c = 0) entao
                   maior <- numeros[l, c]
                   menor <- numeros[l, c]
                senao
                     se numeros[l, c] > maior entao
                        maior <- numeros[l, c]
                     fimse
                     se numeros[l, c] < menor entao
                        menor <- numeros[l, c]
                     fimse
                fimse
           fimpara
      fimpara
      Escreval("Maior: ", maior)
      Escreval("Menor: ", menor)
fimalgoritmo
