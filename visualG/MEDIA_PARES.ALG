Algoritmo "media_pares"


Var

 N, i : inteiro
 vet: vetor [0..5] de inteiro
 media, soma, contPares : real

Inicio

 escreva("Quantos elementos vai ter o vetor? ")
 leia(N)
 
 para i de 0 ate N - 1 faca
      escreva("Digite um número: ")
      leia(vet[i])
 fimpara
 
 soma <- 0
 contPares <- 0
 para i de 0 ate N - 1 faca
      se vet[i] % 2 = 0 entao
           soma <- soma + vet[i]
           contPares  <- contPares + 1
      fimse
 fimpara
 
 se contPares = 0 entao
    escreval("NENHUM NÚMERO PAR")
 senao
    media <- soma / contPares
    escreval("MÉDIA DOS PARES = ", media:4:1)
 fimse

Fimalgoritmo