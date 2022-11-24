package ListaExercicios

import scala.io.StdIn.readInt

object Ex36 extends App {

  var horas, pontos: Int = 0


  val dinheiro = {
    horas = {
      print("Informe a quantidade de horas: ")
      readInt()
    }

    pontos = {
      if (horas <= 10) horas * 2
      else if (horas <= 20) horas * 5
      else horas * 10
    }

    pontos * 0.05f
  }

  printf("Você ganhou R$%.2f", dinheiro)
}
