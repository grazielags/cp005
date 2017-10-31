algoritmo "Matriz"
var
   notas : vetor [0..2, 0..1] de inteiro
   nomes : vetor [0..2] de caractere
   l, c : inteiro
   media : real
inicio
     para l de 0 ate 2 passo 1 faca
          Escreval("Digite o nome do aluno[", l, "]")
          leia(nomes[l])
          para c de 0 ate 1 passo 1 faca
               Escreval("Digite a nota [", l, "][", c, "]")
               leia(notas[l, c])
          fimpara
     fimpara
     para l de 0 ate 2 passo 1 faca
          Escreval("Notas do aluno: ", nomes[l])
          media <- 0
          para c de 0 ate 1 passo 1 faca
               media <- media + notas[l, c]
               Escreval("[", l, "][", c, "] = ", notas[l, c])
          fimpara
          media <- media / 2
          se (media <= 6) e (media >= 0) entao
             escreval("Reprovado com média: ", media)
          senao
               se (media > 6) e (media < 7) entao
                  escreval("Em recuperação com média: ", media)
               senao
                  escreval("Aprovado com média: ", media)
               fimse
          fimse
     fimpara
fimalgoritmo

