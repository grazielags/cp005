algoritmo "03Triangulo"
var
   A, B, C : inteiro
inicio
   escreval("Digite o valor do lado A: ")
   leia(A)
   enquanto A <= 0 faca
       escreval("Voc� digitou um valor inv�lido, por favor digir um valor maior do que 0 para o lado A: ")
       leia(A)
   fimenquanto
   escreval("Digite o valor do lado B: ")
   leia(B)
   enquanto B <= 0 faca
       escreval("Voc� digitou um valor inv�lido, por favor digir um valor maior do que 0 para o lado B: ")
       leia(B)
   fimenquanto
   escreval("Digite o valor do lado C: ")
   leia(C)
   enquanto C <= 0 faca
       escreval("Voc� digitou um valor inv�lido, por favor digir um valor maior do que 0 para o lado C: ")
       leia(C)
   fimenquanto
   se ((A+B) >= C) e ((A+C) >= B) e ((B+C) >= A) entao
      se (A = B) e (A = C) e (B = C) entao
         escreval("Equil�tero")
      senao
         se (A <> B) e (A <> C) e (B <> C) entao
            escreval("Escaleno")
         senao
            escreval("Is�celes")
         fimse
      fimse
   senao
       Escreval("N�o � um tri�ngulo!")
   fimse
fimalgoritmo
