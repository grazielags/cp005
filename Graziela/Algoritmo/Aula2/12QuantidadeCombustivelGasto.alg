algoritmo "QuantidadeCombustivelGasto"
var
	kmPercorridos : real
	consumoMedio : inteiro
	tempoGasto : inteiro
	velocidadeMedia : real
	qtdLitros : real
inicio
   Escreval("Digite a velocidade média: ")
   Leia(velocidadeMedia)
   Escreval("Digite o tempo gasto: ")
   Leia(tempoGasto)
   consumoMedio <- 12
   kmPercorridos <- tempoGasto * velocidadeMedia
   qtdLitros <- kmPercorridos / consumoMedio
   Escreval("Velocidade média: ", velocidadeMedia, " Km/h.")
   Escreval("Tempo gasto na viagem: ", tempoGasto, " horas.")
   Escreval("Distância percorrida: ", kmPercorridos, " Km.")
   Escreval(qtdLitros, " litros gastos nesse percurso.")
fimalgoritmo
