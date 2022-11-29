package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Ex48 extends App {

  var soma, num: Int = 0

  contagem(7)

  @tailrec
  def contagem(i: Int): Unit = {
    if (i == 0) print(s"A soma é: $soma")
    else {
      num = {
        print("Informe um numero: ")
        readInt()
      }
      soma += num
      contagem(i-1)
    }
  }
}
