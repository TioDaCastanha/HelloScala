package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Ex67 extends App {

  var num: Int = 0

  num = {
    print("Escolha um numero: ")
    readLine().toInt
  }

  contagem(0, num)

  @tailrec
  def contagem(inicio: Int, fim: Int): Unit = {
    if (inicio <= fim) {
      print(s"$inicio, ")
      contagem(inicio + 1, fim)
    } else print("Fim!")
  }
}
