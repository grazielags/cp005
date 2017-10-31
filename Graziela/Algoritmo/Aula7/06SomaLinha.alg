algoritmo "06SomaLinha"
var
   m : vetor [0..3, 0..3] de inteiro
   l, c, linha, soma : inteiro
inicio
      Escreval("Lendo os valores da matriz!")
      para l de 0 ate 3 passo 1 faca
           para c de 0 ate 3 passo 1 faca
                Escreva("Digite um número [", l, "][", c,"]: ")
                leia(m[l, c])
           fimpara
      fimpara
      Escreva("Qual linha deseja realizar a soma (0, 1, 2, 3): ")
      leia(linha)
      para c de 0 ate 3 passo 1 faca
           soma <- soma + m[linha, c]
      fimpara
      Escreval("Soma: ", soma)
fimalgoritmo
