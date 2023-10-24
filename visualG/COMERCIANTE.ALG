Algoritmo "comerciante"

Var

 N, i : inteiro
 nome: vetor [0..99] de caractere
 compra: vetor [0..99] de real
 venda: vetor [0..99] de real
 totalCompra, totalVenda, lucroTotal, lucro: real
 lucroBaixo, lucroMedio, lucroAlto : inteiro

Inicio

 escreva("Serao digitados dados de quantos produtos?")
 leia(N)
 
 para i de 0 ate N - 1 faca
      escreval("Produto ", i + 1, ":")
      escreva("Nome: ")
      leia(nome[i])
      escreva("Preço de compra: ")
      leia(compra[i])
      escreva("Preço de venda: ")
      leia(venda[i])
 fimpara
 
 escreval
 escreval("RELATORIO: ")

 lucroBaixo <- 0
 lucroMedio <- 0
 lucroAlto <- 0
 para i de 0 ate N - 1 faca
      lucro <- venda[i] - compra[i]
      se lucro < compra[i] / 10 entao
         lucroBaixo <- lucroBaixo + 1
      senao
           se lucro <= compra[i] / 5 entao
              lucroMedio <- lucroMedio + 1
           senao
              lucroAlto <- lucroAlto + 1
           fimse
      fimse
 fimpara
 
 escreval("Lucro abaixo de 10%: ", lucroBaixo)
 escreval("Lucro entre 10% e 20%: ", lucroMedio)
 escreval("Lucro acima de 20%: ", lucroAlto)
 
 totalCompra <- 0
 para i de 0 ate N -1 faca
    totalCompra <- totalCompra + compra[i]
 fimpara
 escreval("Valor total de compra: ", totalCompra:6:2)
 
 totalVenda <- 0
 para i de 0 ate N -1 faca
    totalVenda <- totalVenda + venda[i]
 fimpara
 escreval("Valor total de venda: ", totalVenda:6:2)
 
 lucroTotal <- totalVenda - totalCompra
 escreval("Lucro total: ", lucroTotal:6:2)
 
Fimalgoritmo