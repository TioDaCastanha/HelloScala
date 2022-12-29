package ListaExerciciosParte3

import scala.annotation.tailrec

object Ex98 extends App {

  print("A Soma é: " + superSomador(10,20))

  def superSomador(inicio: Int, fim: Int): Int ={
    if (inicio == fim) fim
    else inicio + superSomador(inicio + 1, fim)
  }
}
