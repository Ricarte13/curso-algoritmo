Algoritmo "experiencias"

Var

   N, i, cobaia, total, coelhos, ratos, sapos : inteiro
   t : caractere
   percentualC, percentualR, percentualS : real

Inicio

   escreva("Quantos casos de teste serao digitados? ")
   leia(N)

   coelhos <-0
   ratos <- 0
   sapos <- 0

   para i de 1 ate N faca
      escreva("Quantidade de cobaias: ")
      leia(cobaia)
      escreva("Tipo de cobaia: ")
      leia(t)

      se t = "R" entao
         ratos <- ratos + cobaia
      senao
         se t = "S" entao
            sapos <- sapos + cobaia
         senao
            coelhos <- coelhos + cobaia
         fimse
      fimse


   fimpara

   total <- ratos + sapos + coelhos
   
   percentualC <- coelhos * 100 / total
   percentualR <- ratos * 100 / total
   percentualS <- sapos * 100 / total

   escreval("RELATÓRIO FINAL: ")
   escreval("Total: ", total, " cobaias")
   escreval("Total de coelhos: ", coelhos)
   escreval("Total de ratos: ", ratos)
   escreval("Total de sapos: ", sapos)
   escreval("Percentual de coelhos: ", percentualC:4:2)
   escreval("Percentual de ratos: ", percentualR:4:2)
   escreval("Percentual de sapos: ", percentualS:4:2)
   
Fimalgoritmo