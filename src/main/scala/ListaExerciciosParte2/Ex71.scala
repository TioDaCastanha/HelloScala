package ListaExerciciosParte2

import scala.annotation.tailrec


object Ex71 extends App {

  var list: Array[Int] = new Array(8)

  preencher(7)

  print(list.mkString("(", ", ", ")"))

  @tailrec
  def preencher(cont: Int): Unit ={
    if(cont >= 0){
      list(cont) = 999
      preencher(cont - 1)
    }
  }

}
