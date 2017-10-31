algoritmo "06SomaLinha"
var
   m : vetor [0..3, 0..3] de inteiro
   l, c, soma, linha : inteiro
inicio
      para l de 0 ate 3 passo 1 faca
           para c de 0 ate 3 passo 1 faca
                Escreva("Digite um número [", l, "][", c,"]: ")
                leia(m[l, c])
           fimpara
      fimpara
      escreva("Digite a linha que deseja fazer a soma: ")
      leia(linha)
      para c de 0 ate 3 passo 1 faca
           soma <- soma + m[linha,c]
       fimpara
      escreva("Soma: ", soma)
fimalgoritmo
