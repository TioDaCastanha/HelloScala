package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex43 {
  def main (args: Array[String]): Unit = {

    contagem(30)
  }

  @tailrec
  def contagem(num: Int): Unit ={
    if (num == 0) {
      print("Acabou!")
      return
    }
    else if (num % 4 == 0) print("["+num+"] ")
    else print(num + " ")
    contagem(num - 1)
  }
  
}
