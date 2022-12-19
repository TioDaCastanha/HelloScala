package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Ex56 extends App {

  var soma, num: Int = 0

  soma(opcao())

  @tailrec
  def soma(escolha: Int): Unit = {
    if(escolha != 1111){
      soma += escolha
      soma(opcao())
    }else print(s"A soma total é: $soma")
  }

  def opcao(): Int = {
    num = {
      print("Informe um numero (Digite 1111 para sair): ")
      readInt()
    }

    num
  }

}
