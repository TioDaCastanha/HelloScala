package ListaExerciciosParte2

import javax.swing.JOptionPane
import scala.annotation.tailrec
import scala.util.Random

object Ex55 extends App {

  var vida: Int = 4
  var random = new Random()

  sorteio(random.nextInt(11), escolha())

  @tailrec
  def sorteio(num: Int, opcao: Int): Unit = {
    if (num != opcao) {
      println(s"Errou!! CPU escolheu $num")
      vida -= 1

      if (vida == 0) print("Sem mais Tentativas. Fim de Jogo!!")
      else {
        sorteio(random.nextInt(11), escolha())
      }

    }
    else println(s"Parabéns você acertou!!")
  }

  def escolha(): Int = {
    val opcao: Int = JOptionPane.showInputDialog("---- ADIVINHE O NUMERO ----\n Informe um número de 0 a 10:").toInt
    opcao
  }

}
