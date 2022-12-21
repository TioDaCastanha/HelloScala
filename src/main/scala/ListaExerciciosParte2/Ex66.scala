package ListaExerciciosParte2

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Ex66 extends App {

  var num, resultado: Int = 0

  num = {
    print("Escolha um numero: ")
    readLine().toInt
  }

  tabuada(1,10)

  @tailrec
  def tabuada(inicio: Int, fim: Int): Unit ={
    if(inicio <= fim){
      resultado = num * inicio
      print(s" $num x $inicio = $resultado\n")
      tabuada(inicio + 1, fim)
    }else print("Fim Tabuada!!")
  }

}
