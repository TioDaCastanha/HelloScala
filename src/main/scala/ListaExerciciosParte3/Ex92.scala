package ListaExerciciosParte3

import scala.util.Random

object Ex92 extends App {

  var num: Int = 0
  var random = new Random()

  num = random.nextInt(101)

  print(s"O numero $num é ${parOuImpar()}")

  def parOuImpar(): String = if (num % 2 == 0) "PAR" else "ÍMPAR"
}
