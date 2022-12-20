package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Ex63 extends App {

  var num, cont, media, menor, contPar: Int = 0

  contagem(true)

  @tailrec
  def contagem(opcao: Boolean): Unit = {
    if (opcao) {
      num = {
        print("Digite uma numero: ")
        readLine().toInt
      }

      cont += 1
      media += num

      if (num % 2 == 0) contPar += 1

      if (menor == 0) menor = num
      else if(num < menor) menor = num

      contagem(escolha())

    } else printf("Somatorio dos valores é de: %d\n" +
      "Media dos valores informados é: %.2f\n" +
      "O menor valor digitado foi: %d\n" +
      "Quantidade de valores pares: %d", media, media / cont.toFloat, menor, contPar)
  }

  def escolha(): Boolean = {
    val escolha = {
      print("Deseja continuar? ")
      readLine()
    }

    if (escolha.equalsIgnoreCase("s")) true
    else false
  }
}
