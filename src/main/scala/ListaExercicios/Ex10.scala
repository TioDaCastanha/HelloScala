package ListaExercicios

import scala.io.StdIn.readFloat

object Ex10 extends App {

  var largura, altura, area: Float = 0.0f

  print("Informe a largura da parede: ")
  largura = readFloat()
  print("Informe a altura da parede: ")
  altura = readFloat()

  area = largura * altura

  print(s"Para pintar uma área de $area m² é preciso ${area / 2} litros de tinta")
}
