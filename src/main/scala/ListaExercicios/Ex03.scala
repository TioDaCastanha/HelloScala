package ListaExercicios

import scala.io.StdIn

object Ex03 {
  def main(args: Array[String]): Unit ={

    var nome: String = ""
    var salario: Float = 0.0f

    print("Nome do Funcionário: ")
    nome = StdIn.readLine()

    print("Salário: ")
    salario = StdIn.readFloat()

    printf(s"O funcionário $nome tem um salário de %.2f", salario)

  }
}
