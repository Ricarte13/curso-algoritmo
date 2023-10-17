Algoritmo "temperatura"

Var

   escala : caractere
   temperatura, F, C : real

   
Inicio

     escreva("Voce vai digitar a temperatura em qual escala (C/F)? ")
     leia(escala)
     
     se escala = F entao
        escreva("Digite a temperatura em Fahrenheit: ")
        leia(F)
        C <- 5 * (F - 32) / 9
        escreval("Temperatura equivalente em Celsius: ", C:4:2)
     senao
          escreva("Digite a temperatura em Celsius: ")
          leia(C)
          F <- (9 * C + 160) / 5
          escreval("Temperatura equivalente em Fahrenheit: ", F:4:2)
    fimse
    
Fimalgoritmo