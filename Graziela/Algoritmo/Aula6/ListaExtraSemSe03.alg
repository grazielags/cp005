algoritmo "ListaExtraSemSe03"
var
   v : vetor [0..4] de inteiro
   i, auxiliar : inteiro
inicio
     para i de 0 ate 4 passo 1 faca
          Escreva("Digite um n�mero para o vetor 1 [", i, "] : ")
          leia(v[i])
     fimpara
     //Deve come�ar com o primeiro valor �mpar, e deve terminar o para com uma posi��o a menos do que a �ltima posi��o.
     para i de 1 ate 3 passo 2 faca
         auxiliar <- v[i]
         v[i] <- v[i+1]
         v[i+1] <- auxiliar
     fimpara
     para i de 0 ate 4 passo 1 faca
         Escreval("[", i, "]: ", v[i])
     fimpara
fimalgoritmo
