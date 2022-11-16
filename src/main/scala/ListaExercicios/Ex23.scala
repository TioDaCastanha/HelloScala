package ListaExercicios

import scala.io.StdIn.{readFloat, readLine}

object Ex23 extends App {

  var nome, sexo: String = ""
  var valorCompra: Float = 0.0f
  val descMulher = 0.13f
  val descHomem = 0.05f

  nome = {
    print("Informe o Nome do Cliente: ")
    readLine()
  }

  sexo = {
    print("Informe o Sexo do Cliente: ")
    readLine().toLowerCase
  }

  val total: Float = {
    valorCompra = {
      print("Informe o valor total da compra: ")
      readFloat()
    }

    if (sexo.equalsIgnoreCase("feminino")) valorCompra - valorCompra * descMulher
    else valorCompra - valorCompra * descHomem
  }

  print(s"Total a pagar com desconto: $total")
}
