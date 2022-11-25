package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex39 extends App {

  contagem(10)

  @tailrec
  def contagem (num: Int): Unit = {
    if(num == 2) print("Acabou!")
    else {
      print(num + " ")
      contagem(num-1)
    }
  }

}
