algoritmo "16"

var
 sexo:caractere
 altura, peso,result:real
inicio
 escreval("Digite a sua altura: ")
 leia(altura)
  escreval("Digite o seu peso: ")
 leia(peso)
 escreval("Digite o sexo (F p/Feminino e M p/ Masculino)")
 leia(sexo)
   se (peso=(72.7*altura)-58) e (sexo="m") entao
     escreval("Dentro do seu peso ideal: ",result)
   senao
     escreval(" Fora do seu peso ideal")
   fimse
       se (peso=(62.7*altura)-44.7) e (sexo="f") entao
         escreval("Dentro do seu peso ideal: ",result)
       senao
         escreval(" Fora do seu peso ideal")
       fimse
fimalgoritmo
