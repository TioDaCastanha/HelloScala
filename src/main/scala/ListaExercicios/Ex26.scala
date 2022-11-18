package ListaExercicios

import scala.util.Random

object Ex26 extends App {

  val random = new Random()
  var num1, num2: Int = 0

  val resultado = {

    num1 = random.nextInt(11)
    num2 = random.nextInt(11)

    if (num1 > num2) "O primeiro valor é Maior"
    else if (num1 < num2) "O segundo valor é o Maior"
    else "Os dois são iguais"
  }

  print(resultado)

}
