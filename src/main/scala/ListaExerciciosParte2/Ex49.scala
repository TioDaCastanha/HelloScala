package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Ex49 extends App{

  var num, par, impar: Int = 0

  contagem(6)

  @tailrec
  def contagem(i :Int): Unit = {
    if (i == 0) println(s"Quantidade Pares: $par \nQuantidade Impares: $impar")
    else {
      num = {
        print("Informe um numero: ")
        readInt()
      }

      if (num % 2 == 0) par += 1
      else impar += 1

      contagem(i-1)
    }
  }

}
