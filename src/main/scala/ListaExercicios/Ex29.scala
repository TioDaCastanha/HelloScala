package ListaExercicios

import scala.io.StdIn.{readFloat, readInt}

object Ex29 extends App {

  var nome: String = ""
  var salario, bonus: Float = 0.0f
  var anosTrabalho: Int = 0

  val salarioFinal = {

    bonus = {
      salario = {
        print("Informe seu salario: ")
        readFloat()
      }

      anosTrabalho = {
        print("Informe quantos anos de empresa: ")
        readInt()
      }

      if (anosTrabalho >= 10) salario * 0.2f
      else if (anosTrabalho >= 3) salario * 0.125f
      else salario * 0.03f
    }

    salario + bonus
  }

  print("Seu novo salário é de: R$" + salarioFinal)
}
