package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex61 extends App {

  contagem(0, 3)

  @tailrec
  def contagem(num: Int, inc: Int): Unit ={
    if (num != 33){
      print(s"$num ")
      contagem(num + inc, inc)
    } else print("Acabou!")
  }

}
