package ListaExercicios

import scala.io.StdIn.readInt

object Ex15 extends App {

  var dias: Int = 0
  var salario: Float = 0.0f
  val valorDia: Float = 8 * 25

  salario = {
    dias = {
      print("Informe quantidade de dias trabalhados: ")
      readInt()
    }

    dias * valorDia
  }

  printf("Você vai receber: R$%.2f", salario)
}
