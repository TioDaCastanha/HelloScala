package ListaExerciciosParte3

import scala.util.Random

object Ex91 extends App{

  var num1, num2: Int = 0
  var random = new Random()

  num1 = random.nextInt(101)
  num2 = random.nextInt(101)

  print(s"Entre o $num1 e o $num2 o maior é o ${maior()}")

  def maior(): Int = if (num1 > num2) num1 else num2

}
