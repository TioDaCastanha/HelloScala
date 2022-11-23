package ListaExercicios

import javax.swing.JOptionPane
import scala.annotation.tailrec
import scala.util.Random

object Ex31 extends App {

  var opcao: String = ""
  val cpuEscolha: Random = new Random()
  var opcaoCpu: Int = 0
  var vencedor = false

  do {
    opcao = {
      JOptionPane.showInputDialog("---- JO KEN PO ----\nPedra, Papel ou Tesoura?\nEscolha uma Opção: ").toLowerCase()
    }

    opcaoCpu = {
      escolha(cpuEscolha.nextInt(4))
    }

    vencedor = {
      opcao match {
        case "pedra" => resultado(1)
        case "papel" => resultado(2)
        case "tesoura" => resultado(3)
        case _ => println("Opção Inválida"); false
      }
    }
  }while(!vencedor)

  @tailrec
  def escolha(num: Int): Int ={
    if (num == 0)  escolha(cpuEscolha.nextInt(4))
    else num
  }

  def resultado(opcao: Int): Boolean ={
    var empate, perde = 0

    if(opcao == 1){
      empate = 1
      perde = 2
    } else if (opcao == 2) {
      empate = 2
      perde = 3
    } else {
      empate = 3
      perde = 1
    }

    if (opcaoCpu == empate) {
      println("Empatou!!")
      false
    } else if (opcaoCpu == perde) {
      println("Perdeu!!")
      false
    } else {
      println("Ganhou!!")
      true
    }
  }

}
