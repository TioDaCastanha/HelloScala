package ListaExercicios

import javax.swing.JOptionPane
import scala.annotation.tailrec
import scala.util.Random

object Ex32 {


  var random = new Random()

  def main(args: Array[String]): Unit = {

    sorteio(random.nextInt(11), escolha())

  }

  @tailrec
  def sorteio(num: Int, opcao: Int): Unit ={
    if(num != opcao) {
      println(s"Errou!! CPU escolheu $num")
      sorteio(random.nextInt(11), escolha())
    }
    else println(s"Parabéns você acertou!!")
  }

  def escolha (): Int = {
    val opcao: Int = JOptionPane.showInputDialog("---- ADIVINHE O NUMERO ----\n Informe um número de 0 a 10:").toInt
    opcao
  }

}
