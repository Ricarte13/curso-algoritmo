Algoritmo "aprovados"

Var

 N, i : inteiro
 nome: vetor [0..9] de caractere
 primeiro: vetor [0..9] de real
 segundo: vetor [0..9] de real
 media : real

Inicio

 escreva("Quantos alunos serão digitados? ")
 leia(N)
 
 para i de 0 ate N - 1 faca
      escreval("Digite nome, primeira e segunda nota do ", i + 1, "° aluno:")
      leia(nome[i])
      leia(primeiro[i])
      leia(segundo[i])
 fimpara
 
 escreval("Alunos aprovados: ")
 para i de 0 ate N - 1 faca
      media <- (primeiro[i] + segundo[i]) / 2
      se media >= 6.0 entao
         escreval(nome[i])
      fimse
 fimpara

Fimalgoritmo