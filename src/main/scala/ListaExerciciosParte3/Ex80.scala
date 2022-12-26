package ListaExerciciosParte3

import java.util
import scala.annotation.tailrec
import scala.io.StdIn.readLine
import scala.util.Random

object Ex80 extends App {

  var lista = new Array[Int](30)
  var listaPos = new util.ArrayList[Int]
  var random = new Random()
  var chave: Int = 0

  preencher(0)

  chave = {
    print("Informe a Chave: ")
    readLine.toInt
  }

  verificaChave(chave, 0)

  println("A chave selecionada foi sorteada: "+ listaPos.size()+ " Vezes")
  println("Chave encontrada nas posições: "+ listaPos)

  @tailrec
  def verificaChave(chave: Int, i: Int): Unit ={
    if (i < lista.length) {
      if (chave == lista(i)) {
        listaPos.add(i)
      }
      verificaChave(chave, i + 1)
    }
  }

  @tailrec
  def preencher(i: Int): Unit ={
    if (i < lista.length){
      lista(i) = {
        testeZero(random.nextInt(16))
      }
      preencher(i + 1)
    }
  }

  @tailrec
  def testeZero(num: Int): Int ={
    if (num == 0){
      testeZero(random.nextInt(16))
    } else {
      num
    }
  }

}
