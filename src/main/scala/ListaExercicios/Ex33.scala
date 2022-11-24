package ListaExercicios

import scala.io.StdIn.{readFloat, readInt}

object Ex33 extends App {

  var valorCasa, salario, valorParcela: Float = 0.0f
  var anos: Int = 0

  valorParcela = {
    valorCasa = {
      print("Informe o valor da Casa que deseja adquirir: ")
      readFloat()
    }

    salario = {
      print("Informe seu salário: ")
      readFloat()
    }

    anos = {
      print("Em quantos anos pretende pagar? ")
      readInt()
    }

    valorCasa / (anos * 12)
  }

  if (valorParcela > salario * 0.30) print(s"Financiamento Recusado!! Valor da parcela excede 30% do salário: $valorParcela")
  else print(s"Financiamento aprovado!! valor do financiamento: ${anos * 12}x de $valorParcela")

}
