Algoritmo "soma_vetor"

Var

 N, i : inteiro
 vet: vetor [0..9] de real
 soma, media : real

Inicio

  escreva("Quantos n�meros voc� vai digitar? ")
  leia(N)
  
  soma <- 0
  para i de 0 ate N - 1 faca
       escreva("Digite um n�mero: ")
       leia(vet[i])
       soma <- soma + vet[i]
  fimpara
  
  escreval
  escreva("VALORES = ")
  para i de 0 ate N - 1 faca
       escreva(vet[i]:4:1, " ")
  fimpara
  
  media <- soma / N
  escreval
  escreval("SOMA = ", soma:4:2)
  escreval("M�dia = ", media:4:2)

Fimalgoritmo