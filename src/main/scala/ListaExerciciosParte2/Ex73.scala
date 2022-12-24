package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex73 extends App {

  var lista = new Array[Int](10)

  preencher(9,1,0)

  print(lista.mkString("(", ", ", ")"))

  @tailrec
  def preencher(inicio: Int, inc: Int, cont: Int): Unit ={
    if (cont == 0) {
      lista(cont) = inicio
      preencher(lista(cont), inc, cont + 1)
    } else if (cont < lista.length){
      lista(cont) = inicio - inc
      preencher(lista(cont), inc, cont + 1)
    }
  }

}
