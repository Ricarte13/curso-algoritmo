Algoritmo "dados_pessoas"

Var

 N, i, homens, mulheres : inteiro
 altura: vetor [0..4] de real
 genero: vetor [0..4] de caractere
 menor, maior, media, somaAlturas : real
Inicio

 escreva("Quantas pessoas serão digitadas? ")
 leia(N)
 
 para i de 0 ate N - 1 faca
      escreva("Altura da ", i + 1, "ª pessoa:")
      leia(altura[i])
      escreva("Genero da ", i + 1, "ª pessoa:")
      leia(genero[i])
 fimpara

 menor <- altura[0]
 para i de 1 ate N - 1 faca
   se altura[i] < menor entao
      menor <- altura[i]
   fimse
 fimpara
 escreval("Menor altura = ", menor)
 
 maior <- altura[0]
 para i de 1 ate N - 1 faca
   se altura[i] > maior entao
      maior <- altura[i]
   fimse
 fimpara
 escreval("Maior altura = ", maior)
 
 somaAlturas <- 0
 mulheres <- 0
 para i de 0 ate N - 1 faca
      se genero[i] = "F" entao
         somaAlturas <- somaAlturas + altura[i]
         mulheres <- mulheres + 1
      fimse
 fimpara
 
 media <- somaAlturas / mulheres
 escreval("Media das alturas das mulheres = ", media:3:2)
 
 homens <- 0
 para i de 0 ate N - 1 faca
      se genero[i] = "M" entao
         homens <- homens + 1
      fimse
 fimpara
 
 escreval("Número de homens = ", homens)
 

Fimalgoritmo