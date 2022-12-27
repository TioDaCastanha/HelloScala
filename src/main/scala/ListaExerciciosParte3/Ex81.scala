package ListaExerciciosParte3

import java.util
import scala.annotation.tailrec
import scala.util.Random

object Ex81 {
  var random = new Random()
  var maior: Int = 0

  def main(args: Array[String]): Unit ={
    var lista = new Array[Int](8)
    var listaMais25 = new util.ArrayList[Int]()
    var listaMaiorPos = new util.ArrayList[Int]()
    var media: Float = 0.0f


    preencher(random.nextInt(101), 0, lista)

    listaMais25 = buscaMais25(lista)

    maiorIdade(lista, 0)

    listaMaiorPos = buscaMaiorIdade(lista, maior)

    media = lista.sum / 8f

    println("lista informada: "+ lista.mkString("(", ",", ")"))
    println("A Media das pessoas cadastradas é de: "+ media)
    println("As posições com idades maiores que 25 anos são: "+ listaMais25)
    println("A maior idade digitada foi: "+ maior)
    print("As posições com a maior idade foram: "+ listaMaiorPos)


  }

  @tailrec
  def preencher(num: Int, i: Int, lista: Array[Int]): Unit = {
    if (i < lista.length){
      if(num == 0) preencher(random.nextInt(101), i, lista)
      else {
        lista(i) = num
        preencher(random.nextInt(101), i + 1, lista)
      }
    }
  }

  def buscaMais25(lista: Array[Int]): util.ArrayList[Int] ={
    val listaMais25 = new util.ArrayList[Int]()

    for (i <- 0 to 7) {
      if(lista(i) > 25) listaMais25.add(i)
    }

    listaMais25
  }

  @tailrec
  def maiorIdade(lista: Array[Int], i: Int): Unit ={
    if (i < lista.length){
      if(lista(i) > maior) {
        maior = lista(i)
        maiorIdade(lista, i + 1)
      }else maiorIdade(lista, i + 1)
    }
  }

  def buscaMaiorIdade(lista: Array[Int], maior: Int): util.ArrayList[Int] ={
    val listaMaiorPos = new util.ArrayList[Int]()

    for (i <- 0 to 7) if(lista(i).equals(maior)) listaMaiorPos.add(i)

    listaMaiorPos
  }

}
