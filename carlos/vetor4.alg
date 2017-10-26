algoritmo "vetor3"

var
   idade : vetor[1..3] de inteiro
   nome, cat : vetor[1..3] de caractere
   i : inteiro
inicio
   para i de 1 ate 3 faca
      escreva("diga o nome do nadador: ")
      leia(nome[i])
      escreva("diga idade do nadador: ")
      leia(idade[i])
      escolha idade[i]
      caso 5 ate 7
         cat[i] <- "Infantil A"
      caso 8 ate 10
         cat[i] <- "Infantil B"
      caso 11 ate 13
         cat[i] <- "Juvenil A"
      caso 14 ate 17
         cat[i] <- "Juvenil B"
      outrocaso
         cat[i] <- "Adulto"
      fimescolha
   fimpara
   para i de 1 ate 3 faca
     escreval("nome: ", nome[i]," /idade: ", idade[i]," /categoria: ", cat[i])
   fimpara



fimalgoritmo
