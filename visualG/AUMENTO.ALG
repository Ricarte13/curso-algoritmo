Algoritmo "aumento"

Var

  salario, novoSalario, porcentagem : real

Inicio

   escreva("Digite o salario da pessoa: ")
   leia(salario)
   
   se salario <= 1000.00 entao
      novoSalario <- salario + salario * 0.2
      porcentagem <- 20
   senao
        se salario <= 3000.00 entao
             novoSalario <- salario + salario * 0.15
             porcentagem <- 15
        senao
             se salario <= 8000.00 entao
                novoSalario <- salario + salario * 0.1
                porcentagem <- 10
             senao
                novoSalario <- salario + salario * 0.05
                porcentagem <- 5
             fimse
        fimse
   fimse
   
   escreval("Novo salario = R$ ", novoSalario:6:2)
   escreval("Aumento = R$ ", novoSalario - salario:6:2)
   escreval("Porcentagem = ", porcentagem, " %")
   
Fimalgoritmo