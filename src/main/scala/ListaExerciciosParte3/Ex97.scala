package ListaExerciciosParte3

import scala.util.Random

object Ex97 extends App {

  var num1, num2, num3: Int = 0
  var random = new Random()

  num1 = random.nextInt(101)
  num2 = random.nextInt(101)
  num3 = random.nextInt(101)

  print(s"Entre os numero $num1, $num2 e $num3 o ${maior(num1, num2, num3)} é o maior.")

  def maior(num1: Int, num2: Int, num3: Int): Int = if (num1 > num2 && num1 > num3) num1 else if (num2 > num3) num2 else num3
}
