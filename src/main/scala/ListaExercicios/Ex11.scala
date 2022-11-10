package ListaExercicios

import scala.io.StdIn.readInt

object Ex11 extends App {

  var a, b, c, delta: Int = 0

  print("Informe o valor de A: ")
  a = readInt()
  print("Informe o valor de B: ")
  b = readInt()
  print("Informe o valor de c: ")
  c = readInt()

  delta = (b * b) - 4 * a * c

  print(s"O Valor de Delta é: $delta")

}
