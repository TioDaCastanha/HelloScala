package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.util.Random

object Ex50 extends App {

  val random: Random = new Random()
  var num, numeroAcima5, numDiv3: Int = 0

  contagem(20)

  @tailrec
  def contagem(i: Int): Unit ={
    if (i == 0) print(s"\nNumeros acima de 5: $numeroAcima5 \nNumeros divisiveis por 3: $numDiv3")
    else {
      num = random.nextInt(11)
      print(num + " ")
      if (num % 3 == 0) numDiv3 += 1
      if (num > 5) numeroAcima5 += 1
      contagem(i - 1)
    }
  }

}
