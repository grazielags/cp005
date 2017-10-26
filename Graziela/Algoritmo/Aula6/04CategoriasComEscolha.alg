algoritmo "04CategoriasComEscolha"
var
   idades : vetor [0..2] de inteiro
   categorias : vetor [0..2] de caractere
   i : inteiro
inicio
     para i de 0 ate 2 passo 1 faca
          Escreval("Digite a idade da pessoa: ")
          leia(idades[i])
          escolha idades[i]
             caso 0 ate 4
                categorias[i] <- "Idade inválida"
             caso 5 ate 7
                categorias[i] <- "Infantil A"
             caso 8 ate 10
                categorias[i] <- "Infantil B"
             caso 11 ate 13
                categorias[i] <- "Juvenil A"
             caso 14 ate 17
                categorias[i] <- "Juvenil B"
             outrocaso
                categorias[i] <- "Adulto"
          fimescolha
      fimpara
      para i de 0 ate 2 passo 1 faca
           Escreval(idades[i], " - ", categorias[i])
      fimpara
fimalgoritmo
