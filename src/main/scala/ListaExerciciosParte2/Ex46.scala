package ListaExerciciosParte2

object Ex46 extends App {

  print("A soma é: " + contagem(100, 2))

  def contagem(num: Int, incremento: Int): Int = {
    if (num == 6)  6
    else num + contagem(num - incremento, incremento)
  }

}
