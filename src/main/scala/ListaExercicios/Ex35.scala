package ListaExercicios

import scala.annotation.tailrec
import scala.io.StdIn.{readFloat, readInt}

object Ex35 extends App {

  var km, valorTotal: Float = 0.0f
  val valorPopular = 90
  val valorLuxo = 150
  var opcao, dias: Int = 0

  valorTotal = {
    km = {
      print("Informe a km percorrida: ")
      readFloat()
    }

    dias = {
      print("Quantidade de dias que o carro foi alugado: ")
      readInt()
    }

    calculoTipoCarro()
  }

  print(s"Valor total a Pagar: $valorTotal")


  @tailrec
  def calculoTipoCarro(): Float = {
    opcao = {
      println("Informe o tipo de carro alugado.\n 1 - Popular e 2 - Luxo: ")
      readInt()
    }

    if (opcao == 1){

      if (km <= 100) (dias * valorPopular) + (km * 0.20f)
      else (dias * valorPopular) + (km * 0.10f)

    } else if (opcao == 2){

      if (km <= 100) (dias * valorLuxo) + (km * 0.20f)
      else (dias * valorLuxo) + (km * 0.10f)

    } else {
      println ("Opção Inválida!! informe uma opção válida")
      calculoTipoCarro()
    }
  }
}
