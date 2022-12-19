package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.{readFloat, readLine}

object Ex57 extends App {

  var salario, totalH, totalM: Float = 0.0f
  var sexo: String = ""

  contagem()

  @tailrec
  def contagem(): Unit ={
    salario = {
      print("Informe o salário do funcionário: ")
      readFloat()
    }

    sexo = {
      print("Informe o sexo do funcionário: ")
      readLine()
    }

    if(sexo.equalsIgnoreCase("feminino")) totalM += salario
    else totalH += salario

    if(opcao().equalsIgnoreCase("s")){
      contagem()
    }else print(s"O total pago aos Homens é de: $totalH \nO Total pago as mulheres é de: $totalM")

  }

  def opcao(): String = {
    val opcao = {
      print("Deseja continuar (S/N)? ")
      readLine()
    }
    opcao
  }

}
