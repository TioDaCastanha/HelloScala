package ListaExerciciosParte3

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Ex84 extends App {

  var listaNome = new Array[String](5)
  var listaIdade = new Array[Int](5)

  preencher(0)

  println("--- Lista Menores de 18 ---")
  imprimeMenores(0)


  @tailrec
  def preencher(i: Int): Unit ={
    if (i < listaNome.length){
      listaNome(i) = {
        print("Informe o Nome: ")
        readLine()
      }

      listaIdade(i) = {
        print("Informe a Idade: ")
        readLine().toInt
      }

      preencher(i + 1)
    }
  }

  @tailrec
  def imprimeMenores(i: Int): Unit ={
    if(i < listaNome.length){
      if(listaIdade(i) < 18){
        println("Nome: "+ listaNome(i))
        println("Idade: "+ listaIdade(i)+ "\n")
      }
      imprimeMenores(i + 1)
    }
  }

}
