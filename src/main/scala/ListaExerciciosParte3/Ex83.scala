package ListaExerciciosParte3

import scala.annotation.tailrec
import scala.util.Random

object Ex83 extends App {

  var random = new Random()
  var lista = new Array[Int](20)

  preencher(0)

  println("Numeros Gerados: "+ lista.mkString("(", ",", ")"))
  lista = lista.sorted
  println("Lista em Ordem Crescente: "+ lista.mkString("(", ",", ")"))

  @tailrec
  def preencher(i: Int): Unit ={
    if(i < lista.length){
      lista(i) = random.nextInt(100)
      preencher(i + 1)
    }
  }

}
