Algoritmo "mais_velho"


Var

   N, i: inteiro
   nomes: vetor [0..9] de caractere
   idades: vetor [0..9] de inteiro
   maisVelha : caractere

Inicio

 escreva("Quantas pessoas você vai digitar? ")
 leia(N)
 
 para i de 0 ate N - 1 faca
      escreval("Dados da ", i + 1, "a pessoa:")
      escreva("Nome: ")
      leia(nomes[i])
      escreva("Idade: ")
      leia(idades[i])
 fimpara
 
 maisVelha <- nomes[0]
 
 para i de 1 ate N faca
      se idades[i] > idades[i -1] entao
         maisVelha <- nomes[i]
      fimse
 fimpara
 
 escreval("PESSOA MAIS VELHA: ", maisVelha)


Fimalgoritmo