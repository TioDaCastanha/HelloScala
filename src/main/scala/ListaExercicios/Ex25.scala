package ListaExercicios

import scala.util.Random

object Ex25 extends App {

  val random = new Random()
  var retaA, retaB, retaC: Int = 0

  retaA = random.nextInt(10)
  retaB = random.nextInt(12)
  retaC = random.nextInt(14)

  exibir()

  if (retaA < retaB + retaC)
    if (retaC < retaA + retaB)
      if (retaB < retaC + retaA) print("É possivel fazer um Triangulo com as Medidas Acima!!")
      else naoDeu()
    else naoDeu()
  else naoDeu()

  def exibir(): Unit = {
    println(retaA)
    println(retaB)
    println(retaC)
  }

  def naoDeu(): Unit = {
    print("Não é Possivel fazer um triangulo com as Medidas acima!!")
  }

}


