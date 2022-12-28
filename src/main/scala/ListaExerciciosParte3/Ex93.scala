package ListaExerciciosParte3

import scala.annotation.tailrec

object Ex93 extends App {

  contador(4, 3, 20)

  @tailrec
  def contador(inicio: Int, incremento: Int, fim: Int): Unit = {
    if (inicio <= fim) {
      print(s" $inicio >>")
      contador(inicio + incremento, incremento, fim)
    }
    else print(" FIM")
  }

}
