package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Ex42 {
  def main (args: Array[String]): Unit ={

    print("Informe um numero: ")
    var num = readInt()

    contagem(num, 0)

  }

  @tailrec
  def contagem (num: Int, inicio: Int): Unit = {
    if (inicio == num + 1) print("Acabou!")
    else {
      print(inicio + " ")
      contagem(num, inicio + 1)
    }
  }
}
