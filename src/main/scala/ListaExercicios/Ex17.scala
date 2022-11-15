package ListaExercicios

import scala.io.StdIn.readFloat

object Ex17 extends App{

  var velocidade: Float = 0.0f
  val reaisKm: Int = 5

  val valorMulta: Float = {
    print("Informe a velocidade registrada? ")
    velocidade = readFloat()

    if (velocidade > 80) {
      println("Você ultrapassou o limite de velocidade e será multado!")
      (velocidade - 80) * reaisKm
    } else {
      println("Sem multas a Aplicar, nenhuma infração de transito!")
      0.0f
    }
  }

  printf("Valor da multa é R$%.2f", valorMulta)
}
