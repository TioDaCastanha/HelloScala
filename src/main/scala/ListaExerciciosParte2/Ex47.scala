package ListaExerciciosParte2

object Ex47 extends App {

  print("A soma é: " + contagem(500, 50))

  def contagem(num: Int, incremento: Int): Int = {
    if (num == 0) 0
    else num + contagem(num - incremento, incremento)
  }

}
