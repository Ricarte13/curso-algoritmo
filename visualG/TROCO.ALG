Algoritmo "troco"

Var

   preco, quantiaRecebida, troco : real
   quantidade : inteiro

Inicio

   escreva("Preco unitário do produto: ")
   leia(preco)
   escreva("Quantidade comprada: ")
   leia(quantidade)
   escreva("Dinheiro recebido: ")
   leia(quantiaRecebida)
   
   troco <- quantiaRecebida - (preco * quantidade)
   
   escreval("TROCO = ", troco:8:2)

Fimalgoritmo