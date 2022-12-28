package ListaExerciciosParte3

import scala.util.Random

object Ex90 extends App {

  var num1, num2: Int = 0
  var random = new Random()

  num1 = random.nextInt(101)
  num2 = random.nextInt(101)

  print(s"$num1 + $num2 = "+ soma())

  def soma(): Int = num1 + num2

}
