algoritmo "media com funcao"
var
   n1, n2 : inteiro
   funcao fun(n1, n2 : inteiro): caractere
   var
      resultado : inteiro
   inicio
      resultado <- ((n1 + n2)div 2)
      se resultado >= 7 entao
         retorne "Aprovado"
      senao
         retorne "Reprovado"
      fimse
   fimfuncao
inicio
   escreva("digite uma nota: ")
   leia(n1)
   escreva("digite uma nota: ")
   leia(n2)
   escreva(fun(n1, n2))
fimalgoritmo
