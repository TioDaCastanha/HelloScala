package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex38 extends App {

  contagem(6)

  @tailrec
  def contagem (num: Int): Unit = {
    if(num != 12) {
      print(num + " ")
      contagem(num+1)
    }
    else print(" Acabou!")
  }
}
