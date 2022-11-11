package ListaExercicios

import scala.io.StdIn.readFloat

object Ex13 extends App {

  var salario, novoSalario: Float = 0.0f

  print("Informe o salário do funcionario: ")
  salario = readFloat()

  novoSalario = (salario * 1.15).toFloat

  print(s"O novo salario com acrécimo de 15% é: $novoSalario")
}
