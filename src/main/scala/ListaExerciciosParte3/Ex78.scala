package ListaExerciciosParte3

import java.util
import scala.annotation.tailrec
import scala.util.Random

object Ex78 extends App {

  var lista = new Array[Int](7)
  var listaPos = new util.ArrayList[Int]
  var random = new Random()

  preencher(0)

  println(lista.mkString("(", ", ", ")"))
  print(s"Os valores multiplos de 10 estão nas posições: "+ listaPos)

  @tailrec
  def preencher(i: Int): Unit = {
    if (i < lista.length) {
      lista(i) = random.nextInt(101)
      if(lista(i) % 10 == 0) {
        listaPos.add(i)
      }
      preencher(i + 1)
    }
  }

}
