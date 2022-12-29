package ListaExerciciosParte3

object Ex99 extends App {

  print("7² = "+ potencia(7,2))

  def potencia(num: Int, expoente: Int): Int ={
    if(expoente == 1) num
    else num * potencia(num, expoente - 1)
  }

}
