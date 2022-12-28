package ListaExerciciosParte3

object Ex89 extends App {

  gerador("Vai Brasilian!!", 5, 3)

  def gerador(frase: String, qtd: Int, tipo: Int): Unit = {
    println(tipoBorda(tipo))
    for (i <- 1 to qtd) println(s"  $frase")
    println(tipoBorda(tipo))
  }

  def tipoBorda(tipo: Int): String = {
    if (tipo == 1) "+-------=======------+"
    else if (tipo == 2) "~~~~~~~~:::::::~~~~~~~"
    else "<<<<<<<<------->>>>>>>"
  }

}
