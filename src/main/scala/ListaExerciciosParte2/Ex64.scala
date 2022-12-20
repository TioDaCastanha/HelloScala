package ListaExerciciosParte2

import scala.annotation.tailrec

object Ex64 extends App {

  contagem(0, 5, 40)

  @tailrec
  def contagem(inicio: Int, inc: Int, fim: Int): Unit = {
    if(inicio <= fim){
      print(s"$inicio ")
      contagem(inicio + inc, inc, fim)
    }else print("Acabou!!")
  }
}
