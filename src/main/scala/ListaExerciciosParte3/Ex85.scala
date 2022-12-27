package ListaExerciciosParte3

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Ex85 extends App {

  var listaNome, listaSexo = new Array[String](5)
  var listaSalario = new Array[Float](5)

  preencher(0)

  println("--- Lista Mulheres 5mil ---")
  imprimeMais5mil(0)


  @tailrec
  def preencher(i: Int): Unit = {
    if (i < listaNome.length) {
      listaNome(i) = {
        print("Informe o Nome: ")
        readLine()
      }

      listaSexo(i) = {
        print("Informe o Sexo: ")
        readLine()
      }

      listaSalario(i) = {
        print("Informe o Salario: ")
        readLine().toFloat
      }

      preencher(i + 1)
    }
  }

  @tailrec
  def imprimeMais5mil(i: Int): Unit = {
    if (i < listaNome.length) {
      if (listaSalario(i) > 5000 && listaSexo(i).equalsIgnoreCase("f")) {
        println("Nome: " + listaNome(i))
        println("Salario: " + listaSalario(i) + "\n")
      }
      imprimeMais5mil(i + 1)
    }
  }

}
