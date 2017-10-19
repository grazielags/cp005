algoritmo "03Triangulo"
var
   A, B, C : inteiro
inicio
   escreval("Digite o valor do lado A: ")
   leia(A)
   enquanto A <= 0 faca
       escreval("Você digitou um valor inválido, por favor digir um valor maior do que 0 para o lado A: ")
       leia(A)
   fimenquanto
   escreval("Digite o valor do lado B: ")
   leia(B)
   enquanto B <= 0 faca
       escreval("Você digitou um valor inválido, por favor digir um valor maior do que 0 para o lado B: ")
       leia(B)
   fimenquanto
   escreval("Digite o valor do lado C: ")
   leia(C)
   enquanto C <= 0 faca
       escreval("Você digitou um valor inválido, por favor digir um valor maior do que 0 para o lado C: ")
       leia(C)
   fimenquanto
   se ((A+B) >= C) e ((A+C) >= B) e ((B+C) >= A) entao
      se (A = B) e (A = C) e (B = C) entao
         escreval("Equilátero")
      senao
         se (A <> B) e (A <> C) e (B <> C) entao
            escreval("Escaleno")
         senao
            escreval("Isóceles")
         fimse
      fimse
   senao
       Escreval("Não é um triângulo!")
   fimse
fimalgoritmo
