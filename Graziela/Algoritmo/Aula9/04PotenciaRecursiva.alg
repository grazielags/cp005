algoritmo "04PotenciaRecursiva"
var
   base, potencia, resultado : inteiro
funcao resultadoPotencia(aux, b, p : inteiro) : inteiro
   inicio
         se p = 0 entao
            retorne 1
         senao
             se aux = p entao
                retorne b
             senao
                retorne b * resultadoPotencia(aux + 1, b, p)
             fimse
         fimse
         //Forma como monta no momento do cálculo por exemplo base = 2 e potência = 2, (2 * (2 * (2 * (2))))
fimfuncao
inicio
      Escreva("Digite a base: ")
      leia(base)
      Escreva("Digite a potência: ")
      leia(potencia)
      resultado <- resultadoPotencia(1, base, potencia)
      Escreva(resultado)
fimalgoritmo
