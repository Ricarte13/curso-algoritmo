Algoritmo "operadora"


Var

    minutos : inteiro
    valorPago : real

Inicio

    escreva("Digite a quantidade de minutos: ")
    leia(minutos)

    se minutos <= 100 entao
       valorPago <- 50
       escreval("Valor a pagar: R$ ", valorPago:4:2)
    senao
      valorPago <- 50 + 2 * (minutos - 100)
      escreval("Valor a pagar: R$ ", valorPago:4:2)
    fimse

Fimalgoritmo