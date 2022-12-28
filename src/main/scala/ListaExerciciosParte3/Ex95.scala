package ListaExerciciosParte3

import scala.util.Random

object Ex95 extends App {

  var num1, num2: Int = 0
  var random = new Random()

  num1 = random.nextInt(101)
  num2 = random.nextInt(101)

  print(s"$num1 + $num2 = " + soma(num1, num2))

  def soma(num1: Int, num2: Int): Int = num1 + num2

}
