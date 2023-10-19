Algoritmo "quadrante"


Var

   X, Y : inteiro

Inicio

   escreval("Digite os valores das coordenadas X e Y: ")
   leia(X)
   leia(Y)
   
   enquanto (x <> 0) e (y <> 0) faca
            se (x >0) e (y > 0) entao
               escreval("Quadrante 1")
            senao
              se (x < 0) e (y > 0) entao
                 escreval("QUADRANTE 2")
              senao
                   se (x < 0) e (y < 0) entao
                      escreval("QUADRANTE 3")
                   senao
                        se (x > 0) e (y < 0) entao
                           escreval("QUADRANTE 4")
                        fimse
                   fimse
               fimse
            fimse
            
   escreval("Digite os valores das coordenadas X e Y: ")
   leia(X)
   leia(Y)
   
   fimenquanto
   
Fimalgoritmo