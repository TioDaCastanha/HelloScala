package ListaExercicios

import scala.io.StdIn.readInt

object ex16 extends App {

  var qtdCigarrosDia, qtdAnos, diasPerdidos: Int = 0
  val diaCigarro = 10
  val diaMin = 1440

  diasPerdidos = {

    qtdCigarrosDia = {
      print("Quantos cigarros você fuma/fumou por dia? ")
      readInt()
    }

    qtdAnos = {
      print("A quantos anos você fuma/fumou? ")
      readInt()
    }

    (((365 * qtdAnos) * qtdCigarrosDia) * diaCigarro) / diaMin
  }

  print(s"Você já perdeu $diasPerdidos dias de Vida")

}
