package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Ex45 extends App {

  var num, incremento, inicial: Int = 0

  coletor()
  contagem(num, incremento, inicial)

  def coletor (): Unit ={
    inicial = {
      print("Digite o valor inicial: ")
      readInt()
    }

    num = {
      print("Digite o ultimo valor: ")
      readInt()
    }

    compara()
  }

  def compara(): Unit ={
    if (inicial < num) {
      incremento = {
        print("Digite o incremento: ")
        readInt()
      }
    }
    else {
      println("Valor inicial maior que o Final!!")
      coletor()
    }
  }

  @tailrec
  def contagem(num: Int, incremento: Int, inicio: Int): Unit = {
    if (inicio > num) print("Acabou!")
    else {
      print(inicio + " ")
      contagem(num, incremento, inicio + incremento)
    }
  }

}
