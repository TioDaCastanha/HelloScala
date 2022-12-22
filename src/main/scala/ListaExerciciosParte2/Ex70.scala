package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex70 extends App{

  var ultimo, proximo, cont: Int = 0
  var penultimo = 1

  fibonacci(10)

  @tailrec
  def fibonacci(numero: Int): Unit = {
    if (cont == 0){
      print(s"$penultimo")
      proximo = ultimo + penultimo
      cont += 1
      fibonacci(numero)
    } else if (cont < numero) {
      print(s", $proximo")
      ultimo = penultimo
      penultimo = proximo
      proximo = ultimo + penultimo
      cont += 1
      fibonacci(numero)
    }
  }

}
