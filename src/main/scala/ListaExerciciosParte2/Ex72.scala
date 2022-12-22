package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex72 extends App {

  var list: Array[Int] = new Array(10)
  var cont: Int = 0

  preencher(5, 5)

  print(list.mkString("(", ", ", ")"))

  @tailrec
  def preencher(inicio: Int, inc: Int): Unit ={
    if(cont < list.length){
      list(cont) = inicio
      cont += 1
      preencher(inicio + inc, inc)
    }
  }

}
