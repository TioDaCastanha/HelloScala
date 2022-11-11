package ListaExercicios

import scala.io.StdIn.{readFloat, readInt}

object Ex14 extends App {

  var dias: Int = 0
  var kmPercorrido, valorTotal: Float = 0.0f
  val valDia = 90.00f
  val kmRodado = 0.20f

  valorTotal = {
    dias = {
      print("Informe quantos dias o carro foi alugado: ")
      readInt()
    }

    kmPercorrido = {
      print("Informe quantos Km o carro percorreu: ")
      readFloat()
    }

    valDia * dias + kmPercorrido * kmRodado
  }

  print(s"O valor total a pagar é de $valorTotal")

}
