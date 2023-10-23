Algoritmo "alturas"

Var

 N, i,  menores : inteiro
 media, porcentagem, somaAltura : real
 nome : caractere
 vetNome : vetor [0..9] de caractere
 vetIdade : vetor [0..9] de inteiro
 vetAltura : vetor [0..9] de real
Inicio

  escreva("Quantas pessoas serão digitadas? ")
  leia(N)
  
  para i de 0 ate N - 1 faca
       escreval("Dados da ", i + 1,"a pessoa")
       escreva("Nome: ")
       leia(vetNome[i])
       escreva("Idade: ")
       leia(vetIdade[i])
       escreva("Altura: ")
       leia(vetAltura[i])
  fimpara
  
  escreval
  somaAltura <- 0
  para i de 0 ate N - 1 faca
       somaAltura <- somaAltura + vetAltura[i]
  fimpara
  
  media <- somaAltura / N
  escreval("Altura média: ", media:3:2)

  menores <- 0
  para i de 0 ate N - 1 faca
       se vetIdade[i] < 16 entao
          menores <- menores + 1
       fimse
  fimpara
  
  porcentagem <- menores * 100 / N
  escreval("Pessoas com menos de 16 anos: ", porcentagem:3:1, "%")
  
  para i de 0 ate N - 1 faca
       se vetIdade[i] < 16 entao
          escreval(vetNome[i])
       fimse
fimpara

Fimalgoritmo
