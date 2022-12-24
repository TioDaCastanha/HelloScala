package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex75 extends App{

  var lista = new Array[Int](16)

  fibonacci(0,0)

  print(lista.mkString("(", ", ", ")"))

  @tailrec
  def fibonacci(cont: Int, ultimo: Int): Unit ={
    if(cont < lista.length){
      if(cont == 0){
        lista(cont) = 1
        fibonacci(cont + 1, 0)
      }else {
        lista(cont) = lista(cont - 1) + ultimo
        fibonacci(cont + 1, lista(cont - 1))
      }
    }
  }

}
