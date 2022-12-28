package ListaExerciciosParte3

object Ex88 extends App {

  gerador("Aprendendo Portugol", 4)

  def gerador(frase: String, qtd: Int): Unit = {
    println("+-------=======------+")
    for (i <- 1 to qtd) println(s"  $frase")
    println("+-------=======------+")
  }

}
