Algoritmo "troco_verificado"

Var

  preco, pagamento, valorRestante, troco, valorTotal : real
  quantidade : inteiro


Inicio

      escreva("Preço unitário do produto: ")
      leia(preco)
      escreva("Quantidade comprada: ")
      leia(quantidade)
      escreva("Dinheiro recebido: ")
      leia(pagamento)
      
      valorTotal <- preco * quantidade
      Troco <- pagamento - valorTotal

      se pagamento < valorTotal entao
         valorRestante <- valorTotal - pagamento
         escreval("DINHEIRO INSUFICIENTE. FALTAM ", valorRestante, " REAIS")
      senao
           escreval("TROCO = ", troco:4:2)
      fimse
              
Fimalgoritmo