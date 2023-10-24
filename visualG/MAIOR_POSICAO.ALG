Algoritmo "maior_posicao"

Var

 N, i, posicao : inteiro
 vet: vetor [0..99] de real
 maior : real
 
Inicio

 escreva("Quantos números você vai digitar? ")
 leia(N)
 
 para i de 0 ate N - 1 faca
      escreva("Digite um numero: ")
      leia(vet[i])
 fimpara
 
 para i de 0 ate N -1 faca
     se vet[i + 1] > vet[i] entao
        maior <- vet[i + 1]
        posicao <- i + 1
     fimse
 fimpara

 escreval
 escreval("MAIOR VALOR = ", maior:4:1)
 escreval("POSIÇÃO DO MAIOR VALOR = ", posicao)

Fimalgoritmo