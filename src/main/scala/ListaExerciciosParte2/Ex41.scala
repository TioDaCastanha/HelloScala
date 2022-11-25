package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex41 extends App {

  contagem(100, 5)

  @tailrec
  def contagem (num: Int, incremento: Int): Unit ={
    if (num == 0 - incremento) print("Acabou!!")
    else {
      print(num + " ")
      contagem(num - incremento, incremento)
    }
  }

}
