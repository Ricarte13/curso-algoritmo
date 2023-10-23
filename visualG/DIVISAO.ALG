Algoritmo "divisao"

Var

  N, i : inteiro
  numerador, denominador, divisao : real

Inicio

  escreva("Quantos casos você vai digitar? ")
  leia(N)
  
  para i de 1 ate N faca
       escreva("Entre com o numerador: ")
       leia(numerador)
       escreva("Entre com o denominador: ")
       leia(denominador)
       
       se denominador = 0 entao
          escreval("DIVISÃO IMPOSSÍVEL")
       senao
           divisao <- numerador / denominador
           escreval("DIVISÃO = ", divisao:4:2)
       fimse

 fimpara
 
Fimalgoritmo