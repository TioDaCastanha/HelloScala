package ListaExercicios

import scala.io.StdIn.readFloat

object Ex05 {
  def main(args: Array[String]): Unit = {
    var nota1, nota2: Float = 0.0f

    print("Nota 1: ")
    nota1 = readFloat()

    print("Nota 2: ")
    nota2 = readFloat()

    val media: Float = (nota1 + nota2) / 2

    printf(s"A média entre $nota1 e $nota2 é igual a %.2f", media)

  }
}
