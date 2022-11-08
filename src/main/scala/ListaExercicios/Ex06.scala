package ListaExercicios

import scala.io.StdIn.readInt

object Ex06 {
  def main(args: Array[String]): Unit = {
    var num1: Int = 0

    print("Digite um numero: ")
    num1 = readInt()

    println(s"O antecessor de $num1 é ${num1 - 1}")
    print(s"O sucessor de $num1 é ${num1 + 1}")
  }
}
