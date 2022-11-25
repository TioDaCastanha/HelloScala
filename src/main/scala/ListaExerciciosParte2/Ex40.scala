package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex40 extends App {

  contagem(0,3)

  @tailrec
  def contagem(num: Int, incremento: Int): Unit ={
    if (num == 21) print("Acabou!")
    else {
      print(num + " ")
      contagem(num + incremento , incremento)
    }
  }

}
