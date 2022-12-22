package ListaExerciciosParte2

import scala.io.StdIn.readInt

object Ex69 extends App {

  var soma, inicio, inc, qtd, total: Int = 0

  qtd = 10

  inicio = {
    print("Qual o primeiro termo da PA: ")
    readInt()
  }

  inc = {
    print("Qual a Razão da PA: ")
    readInt()
  }

  pa(qtd, inicio, inc)

  print(s"\nO total das somas da PA é $total")

  def pa(qtd: Int, inicio: Int, inc: Int): Int ={
    if(qtd == 1) {
      print(s"$inicio ")
      inicio
    } else {
      soma += pa(qtd - 1, inicio, inc) + inc
      print(s"$soma ")
      total += soma
      soma
    }
  }
}
