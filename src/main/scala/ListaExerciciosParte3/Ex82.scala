package ListaExerciciosParte3

import java.util
import scala.annotation.tailrec
import scala.util.Random

object Ex82 extends App {

  var lista = new Array[Int](10)
  var listaMaiorPos = new util.ArrayList[Int]()
  var media: Float = 0.0f
  var random = new Random()
  var maior, qtdMedia: Int = 0


  preencher(random.nextInt(101), 0, lista)

  media = lista.sum / 10f

  alunosAcimaMedia(media, 0)

  maiorNota(lista, 0)

  listaMaiorPos = buscaMaiorNota(lista, maior)



  println("lista informada: " + lista.mkString("(", ",", ")"))
  println("A Media da Turma é de: " + media)
  println("Quantidade de alunos acima da média da turma: "+ qtdMedia)
  println("A maior nota digitada foi: " + maior)
  print("As posições com a maior nota foram: " + listaMaiorPos)


  @tailrec
  def preencher(num: Int, i: Int, lista: Array[Int]): Unit = {
    if (i < lista.length) {
        lista(i) = num
        preencher(random.nextInt(101), i + 1, lista)
      }
  }

  @tailrec
  def maiorNota(lista: Array[Int], i: Int): Unit = {
    if (i < lista.length) {
      if (lista(i) > maior) {
        maior = lista(i)
        maiorNota(lista, i + 1)
      } else maiorNota(lista, i + 1)
    }
  }

  def buscaMaiorNota(lista: Array[Int], maior: Int): util.ArrayList[Int] = {
    val listaMaiorPos = new util.ArrayList[Int]()

    for (i <- 0 to 7) if (lista(i).equals(maior)) listaMaiorPos.add(i)

    listaMaiorPos
  }

  @tailrec
  def alunosAcimaMedia(media: Float, i: Int): Unit ={
    if (i < lista.length) {
      if (lista(i) >= media) qtdMedia += 1
      alunosAcimaMedia(media, i + 1)
    }
  }
}
