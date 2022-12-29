package ListaExerciciosParte3

import scala.util.Random

object Ex96 extends App {

  var nota1, nota2: Int = 0
  var random = new Random()

  nota1 = random.nextInt(101)
  nota2 = random.nextInt(101)

  print(s"A média do aluno é: ${media(nota1, nota2)}")

  def media(nota1: Int, nota2: Int): Float = (nota1 + nota2) / 2f
}
