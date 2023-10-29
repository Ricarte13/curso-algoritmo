Algoritmo "cada_linha"


Var

 N ,i, j, maiorElemento : inteiro
 mat: vetor [0..3, 0..3] de inteiro


Inicio

 escreva("Qual a ordem da matriz? ")
 leia(N)
 
 para i de 0 ate N - 1 faca
      para j de 0 ate N -1 faca
      escreva("Elemento [", i, ",", j, "]: ")
      leia(mat[i,j])
      fimpara
fimpara

escreval("MAIOR ELEMENTO DE CADA LINHA: ")
para i de 0 ate N - 1 faca
     maiorElemento <- mat[i,0]
     para j de 1 ate N - 1 faca
          se mat [i, j] > maiorElemento entao
             maiorElemento <- mat[i, j]
          fimse
     fimpara
     escreval(maiorElemento)
fimpara

Fimalgoritmo