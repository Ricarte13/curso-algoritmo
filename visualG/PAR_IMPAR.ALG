Algoritmo "par_impar"

Var

   N, X, i : inteiro

Inicio

   escreva("Quantos numeros voce vai digitar? ")
   leia(N)

   para i de 1 ate N faca
      escreva("Digite um numero: ")
      leia(X)

      se X = 0 entao
         escreval("NULO")
      senao
         se X % 2 <> 0 entao
            se x > 0 entao
               escreval("IMPAR POSITIVO")
            senao
              escreval("IMPAR NEGATIVO")
            fimse
         senao
            se X % 2 = 0 entao
               se X > 0 entao
                  escreval("PAR POSITIVO")
               senao
                  escreval("PAR NEGATIVO")
               fimse
            fimse
         fimse
      fimse

   fimpara

Fimalgoritmo