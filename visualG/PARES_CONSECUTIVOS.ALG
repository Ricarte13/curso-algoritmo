Algoritmo "pares_consecutivos"

Var

   X, soma : inteiro

Inicio

   soma <- 0

   escreva("Digite um numero inteiro: ")
   leia(X)

   enquanto X <> 0 faca
      se X % 2 <> 0 entao
         x <- x + 1
      fimse
      
//      soma <-  X + (X +2) + (x + 4) + (x + 6) + (x + 8)
      soma <- 5 * x + 20
      escreval("SOMA = ", soma)

      escreva("Digite um numero inteiro: ")
      leia(X)

   fimenquanto


Fimalgoritmo