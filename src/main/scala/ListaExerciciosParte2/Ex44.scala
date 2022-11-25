package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Ex44 extends App {

  var num, incremento, inicial: Int = 0

  inicial = {
    print("Digite o valor inicial: ")
    readInt()
  }

  num = {
    print("Digite o ultimo valor: ")
    readInt()
  }

  incremento = {
    print("Digite o incremento: ")
    readInt()
  }

  contagem(num, incremento, inicial)

  @tailrec
  def contagem(num: Int, incremento: Int, inicio: Int): Unit = {
    if (inicio > num) print("Acabou!")
    else {
      print(inicio + " ")
      contagem(num, incremento, inicio + incremento)
    }
  }

}
