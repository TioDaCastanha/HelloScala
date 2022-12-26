package ListaExerciciosParte3

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Ex77 extends App {

  var lista =  new Array[String](7)

  preencher(0)

  print(lista.reverse.mkString("(", ",", ")"))


  @tailrec
  def preencher(i: Int): Unit = {
    if (i < lista.length) {
      lista(i) = {
        print("Informe um Nome: ")
        readLine()
      }
      preencher(i + 1)
    }
  }
}
