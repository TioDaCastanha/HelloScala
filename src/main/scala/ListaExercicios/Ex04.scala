package ListaExercicios

import scala.io.StdIn.readInt

object Ex04 {
  def main(args: Array[String]): Unit ={
    var num1, num2: Int = 0

    print("Informe um valor: ")
    num1 = readInt()

    print("Informe outro valor: ")
    num2 = readInt()

    print(s"A Soma entre $num1 e $num2 é igual a ${num1+num2}")

  }

}
