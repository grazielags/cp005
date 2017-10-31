algoritmo "03
var
   notas : vetor [0..9, 0..4] de inteiro
   nomes : vetor [0..9] de caractere
   l, c : inteiro
inicio
      para l de 0 ate 9 passo 1 faca
           Escreva("Digite o nome do aluno [",l,"]: ")
           leia(nomes[l])
           para c de 0 ate 4 passo 1 faca
                Escreva("Digite a nota [",l,", ",c,"] do aluno ",nomes[l],": ")
                leia(notas[l, c])
           fimpara
      fimpara
      para l de 0 ate 9 faca
           escreva(nomes[l], ": [")
           para c de 0 ate 4 faca
                escreva(notas[l,c])
           fimpara
           escreval("]")
      fimpara
fimalgoritmo
