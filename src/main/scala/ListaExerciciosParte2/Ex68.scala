package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.{readFloat, readLine}

object Ex68 extends App {

  var sexo: String = ""
  var peso, mediaPesoM, maiorPesoH: Float = 0.0f
  var qtdMulheres, qtdHomem100mais: Int = 0

  contagem(4)

  @tailrec
  def contagem(num: Int): Unit = {
    if (num > 0) {
      sexo = {
        print("Informe o Sexo: ")
        readLine()
      }

      peso = {
        print("Informe o Peso: ")
        readFloat()
      }

      if (sexo.equalsIgnoreCase("f")) {
        mediaPesoM += peso
        qtdMulheres += 1
      } else {
        if (peso > 100) qtdHomem100mais += 1
        if (peso > maiorPesoH) maiorPesoH = peso
      }

      contagem(num - 1)

    } else printf("Quantidade de mulheres cadastradas: %d\n" +
      "Media de peso entre as mulheres: %.2f\n" +
      "Quantidade de homens com mais de 100kg: %d\n" +
      "Maior peso entre os homens: %.2f", qtdMulheres, mediaPesoM / qtdMulheres, qtdHomem100mais, maiorPesoH)

  }

}
