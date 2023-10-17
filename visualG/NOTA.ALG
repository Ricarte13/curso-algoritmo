Algoritmo "nota"

Var

      nota1, nota2, soma : real


Inicio

      escreva("Digite a primeira nota: ")
      leia(nota1)

      escreva("Digite a segunda nota: ")
      leia(nota2)

      soma <- nota1 + nota2
      
      escreval("NOTA FINAL = ", soma)
      
      se soma < 60 entao
         escreva("REPROVADO")
      fimse

Fimalgoritmo