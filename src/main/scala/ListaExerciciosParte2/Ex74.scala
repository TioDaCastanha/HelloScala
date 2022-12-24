package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex74 extends App {

  var lista = new Array[Int](10)

  preencher(0)

  print(lista.mkString("(", ", ", ")"))

  @tailrec
  def preencher(cont: Int): Unit = {
    if(cont < lista.length) {
      if (cont % 2 == 0) {
        lista(cont) = 5
        preencher(cont + 1)
      } else {
        lista(cont) = 3
        preencher(cont + 1)
      }
    }
  }

}
