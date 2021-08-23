algoritmo "14"

var
cod, quant: inteiro
preco: real
inicio
 escreval("*****************************************")
 escreval("*   | Cód | Lanche          | Preço |   *")
 escreval("*   | 100 | Cachorro Quente | 2,50  |   *")
 escreval("*   | 101 | Bauru Simples   | 3,00  |   *")
 escreval("*   | 102 | cheeseburguer   | 3,50  |   *")
 escreval("*   | 103 | X-Salada        | 3,00  |   *")
 escreval("*****************************************")
 escreva("Digite o código: ")
  leia(cod)
 escreva("Digite a quantidade: ")
  leia(quant)
    se cod=100 entao
      preco:=2.50*quant
      escreval(quant," Cachorro(s) Quente(s): R$",preco)
    senao
      se cod=101 entao
        preco:=3*quant
        escreval(quant," Bauru Simples: R$",preco)
      senao
        se cod=102 entao
          preco:=3.50*quant
          escreval(quant," Cheeseburguer: R$",preco)
        senao
          se cod=103 entao
            preco:=3*quant
            escreval(quant,"X-Salada: R$",preco)
          senao
            escreval("Código invalido")
          fimse
        fimse
      fimse
    fimse
fimalgoritmo
