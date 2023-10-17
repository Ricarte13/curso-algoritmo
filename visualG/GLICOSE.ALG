Algoritmo "glicose"

Var

   glicose : real

Inicio

    escreva("Digite a medida de glicose: ")
    leia(glicose)
    
    se glicose <= 100 entao
       escreval("Classificação: normal")
    senao
         se (glicose > 100) e glicose <= 140 entao
            escreval("Classificação: elevado")
         senao
              escreval("Classificação: diabetes")
         fimse
    fimse
    

Fimalgoritmo