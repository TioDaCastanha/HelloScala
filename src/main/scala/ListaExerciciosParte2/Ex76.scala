package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.util.Random

object Ex76 extends App {

  var lista = new Array[Int](7)
  var random = new Random()

  preencher(0)

  print(lista.mkString("(", ", ", ")"))

  @tailrec
  def preencher(i: Int): Unit ={
    if(i < lista.length) {
      lista(i) = random.nextInt(101)
      preencher(i + 1)
    }
  }

}
