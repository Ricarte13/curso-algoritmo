Algoritmo "media_idades"

Var

  idade, quantidade, soma : inteiro
  media : real

Inicio

  soma <- 0
  quantidade <- 0
  
  escreval("Digite as idades: ")
  leia(idade)

  enquanto idade > 0 faca

     soma <- soma + idade
     quantidade <- quantidade + 1
     
     leia(idade)

  fimenquanto

  se quantidade =  0 entao
     escreval("IMPOSSIVEL CALCULAR")
  senao
    media <- soma / quantidade
    escreval("MÉDIA = ", media:4:2)
  fimse

Fimalgoritmo