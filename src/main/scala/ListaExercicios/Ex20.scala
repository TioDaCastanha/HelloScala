package ListaExercicios

import scala.io.StdIn.readInt

object Ex20 {
  def main(args: Array[String]): Unit ={
    var num: Int = 0
    val ePar: Boolean = {

      num = {
        print("Informe um numero: ")
        readInt()
      }

      if (num % 2 == 0) {
        print("Numero Digitado é Par.")
        true
      } else {
        print("Numero Digitado é Impar")
        false
      }
    }
  }
}
