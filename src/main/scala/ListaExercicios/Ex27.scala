package ListaExercicios

import scala.io.StdIn.readFloat

object Ex27 extends App {

  var nota1, nota2, media: Float = 0.0f

  val resultado = {

    media = {
      nota1 = {
        print("Informe a Nota 1: ")
        readFloat()
      }

      nota2 = {
        print("Informe a Nota 2: ")
        readFloat()
      }

      (nota1 + nota2) / 2
    }

    if (media >= 7.0 ) "APROVADO"
    else if (media >= 5.0) "RECUPERAÇÃO"
    else "REPROVADO"
  }

  print("Resultado: " + resultado)

}
