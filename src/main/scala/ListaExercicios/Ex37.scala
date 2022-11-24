package ListaExercicios

import scala.io.StdIn.{readFloat, readInt, readLine}

object Ex37 extends App {

  var salario, novoSalario: Float = 0.0f
  var anosTrabalho: Int = 0
  var sexo: String = ""

  novoSalario = {
    salario = {
      print("Informe seu salário atual: ")
      readFloat()
    }

    sexo = {
      print("Informe o sexo: ")
      readLine().toLowerCase
    }

    anosTrabalho = {
      print("Informe quantos anos de serviço: ")
      readInt()
    }

    sexo match {
      case "masculino" =>

        if (anosTrabalho < 20) salario * 1.03f
        else if (anosTrabalho <= 30) salario * 1.13f
        else salario * 1.25f

      case "feminino" =>

        if (anosTrabalho < 20) salario * 1.05f
        else if (anosTrabalho <= 30) salario * 1.12f
        else salario * 1.23f

    }
  }

  printf("Seu novo salário é: R$%.2f", novoSalario)
}
