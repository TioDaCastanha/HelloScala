package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex65 extends App {

  contagem(100, 10, 0)

  @tailrec
  def contagem(inicio: Int, inc: Int, fim: Int): Unit = {
    if (inicio >= fim) {
      print(s"$inicio ")
      contagem(inicio - inc, inc, fim)
    } else print("Acabou!!")
  }
}
