Algoritmo "media_ponderada"

Var

  N, i : inteiro
  n1, n2, n3, mediaPonderada : real

Inicio

 escreva("Quantos casos voce vai digitar? ")
 leia(N)
 
 para i de 1 ate N faca
      escreval("Digite três números: ")
      leia(n1)
      leia(n2)
      leia(n3)
      
      mediaPonderada <- (2 * n1 + 3 * n2 + 5 * n3) / 10
      
      escreval("MEDIA = ", mediaPonderada:4:1)
 fimpara
 
Fimalgoritmo