Algoritmo "numeros_pares"


Var

 N, i, soma : inteiro
 vet: vetor [0..5] de inteiro

Inicio

 escreva("Quantos numeros voce vai digitar? ")
 leia(N)
 
 para i de 0 ate N - 1 faca
      escreva("Digite um numero: ")
      leia(vet[i])
 fimpara
 
 escreval
 escreval("N�MEROS PARES: ")
 para i de 0 ate N - 1 faca
      se vet[i] % 2 = 0 entao
         escreva(vet[i], " ")
      fimse
 fimpara
 
 soma <- 0
 para i de 0 ate N - 1 faca
     se vet[i] % 2 = 0 entao
        soma <- soma + 1
      fimse
 fimpara
 
 escreval
 escreval
 escreval("QUANTIDADE DE PARES = ", soma)

Fimalgoritmo