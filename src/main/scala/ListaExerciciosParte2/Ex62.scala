package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Ex62 extends App {

  var idade, cont, media, contMais21: Int = 0

  contagem(true)

  @tailrec
  def contagem(opcao: Boolean): Unit ={
    if(opcao){
      idade = {
        print("Digite uma idade: ")
        readLine().toInt
      }

      cont += 1
      media += idade

      if(idade >= 21) contMais21 += 1

      contagem(escolha())
    } else printf("Quantidade de idades digitadas: %d\n" +
      "Media das idades informadas: %.2f\n" +
      "Quantidade de pessoas com 21 anos ou mais: %d", cont, media / cont.toFloat, contMais21)
  }

  def escolha(): Boolean ={
    val escolha = {
      print("Deseja continuar? ")
      readLine()
    }

    if (escolha.equalsIgnoreCase("s")) true
    else false
  }

}
