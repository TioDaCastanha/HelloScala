package aprendendoScalla

import scala.util.Random

object Triangulo extends App {

  val random = new Random()
  var retaA, retaB, retaC: Int = 0

  retaA = random.nextInt(10)
  retaB = random.nextInt(12)
  retaC = random.nextInt(14)

  print(retaA, retaB, retaC)

  if (equilatero()) true
  else print("Não foi possivel fazer um triangulo")


  def equilatero(): Boolean = {
    if (isTriangle) {
      if (retaA == retaB && retaA == retaC) {
        print("EQUILATERO")
        true
      }
      else isoceles()
    }else false
  }

  def isoceles(): Boolean = {
    if (retaA == retaB || retaB == retaC || retaA == retaC) {
      print("ISOCELES")
      true
    }
    else escaleno()
  }

  def escaleno(): Boolean = {
    print("ESCALENO")
    true
  }

  def isTriangle: Boolean = {

    if (retaA < retaB + retaC)
      if (retaC < retaA + retaB)
        if (retaB < retaC + retaA) true
        else false
      else false
    else false

  }

}



