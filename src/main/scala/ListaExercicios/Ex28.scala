package ListaExercicios

import scala.io.StdIn.readFloat

object Ex28 extends App {

  var largura, comprimento, area: Float = 0.0f

  val resultado = {

    area = {
      largura = {
        print("Informe a Largura do terreno: ")
        readFloat()
      }

      comprimento = {
        print("Informe o Comprimento do terreno: ")
        readFloat()
      }

      largura * comprimento
    }

    if (area >= 500) "TERRENO VIP"
    else if (area >= 100) "TERRENO MASTER"
    else "TERRENO POPULAR"
  }

  print(s"Terreno com Area de $area m² é: " + resultado)

}
