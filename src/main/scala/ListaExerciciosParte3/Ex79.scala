package ListaExerciciosParte3

import java.util
import scala.annotation.tailrec
import scala.util.Random

object Ex79 extends App{

  var lista = new Array[Int](10)
  var listaPar = new util.ArrayList[Int]
  var listaPos = new util.ArrayList[Int]
  var random = new Random()

  preencher(0)

  println("Lista Informada: "+ lista.mkString("(", ",", ")"))
  println("Os numeros pares são: "+ listaPar)
  print("Posição dos numeros pares na lista: "+ listaPos)

  @tailrec
  def preencher(i: Int): Unit ={
    if(i < lista.length){
      lista(i) = random.nextInt(101)
      if(lista(i) % 2 == 0){
        listaPar.add(lista(i))
        listaPos.add(i)
      }

      preencher(i + 1)
    }
  }


}
