package ListaExercicios

import scala.io.StdIn.readFloat

object Ex24 extends App {

  var distancia: Float = 0.0f
  val kmAte200 = 0.5f
  val kmMais200 = 0.45f

  val passagem = {

    distancia = {
      print("Informe a Distância da Viagem: ")
      readFloat()
    }

    if (distancia <= 200) distancia * kmAte200
    else distancia * kmMais200
  }

  print(s"Você pagara na passagem em: $passagem REAIS")

}
