package ListaExercicios

import scala.io.StdIn.readFloat

object Ex12 extends App {

  var preco, precoComDesconto: Float = 0.0f

  print("Informe o valor do Produto: ")
  preco = readFloat()

  precoComDesconto = preco - (preco * 0.05).toFloat

  print(s"Valor do produto com desconto de 5% é de $precoComDesconto")

}
