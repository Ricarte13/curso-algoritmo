Algoritmo "soma_linhas"


Var

 M, N , i, j : inteiro
 mat: vetor [0..2, 0..3] de real
 vet: vetor[0..2] de real


Inicio

 escreva("Qual a quantidade de linhas da matriz? ")
 leia(M)
 escreva("Qual a quantidade de colunas da matriz? ")
 leia(N)
 

 para i de 0 ate M - 1 faca

      escreval("Digite os elementos da ", i + 1, "ª. linha: ")
      para j de 0 ate N - 1 faca
           leia(mat[i, j])
      fimpara
 fimpara
 
 escreval("VETOR GERADO:")
 para i de 0 ate M - 1 faca
      vet[i] <- 0
       para j de 0 ate N - 1 faca
           vet[i] <- vet[i] + mat[i, j]
      fimpara
 escreval(vet[i]:3:1)
 fimpara
 
 
Fimalgoritmo